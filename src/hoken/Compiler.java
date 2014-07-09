package hoken;

import hoken.ast.HokenNode;
import hoken.ast.HokenNodeAdaptor;
import hoken.checker.HokenChecker;
import hoken.generator.HokenGenerator;
import hoken.parser.HokenLexer;
import hoken.parser.HokenParser;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplateGroup;

import TAM.Assembler;

/**
 * Het hoofdprogramma van de Høken compiler. Is uitvoerbaar.
 * 
 */
public class Compiler {

	/** Enumeratie van de mogelijke uitvoertypen van de compiler. **/
	public enum Target {
		TAM, JVM, DOT
	};

	/** Huidig geselecteerde uitvoer. **/
	private Target target = Target.TAM;
	/** Geeft aan of er uitgebreide uitvoer moet plaatsvinden. **/
	private boolean verbose = true;
	/** Geeft aan of de assemblercode uitgevoerd moet worden. **/
	private boolean asm = false;
	/** Het bestand met de broncode. **/
	private ANTLRFileStream infile;
	/** De naam van het programma **/
	private String programName;

	/**
	 * Maakt een nieuwe instantie van <code>Compiler</code> aan met de opgegeven
	 * argumenten en verwerkt deze.
	 **/
	public Compiler(String[] args) {
		processArgs(args);
	}

	/**
	 * Zet de boel in werking en doorloopt het compilatieproces op basis van de
	 * meegegeven argumenten.
	 */
	public void run() {
		try {
			long startTime = System.currentTimeMillis();

			// syntactic analysis
			print("===> Parsen...");
			HokenLexer lexer = new HokenLexer(infile);
			HokenParser parser = new HokenParser(new CommonTokenStream(lexer));
			parser.setTreeAdaptor(new HokenNodeAdaptor());
			HokenNode ast = parser.program().getTree();
			haltOnErrors(parser.getErrorCount());

			// context analysis
			print("===> Controleren...");
			HokenChecker checker = new HokenChecker(new CommonTreeNodeStream(
					ast));
			checker.program();
			haltOnErrors(checker.getErrorCount());

			// code genereren
			if (this.target == Target.TAM) {
				print("===> Code genereren voor TAM...");
				HokenGenerator generator = new HokenGenerator(
						new CommonTreeNodeStream(ast));
				StringTemplateGroup templateLib = new StringTemplateGroup(
						new FileReader("tam.stg"));
				generator.setTemplateLib(templateLib);
				generator.target = Target.TAM;
				String code = generator.program(this.programName).toString();
				if(this.asm) System.out.println(code); 

				print("===> Assembleren...");
				Assembler.assemble(new ByteArrayInputStream(code.getBytes()),
						new FileOutputStream("obj.tam"));
			} else if (this.target == Target.JVM) {
				print("===> Code genereren voor JVM...");
				HokenGenerator generator = new HokenGenerator(new CommonTreeNodeStream(ast));
				StringTemplateGroup templateLib = new StringTemplateGroup(new FileReader("jvm.stg"));
				generator.setTemplateLib(templateLib);
				generator.target = Target.JVM;
				// verhoog addrs, want voor JVM geldt 0=this, en 1=Scanner voor de input
				generator.nextAddr = 2;
				String code = generator.program(this.programName).toString();
				if(this.asm) System.out.println(code);
				print("===> Assembleren...");
				File temp = new File("hoken.tmp");
				FileWriter fw = new FileWriter(temp);
				fw.write(code);
				fw.close();
				new jasmin.Main().assemble("hoken.tmp");
				temp.delete();
				new File("_temp.j").delete();
			} else if (this.target == Target.DOT) {
				print("===> Genereert DOT-file van AST...");
				DOTTreeGenerator gen = new DOTTreeGenerator();
				FileWriter fw = new FileWriter("obj.dot");
				fw.write(gen.toDOT(ast).toString());
				fw.close();
			}

			long endTime = System.currentTimeMillis();
			print("Compilatie geslaagd! " + ((double) endTime - startTime)
					/ 1000 + "s");
		} catch (RecognitionException e) {
			// error
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.exit(0);
	}

	/**
	 * Bepaalt op basis van het meegegeven foutaantal of de compilatie gestopt
	 * moet worden.
	 * 
	 * @param errorCount
	 *            het aantal fouten van de afgelopen fase
	 */
	private void haltOnErrors(int errorCount) {
		if (errorCount > 0) {
			System.err.println("===> Totaal aantal fouten: " + errorCount);
			System.exit(1);
		}
	}

	/**
	 * Interpreteert de argumenten meegegeven aan de compiler.
	 * 
	 * @param args
	 *            de argumenten
	 */
	private void processArgs(String[] args) {
		if (args == null || args.length == 0) {
			System.err.println("Høken ");
			System.err
					.println("Gebruik: java hoken.Compiler [opties] hoken.hk");
			System.err.println("  -silent");
			System.err
					.println("     Onderdruk informatie gegeven door de compiler");
			System.err.println("  -asm");
			System.err.println("     Produceer naast het object ook de gegenereerde code op de standaardoutput");
			System.err.println("  -tam");
			System.err.println("     Gebruik TAM als doelmachine (standaard)");
			System.err.println("  -jvm");
			System.err.println("     Gebruik Java als doelmachine");
			System.err.println("  -dot");
			System.err
					.println("     Tekent de AST als doel");
			System.exit(1);
		}

		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-tam")) {
				this.target = Target.TAM;
			} else if (args[i].equals("-jvm")) {
				this.target = Target.JVM;
			} else if (args[i].equals("-silent")) {
				this.verbose = false;
			} else if (args[i].equals("-dot")) {
				this.target = Target.DOT;
			} else if (args[i].equals("-asm")) {
				this.asm = true;
			} else {
				if (i < args.length - 1) {
					System.err
							.println("FOUT: Invoer bestandsnaam '" + args[i] + "' zou het laatste argument moeten zijn.");
					System.exit(1);
				} else {
					try {
						this.infile = new ANTLRFileStream(args[i]);
						this.programName = stripExtension(args[i]);
					} catch (IOException e) {
						System.err
								.println("FOUT: Kon invoer bestand '"+ args[i] + "' niet openen.");
						System.exit(1);
					}
				}
			}
		}

		if (this.infile == null) {
			System.err.println("FOUT: Geen invoer bestand opgegeven.");
			System.exit(1);
		}
	}
	
	private String stripExtension(String filename) {
		int pos = filename.lastIndexOf('.');
		if(pos == -1)
			return filename;
		else
			return filename.substring(0, pos);
	}

	/**
	 * Drukt een bericht af op basis van de keuze voor uitgebereide
	 * berichtgeving.
	 * 
	 * @param msg
	 *            het bericht
	 */
	private void print(String msg) {
		if (verbose) {
			System.err.println(msg);
		}
	}

	/**
	 * Maakt een nieuwe instantie van <code>Compiler</code> en zet de boel in
	 * werking.
	 * 
	 * @param args
	 *            command-line argumenten
	 */
	public static void main(String[] args) {
		Compiler compiler = new Compiler(args);
		compiler.run();
	}

}

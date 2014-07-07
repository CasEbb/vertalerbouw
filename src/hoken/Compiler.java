package hoken;

import hoken.ast.HokenNode;
import hoken.ast.HokenNodeAdaptor;
import hoken.checker.HokenChecker;
import hoken.generator.HokenGenerator;
import hoken.parser.HokenLexer;
import hoken.parser.HokenParser;

import java.io.ByteArrayInputStream;
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
	enum Target {
		TAM, JVM, DOT
	};

	/** Huidig geselecteerde uitvoer. **/
	private Target target = Target.TAM;
	/** Geeft aan of er uitgebreide uitvoer moet plaatsvinden. **/
	private boolean verbose = true;
	/** Het bestand met de broncode. **/
	private ANTLRFileStream infile;

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
				String code = generator.program().toString();
				System.err.println(code);

				print("===> Assembleren...");
				Assembler.assemble(new ByteArrayInputStream(code.getBytes()),
						new FileOutputStream("obj.tam"));
			} else if (this.target == Target.JVM) {
				print("===> Code genereren voor JVM...");
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
			System.err.println("  -tam");
			System.err.println("     Gebruik TAM als doelmachine (standaard)");
			System.err.println("  -jvm");
			System.err.println("     Gebruik Java als doelmachine");
			System.err.println("  -dot");
			System.err
					.println("     Geef de AST als graaf op de standaardoutput");
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
			} else {
				if (i < args.length - 1) {
					System.err
							.println("FOUT: Invoer bestandsnaam '%s' zou het laatste argument moeten zijn.");
					System.exit(1);
				} else {
					try {
						infile = new ANTLRFileStream(args[i]);
					} catch (IOException e) {
						System.err
								.println("FOUT: Kon invoer bestand '%s' niet openen.");
						System.exit(1);
					}
				}
			}
		}

		if (infile == null) {
			System.err.println("FOUT: Geen invoer bestand opgegeven.");
			System.exit(1);
		}
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

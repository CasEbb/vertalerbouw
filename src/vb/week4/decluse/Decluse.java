package vb.week4.decluse;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Set;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

public class Decluse {
	private static final Set<Option> options = EnumSet.noneOf(Option.class);
	private static String inputFile;

	public static void parseOptions(String[] args) {
		if (args.length == 0) {
			System.err.println(USAGE_MESSAGE);
			System.exit(1);
		}
		for (int i = 0; i < args.length; i++) {
			try {
				Option option = getOption(args[i]);
				if (option == null) {
					if (i < args.length - 1) {
						System.err
								.println("Input file name '%s' should be last argument");
						System.exit(1);
					} else {
						inputFile = args[i];
					}
				} else {
					options.add(option);
				}
			} catch (IllegalArgumentException exc) {
				System.err.println(exc.getMessage());
				System.err.println(USAGE_MESSAGE);
				System.exit(1);
			}
		}
	}

	public static void main(String[] args) {
		parseOptions(args);

		try {
			InputStream in = inputFile == null ? System.in
					: new FileInputStream(inputFile);
			DecluseLexer lexer = new DecluseLexer(new ANTLRInputStream(in));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			DecluseParser parser = new DecluseParser(tokens);

			DecluseParser.decluse_return result = parser.decluse();
			CommonTree tree = (CommonTree) result.getTree();
			
            if (!options.contains(Option.NO_CHECKER)) {      // check the AST
                CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
                DecluseChecker checker = new DecluseChecker(nodes);
                checker.decluse();
            }

			if (options.contains(Option.AST)) { // print the AST as string
				System.out.println(tree.toStringTree());
			}

			if (options.contains(Option.DOT)) { // print the AST as DOT
												// specification
				DOTTreeGenerator gen = new DOTTreeGenerator();
				StringTemplate st = gen.toDOT(tree);
				System.out.println(st);
			}

		} catch (RecognitionException e) {
			System.err
					.print("ERROR: recognition exception thrown by compiler: ");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.print("ERROR: uncaught exception thrown by compiler: ");
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static Option getOption(String text)
			throws IllegalArgumentException {
		if (!text.startsWith(OPTION_PREFIX)) {
			return null;
		}
		String stripped = text.substring(OPTION_PREFIX.length());
		for (Option option : Option.values()) {
			if (option.getText().equals(stripped)) {
				return option;
			}
		}
		throw new IllegalArgumentException(String.format(
				"Illegal option value '%s'", text));
	}

	private static final String USAGE_MESSAGE;

	static {
		StringBuilder message = new StringBuilder("Usage:");
		for (Option option : Option.values()) {
			message.append(" [");
			message.append(option.getText());
			message.append("]");
		}
		message.append(" [filename]");
		USAGE_MESSAGE = message.toString();
	}

	private static enum Option {
		DOT, AST, NO_CHECKER;

		private Option() {
			this.text = name().toLowerCase();
		}

		public String getText() {
			return this.text;
		}

		private final String text;
	}

	private static final String OPTION_PREFIX = "-";
}

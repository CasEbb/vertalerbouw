package vb.week2.tabular;

import vb.week2.tabular.Token.Kind;

public class Parser {
	protected Token currentToken;
	private Scanner scanner;
	/**
	 * @param scanner
	 *            the Scanner object to be used for parsing
	 * @requires scanner != null;
	 */
	public Parser(Scanner scanner) {
		this.scanner = scanner;
	}
	
	private void accept(Kind expectedKind) throws SyntaxError {
		if(currentToken.getKind() == expectedKind) {
			currentToken = scanner.scan();
		} else {
			throw new SyntaxError("Syntax error. Expected '" + expectedKind.toString() + "', got '" + currentToken.getRepr() + "'");
		}
	}
	
	public void acceptIt() throws SyntaxError {
		currentToken = scanner.scan();
	}
	
	protected void parseLatexTabular() throws SyntaxError {
		parseBeginTabular();
		parseColsSpec();
		parseRows();
		parseEndTabular();
	}
	
	protected void parseColsSpec() throws SyntaxError {
		accept(Kind.LCURLY);
		parseIdentifier();
		accept(Kind.RCURLY);
	}
	
	protected void parseRows() throws SyntaxError {
		do {
			parseRow();
			accept(Kind.DOUBLE_BSLASH);
		}
		while(currentToken.getKind() == Kind.IDENTIFIER);
	}
	
	protected void parseRow() throws SyntaxError {
		parseEntry();
		while(currentToken.getKind() == Kind.AMPERSAND) {
			acceptIt();
			parseEntry();
		}
	}
	
	protected void parseEntry() throws SyntaxError {
		switch(currentToken.getKind()) {
		case NUM:
		case IDENTIFIER:
			acceptIt();
			break;
		default:
			throw new SyntaxError("Lege entry. Ik heb " + currentToken.getRepr());
		}
	}
	
	protected void parseBeginTabular() throws SyntaxError {
		accept(Kind.BSLASH);
		accept(Kind.BEGIN);
		accept(Kind.LCURLY);
		accept(Kind.TABULAR);
		accept(Kind.RCURLY);
	}
	
	protected void parseEndTabular() throws SyntaxError {
		accept(Kind.BSLASH);
		accept(Kind.END);
		accept(Kind.LCURLY);
		accept(Kind.TABULAR);
		accept(Kind.RCURLY);
	}
	
	protected void parseNum() throws SyntaxError {
		accept(Kind.NUM);
	}
	
	protected void parseIdentifier() throws SyntaxError {
		accept(Kind.IDENTIFIER);
	}

	/**
	 * Parses the input as LaTeX tabular specification.
	 * 
	 * @returns {@code true} if parsing was successful
	 */
	public boolean parse() {
		try {
			currentToken = scanner.scan();
			parseLatexTabular();
			if(currentToken.getKind() != Kind.EOT) {
				return false;
			} else {
				return true;
			}
		} catch(SyntaxError e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
			return false;
		}
	}
	
	public static void main(String[] args) {
		ParserEmit p = new ParserEmit(new Scanner(System.in));
		p.parse();
		System.out.println(p.emit());
	}
}

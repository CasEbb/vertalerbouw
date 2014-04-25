package vb.week2.tabular;

import java.io.IOException;
import java.io.InputStream;

import vb.week2.tabular.Token.Kind;

public class Scanner {
	private int currentLineNr = 0;
	private InputStream in;
	private char currentChar;
	private Kind currentKind;
	private StringBuilder currentSpelling;

	private static final char cSPACE = ' ', cTAB = '\t', cEOLr = '\r',
			cEOLn = '\n', cPERCENT = '%', cEOT = '\u0000', /* End OF Text */
			cBSLASH = '\u005C\u005C';

	// == '\\'
	// We cannot use the '\\' denotation here because
	// otherwise LaTeX's listings package will get very
	// confused. Students should use '\\' of course.

	/**
	 * Constructor.
	 * 
	 * @param in
	 *            the stream from which the characters will be read
	 */
	public Scanner(InputStream in) {
		this.in = in;
		this.currentChar = getNextChar();
		this.currentSpelling = new StringBuilder();
	}

	/*
	 * Returns the next character. Returns cEOT when end-of-file or in case of
	 * an error.
	 */
	private char getNextChar() {
		try {
			int ch = this.in.read();

			if (ch == -1) {
				ch = cEOT;
			} else if (ch == cEOLn) {
				this.currentLineNr++;
			}

			return (char) ch;
		} catch (IOException e) {
			return cEOT;
		}
	}

	private void take(char expectedChar) throws SyntaxError {
		if (currentChar == expectedChar) {
			currentSpelling.append(currentChar);
			currentChar = getNextChar();
		} else {
			throw new SyntaxError("Unrecognized character '" + currentChar
					+ "', expected '" + expectedChar + "'");
		}
	}

	private void takeIt() {
		this.currentSpelling.append(this.currentChar);
		this.currentChar = getNextChar();
	}

	private boolean isNumeric(char c) {
		return (c >= '0' && c <= '9');
	}

	private boolean isAlphaNumeric(char c) {
		return (c >= 'A' && c <= 'z') || isNumeric(c);
	}
	
	private void scanSeparator() throws SyntaxError {
		switch(currentChar) {
		case cPERCENT:
			takeIt();
			while(currentChar != cEOLn) takeIt();
			take('\n');
			break;
		case cSPACE:
		case cTAB:
		case cEOLn:
		case cEOLr:
			takeIt();
			break;
		default:
			return;
		}
	}

	private Kind scanToken() throws SyntaxError {
		switch (currentChar) {
		case cBSLASH: // represents \
			takeIt();
			if (currentChar == cBSLASH) {
				takeIt();
				return Kind.DOUBLE_BSLASH;
			} else {
				return Kind.BSLASH;
			}
		case '{':
			takeIt();
			return Kind.LCURLY;
		case '}':
			takeIt();
			return Kind.RCURLY;
		case '&':
			takeIt();
			return Kind.AMPERSAND;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			do {
				takeIt();
			} while (isNumeric(currentChar));
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			do {
				takeIt();
			} while (isAlphaNumeric(currentChar));
			return Kind.IDENTIFIER;
		case cEOT:
			return Kind.EOT;
		default:
			throw new SyntaxError("Unexpected character '" + currentChar + "' at line " + getLineNr());
		}
	}

	/**
	 * Returns the next Token from the input.
	 * 
	 * @return the next Token
	 * @throws SyntaxError
	 *             when an unknown or unexpected character has been found in the
	 *             input.
	 */
	public Token scan() throws SyntaxError {
		while (currentChar == cSPACE || currentChar == cTAB || currentChar == cEOLn || currentChar == cEOLr || currentChar == cPERCENT)
			scanSeparator();
		currentSpelling = new StringBuilder();
		currentKind = scanToken();
		return new Token(currentKind, currentSpelling.toString());
	}

	public int getLineNr() {
		return this.currentLineNr;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			Token token = scanner.scan();
			while (token.getKind() != Kind.EOT) {
				System.out.println(token);
				token = scanner.scan();
			}
			
			System.out.println("Scanning OK. Number of lines: " + scanner.getLineNr());
		} catch(SyntaxError e) {
			System.err.println(e.getMessage());
		}
	}
}

class SyntaxError extends Exception {
	private static final long serialVersionUID = 1L;

	public SyntaxError(String msg) {
		super(msg);
	}
}

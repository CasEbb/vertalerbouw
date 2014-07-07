package hoken;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

/**
 * Wordt gegooid als er ongeldige operaties worden uitgevoerd tijdens het
 * compileren van een Høken programma.
 * 
 */
public class HokenException extends RecognitionException {
	private static final long serialVersionUID = 1L;
	private String error;

	/**
	 * Maakt een <code>HokenException</code> met een bericht.
	 * 
	 * @param error
	 *            het bericht
	 */
	public HokenException(String error) {
		super();
		this.error = error;
	}

	/**
	 * Maakt een <code>HokenException</code> met een bericht en een verwijzing
	 * naar de AST node waar de fout plaatsvond.
	 * 
	 * @param tree
	 *            de AST node waar de fout plaatsvond
	 * @param msg
	 *            het bericht
	 */
	public HokenException(Tree tree, String msg) {
		super();
		this.error = "'" + tree.getText() + "'" + " (regel: " + tree.getLine()
				+ ", kolom: " + tree.getCharPositionInLine() + ") " + msg;
	}

	/**
	 * Geeft de hele foutmelding behorende bij deze exceptie.
	 */
	public String getMessage() {
		return error;
	}
}

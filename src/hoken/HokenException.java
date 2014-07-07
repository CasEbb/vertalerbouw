package hoken;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class HokenException extends RecognitionException {
	private static final long serialVersionUID = 1L;
	private String error;

	public HokenException(String error) {
		super();
		this.error = error;
	}

	public HokenException(Tree tree, String msg) {
		super();
		this.error = "'" + tree.getText() + "'" + " (regel: " + tree.getLine()
				+ ", kolom: " + tree.getCharPositionInLine() + ") " + msg;
	}

	public String getMessage() {
		return error;
	}
}

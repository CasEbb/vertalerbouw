package vb.project;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class VBException extends RecognitionException {
	private static final long serialVersionUID = 1L;
	private String error;

	public VBException(String error) {
		super();
		this.error = error;
	}

	public VBException(Tree tree, String msg) {
		super();
		this.error = "'" + tree.getText() + "'" + " (line: " + tree.getLine()
				+ ", col:" + tree.getCharPositionInLine() + ") " + msg;
	}

	public String getMessage() {
		return error;
	}
}

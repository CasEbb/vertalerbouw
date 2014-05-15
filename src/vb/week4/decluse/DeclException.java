package vb.week4.decluse;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class DeclException extends RecognitionException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;

    // Ctor which only requires the error message to be printed.
    public DeclException(String msg) {
        super();
        this.msg = msg;
    }

    // Ctor that takes a node of the AST tree (i.e. IDENTIFIER) and
    // the error message to build a more informative error message.
    public DeclException(Tree tree, String msg) {
        super();
        this.msg = tree.getText() +
                " (" + tree.getLine() +
                ":" + tree.getCharPositionInLine() +
                ") " + msg;
    }

    @Override
    public String getMessage() {
        return this.msg;
    }
}

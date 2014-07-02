package vb.project.nodes;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class VBNode extends CommonTree {
	
	// Het resultaat van een expressie is een type
	public Type type;

	public VBNode() { super(); }
	public VBNode(Token t) { token = t; }
	public VBNode(VBNode node) { super(node); }
	public Tree dupNode() { return new VBNode(this); }
	public String toString() { return token.getText()+"<VBNode>"; }
	
	public boolean shouldReturn() {
		// Wanneer laten we onze waarde op de stack staan?
		// Als onze parent het programma is, of
		// we niet het laatste statement zijn in een compound expression
		return (getParent() instanceof VBNode);
	}
	
}

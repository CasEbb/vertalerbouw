package hoken.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class HokenNode extends CommonTree {
	
	// Het resultaat van een expressie is een type
	public Type type;

	public HokenNode() { super(); }
	public HokenNode(Token t) { token = t; }
	public HokenNode(HokenNode node) { super(node); }
	public Tree dupNode() { return new HokenNode(this); }
	public String toString() { return token.getText()+"<HokenNode>"; }
	
	public boolean shouldReturn() {
		// Wanneer laten we onze waarde op de stack staan?
		// Als onze parent het programma is, of
		// we niet het laatste statement zijn in een compound expression
		return (getParent() instanceof HokenNode);
	}
	
}

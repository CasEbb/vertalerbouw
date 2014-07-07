package hoken.ast;

import hoken.checker.HokenChecker;

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
	
	public boolean shouldNotReturn() {
		// Wanneer laten we onze waarde op de stack staan?
		// Als onze parent niet het programma is
		int parentType = this.getParent().getType();
		if(parentType == HokenChecker.PROGRAM) {
			// in global scope nooit iets op de stack achterlaten
			return true;
		} else if(parentType == HokenChecker.COMPOUND) {
			// return true als wij laatste child van de parent zijn
			// dan zijn wij dus het laatste statement in een compound
			// en moet onze waarde op de stack blijven
			return !this.getParent().getChild(this.getParent().getChildCount()-1).equals(this);
		} else {
			// alle andere gevallen bewaren
			return false;
		}
	}
	
}

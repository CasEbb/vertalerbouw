package hoken.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

public class IdNode extends HokenNode {
	
	// Referentie naar de declaratie van deze id
	public DeclarationNode declaration;

	public IdNode() { super(); }
	public IdNode(Token t) { token = t; }
	public IdNode(IdNode node) { super(node); }
	public Tree dupNode() { return new IdNode(this); }
	public String toString() { return token.getText()+"<IdNode>"; }
	
	public boolean isConstant() {
		return this.declaration.isConstant;
	}

}

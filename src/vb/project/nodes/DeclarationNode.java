package vb.project.nodes;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

public class DeclarationNode extends VBNode {
	
	public int address = -1;
	public boolean isConstant = false;
	
	public DeclarationNode(Token t) { token = t; }
	public DeclarationNode(DeclarationNode node) { super(node); }
	public Tree dupNode() { return new DeclarationNode(this); }
	public String toString() { return token.getText()+"<DeclarationNode>"; }

}

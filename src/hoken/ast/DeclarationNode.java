package hoken.ast;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import vb.project.VBParser;

public class DeclarationNode extends HokenNode {
	
	public int address = -1;
	public boolean isConstant = false;
	
	public DeclarationNode(Token t) { token = t; }
	public DeclarationNode(DeclarationNode node) { super(node); }
	public DeclarationNode(int tokenType) { super(new CommonToken(tokenType, VBParser.tokenNames[tokenType])); }
	public Tree dupNode() { return new DeclarationNode(this); }
	public String toString() { return token.getText()+"<DeclarationNode>"; }

}

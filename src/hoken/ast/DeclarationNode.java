package hoken.ast;

import hoken.parser.HokenParser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

public class DeclarationNode extends HokenNode {
	
	public int address = -1;
	public boolean isConstant = false;
	public List<String> ids = new ArrayList<String>();
	
	public DeclarationNode(Token t) { token = t; }
	public DeclarationNode(DeclarationNode node) { super(node); }
	public DeclarationNode(int tokenType) { super(new CommonToken(tokenType, HokenParser.tokenNames[tokenType])); }
	public Tree dupNode() { return new DeclarationNode(this); }
	public String toString() { return token.getText()+"<DeclarationNode>"; }
	
	public int getOffsettedAddress(IdNode id) {
		return this.address + this.ids.indexOf(id.getText());
	}

}

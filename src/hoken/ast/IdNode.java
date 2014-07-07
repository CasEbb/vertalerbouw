package hoken.ast;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

/**
 * Representeert een AST node waarvan de token bestaat uit een identifier, en
 * gekoppeld kan worden aan een bijbehorende declaratie van die identifier.
 * 
 */
public class IdNode extends HokenNode {

	/** De <code>DeclarationNode</code> waar deze identifier wordt gedeclareerd. **/
	public DeclarationNode declaration;

	public IdNode() {
		super();
	}

	public IdNode(Token t) {
		token = t;
	}

	public IdNode(IdNode node) {
		super(node);
	}

	public Tree dupNode() {
		return new IdNode(this);
	}

	public String toString() {
		return token.getText() + "<IdNode>";
	}

}

package hoken.ast;

import hoken.parser.HokenParser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

/**
 * AST node waarin een of meerdere identifiers van een bepaald type worden
 * gedeclareerd, al dan niet als constante.
 * 
 */
public class DeclarationNode extends HokenNode {

	/**
	 * Het basisadres van deze declaratie. Als deze declaratienode geldt voor
	 * meerde identifiers, geldt er wellicht een offset.
	 **/
	public int address = -1;
	/** Boolean die aangeeft of dit een constante declaratie is. **/
	public boolean isConstant = false;
	/** Lijst met identifiers die in deze node gedeclareerd zijn. **/
	public List<String> ids = new ArrayList<String>();

	public DeclarationNode(Token t) {
		token = t;
	}

	public DeclarationNode(DeclarationNode node) {
		super(node);
	}

	public DeclarationNode(int tokenType) {
		super(new CommonToken(tokenType, HokenParser.tokenNames[tokenType]));
	}

	public Tree dupNode() {
		return new DeclarationNode(this);
	}

	public String toString() {
		return token.getText() + "<DeclarationNode>";
	}

	/**
	 * Bepaalt op basis van de gegeven <code>IdNode</code> het adres van de
	 * identifier in het geheugen.
	 * 
	 * @param id
	 *            de identifier
	 * @return het adres van de identifier
	 */
	public int getOffsettedAddress(IdNode id) {
		return this.address + this.ids.indexOf(id.getText());
	}

}

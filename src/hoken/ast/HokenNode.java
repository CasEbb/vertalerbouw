package hoken.ast;

import hoken.checker.HokenChecker;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

/**
 * AST node voor de taal Høken. Voor elke node wordt het type bijgehouden. Ook
 * kan opgevraagd worden of deze node zijn waarde op de stack moet achterlaten.
 * 
 */
public class HokenNode extends CommonTree {

	/** Het type van deze node, wordt ingesteld tijdens contextuele analyse. **/
	public Type type;

	public HokenNode() {
		super();
	}

	public HokenNode(Token t) {
		token = t;
	}

	public HokenNode(HokenNode node) {
		super(node);
	}

	public Tree dupNode() {
		return new HokenNode(this);
	}

	public String toString() {
		return token.getText() + "<HokenNode>";
	}

	/**
	 * Methode die op basis van zijn positie in de AST bepaalt of het resultaat
	 * van zijn expressie op de stack moet blijven staan.
	 * 
	 * @return een boolean die aangeeft of de waarde mag worden weggeworpen
	 */
	public boolean shouldNotReturn() {
		// Wanneer laten we onze waarde op de stack staan?
		// Als onze parent niet het programma is
		int parentType = this.getParent().getType();
		if (parentType == HokenChecker.PROGRAM) {
			// in global scope nooit iets op de stack achterlaten
			return true;
		} else if (parentType == HokenChecker.COMPOUND) {
			// return true als wij laatste child van de parent zijn
			// dan zijn wij dus het laatste statement in een compound
			// en moet onze waarde op de stack blijven
			return !this.getParent()
					.getChild(this.getParent().getChildCount() - 1)
					.equals(this);
		} else {
			// alle andere gevallen bewaren
			return false;
		}
	}

}

package hoken.ast;

import hoken.HokenException;
import hoken.checker.HokenChecker;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

/**
 * Een AST node met een operator en één of twee operands. Op basis van de
 * operator en de typen van de operands wordt bepaald of hier een type mismatch
 * plaatsvindt.
 * 
 */
public class ExpressionNode extends HokenNode {

	public ExpressionNode(Token t) {
		token = t;
	}

	public ExpressionNode(ExpressionNode node) {
		super(node);
	}

	public Tree dupNode() {
		return new ExpressionNode(this);
	}

	public String toString() {
		return token.getText() + "<ExpressionNode>";
	}

	/**
	 * Controleert op basis van de operator en de children van deze node of er
	 * voor deze node geldt dat er een geldige expressie wordt uitgevoerd.
	 * 
	 * @throws HokenException
	 *             als er een type mismatch plaatsvindt
	 */
	public void check() throws HokenException {
		int operand = this.getType();

		// Controleer unaire expressies
		if (this.getChildCount() == 1) {
			HokenNode E = (HokenNode) this.getChild(0);

			switch (operand) {
			// int => int
			case HokenChecker.PLUS:
			case HokenChecker.MINUS:
				if (E.type != Type.INTEGER) {
					throw new HokenException(this, "Foute operand voor unaire "
							+ HokenChecker.tokenNames[operand]
							+ ". Toegestaan is INTEGER, gevonden is "
							+ E.type.toString());
				}
				this.type = Type.INTEGER;
				break;
			// bool => bool
			case HokenChecker.NOT:
				if (E.type != Type.BOOLEAN) {
					throw new HokenException(this, "Foute operand voor unaire "
							+ HokenChecker.tokenNames[operand]
							+ ". Toegestaan is BOOLEAN, gevonden is "
							+ E.type.toString());
				}
				this.type = Type.BOOLEAN;
				break;
			}
		} else {
			HokenNode L = (HokenNode) this.getChild(0);
			HokenNode R = (HokenNode) this.getChild(1);

			switch (operand) {
			// int x int => int
			case HokenChecker.TIMES:
			case HokenChecker.DIVIDE:
			case HokenChecker.MODULO:
			case HokenChecker.PLUS:
			case HokenChecker.MINUS:
				if (L.type != Type.INTEGER || R.type != Type.INTEGER) {
					throw new HokenException(
							this,
							"Foute operands voor "
									+ HokenChecker.tokenNames[operand]
									+ ". Toegestaan is [INTEGER, INTEGER], gevonden is ["
									+ L.type.toString() + ","
									+ R.type.toString() + "]");
				}
				this.type = Type.INTEGER;
				break;
			// int x int => bool
			case HokenChecker.LT:
			case HokenChecker.LTE:
			case HokenChecker.GTE:
			case HokenChecker.GT:
				if (L.type != Type.INTEGER || R.type != Type.INTEGER) {
					throw new HokenException(
							this,
							"Foute operands voor "
									+ HokenChecker.tokenNames[operand]
									+ ". Toegestaan is [INTEGER, INTEGER], gevonden is ["
									+ L.type.toString() + ","
									+ R.type.toString() + "]");
				}
				this.type = Type.BOOLEAN;
				break;
			// {int,bool,char} x {int,bool,char} => bool
			case HokenChecker.EQ:
			case HokenChecker.NEQ:
				if (L.type != R.type || L.type == Type.VOID
						|| R.type == Type.VOID) {
					throw new HokenException(
							this,
							"Foute operands voor "
									+ HokenChecker.tokenNames[operand]
									+ ". Types moeten matchen en mogen geen VOID zijn, gevonden is ["
									+ L.type.toString() + ","
									+ R.type.toString() + "]");
				}
				this.type = Type.BOOLEAN;
				break;
			// bool x bool => bool
			case HokenChecker.AND:
			case HokenChecker.OR:
				if (L.type != Type.BOOLEAN || R.type != Type.BOOLEAN) {
					throw new HokenException(
							this,
							"Foute operands voor "
									+ HokenChecker.tokenNames[operand]
									+ ". Toegestaan is [BOOLEAN, BOOLEAN], gevonden is ["
									+ L.type.toString() + ","
									+ R.type.toString() + "]");
				}
				this.type = Type.BOOLEAN;
				break;
			}
		}
	}

}

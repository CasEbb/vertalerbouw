package vb.project.nodes;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

import vb.project.VBChecker;
import vb.project.VBException;

public class ExpressionNode extends VBNode {

	public ExpressionNode(Token t) { token = t; }
	public ExpressionNode(ExpressionNode node) { super(node); }
	public Tree dupNode() { return new ExpressionNode(this); }
	public String toString() { return token.getText()+"<ExpressionNode>"; }
	
	public void check() throws VBException {
		int operand = this.getType();

		if(this.getChildCount() == 1) {
			VBNode E = (VBNode)this.getChild(0);
			
			switch(operand) {
			// int => int
			case VBChecker.PLUS:
			case VBChecker.MINUS:
				if(E.type != Type.INTEGER) {
					throw new VBException(this, "Foute operand voor unaire " + VBChecker.tokenNames[operand] + ". Toegestaan is INTEGER, gevonden is " + E.type.toString());
				}
				this.type = Type.INTEGER;
				break;
			case VBChecker.NOT:
				if(E.type != Type.BOOLEAN) {
					throw new VBException(this, "Foute operand voor unaire " + VBChecker.tokenNames[operand] + ". Toegestaan is BOOLEAN, gevonden is " + E.type.toString());
				}
				this.type = Type.BOOLEAN;
				break;			
			}
		} else {	
			VBNode L = (VBNode)this.getChild(0);
			VBNode R = (VBNode)this.getChild(1);
			
			switch(operand) {
			// int x int => int
			case VBChecker.TIMES:
			case VBChecker.DIVIDE:
			case VBChecker.MODULO:
			case VBChecker.PLUS:
			case VBChecker.MINUS:
				if(L.type != Type.INTEGER || R.type != Type.INTEGER) {
					throw new VBException(this, "Foute operands voor " + VBChecker.tokenNames[operand] + ". Toegestaan is [INTEGER, INTEGER], gevonden is [" + L.type.toString() + "," + R.type.toString() + "]");
				}
				this.type = Type.INTEGER;
				break;
			// int x int => bool
			case VBChecker.LT:
			case VBChecker.LTE:
			case VBChecker.GTE:
			case VBChecker.GT:
				if(L.type != Type.INTEGER || R.type != Type.INTEGER) {
					throw new VBException(this, "Foute operands voor " + VBChecker.tokenNames[operand] + ". Toegestaan is [INTEGER, INTEGER], gevonden is [" + L.type.toString() + "," + R.type.toString() + "]");
				}
				this.type = Type.BOOLEAN;
				break;
			// {int,bool,char} x {int,bool,char} => bool
			case VBChecker.EQ:
			case VBChecker.NEQ:
				if(L.type != R.type || L.type == Type.VOID || R.type == Type.VOID) {
					throw new VBException(this, "Foute operands voor " + VBChecker.tokenNames[operand] + ". Types moeten matchen en mogen geen VOID zijn, gevonden is [" + L.type.toString() + "," + R.type.toString() + "]");
				}
				this.type = Type.BOOLEAN;
				break;
			// bool x bool => bool
			case VBChecker.AND:
			case VBChecker.OR:
				if(L.type != Type.BOOLEAN || R.type != Type.BOOLEAN) {
					throw new VBException(this, "Foute operands voor " + VBChecker.tokenNames[operand] + ". Toegestaan is [BOOLEAN, BOOLEAN], gevonden is [" + L.type.toString() + "," + R.type.toString() + "]");
				}
				this.type = Type.BOOLEAN;
				break;
			}
		}
	}

}

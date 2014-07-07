tree grammar HokenChecker;

options {
    language=Java;
    tokenVocab=Hoken;
    ASTLabelType=HokenNode;
}

@header {
package hoken.checker;
import hoken.HokenException;
import hoken.ast.*;
}

@members {
private int errors = 0;
private SymbolTable symtab = new SymbolTable();

public int getErrorCount() {
    return this.errors;
}

@Override
public void displayRecognitionError(String[] tokenNames, RecognitionException e)
{
    this.errors++;
    if(e instanceof HokenException)
        emitErrorMessage(e.getMessage());
    else
        super.displayRecognitionError(tokenNames, e);
}
}

program
    :   ^(PROGRAM
            {symtab.openScope();}
            statement*
            {symtab.closeScope();} 
        )
    ;

statement
    :   ^(declaration=VAR type=(INTEGER|CHARACTER|BOOLEAN) (ids+=ID)+)
            {
            	declaration.type = Type.getType($type.text);
                for(Object child : $ids) {
                	String id = ((HokenNode)child).getText();
                    symtab.enter(id, (DeclarationNode)declaration);
                    ((DeclarationNode)declaration).ids.add(id);
                }
            }
    |   ^(declaration=CONST type=(INTEGER|CHARACTER|BOOLEAN) (ids+=ID)+ operand)
            {
                declaration.type = Type.getType($type.text);
                ((DeclarationNode)declaration).isConstant = true;
                for(Object child : $ids) {
                	String id = ((HokenNode)child).getText();
                    symtab.enter(id, (DeclarationNode)declaration);
                    ((DeclarationNode)declaration).ids.add(id);
                }
            }
    |   expr
    ;

expr:   ^(exp=(PLUS|MINUS) expr expr?)
            {((ExpressionNode)exp).check();}
    |   ^(exp=NOT expr)
            {((ExpressionNode)exp).check();}
    |   ^(exp=(DIVIDE|MODULO|TIMES|AND|OR|LT|LTE|GT|GTE|EQ|NEQ) expr expr)
            {((ExpressionNode)exp).check();}
    |   ^(compound=COMPOUND
            {symtab.openScope();} 
            statement*
            {symtab.closeScope();}
            {compound.type = ((HokenNode)compound.getChild(compound.getChildCount()-1)).type;}
        )
    |   ^(assign=ASSIGN expr expr)
        {
            IdNode id;
            if(((HokenNode)$assign.getChild(0)).getType() != ID) {
                throw new HokenException($assign, "Linkerkant van een toekenning moet een identifier zijn.");
            } else {
                id = (IdNode)$assign.getChild(0);
            }
            if(id.declaration.isConstant) {
                throw new HokenException($assign, "Identifier '" + id.getText() + "' is een constante.");
            }
            Type ex_type = ((HokenNode)$assign.getChild(1)).type;
            if(id.type != ex_type) {
                throw new HokenException($assign, "Verkeerde combinatie: identifier '" + id.getText() + "' is van type " + id.type.toString() + ", maar er wordt " + ex_type.toString() + " toegekend");
            }
            ((HokenNode)$assign).type = ex_type;
        }
    |   ^(write=WRITE expr+)
        { 
            for(Object child : write.getChildren()) {
                HokenNode expr = (HokenNode)child;
                if(expr.type == Type.VOID)
                    throw new HokenException(write, "Verkeerd argument: verwachtte [INTEGER, BOOLEAN, CHARACTER], kreeg VOID");
            }
            if(write.getChildCount() == 1)
                write.type = ((HokenNode)write.getChild(0)).type;
            else
                write.type = Type.VOID;
        }
    |   ^(read=READ idref+)
        {
            if($read.getChildCount() == 1)
                read.type = symtab.retrieve(read.getChild(0)).type;
            else {
                read.type = Type.VOID;
                for(Object id : $read.getChildren())
                    symtab.retrieve((HokenNode)id);
            }
        }
    |   operand
    ;

operand    
    :   idref
    |   i=INT
        { i.type = Type.INTEGER; }
    |   c=CHAR
        { c.type = Type.CHARACTER; }
    |   b=(TRUE|FALSE)
        { b.type = Type.BOOLEAN; }
    ;

idref
    :   id=ID
        {
            DeclarationNode ref = symtab.retrieve($id);
            ((IdNode)$id).declaration = ref;
            ((IdNode)$id).type = ref.type;
        }
    ;

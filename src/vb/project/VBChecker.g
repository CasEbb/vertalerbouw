tree grammar VBChecker;

options {
    language=Java;
    output=AST;
    tokenVocab=VB;
    ASTLabelType=VBNode;
}

@header {
package vb.project;
import vb.project.nodes.*;
}

@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

@members {
private SymbolTable symtab = new SymbolTable();
}

program
    :   ^(PROGRAM
            {symtab.openScope();}
            (statements+=statement)*
            {symtab.closeScope();} 
        )
    ;

statement
    :   ^(declaration=VAR type=(INTEGER|CHARACTER|BOOLEAN) (ids+=ID)+)
            {
                for(Object id : $ids) {
                    symtab.enter(((CommonTree)id).getText(), (DeclarationNode)declaration);
                    ((DeclarationNode)declaration).type = Type.valueOf($type.text.toUpperCase());
                }
            }
    |   ^(declaration=CONST type=(INTEGER|CHARACTER|BOOLEAN) (ids+=ID)+ operand)
            {
                for(Object id : $ids) {
                    symtab.enter(((CommonTree)id).getText(), (DeclarationNode)declaration);
                    ((DeclarationNode)declaration).type = Type.valueOf($type.text.toUpperCase());
                    ((DeclarationNode)declaration).isConstant = true;
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
            (stats+=statement)*
            {symtab.closeScope();}
        )
        {
            VBNode C = (VBNode)$compound;
            C.type = Type.VOID;
            for(int i = $stats.size() - 1; i >= 0; i--) {
                VBNode child = (VBNode)C.getChild(i);
                if(child.type != Type.VOID) {
                    C.type = child.type;
                    break;
                }
            }
        }
    |   ^(assign=ASSIGN expr expr)
        {
            IdNode id;
            if(((VBNode)$assign.getChild(0)).getType() != ID) {
                throw new VBException($assign, "Linkerkant van een toekenning moet een identifier zijn.");
            } else {
                id = (IdNode)$assign.getChild(0);
            }
            if(id.declaration.isConstant) {
                throw new VBException($assign, "Identifier '" + id.getText() + "' is een constante.");
            }
            Type ex_type = ((VBNode)$assign.getChild(1)).type;
            if(id.type != ex_type) {
                throw new VBException($assign, "Verkeerde combinatie: identifier '" + id.getText() + "' is van type " + id.type.toString() + ", maar er wordt " + ex_type.toString() + " toegekend");
            }
            ((VBNode)$assign).type = ex_type;
        }
    |   ^(write=WRITE (exprs+=expr)+)
        {
            VBNode W = (VBNode)$write;
            for(int i = 0; i < $exprs.size(); i++) {
                if(((VBNode)$write.getChild(i)).type == Type.VOID) {
                    throw new VBException($write, "Verkeerd argument: verwachtte [INTEGER, BOOLEAN, CHARACTER], kreeg VOID");
                }
            }
            if($exprs.size() == 1) {
                W.type = ((VBNode)W.getChild(0)).type;
            } else {
                W.type = Type.VOID;
            }
        }
    |   ^(read=READ (ids+=ID)+)
        {
            VBNode R = (VBNode)$read;
            R.type = Type.VOID;
            if($ids.size() == 1) {
                R.type = symtab.retrieve(((IdNode)R.getChild(0)).getText()).type;
            } else {
                for(Object id : $ids) {
                    symtab.retrieve(((VBNode)id).getText());
                }
            }
        }
    |   operand
    ;

operand    
    :   
        id=ID
        {
            IdNode I = (IdNode)$id;
            DeclarationNode ref = symtab.retrieve($id.text);
            I.declaration = ref;
            I.type = ref.type;
        }
    |   i=INT
        { ((VBNode)$i).type = Type.INTEGER; }
    |   c=CHAR
        { ((VBNode)$c).type = Type.CHARACTER; }
    |   b=(TRUE|FALSE)
        { ((VBNode)$b).type = Type.BOOLEAN; }
    ;

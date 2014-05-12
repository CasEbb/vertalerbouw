tree grammar CalcChecker;

options {
    tokenVocab=Calc;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week3.calc;
import java.util.Set;
import java.util.HashSet;
}

// Alter code generation so catch-clauses get replaced with this action. 
// This disables ANTLR error handling: CalcExceptions are propagated upwards.
@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

@members {
    // idset - a set of declared identifiers.
    private Set<String> idset = new HashSet<String>();   
    
    public boolean  isDeclared(String s)     { return idset.contains(s); }
    public void     declare(String s)        { idset.add(s);             }
}

program
    :   ^(PROGRAM (declaration | statement)+)
    ;
    
declaration
    :   ^(VAR id=IDENTIFIER type)
        {   if (isDeclared($id.text))
                throw new CalcException($id, "is already declared");
            else 
                declare($id.getText()); 
        }
    ;
 
statement 
    :   becomes
    |   ^(PRINT expr)
    |   ^(SWAP  IDENTIFIER IDENTIFIER)
    |   ^(DO statement+ ^(WHILE expr))
    ;

becomes
	:   ^(BECOMES IDENTIFIER assignment)
    ;

assignment
    :   expr
    |   becomes
    ;

expr
    :   binary_expr
    |   ^(IF expr expr expr)
    ;
    
binary_expr
    :   expr1
    |   ^(LT expr expr)
    |   ^(LTE expr expr)
    |   ^(GT expr expr)
    |   ^(GTE expr expr)
    |   ^(EQUALS expr expr)
    |   ^(NEQUALS expr expr)
    ;
    
expr1 
    :   expr2
    |   ^(PLUS expr expr)
    |   ^(MINUS expr expr)
    ;
    
expr2
    :   operand
    |   ^(TIMES expr expr)
    |   ^(DIVIDE expr expr)
    ;
    
operand
    :   id=IDENTIFIER 
        {   if (!isDeclared($id.text))
                throw new CalcException($id, "is not declared");
        }
    |   n=NUMBER 
    ;
    
type
    :   INTEGER
    ;

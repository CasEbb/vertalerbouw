// [file: CalcInterpreter.g, started: 22-Apr-2008]
//
// Calc - Simple calculator with memory variables.
// CalcInterpreter.g: interpreter
//
// @author   Theo Ruys
// @version  2008.04.22

tree grammar CalcInterpreter;

options {
    tokenVocab=Calc;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week3.calc;
import java.util.Map;
import java.util.HashMap;
}

@members { 
    private Map<String,Integer> store = new HashMap<String,Integer>();   
}

program
    :   ^(PROGRAM (declaration | statement)+)
    ;
    
declaration
    :   ^(VAR id=IDENTIFIER type)
            { store.put($id.text, 0); } 
    ;

statement
    :   becomes
    |   ^(PRINT v=expr)
            { System.out.println("" + v);   }
    |   ^(SWAP  var1=IDENTIFIER var2=IDENTIFIER)
            { int new1 = store.get($var2.text); int new2 = store.get($var1.text); store.put($var1.text, new1); store.put($var2.text, new2); }
    | { int idx = input.index(); }  ^(DO statements=statement+ ^(WHILE cond=expr))
        {    
	        if(cond != 0) {
	        	input.rewind(idx);
	        }
        }
    ;

becomes returns [int val = 0;]
	:   ^(BECOMES id=IDENTIFIER v=assignment)
            { store.put($id.text, v); val = v;      }
    ;

assignment returns [int val = 0;]
    :   z=expr { val = z; }
    |   z=becomes { val = z; }
    ;
    
expr returns [int val = 0;]
    :   z=binary_expr                   { val = z;      }
    |   ^(IF cond=expr trueval=expr falseval=expr)
        {
    		if(cond != 0) {
    		  val = trueval;
    		} else {
    		  val = falseval;
    		}
        }
    ;

binary_expr returns [int val = 0;]
    :   z=expr1 { val = z; }
    |   ^(LT      a=expr b=expr) { val = (a <  b) ? 1 : 0; }
    |   ^(LTE     a=expr b=expr) { val = (a <= b) ? 1 : 0; }
    |   ^(GT      a=expr b=expr) { val = (a >  b) ? 1 : 0; }
    |   ^(GTE     a=expr b=expr) { val = (a >= b) ? 1 : 0; }
    |   ^(EQUALS  a=expr b=expr) { val = (a == b) ? 1 : 0; }
    |   ^(NEQUALS a=expr b=expr) { val = (a != b) ? 1 : 0; }
    ;
    
expr1 returns [int val = 0;] 
    :   z=expr2                   { val = z;      }
    |   ^(PLUS x=expr y=expr)   { val = x + y;  }
    |   ^(MINUS x=expr y=expr)  { val = x - y;  }
    ;

expr2 returns [int val = 0;]
    :   z=operand                 { val = z;     }
    |   ^(TIMES x=expr y=expr)  { val = x * y; }
    |   ^(DIVIDE x=expr y=expr)
        {   if (y == 0)
                throw new CalcException("cannot divide by zero");
            else 
                val = x / y;
        }
    ;
    
operand returns [int val = 0]
    :   id=IDENTIFIER   { val = store.get($id.text);       } 
    |   n=NUMBER        { val = Integer.parseInt($n.text); }
    ;
    
type
    :   INTEGER
    ;

tree grammar CalcCodeGenerator;

options {
    tokenVocab=Calc;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week4.xcalc;
import java.util.Map;
import java.util.HashMap;
}

@members { 
    private Map<String,Integer> store = new HashMap<String,Integer>();
    private int storeCounter = 0;
    private int labelCounter = 1;
}

program
    :   ^(PROGRAM (declaration | statement)+)
        {
            System.out.println("HALT         ");
        }
    ;
    
declaration
    :   ^(VAR id=IDENTIFIER type)
        {
        	System.out.println("PUSH        1");
        	System.out.println("LOADL       0");
        	System.out.println("STORE(1)    " + storeCounter + "[SB]");
        	store.put($id.text, storeCounter++);
        } 
    ;

statement
    :   becomes { System.out.println("POP(0)      1"); }
    |   ^(PRINT v=expr)
        {
        	System.out.println("CALL        putint");
        	System.out.println("CALL        puteol");
        }
    |   ^(SWAP  var1=IDENTIFIER var2=IDENTIFIER)
        {
        	System.out.println("LOAD(1)      " + store.get($var1.text) + "[SB]");
        	System.out.println("LOAD(1)      " + store.get($var2.text) + "[SB]");
            System.out.println("STORE(1)     " + store.get($var1.text) + "[SB]");
            System.out.println("STORE(1)     " + store.get($var2.text) + "[SB]");   
        }
    |   {
    		int labelNo = labelCounter++;
            System.out.print("L" + labelNo + ": ");
        }
        ^(DO statements=statement+ ^(WHILE cond=expr))
        {    
        	System.out.println("LOADL       0");
        	System.out.println("LOADL       1");
        	System.out.println("CALL        ne");
	        System.out.println("JUMPIF(1)   L" + labelNo + "[CB]");
        }
    ;

becomes
	:   ^(BECOMES id=IDENTIFIER v=assignment)
        {
        	System.out.println("STORE(1)    " + store.get($id.text) + "[SB]");
        	System.out.println("LOAD(1)     " + store.get($id.text) + "[SB]");
        	
        }
    ;

assignment
    :   z=expr
    |   z=becomes
    ;
    
expr
    :   z=binary_expr
    |   ^(IF cond=expr
        {
        	int falseLabel = labelCounter++;
        	int endLabel   = labelCounter++;
            System.out.println("LOADL       0");
            System.out.println("LOADL       1");
            System.out.println("CALL        ne");
            System.out.println("JUMPIF(0)   L" + falseLabel + "[CB]");
        } trueval=expr
        {
        	System.out.println("JUMP        L" + endLabel + "[CB]");
        	System.out.print("L" + falseLabel + ": ");
        } falseval=expr)
        {
    		System.out.print("L" + endLabel + ": ");
        }
    ;

binary_expr
    :   z=expr1
    |   ^(LT      a=expr b=expr) { System.out.println("CALL        lt"); }
    |   ^(LTE     a=expr b=expr) { System.out.println("CALL        le"); }
    |   ^(GT      a=expr b=expr) { System.out.println("CALL        gt"); }
    |   ^(GTE     a=expr b=expr) { System.out.println("CALL        ge"); }
    |   ^(EQUALS  a=expr b=expr) { System.out.println("LOADL       1"); System.out.println("CALL        eq"); }
    |   ^(NEQUALS a=expr b=expr) { System.out.println("LOADL       1"); System.out.println("CALL        ne"); }
    ;
    
expr1
    :   z=expr2
    |   ^(PLUS x=expr y=expr)   { System.out.println("CALL        add");  }
    |   ^(MINUS x=expr y=expr)  { System.out.println("CALL        sub");  }
    ;

expr2
    :   z=operand
    |   ^(TIMES x=expr y=expr)  { System.out.println("CALL        mult"); }
    |   ^(DIVIDE x=expr y=expr) { System.out.println("CALL        div"); }
    ;
    
operand
    :   id=IDENTIFIER
        {
        	System.out.println("LOAD(1)     " + store.get($id.text) + "[SB]");
        } 
    |   n=NUMBER
        {
        	System.out.println("LOADL       " + $n.text);
        }
    ;
    
type
    :   INTEGER
    ;

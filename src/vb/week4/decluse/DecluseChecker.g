tree grammar DecluseChecker;

options {
    tokenVocab=Decluse;                    // import tokens from Calc.tokens
    ASTLabelType=CommonTree;            // AST nodes are of type CommonTree
}

@header {
package vb.week4.decluse;
}

@members { 
private SymbolTable symtab = new SymbolTable();
}

@rulecatch { 
    catch (RecognitionException e) { 
        throw e; 
    } 
}

decluse
    :   { symtab.openScope(); } ^(DECLUSE element*) { symtab.closeScope(); }
    ;

element
    :   ^(DECL id=ID) { symtab.enter($id.text, new Attribute("")); }
    |   ^(USE  id=ID) { symtab.retrieve($id.text); }
    |   { symtab.openScope(); } ^(LPAREN element*) { symtab.closeScope(); }
    ;


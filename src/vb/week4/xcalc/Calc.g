grammar Calc;

options {
    k=1;                                // LL(1) - do not use LL(*)
    language=Java;                      // target language is Java (= default)
    output=AST;                         // build an AST
}

tokens {
    COLON       =   ':'     ;
    SEMICOLON   =   ';'     ;
    LPAREN      =   '('     ;
    RPAREN      =   ')'     ;
    COMMA       =   ','     ;

    // operators
    BECOMES     =   ':='    ;
    PLUS        =   '+'     ;
    MINUS       =   '-'     ;
    TIMES       =   '*'     ;
    DIVIDE      =   '/'     ;   
    LT          =   '<'     ;
    LTE         =   '<='    ;
    GT          =   '>'     ;
    GTE         =   '>='    ;
    EQUALS      =   '=='    ;
    NEQUALS     =   '!='    ;

    // keywords
    PROGRAM     =   'program'   ;
    VAR         =   'var'       ;
    PRINT       =   'print'     ;
    SWAP        =   'swap'      ;
    INTEGER     =   'integer'   ;
    IF          =   'if'        ;
    THEN        =   'then'      ;
    ELSE        =   'else'      ;
    DO          =   'do'        ;
    WHILE       =   'while'     ;
}

@lexer::header {
package vb.week4.xcalc;
}

@header {
package vb.week4.xcalc;
}

// Parser rules

program
    :   commands EOF
            ->  ^(PROGRAM commands)
    ;

commands
    :   (declaration SEMICOLON!)* statements (declarations statements)*
    ;
    
declarations
    :   (declaration SEMICOLON!)+
    ;
    
statements
    :   (statement SEMICOLON!)+
    ;

declaration
    :   VAR^ IDENTIFIER COLON! type
    ;
    
statement
    :   expr
    |   print_stat
    |   swap_stat
    |   dowhile_stat    
    ;

expr
    :   if_expr
    |   binary_expr
    ;

print_stat
    :   PRINT^ LPAREN! expr RPAREN!
    ;

swap_stat
    :   SWAP^ LPAREN! IDENTIFIER COMMA! IDENTIFIER RPAREN!
    ;

dowhile_stat
    :   DO statements WHILE expr -> ^(DO statements ^(WHILE expr))
    ;

if_expr
    :   IF^ expr THEN! expr ELSE! expr
    ;

lvalue
    :   IDENTIFIER
    ;
    
binary_expr
    :   add_expr (((LT^ | LTE^ | GT^ | GTE^ | EQUALS^ | NEQUALS^) add_expr) | (BECOMES^ expr) )?
    ;
    
add_expr
    :   mult_expr ((PLUS^ | MINUS^) mult_expr )*
    ;

mult_expr
    :   operand ((TIMES^ | DIVIDE^) operand )*
    ;

operand
    :   IDENTIFIER
    |   NUMBER
    |   LPAREN! expr RPAREN!
    ;

type
    :   INTEGER
    ;


// Lexer rules

IDENTIFIER
    :   LETTER (LETTER | DIGIT)*
    ;

NUMBER
    :   DIGIT+
    ;


COMMENT
    :   '//' .* '\n' 
            { $channel=HIDDEN; }
    ;

WS
    :   (' ' | '\t' | '\f' | '\r' | '\n')+
            { $channel=HIDDEN; }
    ;

fragment DIGIT  :   ('0'..'9') ;
fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;

// EOF


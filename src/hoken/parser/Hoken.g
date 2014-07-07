grammar Hoken;

options {
    k=1;
    language=Java;
    output=AST;
    ASTLabelType=HokenNode;
}

tokens {
    // hulptokens
    SEMICOLON = ';';
    COLON = ':';
    ASSIGN = ':=';
    EQUALS = '=';
    LPAREN = '(';
    RPAREN = ')';
    COMMA = ',';
    LCURLY = '{';
    RCURLY = '}';
    
    // operands
    OR = '||';
    AND = '&&';
    PLUS = '+';
    MINUS = '-';
    NOT = '!';
    TIMES = '*';
    DIVIDE = '/';
    MODULO = '%';
    GT = '>';
    GTE = '>=';
    LT = '<';
    LTE = '<=';
    EQ = '==';
    NEQ = '<>';

    // keywords
    // io
    WRITE = 'skrieben';
    READ = 'vraogen';
    // variabelen
    CONST = 'blievend';
    INTEGER = 'getalletjen';
    BOOLEAN = 'walofneet';
    CHARACTER = 'lettertjen';
    // waarden
    TRUE = 'wal';
    FALSE = 'neet';

    // pseudo-tokens voor de AST
    COMPOUND;
    PROGRAM;
    VAR;
}

@lexer::header {
package hoken.parser;
}

@header {
package hoken.parser;
import hoken.HokenException;
import hoken.ast.*;
}

@members {
private int errors = 0;

public int getErrorCount() {
    return this.errors;
}

@Override
public void displayRecognitionError(String[] tokenNames, RecognitionException e)
{
    this.errors++;
    emitErrorMessage("'" + e.token.getText() + "' (regel: " + e.line + ", kolom: " + e.charPositionInLine + ") " + getErrorMessage(e, tokenNames));
}
}

program
    :   statements EOF
        -> ^(PROGRAM statements)
    ;

statements
    :   (statement SEMICOLON!)*
    ;

statement
    :   decl
    |   expr
    ;

decl:   type id_list
        -> ^(VAR<DeclarationNode> type id_list)
    |   CONST<DeclarationNode>^ type id_list EQUALS! value
    ;
    
expr:   assignment_expr
    ;

assignment_expr
    :   logical_or_expr (ASSIGN^ assignment_expr)?
    ;

read_stat
    :   READ^ LPAREN! id_list RPAREN!
    ;

write_stat
    :   WRITE^ LPAREN! expr_list RPAREN!
    ;

compound_stat
    :   LCURLY statements RCURLY
        -> ^(COMPOUND statements)
    ;

logical_or_expr
    :   logical_and_expr (OR<ExpressionNode>^ logical_and_expr)*
    ;

logical_and_expr
    :   logical_comparative_expr (AND<ExpressionNode>^ logical_comparative_expr)*
    ;

logical_comparative_expr
    :   additive_expr
        (
            ( LT <ExpressionNode>^
            | LTE<ExpressionNode>^
            | GTE<ExpressionNode>^
            | GT <ExpressionNode>^
            | EQ <ExpressionNode>^
            | NEQ<ExpressionNode>^
            )
        additive_expr)*
    ;

additive_expr
    :   multiplicative_expr
        (
            ( PLUS <ExpressionNode>^
            | MINUS<ExpressionNode>^
            )
        multiplicative_expr)*
    ;

multiplicative_expr
    :   unary_expr
        (
            ( TIMES <ExpressionNode>^
            | DIVIDE<ExpressionNode>^
            | MODULO<ExpressionNode>^
        ) unary_expr)*
    ;

unary_expr
    :   ( PLUS<ExpressionNode>^
        | MINUS<ExpressionNode>^
        | NOT<ExpressionNode>^
        )? operand
    ;

operand
    :   ID<IdNode>
    |   value
    |   read_stat
    |   write_stat
    |   compound_stat
    |   LPAREN! expr RPAREN!
    ;

//=========================
//  LIJSTEN
//=========================
id_list
    :   ID<IdNode> (COMMA! ID<IdNode>)*
    ;

expr_list
    :   expr (COMMA! expr)*
    ;

//=========================
//  TYPEN/WAARDEN
//=========================
value
    :   CHAR
    |   INT
    |   bool
    ;

type:   INTEGER
    |   BOOLEAN
    |   CHARACTER
    ;

ID  :   (LETTER|UNDERSCORE) (LETTER|DIGIT|UNDERSCORE)*
    ;

INT :	  DIGIT+
    ;

CHAR:  '\'' LETTER '\''
    ;

bool:   TRUE
    |   FALSE
    ;

//=========================
//  COMMENTAAR/WITRUIMTE
//=========================
COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

//=========================
//  FRAGMENTS
//=========================
fragment
LETTER
    :   'a'..'z'
    |   'A'..'Z'
    ;

fragment
DIGIT
    :   '0'..'9'
    ;

fragment
UNDERSCORE
    :   '_'
    ;


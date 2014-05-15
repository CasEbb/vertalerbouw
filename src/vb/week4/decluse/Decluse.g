grammar Decluse;

options {
  k=1;
  language=Java;
  output=AST;
}

tokens {
  LPAREN = '(';
  RPAREN = ')';
  DECL = 'D:';
  USE = 'U:';
  DECLUSE = 'DECLUSE';
}

@header {
package vb.week4.decluse;
}

@lexer::header {
package vb.week4.decluse;
}

decluse
  :  serie EOF -> ^(DECLUSE serie)
  ;

serie
  :  LPAREN^ unit* RPAREN!
  ;

unit
  :  DECL^ ID
  |  USE^ ID
  |  serie
  ;

ID
  :  LETTER+
  ;

WS
  :  (' ' | '\t' | '\f' | '\r' | '\n')+
     { $channel=HIDDEN; }
  ;  

fragment LOWER  :   ('a'..'z') ;
fragment UPPER  :   ('A'..'Z') ;
fragment LETTER :   LOWER | UPPER ;

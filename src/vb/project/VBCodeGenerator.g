tree grammar VBCodeGenerator;

options {
    language=Java;
    output=template;
    tokenVocab=VB;
    ASTLabelType=VBNode;
}

@header {
package vb.project;
}

@members {
private SymbolTable symtab = new SymbolTable();
}

program
    :   ^(PROGRAM (statements+=statement)*)
          { int numPop = symtab.closeScope(); }
          -> program(instructions={$statements}, pop={numPop})
    ;

statement
    :   ^(VAR type (ids+=ID)+)
          { for(Object id : $ids) { symtab.enter(((VBNode)id).getText()); } }
          -> declaration(size={$ids.size()})
    |   ^(CONST type (ids+=ID)+ operand)
          { for(Object id : $ids) { symtab.enter(((VBNode)id).getText()); } }
          -> declaration(size={$ids.size()})
    |   expr { $st = $expr.st; }
    ;

expr:   ^(PLUS x=expr y=expr?)
          -> addexpr(x={$x.st}, y={$y.st})  
    |   ^(MINUS x=expr y=expr?)
          -> subexpr(x={$x.st}, y={$y.st})  
    |   ^(NOT x=expr)
          -> notexpr(x={$x.st})
    |   ^(TIMES x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"mult"})
    |   ^(DIVIDE x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"div"})
    |   ^(MODULO x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"mod"})
    |   ^(COMPOUND { symtab.openScope(); } (statements+=statement)*)
          { int numPop = symtab.closeScope(); }
          -> compound(instructions={$statements}, pop={numPop})
    |   ^(AND x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"and"})
    |   ^(OR x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"or"})
    |   ^(LT x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"lt"})
    |   ^(LTE x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"le"})
    |   ^(GT x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"gt"})
    |   ^(GTE x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"ge"})
    |   ^(EQ x=expr y=expr)
          -> ifexpr(x={$x.st}, y={$y.st}, instr={"eq"})
    |   ^(NEQ x=expr y=expr)
          -> ifexpr(x={$x.st}, y={$y.st}, instr={"ne"})
    |   ^(ASSIGN id=ID e=expr)
          -> assign(var={$id.text}, addr={symtab.retrieve($id.text)}, expr={$e.st})
    |   ^(WRITE (exprs+=expr)+)
          -> write(expressions={$exprs})
    |   ^(READ (ids+=ID)+)
          {
            List<Integer> addresses = new ArrayList<Integer>();
            for(Object id1 : $ids) {
              addresses.add(symtab.retrieve(((VBNode)id1).getText()));
            }
          }
          -> read(addresses={addresses})
    |   operand { $st = $operand.st; }
    ;

operand    
    :   id=ID
          -> load(var={$id.text}, addr={symtab.retrieve($id.text)})
    |   intval=INT
          -> integer(val={$intval.text})
    |   charval=CHAR
          -> character(val={(int)$charval.text.charAt(1)})
    |   TRUE
          -> integer(val={1})
    |   FALSE
          -> integer(val={0})
    ;

type
    :   INTEGER
    |   CHARACTER
    |   BOOLEAN
    ;

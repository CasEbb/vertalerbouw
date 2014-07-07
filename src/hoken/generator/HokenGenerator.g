tree grammar HokenGenerator;

options {
    language=Java;
    output=template;
    tokenVocab=Hoken;
    ASTLabelType=HokenNode;
}

@header {
package hoken.generator;
import hoken.ast.*;
}

@members {
private int nextAddr = 0;
private int scopeCounter = 0;
private Stack<Integer> popCounter = new Stack<Integer>();

class IOInstruction {
    public Object attr;
    public Type type;
    IOInstruction(Object attr, Type type) {
        this.attr = attr;
        this.type = type;
    }
    public boolean isCharacter() { return this.type == Type.CHARACTER; }
    public boolean isInteger()   { return this.type == Type.INTEGER;   }
    public boolean isBoolean()   { return this.type == Type.BOOLEAN;   }
}
}

program
    :   ^(PROGRAM (statements+=statement)*)
            -> program(instructions={$statements})
    ;

statement
    :   ^(declaration=VAR (INTEGER|CHARACTER|BOOLEAN) (ids+=ID)+)
            {
                ((DeclarationNode)declaration).address = this.nextAddr;
                this.nextAddr     += $ids.size();
                this.scopeCounter += $ids.size();
            }
            -> declaration(size={$ids.size()})
    |   ^(declaration=CONST (INTEGER|CHARACTER|BOOLEAN) (ids+=ID)+ val=operand)
            {
                ((DeclarationNode)declaration).address = this.nextAddr;
                this.nextAddr     += $ids.size();
                this.scopeCounter += $ids.size();

                List<Integer> addrs = new ArrayList<Integer>();
                for(int i = 0; i < $ids.size(); i++)
                    addrs.add(((DeclarationNode)declaration).address + i);
            }
            -> constant(size={$ids.size()}, addrs={addrs}, val={val})
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
    |   ^(compound=COMPOUND
          {
              this.popCounter.push(this.scopeCounter);
              this.scopeCounter = 0;
          }
          (statements+=statement)*)
          {
              int pop            = this.scopeCounter;            // onthouden hoeveel variabelen we moeten poppen
              this.scopeCounter  = this.popCounter.pop();        // scopeCounter terugzetten op de vorige scope
              this.nextAddr     -= pop;                          // volgende adres kan omlaag
              int result         = (compound.type != Type.VOID) ? 1 : 0; // onthoud een result als compound niet VOID is
          }
          -> compound(instructions={$statements}, numPop={pop}, popResult={result})
    |   ^(op=AND x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"and"}, noReturn={op.shouldNotReturn()})
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
    |   ^(assign=ASSIGN id=ID e=expr)
          -> assign(expr={$e.st}, addr={((IdNode)$id).declaration.getOffsettedAddress((IdNode)$id)}, noReturn={assign.shouldNotReturn()})
    |   ^(write=WRITE (exprs+=expr)+)
      {
        List<IOInstruction> writes = new ArrayList<IOInstruction>();
        for(Object child : write.getChildren()) {
          HokenNode expr = (HokenNode)child;
          writes.add(new IOInstruction($exprs.get(expr.childIndex), expr.type));
        }  
      }
          -> write(writes={writes}, noReturn={write.shouldNotReturn()})
    |   ^(read=READ (ids+=ID)+)
        {
            List<IOInstruction> reads = new ArrayList<IOInstruction>();
            for(Object child : $ids) {
                IdNode I = (IdNode)child;
                reads.add(new IOInstruction(I.declaration.getOffsettedAddress(I), I.declaration.type));
            }
        }
          -> read(reads={reads}, noReturn={read.shouldNotReturn()})
    |   operand { $st = $operand.st; }
    ;

operand    
    :   id=ID
        {IdNode I = (IdNode)$id;}
          -> load(addr={((IdNode)$id).declaration.getOffsettedAddress(I)})
    |   intval=INT
          -> integer(val={$intval.text})
    |   charval=CHAR
          -> integer(val={(int)$charval.text.charAt(1)})
    |   TRUE
          -> integer(val={1})
    |   FALSE
          -> integer(val={0})
    ;

tree grammar HokenGenerator;

options {
    language=Java;
    output=template;
    tokenVocab=Hoken;
    ASTLabelType=HokenNode;
}

@header {
package hoken.generator;
import hoken.Compiler.Target;
import hoken.ast.*;
}

@members {
public Target target = Target.TAM;
public int nextAddr = 0;
private int scopeCounter = 0;
private int nextLabel = 0;
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

program[String name]
    :   ^(PROGRAM (statements+=statement)*)
            -> program(name={name}, instructions={$statements})
    ;

statement
    :   ^(declaration=VAR (INTEGER|CHARACTER|BOOLEAN) (ids+=ID)+)
            {
                ((DeclarationNode)declaration).address = this.nextAddr;
                this.nextAddr     += $ids.size();
                this.scopeCounter += $ids.size();

                List<Integer> addrs = new ArrayList<Integer>();
                for(int i = 0; i < $ids.size(); i++)
                    addrs.add(((DeclarationNode)declaration).address + i);
            }
            -> declaration(size={$ids.size()}, addrs={addrs})
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

expr:   ^(op=PLUS x=expr y=expr?)
          -> addexpr(x={$x.st}, y={$y.st}, noReturn={op.shouldNotReturn()})  
    |   ^(op=MINUS x=expr y=expr?)
          -> subexpr(x={$x.st}, y={$y.st}, noReturn={op.shouldNotReturn()})  
    |   ^(op=NOT x=expr)
          -> notexpr(x={$x.st}, noReturn={op.shouldNotReturn()}, label={this.nextLabel++})
    |   ^(op=TIMES x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={(target==Target.JVM?"mul":"mult")}, noReturn={op.shouldNotReturn()})
    |   ^(op=DIVIDE x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"div"}, noReturn={op.shouldNotReturn()})
    |   ^(op=MODULO x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={(target==Target.JVM?"rem":"mod")}, noReturn={op.shouldNotReturn()})
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
    |   ^(op=OR x=expr y=expr)
          -> binexpr(x={$x.st}, y={$y.st}, instr={"or"}, noReturn={op.shouldNotReturn()})
    |   ^(op=LT x=expr y=expr)
          -> ifexpr(x={$x.st}, y={$y.st}, instr={"lt"}, noReturn={op.shouldNotReturn()}, label={this.nextLabel++})
    |   ^(op=LTE x=expr y=expr)
          -> ifexpr(x={$x.st}, y={$y.st}, instr={"le"}, noReturn={op.shouldNotReturn()}, label={this.nextLabel++})
    |   ^(op=GT x=expr y=expr)
          -> ifexpr(x={$x.st}, y={$y.st}, instr={"gt"}, noReturn={op.shouldNotReturn()}, label={this.nextLabel++})
    |   ^(op=GTE x=expr y=expr)
          -> ifexpr(x={$x.st}, y={$y.st}, instr={"ge"}, noReturn={op.shouldNotReturn()}, label={this.nextLabel++})
    |   ^(op=EQ x=expr y=expr)
          -> ifexpr(x={$x.st}, y={$y.st}, instr={"eq"}, noReturn={op.shouldNotReturn()}, wordLength={true}, label={this.nextLabel++})
    |   ^(op=NEQ x=expr y=expr)
          -> ifexpr(x={$x.st}, y={$y.st}, instr={"ne"}, noReturn={op.shouldNotReturn()}, wordLength={true}, label={this.nextLabel++})
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
          -> load(addr={I.declaration.getOffsettedAddress(I)})
    |   intval=INT
          -> integer(val={$intval.text})
    |   charval=CHAR
          -> integer(val={(int)$charval.text.charAt(1)})
    |   TRUE
          -> integer(val={1})
    |   FALSE
          -> integer(val={0})
    ;

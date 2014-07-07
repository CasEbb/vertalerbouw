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
              this.nextAddr += $ids.size();
          }
          -> declaration(size={$ids.size()})
    |   ^(CONST (INTEGER|CHARACTER|BOOLEAN) (ids+=ID)+ operand)
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
    |   ^(COMPOUND (statements+=statement)*)
          -> compound(instructions={$statements})
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
    |   ^(assign=ASSIGN id=ID e=expr)
          -> assign(expr={$e.st}, addr={((IdNode)$id).declaration.address})
    |   ^(write=WRITE (exprs+=expr)+)
    	{
    		List<IOInstruction> writes = new ArrayList<IOInstruction>();
    		for(Object child : write.getChildren()) {
    			HokenNode expr = (HokenNode)child;
    			writes.add(new IOInstruction($exprs.get(expr.childIndex), expr.type));
    		}  
    	}
          -> write(writes={writes})
    |   ^(read=READ (ids+=ID)+)
        {
            List<IOInstruction> reads = new ArrayList<IOInstruction>();
            for(Object child : $ids) {
                IdNode I = (IdNode)child;
                reads.add(new IOInstruction(I.declaration.address, I.declaration.type));
            }
        }
          -> read(reads={reads})
    |   operand { $st = $operand.st; }
    ;

operand    
    :   id=ID
          -> load(addr={((IdNode)$id).declaration.address})
    |   intval=INT
          -> integer(val={$intval.text})
    |   charval=CHAR
          -> integer(val={(int)$charval.text.charAt(1)})
    |   TRUE
          -> integer(val={1})
    |   FALSE
          -> integer(val={0})
    ;

// $ANTLR 3.5.2 src\\hoken\\generator\\HokenGenerator.g 2014-07-09 12:47:38

package hoken.generator;
import hoken.Compiler.Target;
import hoken.ast.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class HokenGenerator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BOOLEAN", "CHAR", 
		"CHARACTER", "COMMA", "COMMENT", "COMPOUND", "CONST", "DIGIT", "DIVIDE", 
		"EQ", "EQUALS", "FALSE", "GT", "GTE", "ID", "INT", "INTEGER", "LCURLY", 
		"LETTER", "LPAREN", "LT", "LTE", "MINUS", "MODULO", "NEQ", "NOT", "OR", 
		"PLUS", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", "TIMES", "TRUE", 
		"UNDERSCORE", "VAR", "WRITE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BOOLEAN=6;
	public static final int CHAR=7;
	public static final int CHARACTER=8;
	public static final int COMMA=9;
	public static final int COMMENT=10;
	public static final int COMPOUND=11;
	public static final int CONST=12;
	public static final int DIGIT=13;
	public static final int DIVIDE=14;
	public static final int EQ=15;
	public static final int EQUALS=16;
	public static final int FALSE=17;
	public static final int GT=18;
	public static final int GTE=19;
	public static final int ID=20;
	public static final int INT=21;
	public static final int INTEGER=22;
	public static final int LCURLY=23;
	public static final int LETTER=24;
	public static final int LPAREN=25;
	public static final int LT=26;
	public static final int LTE=27;
	public static final int MINUS=28;
	public static final int MODULO=29;
	public static final int NEQ=30;
	public static final int NOT=31;
	public static final int OR=32;
	public static final int PLUS=33;
	public static final int PROGRAM=34;
	public static final int RCURLY=35;
	public static final int READ=36;
	public static final int RPAREN=37;
	public static final int SEMICOLON=38;
	public static final int TIMES=39;
	public static final int TRUE=40;
	public static final int UNDERSCORE=41;
	public static final int VAR=42;
	public static final int WRITE=43;
	public static final int WS=44;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public HokenGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public HokenGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("HokenGeneratorTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return HokenGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\hoken\\generator\\HokenGenerator.g"; }


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


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// src\\hoken\\generator\\HokenGenerator.g:36:1: program[String name] : ^( PROGRAM (statements+= statement )* ) -> program(name=nameinstructions=$statements);
	public final HokenGenerator.program_return program(String name) throws RecognitionException {
		HokenGenerator.program_return retval = new HokenGenerator.program_return();
		retval.start = input.LT(1);

		List<Object> list_statements=null;
		RuleReturnScope statements = null;
		try {
			// src\\hoken\\generator\\HokenGenerator.g:37:5: ( ^( PROGRAM (statements+= statement )* ) -> program(name=nameinstructions=$statements))
			// src\\hoken\\generator\\HokenGenerator.g:37:9: ^( PROGRAM (statements+= statement )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program73); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// src\\hoken\\generator\\HokenGenerator.g:37:19: (statements+= statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= AND && LA1_0 <= ASSIGN)||LA1_0==CHAR||(LA1_0 >= COMPOUND && LA1_0 <= CONST)||(LA1_0 >= DIVIDE && LA1_0 <= EQ)||(LA1_0 >= FALSE && LA1_0 <= INT)||(LA1_0 >= LT && LA1_0 <= PLUS)||LA1_0==READ||(LA1_0 >= TIMES && LA1_0 <= TRUE)||(LA1_0 >= VAR && LA1_0 <= WRITE)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// src\\hoken\\generator\\HokenGenerator.g:37:20: statements+= statement
						{
						pushFollow(FOLLOW_statement_in_program78);
						statements=statement();
						state._fsp--;

						if (list_statements==null) list_statements=new ArrayList<Object>();
						list_statements.add(statements.getTemplate());
						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 38:13: -> program(name=nameinstructions=$statements)
			{
				retval.st = templateLib.getInstanceOf("program",new STAttrMap().put("name", name).put("instructions", list_statements));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statement_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statement"
	// src\\hoken\\generator\\HokenGenerator.g:41:1: statement : ( ^(declaration= VAR ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) -> declaration(size=$ids.size()addrs=addrs)| ^(declaration= CONST ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ val= operand ) -> constant(size=$ids.size()addrs=addrsval=val)| expr );
	public final HokenGenerator.statement_return statement() throws RecognitionException {
		HokenGenerator.statement_return retval = new HokenGenerator.statement_return();
		retval.start = input.LT(1);

		HokenNode declaration=null;
		HokenNode ids=null;
		List<Object> list_ids=null;
		TreeRuleReturnScope val =null;
		TreeRuleReturnScope expr1 =null;

		try {
			// src\\hoken\\generator\\HokenGenerator.g:42:5: ( ^(declaration= VAR ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) -> declaration(size=$ids.size()addrs=addrs)| ^(declaration= CONST ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ val= operand ) -> constant(size=$ids.size()addrs=addrsval=val)| expr )
			int alt6=3;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt6=1;
				}
				break;
			case CONST:
				{
				alt6=2;
				}
				break;
			case AND:
			case ASSIGN:
			case CHAR:
			case COMPOUND:
			case DIVIDE:
			case EQ:
			case FALSE:
			case GT:
			case GTE:
			case ID:
			case INT:
			case LT:
			case LTE:
			case MINUS:
			case MODULO:
			case NEQ:
			case NOT:
			case OR:
			case PLUS:
			case READ:
			case TIMES:
			case TRUE:
			case WRITE:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// src\\hoken\\generator\\HokenGenerator.g:42:9: ^(declaration= VAR ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ )
					{
					declaration=(HokenNode)match(input,VAR,FOLLOW_VAR_in_statement129); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\generator\\HokenGenerator.g:42:27: ( INTEGER | CHARACTER | BOOLEAN )
					int alt2=3;
					switch ( input.LA(1) ) {
					case INTEGER:
						{
						alt2=1;
						}
						break;
					case CHARACTER:
						{
						alt2=2;
						}
						break;
					case BOOLEAN:
						{
						alt2=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:42:28: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_statement132); 
							}
							break;
						case 2 :
							// src\\hoken\\generator\\HokenGenerator.g:42:36: CHARACTER
							{
							match(input,CHARACTER,FOLLOW_CHARACTER_in_statement134); 
							}
							break;
						case 3 :
							// src\\hoken\\generator\\HokenGenerator.g:42:46: BOOLEAN
							{
							match(input,BOOLEAN,FOLLOW_BOOLEAN_in_statement136); 
							}
							break;

					}

					// src\\hoken\\generator\\HokenGenerator.g:42:55: (ids+= ID )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==ID) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:42:56: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_statement142); 
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input, Token.UP, null); 


					                ((DeclarationNode)declaration).address = this.nextAddr;
					                this.nextAddr     += list_ids.size();
					                this.scopeCounter += list_ids.size();

					                List<Integer> addrs = new ArrayList<Integer>();
					                for(int i = 0; i < list_ids.size(); i++)
					                    addrs.add(((DeclarationNode)declaration).address + i);
					            
					// TEMPLATE REWRITE
					// 52:13: -> declaration(size=$ids.size()addrs=addrs)
					{
						retval.st = templateLib.getInstanceOf("declaration",new STAttrMap().put("size", list_ids.size()).put("addrs", addrs));
					}



					}
					break;
				case 2 :
					// src\\hoken\\generator\\HokenGenerator.g:53:9: ^(declaration= CONST ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ val= operand )
					{
					declaration=(HokenNode)match(input,CONST,FOLLOW_CONST_in_statement198); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\generator\\HokenGenerator.g:53:29: ( INTEGER | CHARACTER | BOOLEAN )
					int alt4=3;
					switch ( input.LA(1) ) {
					case INTEGER:
						{
						alt4=1;
						}
						break;
					case CHARACTER:
						{
						alt4=2;
						}
						break;
					case BOOLEAN:
						{
						alt4=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}
					switch (alt4) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:53:30: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_statement201); 
							}
							break;
						case 2 :
							// src\\hoken\\generator\\HokenGenerator.g:53:38: CHARACTER
							{
							match(input,CHARACTER,FOLLOW_CHARACTER_in_statement203); 
							}
							break;
						case 3 :
							// src\\hoken\\generator\\HokenGenerator.g:53:48: BOOLEAN
							{
							match(input,BOOLEAN,FOLLOW_BOOLEAN_in_statement205); 
							}
							break;

					}

					// src\\hoken\\generator\\HokenGenerator.g:53:57: (ids+= ID )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==ID) ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1==CHAR||LA5_1==FALSE||(LA5_1 >= ID && LA5_1 <= INT)||LA5_1==TRUE) ) {
								alt5=1;
							}

						}

						switch (alt5) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:53:58: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_statement211); 
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					pushFollow(FOLLOW_operand_in_statement217);
					val=operand();
					state._fsp--;

					match(input, Token.UP, null); 


					                ((DeclarationNode)declaration).address = this.nextAddr;
					                this.nextAddr     += list_ids.size();
					                this.scopeCounter += list_ids.size();

					                List<Integer> addrs = new ArrayList<Integer>();
					                for(int i = 0; i < list_ids.size(); i++)
					                    addrs.add(((DeclarationNode)declaration).address + i);
					            
					// TEMPLATE REWRITE
					// 63:13: -> constant(size=$ids.size()addrs=addrsval=val)
					{
						retval.st = templateLib.getInstanceOf("constant",new STAttrMap().put("size", list_ids.size()).put("addrs", addrs).put("val", val));
					}



					}
					break;
				case 3 :
					// src\\hoken\\generator\\HokenGenerator.g:64:9: expr
					{
					pushFollow(FOLLOW_expr_in_statement273);
					expr1=expr();
					state._fsp--;

					 retval.st = (expr1!=null?((StringTemplate)expr1.getTemplate()):null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class expr_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expr"
	// src\\hoken\\generator\\HokenGenerator.g:67:1: expr : ( ^(op= PLUS x= expr (y= expr )? ) -> addexpr(x=$x.sty=$y.stnoReturn=op.shouldNotReturn())| ^(op= MINUS x= expr (y= expr )? ) -> subexpr(x=$x.sty=$y.stnoReturn=op.shouldNotReturn())| ^(op= NOT x= expr ) -> notexpr(x=$x.stnoReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= TIMES x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=(target==Target.JVM?\"mul\":\"mult\")noReturn=op.shouldNotReturn())| ^(op= DIVIDE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"div\"noReturn=op.shouldNotReturn())| ^(op= MODULO x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=(target==Target.JVM?\"rem\":\"mod\")noReturn=op.shouldNotReturn())| ^(compound= COMPOUND (statements+= statement )* ) -> compound(instructions=$statementsnumPop=poppopResult=result)| ^(op= AND x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"and\"noReturn=op.shouldNotReturn())| ^(op= OR x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"or\"noReturn=op.shouldNotReturn())| ^(op= LT x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"lt\"noReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= LTE x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"le\"noReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= GT x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"gt\"noReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= GTE x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"ge\"noReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= EQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"eq\"noReturn=op.shouldNotReturn()wordLength=truelabel=this.nextLabel++)| ^(op= NEQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"ne\"noReturn=op.shouldNotReturn()wordLength=truelabel=this.nextLabel++)| ^(assign= ASSIGN id= ID e= expr ) -> assign(expr=$e.staddr=((IdNode)$id).declaration.getOffsettedAddress((IdNode)$id)noReturn=assign.shouldNotReturn())| ^(write= WRITE (exprs+= expr )+ ) -> write(writes=writesnoReturn=write.shouldNotReturn())| ^(read= READ (ids+= ID )+ ) -> read(reads=readsnoReturn=read.shouldNotReturn())| operand );
	public final HokenGenerator.expr_return expr() throws RecognitionException {
		HokenGenerator.expr_return retval = new HokenGenerator.expr_return();
		retval.start = input.LT(1);

		HokenNode op=null;
		HokenNode compound=null;
		HokenNode assign=null;
		HokenNode id=null;
		HokenNode write=null;
		HokenNode read=null;
		HokenNode ids=null;
		List<Object> list_ids=null;
		List<Object> list_statements=null;
		List<Object> list_exprs=null;
		TreeRuleReturnScope x =null;
		TreeRuleReturnScope y =null;
		TreeRuleReturnScope e =null;
		TreeRuleReturnScope operand2 =null;
		RuleReturnScope statements = null;
		RuleReturnScope exprs = null;
		try {
			// src\\hoken\\generator\\HokenGenerator.g:67:5: ( ^(op= PLUS x= expr (y= expr )? ) -> addexpr(x=$x.sty=$y.stnoReturn=op.shouldNotReturn())| ^(op= MINUS x= expr (y= expr )? ) -> subexpr(x=$x.sty=$y.stnoReturn=op.shouldNotReturn())| ^(op= NOT x= expr ) -> notexpr(x=$x.stnoReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= TIMES x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=(target==Target.JVM?\"mul\":\"mult\")noReturn=op.shouldNotReturn())| ^(op= DIVIDE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"div\"noReturn=op.shouldNotReturn())| ^(op= MODULO x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=(target==Target.JVM?\"rem\":\"mod\")noReturn=op.shouldNotReturn())| ^(compound= COMPOUND (statements+= statement )* ) -> compound(instructions=$statementsnumPop=poppopResult=result)| ^(op= AND x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"and\"noReturn=op.shouldNotReturn())| ^(op= OR x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"or\"noReturn=op.shouldNotReturn())| ^(op= LT x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"lt\"noReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= LTE x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"le\"noReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= GT x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"gt\"noReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= GTE x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"ge\"noReturn=op.shouldNotReturn()label=this.nextLabel++)| ^(op= EQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"eq\"noReturn=op.shouldNotReturn()wordLength=truelabel=this.nextLabel++)| ^(op= NEQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"ne\"noReturn=op.shouldNotReturn()wordLength=truelabel=this.nextLabel++)| ^(assign= ASSIGN id= ID e= expr ) -> assign(expr=$e.staddr=((IdNode)$id).declaration.getOffsettedAddress((IdNode)$id)noReturn=assign.shouldNotReturn())| ^(write= WRITE (exprs+= expr )+ ) -> write(writes=writesnoReturn=write.shouldNotReturn())| ^(read= READ (ids+= ID )+ ) -> read(reads=readsnoReturn=read.shouldNotReturn())| operand )
			int alt12=19;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt12=1;
				}
				break;
			case MINUS:
				{
				alt12=2;
				}
				break;
			case NOT:
				{
				alt12=3;
				}
				break;
			case TIMES:
				{
				alt12=4;
				}
				break;
			case DIVIDE:
				{
				alt12=5;
				}
				break;
			case MODULO:
				{
				alt12=6;
				}
				break;
			case COMPOUND:
				{
				alt12=7;
				}
				break;
			case AND:
				{
				alt12=8;
				}
				break;
			case OR:
				{
				alt12=9;
				}
				break;
			case LT:
				{
				alt12=10;
				}
				break;
			case LTE:
				{
				alt12=11;
				}
				break;
			case GT:
				{
				alt12=12;
				}
				break;
			case GTE:
				{
				alt12=13;
				}
				break;
			case EQ:
				{
				alt12=14;
				}
				break;
			case NEQ:
				{
				alt12=15;
				}
				break;
			case ASSIGN:
				{
				alt12=16;
				}
				break;
			case WRITE:
				{
				alt12=17;
				}
				break;
			case READ:
				{
				alt12=18;
				}
				break;
			case CHAR:
			case FALSE:
			case ID:
			case INT:
			case TRUE:
				{
				alt12=19;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// src\\hoken\\generator\\HokenGenerator.g:67:9: ^(op= PLUS x= expr (y= expr )? )
					{
					op=(HokenNode)match(input,PLUS,FOLLOW_PLUS_in_expr292); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr296);
					x=expr();
					state._fsp--;

					// src\\hoken\\generator\\HokenGenerator.g:67:27: (y= expr )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= AND && LA7_0 <= ASSIGN)||LA7_0==CHAR||LA7_0==COMPOUND||(LA7_0 >= DIVIDE && LA7_0 <= EQ)||(LA7_0 >= FALSE && LA7_0 <= INT)||(LA7_0 >= LT && LA7_0 <= PLUS)||LA7_0==READ||(LA7_0 >= TIMES && LA7_0 <= TRUE)||LA7_0==WRITE) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:67:27: y= expr
							{
							pushFollow(FOLLOW_expr_in_expr300);
							y=expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 68:11: -> addexpr(x=$x.sty=$y.stnoReturn=op.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("addexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("noReturn", op.shouldNotReturn()));
					}



					}
					break;
				case 2 :
					// src\\hoken\\generator\\HokenGenerator.g:69:9: ^(op= MINUS x= expr (y= expr )? )
					{
					op=(HokenNode)match(input,MINUS,FOLLOW_MINUS_in_expr346); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr350);
					x=expr();
					state._fsp--;

					// src\\hoken\\generator\\HokenGenerator.g:69:28: (y= expr )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( ((LA8_0 >= AND && LA8_0 <= ASSIGN)||LA8_0==CHAR||LA8_0==COMPOUND||(LA8_0 >= DIVIDE && LA8_0 <= EQ)||(LA8_0 >= FALSE && LA8_0 <= INT)||(LA8_0 >= LT && LA8_0 <= PLUS)||LA8_0==READ||(LA8_0 >= TIMES && LA8_0 <= TRUE)||LA8_0==WRITE) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:69:28: y= expr
							{
							pushFollow(FOLLOW_expr_in_expr354);
							y=expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 70:11: -> subexpr(x=$x.sty=$y.stnoReturn=op.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("subexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("noReturn", op.shouldNotReturn()));
					}



					}
					break;
				case 3 :
					// src\\hoken\\generator\\HokenGenerator.g:71:9: ^(op= NOT x= expr )
					{
					op=(HokenNode)match(input,NOT,FOLLOW_NOT_in_expr400); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr404);
					x=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 72:11: -> notexpr(x=$x.stnoReturn=op.shouldNotReturn()label=this.nextLabel++)
					{
						retval.st = templateLib.getInstanceOf("notexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("noReturn", op.shouldNotReturn()).put("label", this.nextLabel++));
					}



					}
					break;
				case 4 :
					// src\\hoken\\generator\\HokenGenerator.g:73:9: ^(op= TIMES x= expr y= expr )
					{
					op=(HokenNode)match(input,TIMES,FOLLOW_TIMES_in_expr447); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr451);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr455);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 74:11: -> binexpr(x=$x.sty=$y.stinstr=(target==Target.JVM?\"mul\":\"mult\")noReturn=op.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", (target==Target.JVM?"mul":"mult")).put("noReturn", op.shouldNotReturn()));
					}



					}
					break;
				case 5 :
					// src\\hoken\\generator\\HokenGenerator.g:75:9: ^(op= DIVIDE x= expr y= expr )
					{
					op=(HokenNode)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr503); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr507);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr511);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 76:11: -> binexpr(x=$x.sty=$y.stinstr=\"div\"noReturn=op.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "div").put("noReturn", op.shouldNotReturn()));
					}



					}
					break;
				case 6 :
					// src\\hoken\\generator\\HokenGenerator.g:77:9: ^(op= MODULO x= expr y= expr )
					{
					op=(HokenNode)match(input,MODULO,FOLLOW_MODULO_in_expr559); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr563);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr567);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 78:11: -> binexpr(x=$x.sty=$y.stinstr=(target==Target.JVM?\"rem\":\"mod\")noReturn=op.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", (target==Target.JVM?"rem":"mod")).put("noReturn", op.shouldNotReturn()));
					}



					}
					break;
				case 7 :
					// src\\hoken\\generator\\HokenGenerator.g:79:9: ^(compound= COMPOUND (statements+= statement )* )
					{
					compound=(HokenNode)match(input,COMPOUND,FOLLOW_COMPOUND_in_expr615); 

					              this.popCounter.push(this.scopeCounter);
					              this.scopeCounter = 0;
					          
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// src\\hoken\\generator\\HokenGenerator.g:84:11: (statements+= statement )*
						loop9:
						while (true) {
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( ((LA9_0 >= AND && LA9_0 <= ASSIGN)||LA9_0==CHAR||(LA9_0 >= COMPOUND && LA9_0 <= CONST)||(LA9_0 >= DIVIDE && LA9_0 <= EQ)||(LA9_0 >= FALSE && LA9_0 <= INT)||(LA9_0 >= LT && LA9_0 <= PLUS)||LA9_0==READ||(LA9_0 >= TIMES && LA9_0 <= TRUE)||(LA9_0 >= VAR && LA9_0 <= WRITE)) ) {
								alt9=1;
							}

							switch (alt9) {
							case 1 :
								// src\\hoken\\generator\\HokenGenerator.g:84:12: statements+= statement
								{
								pushFollow(FOLLOW_statement_in_expr642);
								statements=statement();
								state._fsp--;

								if (list_statements==null) list_statements=new ArrayList<Object>();
								list_statements.add(statements.getTemplate());
								}
								break;

							default :
								break loop9;
							}
						}

						match(input, Token.UP, null); 
					}


					              int pop            = this.scopeCounter;            // onthouden hoeveel variabelen we moeten poppen
					              this.scopeCounter  = this.popCounter.pop();        // scopeCounter terugzetten op de vorige scope
					              this.nextAddr     -= pop;                          // volgende adres kan omlaag
					              int result         = (compound.type != Type.VOID) ? 1 : 0; // onthoud een result als compound niet VOID is
					          
					// TEMPLATE REWRITE
					// 91:11: -> compound(instructions=$statementsnumPop=poppopResult=result)
					{
						retval.st = templateLib.getInstanceOf("compound",new STAttrMap().put("instructions", list_statements).put("numPop", pop).put("popResult", result));
					}



					}
					break;
				case 8 :
					// src\\hoken\\generator\\HokenGenerator.g:92:9: ^(op= AND x= expr y= expr )
					{
					op=(HokenNode)match(input,AND,FOLLOW_AND_in_expr699); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr703);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr707);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 93:11: -> binexpr(x=$x.sty=$y.stinstr=\"and\"noReturn=op.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "and").put("noReturn", op.shouldNotReturn()));
					}



					}
					break;
				case 9 :
					// src\\hoken\\generator\\HokenGenerator.g:94:9: ^(op= OR x= expr y= expr )
					{
					op=(HokenNode)match(input,OR,FOLLOW_OR_in_expr755); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr759);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr763);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 95:11: -> binexpr(x=$x.sty=$y.stinstr=\"or\"noReturn=op.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "or").put("noReturn", op.shouldNotReturn()));
					}



					}
					break;
				case 10 :
					// src\\hoken\\generator\\HokenGenerator.g:96:9: ^(op= LT x= expr y= expr )
					{
					op=(HokenNode)match(input,LT,FOLLOW_LT_in_expr811); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr815);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr819);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 97:11: -> ifexpr(x=$x.sty=$y.stinstr=\"lt\"noReturn=op.shouldNotReturn()label=this.nextLabel++)
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "lt").put("noReturn", op.shouldNotReturn()).put("label", this.nextLabel++));
					}



					}
					break;
				case 11 :
					// src\\hoken\\generator\\HokenGenerator.g:98:9: ^(op= LTE x= expr y= expr )
					{
					op=(HokenNode)match(input,LTE,FOLLOW_LTE_in_expr872); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr876);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr880);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 99:11: -> ifexpr(x=$x.sty=$y.stinstr=\"le\"noReturn=op.shouldNotReturn()label=this.nextLabel++)
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "le").put("noReturn", op.shouldNotReturn()).put("label", this.nextLabel++));
					}



					}
					break;
				case 12 :
					// src\\hoken\\generator\\HokenGenerator.g:100:9: ^(op= GT x= expr y= expr )
					{
					op=(HokenNode)match(input,GT,FOLLOW_GT_in_expr933); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr937);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr941);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 101:11: -> ifexpr(x=$x.sty=$y.stinstr=\"gt\"noReturn=op.shouldNotReturn()label=this.nextLabel++)
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "gt").put("noReturn", op.shouldNotReturn()).put("label", this.nextLabel++));
					}



					}
					break;
				case 13 :
					// src\\hoken\\generator\\HokenGenerator.g:102:9: ^(op= GTE x= expr y= expr )
					{
					op=(HokenNode)match(input,GTE,FOLLOW_GTE_in_expr994); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr998);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1002);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 103:11: -> ifexpr(x=$x.sty=$y.stinstr=\"ge\"noReturn=op.shouldNotReturn()label=this.nextLabel++)
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "ge").put("noReturn", op.shouldNotReturn()).put("label", this.nextLabel++));
					}



					}
					break;
				case 14 :
					// src\\hoken\\generator\\HokenGenerator.g:104:9: ^(op= EQ x= expr y= expr )
					{
					op=(HokenNode)match(input,EQ,FOLLOW_EQ_in_expr1055); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1059);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1063);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 105:11: -> ifexpr(x=$x.sty=$y.stinstr=\"eq\"noReturn=op.shouldNotReturn()wordLength=truelabel=this.nextLabel++)
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "eq").put("noReturn", op.shouldNotReturn()).put("wordLength", true).put("label", this.nextLabel++));
					}



					}
					break;
				case 15 :
					// src\\hoken\\generator\\HokenGenerator.g:106:9: ^(op= NEQ x= expr y= expr )
					{
					op=(HokenNode)match(input,NEQ,FOLLOW_NEQ_in_expr1121); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1125);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1129);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 107:11: -> ifexpr(x=$x.sty=$y.stinstr=\"ne\"noReturn=op.shouldNotReturn()wordLength=truelabel=this.nextLabel++)
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "ne").put("noReturn", op.shouldNotReturn()).put("wordLength", true).put("label", this.nextLabel++));
					}



					}
					break;
				case 16 :
					// src\\hoken\\generator\\HokenGenerator.g:108:9: ^(assign= ASSIGN id= ID e= expr )
					{
					assign=(HokenNode)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr1187); 
					match(input, Token.DOWN, null); 
					id=(HokenNode)match(input,ID,FOLLOW_ID_in_expr1191); 
					pushFollow(FOLLOW_expr_in_expr1195);
					e=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 109:11: -> assign(expr=$e.staddr=((IdNode)$id).declaration.getOffsettedAddress((IdNode)$id)noReturn=assign.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("expr", (e!=null?((StringTemplate)e.getTemplate()):null)).put("addr", ((IdNode)id).declaration.getOffsettedAddress((IdNode)id)).put("noReturn", assign.shouldNotReturn()));
					}



					}
					break;
				case 17 :
					// src\\hoken\\generator\\HokenGenerator.g:110:9: ^(write= WRITE (exprs+= expr )+ )
					{
					write=(HokenNode)match(input,WRITE,FOLLOW_WRITE_in_expr1238); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\generator\\HokenGenerator.g:110:23: (exprs+= expr )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= AND && LA10_0 <= ASSIGN)||LA10_0==CHAR||LA10_0==COMPOUND||(LA10_0 >= DIVIDE && LA10_0 <= EQ)||(LA10_0 >= FALSE && LA10_0 <= INT)||(LA10_0 >= LT && LA10_0 <= PLUS)||LA10_0==READ||(LA10_0 >= TIMES && LA10_0 <= TRUE)||LA10_0==WRITE) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:110:24: exprs+= expr
							{
							pushFollow(FOLLOW_expr_in_expr1243);
							exprs=expr();
							state._fsp--;

							if (list_exprs==null) list_exprs=new ArrayList<Object>();
							list_exprs.add(exprs.getTemplate());
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					match(input, Token.UP, null); 


					        List<IOInstruction> writes = new ArrayList<IOInstruction>();
					        for(Object child : write.getChildren()) {
					          HokenNode expr = (HokenNode)child;
					          writes.add(new IOInstruction(list_exprs.get(expr.childIndex), expr.type));
					        }  
					      
					// TEMPLATE REWRITE
					// 118:11: -> write(writes=writesnoReturn=write.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("write",new STAttrMap().put("writes", writes).put("noReturn", write.shouldNotReturn()));
					}



					}
					break;
				case 18 :
					// src\\hoken\\generator\\HokenGenerator.g:119:9: ^(read= READ (ids+= ID )+ )
					{
					read=(HokenNode)match(input,READ,FOLLOW_READ_in_expr1291); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\generator\\HokenGenerator.g:119:21: (ids+= ID )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==ID) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:119:22: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_expr1296); 
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					match(input, Token.UP, null); 


					            List<IOInstruction> reads = new ArrayList<IOInstruction>();
					            for(Object child : list_ids) {
					                IdNode I = (IdNode)child;
					                reads.add(new IOInstruction(I.declaration.getOffsettedAddress(I), I.declaration.type));
					            }
					        
					// TEMPLATE REWRITE
					// 127:11: -> read(reads=readsnoReturn=read.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("read",new STAttrMap().put("reads", reads).put("noReturn", read.shouldNotReturn()));
					}



					}
					break;
				case 19 :
					// src\\hoken\\generator\\HokenGenerator.g:128:9: operand
					{
					pushFollow(FOLLOW_operand_in_expr1343);
					operand2=operand();
					state._fsp--;

					 retval.st = (operand2!=null?((StringTemplate)operand2.getTemplate()):null); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class operand_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operand"
	// src\\hoken\\generator\\HokenGenerator.g:131:1: operand : (id= ID -> load(addr=I.declaration.getOffsettedAddress(I))|intval= INT -> integer(val=$intval.text)|charval= CHAR -> integer(val=(int)$charval.text.charAt(1))| TRUE -> integer(val=1)| FALSE -> integer(val=0));
	public final HokenGenerator.operand_return operand() throws RecognitionException {
		HokenGenerator.operand_return retval = new HokenGenerator.operand_return();
		retval.start = input.LT(1);

		HokenNode id=null;
		HokenNode intval=null;
		HokenNode charval=null;

		try {
			// src\\hoken\\generator\\HokenGenerator.g:132:5: (id= ID -> load(addr=I.declaration.getOffsettedAddress(I))|intval= INT -> integer(val=$intval.text)|charval= CHAR -> integer(val=(int)$charval.text.charAt(1))| TRUE -> integer(val=1)| FALSE -> integer(val=0))
			int alt13=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt13=1;
				}
				break;
			case INT:
				{
				alt13=2;
				}
				break;
			case CHAR:
				{
				alt13=3;
				}
				break;
			case TRUE:
				{
				alt13=4;
				}
				break;
			case FALSE:
				{
				alt13=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// src\\hoken\\generator\\HokenGenerator.g:132:9: id= ID
					{
					id=(HokenNode)match(input,ID,FOLLOW_ID_in_operand1370); 
					IdNode I = (IdNode)id;
					// TEMPLATE REWRITE
					// 134:11: -> load(addr=I.declaration.getOffsettedAddress(I))
					{
						retval.st = templateLib.getInstanceOf("load",new STAttrMap().put("addr", I.declaration.getOffsettedAddress(I)));
					}



					}
					break;
				case 2 :
					// src\\hoken\\generator\\HokenGenerator.g:135:9: intval= INT
					{
					intval=(HokenNode)match(input,INT,FOLLOW_INT_in_operand1413); 
					// TEMPLATE REWRITE
					// 136:11: -> integer(val=$intval.text)
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", (intval!=null?intval.getText():null)));
					}



					}
					break;
				case 3 :
					// src\\hoken\\generator\\HokenGenerator.g:137:9: charval= CHAR
					{
					charval=(HokenNode)match(input,CHAR,FOLLOW_CHAR_in_operand1444); 
					// TEMPLATE REWRITE
					// 138:11: -> integer(val=(int)$charval.text.charAt(1))
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", (int)(charval!=null?charval.getText():null).charAt(1)));
					}



					}
					break;
				case 4 :
					// src\\hoken\\generator\\HokenGenerator.g:139:9: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand1473); 
					// TEMPLATE REWRITE
					// 140:11: -> integer(val=1)
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", 1));
					}



					}
					break;
				case 5 :
					// src\\hoken\\generator\\HokenGenerator.g:141:9: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand1502); 
					// TEMPLATE REWRITE
					// 142:11: -> integer(val=0)
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", 0));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program73 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_program78 = new BitSet(new long[]{0x00000D93FC3ED8B8L});
	public static final BitSet FOLLOW_VAR_in_statement129 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTEGER_in_statement132 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_CHARACTER_in_statement134 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_BOOLEAN_in_statement136 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_statement142 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_CONST_in_statement198 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTEGER_in_statement201 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_CHARACTER_in_statement203 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_BOOLEAN_in_statement205 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_ID_in_statement211 = new BitSet(new long[]{0x0000010000320080L});
	public static final BitSet FOLLOW_operand_in_statement217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr292 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr296 = new BitSet(new long[]{0x00000993FC3EC8B8L});
	public static final BitSet FOLLOW_expr_in_expr300 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr346 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr350 = new BitSet(new long[]{0x00000993FC3EC8B8L});
	public static final BitSet FOLLOW_expr_in_expr354 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr400 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr451 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expr503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr507 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr511 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULO_in_expr559 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr563 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr567 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_expr642 = new BitSet(new long[]{0x00000D93FC3ED8B8L});
	public static final BitSet FOLLOW_AND_in_expr699 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr703 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr707 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr755 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr759 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr763 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr811 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr815 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr819 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_expr872 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr876 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr880 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr933 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr937 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr941 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_expr994 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr998 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr1002 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr1055 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1059 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr1063 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expr1121 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1125 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr1129 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_expr1187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr1191 = new BitSet(new long[]{0x00000993FC3EC8B0L});
	public static final BitSet FOLLOW_expr_in_expr1195 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WRITE_in_expr1238 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1243 = new BitSet(new long[]{0x00000993FC3EC8B8L});
	public static final BitSet FOLLOW_READ_in_expr1291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr1296 = new BitSet(new long[]{0x0000000000100008L});
	public static final BitSet FOLLOW_operand_in_expr1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_operand1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_operand1413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_operand1444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand1473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1502 = new BitSet(new long[]{0x0000000000000002L});
}

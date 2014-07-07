// $ANTLR 3.5.2 src\\hoken\\generator\\HokenGenerator.g 2014-07-07 18:57:04

package hoken.generator;
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
		"CHARACTER", "COLON", "COMMA", "COMMENT", "COMPOUND", "CONST", "DIGIT", 
		"DIVIDE", "EQ", "EQUALS", "FALSE", "GT", "GTE", "ID", "INT", "INTEGER", 
		"LCURLY", "LETTER", "LPAREN", "LT", "LTE", "MINUS", "MODULO", "NEQ", "NOT", 
		"OR", "PLUS", "PROGRAM", "RCURLY", "READ", "RPAREN", "SEMICOLON", "TIMES", 
		"TRUE", "UNDERSCORE", "VAR", "WRITE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BOOLEAN=6;
	public static final int CHAR=7;
	public static final int CHARACTER=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT=11;
	public static final int COMPOUND=12;
	public static final int CONST=13;
	public static final int DIGIT=14;
	public static final int DIVIDE=15;
	public static final int EQ=16;
	public static final int EQUALS=17;
	public static final int FALSE=18;
	public static final int GT=19;
	public static final int GTE=20;
	public static final int ID=21;
	public static final int INT=22;
	public static final int INTEGER=23;
	public static final int LCURLY=24;
	public static final int LETTER=25;
	public static final int LPAREN=26;
	public static final int LT=27;
	public static final int LTE=28;
	public static final int MINUS=29;
	public static final int MODULO=30;
	public static final int NEQ=31;
	public static final int NOT=32;
	public static final int OR=33;
	public static final int PLUS=34;
	public static final int PROGRAM=35;
	public static final int RCURLY=36;
	public static final int READ=37;
	public static final int RPAREN=38;
	public static final int SEMICOLON=39;
	public static final int TIMES=40;
	public static final int TRUE=41;
	public static final int UNDERSCORE=42;
	public static final int VAR=43;
	public static final int WRITE=44;
	public static final int WS=45;

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


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// src\\hoken\\generator\\HokenGenerator.g:33:1: program : ^( PROGRAM (statements+= statement )* ) -> program(instructions=$statements);
	public final HokenGenerator.program_return program() throws RecognitionException {
		HokenGenerator.program_return retval = new HokenGenerator.program_return();
		retval.start = input.LT(1);

		List<Object> list_statements=null;
		RuleReturnScope statements = null;
		try {
			// src\\hoken\\generator\\HokenGenerator.g:34:5: ( ^( PROGRAM (statements+= statement )* ) -> program(instructions=$statements))
			// src\\hoken\\generator\\HokenGenerator.g:34:9: ^( PROGRAM (statements+= statement )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program72); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// src\\hoken\\generator\\HokenGenerator.g:34:19: (statements+= statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= AND && LA1_0 <= ASSIGN)||LA1_0==CHAR||(LA1_0 >= COMPOUND && LA1_0 <= CONST)||(LA1_0 >= DIVIDE && LA1_0 <= EQ)||(LA1_0 >= FALSE && LA1_0 <= INT)||(LA1_0 >= LT && LA1_0 <= PLUS)||LA1_0==READ||(LA1_0 >= TIMES && LA1_0 <= TRUE)||(LA1_0 >= VAR && LA1_0 <= WRITE)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// src\\hoken\\generator\\HokenGenerator.g:34:20: statements+= statement
						{
						pushFollow(FOLLOW_statement_in_program77);
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
			// 35:11: -> program(instructions=$statements)
			{
				retval.st = templateLib.getInstanceOf("program",new STAttrMap().put("instructions", list_statements));
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
	// src\\hoken\\generator\\HokenGenerator.g:38:1: statement : ( ^(declaration= VAR ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) -> declaration(size=$ids.size())| ^(declaration= CONST ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ val= operand ) -> constant(size=$ids.size()addrs=addrsval=val)| expr );
	public final HokenGenerator.statement_return statement() throws RecognitionException {
		HokenGenerator.statement_return retval = new HokenGenerator.statement_return();
		retval.start = input.LT(1);

		HokenNode declaration=null;
		HokenNode ids=null;
		List<Object> list_ids=null;
		TreeRuleReturnScope val =null;
		TreeRuleReturnScope expr1 =null;

		try {
			// src\\hoken\\generator\\HokenGenerator.g:39:5: ( ^(declaration= VAR ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) -> declaration(size=$ids.size())| ^(declaration= CONST ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ val= operand ) -> constant(size=$ids.size()addrs=addrsval=val)| expr )
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
					// src\\hoken\\generator\\HokenGenerator.g:39:9: ^(declaration= VAR ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ )
					{
					declaration=(HokenNode)match(input,VAR,FOLLOW_VAR_in_statement121); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\generator\\HokenGenerator.g:39:27: ( INTEGER | CHARACTER | BOOLEAN )
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
							// src\\hoken\\generator\\HokenGenerator.g:39:28: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_statement124); 
							}
							break;
						case 2 :
							// src\\hoken\\generator\\HokenGenerator.g:39:36: CHARACTER
							{
							match(input,CHARACTER,FOLLOW_CHARACTER_in_statement126); 
							}
							break;
						case 3 :
							// src\\hoken\\generator\\HokenGenerator.g:39:46: BOOLEAN
							{
							match(input,BOOLEAN,FOLLOW_BOOLEAN_in_statement128); 
							}
							break;

					}

					// src\\hoken\\generator\\HokenGenerator.g:39:55: (ids+= ID )+
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
							// src\\hoken\\generator\\HokenGenerator.g:39:56: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_statement134); 
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
					          
					// TEMPLATE REWRITE
					// 45:11: -> declaration(size=$ids.size())
					{
						retval.st = templateLib.getInstanceOf("declaration",new STAttrMap().put("size", list_ids.size()));
					}



					}
					break;
				case 2 :
					// src\\hoken\\generator\\HokenGenerator.g:46:9: ^(declaration= CONST ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ val= operand )
					{
					declaration=(HokenNode)match(input,CONST,FOLLOW_CONST_in_statement181); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\generator\\HokenGenerator.g:46:29: ( INTEGER | CHARACTER | BOOLEAN )
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
							// src\\hoken\\generator\\HokenGenerator.g:46:30: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_statement184); 
							}
							break;
						case 2 :
							// src\\hoken\\generator\\HokenGenerator.g:46:38: CHARACTER
							{
							match(input,CHARACTER,FOLLOW_CHARACTER_in_statement186); 
							}
							break;
						case 3 :
							// src\\hoken\\generator\\HokenGenerator.g:46:48: BOOLEAN
							{
							match(input,BOOLEAN,FOLLOW_BOOLEAN_in_statement188); 
							}
							break;

					}

					// src\\hoken\\generator\\HokenGenerator.g:46:57: (ids+= ID )+
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
							// src\\hoken\\generator\\HokenGenerator.g:46:58: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_statement194); 
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

					pushFollow(FOLLOW_operand_in_statement200);
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
					// 56:11: -> constant(size=$ids.size()addrs=addrsval=val)
					{
						retval.st = templateLib.getInstanceOf("constant",new STAttrMap().put("size", list_ids.size()).put("addrs", addrs).put("val", val));
					}



					}
					break;
				case 3 :
					// src\\hoken\\generator\\HokenGenerator.g:57:9: expr
					{
					pushFollow(FOLLOW_expr_in_statement252);
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
	// src\\hoken\\generator\\HokenGenerator.g:60:1: expr : ( ^( PLUS x= expr (y= expr )? ) -> addexpr(x=$x.sty=$y.st)| ^( MINUS x= expr (y= expr )? ) -> subexpr(x=$x.sty=$y.st)| ^( NOT x= expr ) -> notexpr(x=$x.st)| ^( TIMES x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"mult\")| ^( DIVIDE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"div\")| ^( MODULO x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"mod\")| ^(compound= COMPOUND (statements+= statement )* ) -> compound(instructions=$statementsnumPop=poppopResult=result)| ^(op= AND x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"and\"noReturn=op.shouldNotReturn())| ^( OR x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"or\")| ^( LT x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"lt\")| ^( LTE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"le\")| ^( GT x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"gt\")| ^( GTE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"ge\")| ^( EQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"eq\")| ^( NEQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"ne\")| ^(assign= ASSIGN id= ID e= expr ) -> assign(expr=$e.staddr=((IdNode)$id).declaration.getOffsettedAddress((IdNode)$id)noReturn=assign.shouldNotReturn())| ^(write= WRITE (exprs+= expr )+ ) -> write(writes=writesnoReturn=write.shouldNotReturn())| ^(read= READ (ids+= ID )+ ) -> read(reads=readsnoReturn=read.shouldNotReturn())| operand );
	public final HokenGenerator.expr_return expr() throws RecognitionException {
		HokenGenerator.expr_return retval = new HokenGenerator.expr_return();
		retval.start = input.LT(1);

		HokenNode compound=null;
		HokenNode op=null;
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
			// src\\hoken\\generator\\HokenGenerator.g:60:5: ( ^( PLUS x= expr (y= expr )? ) -> addexpr(x=$x.sty=$y.st)| ^( MINUS x= expr (y= expr )? ) -> subexpr(x=$x.sty=$y.st)| ^( NOT x= expr ) -> notexpr(x=$x.st)| ^( TIMES x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"mult\")| ^( DIVIDE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"div\")| ^( MODULO x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"mod\")| ^(compound= COMPOUND (statements+= statement )* ) -> compound(instructions=$statementsnumPop=poppopResult=result)| ^(op= AND x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"and\"noReturn=op.shouldNotReturn())| ^( OR x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"or\")| ^( LT x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"lt\")| ^( LTE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"le\")| ^( GT x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"gt\")| ^( GTE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"ge\")| ^( EQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"eq\")| ^( NEQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"ne\")| ^(assign= ASSIGN id= ID e= expr ) -> assign(expr=$e.staddr=((IdNode)$id).declaration.getOffsettedAddress((IdNode)$id)noReturn=assign.shouldNotReturn())| ^(write= WRITE (exprs+= expr )+ ) -> write(writes=writesnoReturn=write.shouldNotReturn())| ^(read= READ (ids+= ID )+ ) -> read(reads=readsnoReturn=read.shouldNotReturn())| operand )
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
					// src\\hoken\\generator\\HokenGenerator.g:60:9: ^( PLUS x= expr (y= expr )? )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr269); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr273);
					x=expr();
					state._fsp--;

					// src\\hoken\\generator\\HokenGenerator.g:60:24: (y= expr )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= AND && LA7_0 <= ASSIGN)||LA7_0==CHAR||LA7_0==COMPOUND||(LA7_0 >= DIVIDE && LA7_0 <= EQ)||(LA7_0 >= FALSE && LA7_0 <= INT)||(LA7_0 >= LT && LA7_0 <= PLUS)||LA7_0==READ||(LA7_0 >= TIMES && LA7_0 <= TRUE)||LA7_0==WRITE) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:60:24: y= expr
							{
							pushFollow(FOLLOW_expr_in_expr277);
							y=expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 61:11: -> addexpr(x=$x.sty=$y.st)
					{
						retval.st = templateLib.getInstanceOf("addexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// src\\hoken\\generator\\HokenGenerator.g:62:9: ^( MINUS x= expr (y= expr )? )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr316); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr320);
					x=expr();
					state._fsp--;

					// src\\hoken\\generator\\HokenGenerator.g:62:25: (y= expr )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( ((LA8_0 >= AND && LA8_0 <= ASSIGN)||LA8_0==CHAR||LA8_0==COMPOUND||(LA8_0 >= DIVIDE && LA8_0 <= EQ)||(LA8_0 >= FALSE && LA8_0 <= INT)||(LA8_0 >= LT && LA8_0 <= PLUS)||LA8_0==READ||(LA8_0 >= TIMES && LA8_0 <= TRUE)||LA8_0==WRITE) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// src\\hoken\\generator\\HokenGenerator.g:62:25: y= expr
							{
							pushFollow(FOLLOW_expr_in_expr324);
							y=expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 63:11: -> subexpr(x=$x.sty=$y.st)
					{
						retval.st = templateLib.getInstanceOf("subexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// src\\hoken\\generator\\HokenGenerator.g:64:9: ^( NOT x= expr )
					{
					match(input,NOT,FOLLOW_NOT_in_expr363); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr367);
					x=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 65:11: -> notexpr(x=$x.st)
					{
						retval.st = templateLib.getInstanceOf("notexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// src\\hoken\\generator\\HokenGenerator.g:66:9: ^( TIMES x= expr y= expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr398); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr402);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr406);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 67:11: -> binexpr(x=$x.sty=$y.stinstr=\"mult\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "mult"));
					}



					}
					break;
				case 5 :
					// src\\hoken\\generator\\HokenGenerator.g:68:9: ^( DIVIDE x= expr y= expr )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expr447); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr451);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr455);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 69:11: -> binexpr(x=$x.sty=$y.stinstr=\"div\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "div"));
					}



					}
					break;
				case 6 :
					// src\\hoken\\generator\\HokenGenerator.g:70:9: ^( MODULO x= expr y= expr )
					{
					match(input,MODULO,FOLLOW_MODULO_in_expr496); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr500);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr504);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 71:11: -> binexpr(x=$x.sty=$y.stinstr=\"mod\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "mod"));
					}



					}
					break;
				case 7 :
					// src\\hoken\\generator\\HokenGenerator.g:72:9: ^(compound= COMPOUND (statements+= statement )* )
					{
					compound=(HokenNode)match(input,COMPOUND,FOLLOW_COMPOUND_in_expr547); 

					              this.popCounter.push(this.scopeCounter);
					              this.scopeCounter = 0;
					          
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// src\\hoken\\generator\\HokenGenerator.g:77:11: (statements+= statement )*
						loop9:
						while (true) {
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( ((LA9_0 >= AND && LA9_0 <= ASSIGN)||LA9_0==CHAR||(LA9_0 >= COMPOUND && LA9_0 <= CONST)||(LA9_0 >= DIVIDE && LA9_0 <= EQ)||(LA9_0 >= FALSE && LA9_0 <= INT)||(LA9_0 >= LT && LA9_0 <= PLUS)||LA9_0==READ||(LA9_0 >= TIMES && LA9_0 <= TRUE)||(LA9_0 >= VAR && LA9_0 <= WRITE)) ) {
								alt9=1;
							}

							switch (alt9) {
							case 1 :
								// src\\hoken\\generator\\HokenGenerator.g:77:12: statements+= statement
								{
								pushFollow(FOLLOW_statement_in_expr574);
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
					// 84:11: -> compound(instructions=$statementsnumPop=poppopResult=result)
					{
						retval.st = templateLib.getInstanceOf("compound",new STAttrMap().put("instructions", list_statements).put("numPop", pop).put("popResult", result));
					}



					}
					break;
				case 8 :
					// src\\hoken\\generator\\HokenGenerator.g:85:9: ^(op= AND x= expr y= expr )
					{
					op=(HokenNode)match(input,AND,FOLLOW_AND_in_expr631); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr635);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr639);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 86:11: -> binexpr(x=$x.sty=$y.stinstr=\"and\"noReturn=op.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "and").put("noReturn", op.shouldNotReturn()));
					}



					}
					break;
				case 9 :
					// src\\hoken\\generator\\HokenGenerator.g:87:9: ^( OR x= expr y= expr )
					{
					match(input,OR,FOLLOW_OR_in_expr685); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr689);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr693);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 88:11: -> binexpr(x=$x.sty=$y.stinstr=\"or\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "or"));
					}



					}
					break;
				case 10 :
					// src\\hoken\\generator\\HokenGenerator.g:89:9: ^( LT x= expr y= expr )
					{
					match(input,LT,FOLLOW_LT_in_expr734); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr738);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr742);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 90:11: -> binexpr(x=$x.sty=$y.stinstr=\"lt\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "lt"));
					}



					}
					break;
				case 11 :
					// src\\hoken\\generator\\HokenGenerator.g:91:9: ^( LTE x= expr y= expr )
					{
					match(input,LTE,FOLLOW_LTE_in_expr783); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr787);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr791);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 92:11: -> binexpr(x=$x.sty=$y.stinstr=\"le\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "le"));
					}



					}
					break;
				case 12 :
					// src\\hoken\\generator\\HokenGenerator.g:93:9: ^( GT x= expr y= expr )
					{
					match(input,GT,FOLLOW_GT_in_expr832); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr836);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr840);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 94:11: -> binexpr(x=$x.sty=$y.stinstr=\"gt\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "gt"));
					}



					}
					break;
				case 13 :
					// src\\hoken\\generator\\HokenGenerator.g:95:9: ^( GTE x= expr y= expr )
					{
					match(input,GTE,FOLLOW_GTE_in_expr881); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr885);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr889);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 96:11: -> binexpr(x=$x.sty=$y.stinstr=\"ge\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "ge"));
					}



					}
					break;
				case 14 :
					// src\\hoken\\generator\\HokenGenerator.g:97:9: ^( EQ x= expr y= expr )
					{
					match(input,EQ,FOLLOW_EQ_in_expr930); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr934);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr938);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 98:11: -> ifexpr(x=$x.sty=$y.stinstr=\"eq\")
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "eq"));
					}



					}
					break;
				case 15 :
					// src\\hoken\\generator\\HokenGenerator.g:99:9: ^( NEQ x= expr y= expr )
					{
					match(input,NEQ,FOLLOW_NEQ_in_expr979); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr983);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr987);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 100:11: -> ifexpr(x=$x.sty=$y.stinstr=\"ne\")
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "ne"));
					}



					}
					break;
				case 16 :
					// src\\hoken\\generator\\HokenGenerator.g:101:9: ^(assign= ASSIGN id= ID e= expr )
					{
					assign=(HokenNode)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr1030); 
					match(input, Token.DOWN, null); 
					id=(HokenNode)match(input,ID,FOLLOW_ID_in_expr1034); 
					pushFollow(FOLLOW_expr_in_expr1038);
					e=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 102:11: -> assign(expr=$e.staddr=((IdNode)$id).declaration.getOffsettedAddress((IdNode)$id)noReturn=assign.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("expr", (e!=null?((StringTemplate)e.getTemplate()):null)).put("addr", ((IdNode)id).declaration.getOffsettedAddress((IdNode)id)).put("noReturn", assign.shouldNotReturn()));
					}



					}
					break;
				case 17 :
					// src\\hoken\\generator\\HokenGenerator.g:103:9: ^(write= WRITE (exprs+= expr )+ )
					{
					write=(HokenNode)match(input,WRITE,FOLLOW_WRITE_in_expr1081); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\generator\\HokenGenerator.g:103:23: (exprs+= expr )+
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
							// src\\hoken\\generator\\HokenGenerator.g:103:24: exprs+= expr
							{
							pushFollow(FOLLOW_expr_in_expr1086);
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
					// 111:11: -> write(writes=writesnoReturn=write.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("write",new STAttrMap().put("writes", writes).put("noReturn", write.shouldNotReturn()));
					}



					}
					break;
				case 18 :
					// src\\hoken\\generator\\HokenGenerator.g:112:9: ^(read= READ (ids+= ID )+ )
					{
					read=(HokenNode)match(input,READ,FOLLOW_READ_in_expr1133); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\generator\\HokenGenerator.g:112:21: (ids+= ID )+
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
							// src\\hoken\\generator\\HokenGenerator.g:112:22: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_expr1138); 
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
					// 120:11: -> read(reads=readsnoReturn=read.shouldNotReturn())
					{
						retval.st = templateLib.getInstanceOf("read",new STAttrMap().put("reads", reads).put("noReturn", read.shouldNotReturn()));
					}



					}
					break;
				case 19 :
					// src\\hoken\\generator\\HokenGenerator.g:121:9: operand
					{
					pushFollow(FOLLOW_operand_in_expr1185);
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
	// src\\hoken\\generator\\HokenGenerator.g:124:1: operand : (id= ID -> load(addr=((IdNode)$id).declaration.getOffsettedAddress(I))|intval= INT -> integer(val=$intval.text)|charval= CHAR -> integer(val=(int)$charval.text.charAt(1))| TRUE -> integer(val=1)| FALSE -> integer(val=0));
	public final HokenGenerator.operand_return operand() throws RecognitionException {
		HokenGenerator.operand_return retval = new HokenGenerator.operand_return();
		retval.start = input.LT(1);

		HokenNode id=null;
		HokenNode intval=null;
		HokenNode charval=null;

		try {
			// src\\hoken\\generator\\HokenGenerator.g:125:5: (id= ID -> load(addr=((IdNode)$id).declaration.getOffsettedAddress(I))|intval= INT -> integer(val=$intval.text)|charval= CHAR -> integer(val=(int)$charval.text.charAt(1))| TRUE -> integer(val=1)| FALSE -> integer(val=0))
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
					// src\\hoken\\generator\\HokenGenerator.g:125:9: id= ID
					{
					id=(HokenNode)match(input,ID,FOLLOW_ID_in_operand1212); 
					IdNode I = (IdNode)id;
					// TEMPLATE REWRITE
					// 127:11: -> load(addr=((IdNode)$id).declaration.getOffsettedAddress(I))
					{
						retval.st = templateLib.getInstanceOf("load",new STAttrMap().put("addr", ((IdNode)id).declaration.getOffsettedAddress(I)));
					}



					}
					break;
				case 2 :
					// src\\hoken\\generator\\HokenGenerator.g:128:9: intval= INT
					{
					intval=(HokenNode)match(input,INT,FOLLOW_INT_in_operand1252); 
					// TEMPLATE REWRITE
					// 129:11: -> integer(val=$intval.text)
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", (intval!=null?intval.getText():null)));
					}



					}
					break;
				case 3 :
					// src\\hoken\\generator\\HokenGenerator.g:130:9: charval= CHAR
					{
					charval=(HokenNode)match(input,CHAR,FOLLOW_CHAR_in_operand1283); 
					// TEMPLATE REWRITE
					// 131:11: -> integer(val=(int)$charval.text.charAt(1))
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", (int)(charval!=null?charval.getText():null).charAt(1)));
					}



					}
					break;
				case 4 :
					// src\\hoken\\generator\\HokenGenerator.g:132:9: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand1312); 
					// TEMPLATE REWRITE
					// 133:11: -> integer(val=1)
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", 1));
					}



					}
					break;
				case 5 :
					// src\\hoken\\generator\\HokenGenerator.g:134:9: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand1341); 
					// TEMPLATE REWRITE
					// 135:11: -> integer(val=0)
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



	public static final BitSet FOLLOW_PROGRAM_in_program72 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_program77 = new BitSet(new long[]{0x00001B27F87DB0B8L});
	public static final BitSet FOLLOW_VAR_in_statement121 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTEGER_in_statement124 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_CHARACTER_in_statement126 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BOOLEAN_in_statement128 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_statement134 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_CONST_in_statement181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INTEGER_in_statement184 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_CHARACTER_in_statement186 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_BOOLEAN_in_statement188 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_statement194 = new BitSet(new long[]{0x0000020000640080L});
	public static final BitSet FOLLOW_operand_in_statement200 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr273 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_expr_in_expr277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr316 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr320 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_expr_in_expr324 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr363 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr367 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr398 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr402 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr406 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expr447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr451 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULO_in_expr496 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr500 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr504 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_expr574 = new BitSet(new long[]{0x00001B27F87DB0B8L});
	public static final BitSet FOLLOW_AND_in_expr631 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr635 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr639 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr689 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr738 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_expr783 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr787 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr791 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr832 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr836 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr840 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_expr881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr885 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr889 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr930 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr934 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr938 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expr979 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr983 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr987 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_expr1030 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr1034 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr1038 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WRITE_in_expr1081 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1086 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_READ_in_expr1133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr1138 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_operand_in_expr1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_operand1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_operand1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_operand1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand1312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1341 = new BitSet(new long[]{0x0000000000000002L});
}

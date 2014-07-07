// $ANTLR 3.5.2 ..\\src\\hoken\\generator\\HokenGenerator.g 2014-07-07 14:09:55

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
	@Override public String getGrammarFileName() { return "..\\src\\hoken\\generator\\HokenGenerator.g"; }


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


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// ..\\src\\hoken\\generator\\HokenGenerator.g:31:1: program : ^( PROGRAM (statements+= statement )* ) -> program(instructions=$statements);
	public final HokenGenerator.program_return program() throws RecognitionException {
		HokenGenerator.program_return retval = new HokenGenerator.program_return();
		retval.start = input.LT(1);

		List<Object> list_statements=null;
		RuleReturnScope statements = null;
		try {
			// ..\\src\\hoken\\generator\\HokenGenerator.g:32:5: ( ^( PROGRAM (statements+= statement )* ) -> program(instructions=$statements))
			// ..\\src\\hoken\\generator\\HokenGenerator.g:32:9: ^( PROGRAM (statements+= statement )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program72); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ..\\src\\hoken\\generator\\HokenGenerator.g:32:19: (statements+= statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= AND && LA1_0 <= ASSIGN)||LA1_0==CHAR||(LA1_0 >= COMPOUND && LA1_0 <= CONST)||(LA1_0 >= DIVIDE && LA1_0 <= EQ)||(LA1_0 >= FALSE && LA1_0 <= INT)||(LA1_0 >= LT && LA1_0 <= PLUS)||LA1_0==READ||(LA1_0 >= TIMES && LA1_0 <= TRUE)||(LA1_0 >= VAR && LA1_0 <= WRITE)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// ..\\src\\hoken\\generator\\HokenGenerator.g:32:20: statements+= statement
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
			// 33:11: -> program(instructions=$statements)
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
	// ..\\src\\hoken\\generator\\HokenGenerator.g:36:1: statement : ( ^(declaration= VAR ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) -> declaration(size=$ids.size())| ^( CONST ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ operand ) | expr );
	public final HokenGenerator.statement_return statement() throws RecognitionException {
		HokenGenerator.statement_return retval = new HokenGenerator.statement_return();
		retval.start = input.LT(1);

		HokenNode declaration=null;
		HokenNode ids=null;
		List<Object> list_ids=null;
		TreeRuleReturnScope expr1 =null;

		try {
			// ..\\src\\hoken\\generator\\HokenGenerator.g:37:5: ( ^(declaration= VAR ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) -> declaration(size=$ids.size())| ^( CONST ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ operand ) | expr )
			int alt5=3;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt5=1;
				}
				break;
			case CONST:
				{
				alt5=2;
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
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:37:9: ^(declaration= VAR ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ )
					{
					declaration=(HokenNode)match(input,VAR,FOLLOW_VAR_in_statement121); 
					match(input, Token.DOWN, null); 
					// ..\\src\\hoken\\generator\\HokenGenerator.g:37:27: ( INTEGER | CHARACTER | BOOLEAN )
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
							// ..\\src\\hoken\\generator\\HokenGenerator.g:37:28: INTEGER
							{
							match(input,INTEGER,FOLLOW_INTEGER_in_statement124); 
							}
							break;
						case 2 :
							// ..\\src\\hoken\\generator\\HokenGenerator.g:37:36: CHARACTER
							{
							match(input,CHARACTER,FOLLOW_CHARACTER_in_statement126); 
							}
							break;
						case 3 :
							// ..\\src\\hoken\\generator\\HokenGenerator.g:37:46: BOOLEAN
							{
							match(input,BOOLEAN,FOLLOW_BOOLEAN_in_statement128); 
							}
							break;

					}

					// ..\\src\\hoken\\generator\\HokenGenerator.g:37:55: (ids+= ID )+
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
							// ..\\src\\hoken\\generator\\HokenGenerator.g:37:56: ids+= ID
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
					              this.nextAddr += list_ids.size();
					          
					// TEMPLATE REWRITE
					// 42:11: -> declaration(size=$ids.size())
					{
						retval.st = templateLib.getInstanceOf("declaration",new STAttrMap().put("size", list_ids.size()));
					}



					}
					break;
				case 2 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:43:9: ^( CONST ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ operand )
					{
					match(input,CONST,FOLLOW_CONST_in_statement179); 
					match(input, Token.DOWN, null); 
					if ( input.LA(1)==BOOLEAN||input.LA(1)==CHARACTER||input.LA(1)==INTEGER ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// ..\\src\\hoken\\generator\\HokenGenerator.g:43:45: (ids+= ID )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==ID) ) {
							int LA4_1 = input.LA(2);
							if ( (LA4_1==CHAR||LA4_1==FALSE||(LA4_1 >= ID && LA4_1 <= INT)||LA4_1==TRUE) ) {
								alt4=1;
							}

						}

						switch (alt4) {
						case 1 :
							// ..\\src\\hoken\\generator\\HokenGenerator.g:43:46: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_statement192); 
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					pushFollow(FOLLOW_operand_in_statement196);
					operand();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:44:9: expr
					{
					pushFollow(FOLLOW_expr_in_statement207);
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
	// ..\\src\\hoken\\generator\\HokenGenerator.g:47:1: expr : ( ^( PLUS x= expr (y= expr )? ) -> addexpr(x=$x.sty=$y.st)| ^( MINUS x= expr (y= expr )? ) -> subexpr(x=$x.sty=$y.st)| ^( NOT x= expr ) -> notexpr(x=$x.st)| ^( TIMES x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"mult\")| ^( DIVIDE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"div\")| ^( MODULO x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"mod\")| ^( COMPOUND (statements+= statement )* ) -> compound(instructions=$statements)| ^( AND x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"and\")| ^( OR x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"or\")| ^( LT x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"lt\")| ^( LTE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"le\")| ^( GT x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"gt\")| ^( GTE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"ge\")| ^( EQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"eq\")| ^( NEQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"ne\")| ^(assign= ASSIGN id= ID e= expr ) -> assign(expr=$e.staddr=((IdNode)$id).declaration.address)| ^(write= WRITE (exprs+= expr )+ ) -> write(writes=writes)| ^(read= READ (ids+= ID )+ ) -> read(reads=reads)| operand );
	public final HokenGenerator.expr_return expr() throws RecognitionException {
		HokenGenerator.expr_return retval = new HokenGenerator.expr_return();
		retval.start = input.LT(1);

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
			// ..\\src\\hoken\\generator\\HokenGenerator.g:47:5: ( ^( PLUS x= expr (y= expr )? ) -> addexpr(x=$x.sty=$y.st)| ^( MINUS x= expr (y= expr )? ) -> subexpr(x=$x.sty=$y.st)| ^( NOT x= expr ) -> notexpr(x=$x.st)| ^( TIMES x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"mult\")| ^( DIVIDE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"div\")| ^( MODULO x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"mod\")| ^( COMPOUND (statements+= statement )* ) -> compound(instructions=$statements)| ^( AND x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"and\")| ^( OR x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"or\")| ^( LT x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"lt\")| ^( LTE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"le\")| ^( GT x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"gt\")| ^( GTE x= expr y= expr ) -> binexpr(x=$x.sty=$y.stinstr=\"ge\")| ^( EQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"eq\")| ^( NEQ x= expr y= expr ) -> ifexpr(x=$x.sty=$y.stinstr=\"ne\")| ^(assign= ASSIGN id= ID e= expr ) -> assign(expr=$e.staddr=((IdNode)$id).declaration.address)| ^(write= WRITE (exprs+= expr )+ ) -> write(writes=writes)| ^(read= READ (ids+= ID )+ ) -> read(reads=reads)| operand )
			int alt11=19;
			switch ( input.LA(1) ) {
			case PLUS:
				{
				alt11=1;
				}
				break;
			case MINUS:
				{
				alt11=2;
				}
				break;
			case NOT:
				{
				alt11=3;
				}
				break;
			case TIMES:
				{
				alt11=4;
				}
				break;
			case DIVIDE:
				{
				alt11=5;
				}
				break;
			case MODULO:
				{
				alt11=6;
				}
				break;
			case COMPOUND:
				{
				alt11=7;
				}
				break;
			case AND:
				{
				alt11=8;
				}
				break;
			case OR:
				{
				alt11=9;
				}
				break;
			case LT:
				{
				alt11=10;
				}
				break;
			case LTE:
				{
				alt11=11;
				}
				break;
			case GT:
				{
				alt11=12;
				}
				break;
			case GTE:
				{
				alt11=13;
				}
				break;
			case EQ:
				{
				alt11=14;
				}
				break;
			case NEQ:
				{
				alt11=15;
				}
				break;
			case ASSIGN:
				{
				alt11=16;
				}
				break;
			case WRITE:
				{
				alt11=17;
				}
				break;
			case READ:
				{
				alt11=18;
				}
				break;
			case CHAR:
			case FALSE:
			case ID:
			case INT:
			case TRUE:
				{
				alt11=19;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:47:9: ^( PLUS x= expr (y= expr )? )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr224); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr228);
					x=expr();
					state._fsp--;

					// ..\\src\\hoken\\generator\\HokenGenerator.g:47:24: (y= expr )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( ((LA6_0 >= AND && LA6_0 <= ASSIGN)||LA6_0==CHAR||LA6_0==COMPOUND||(LA6_0 >= DIVIDE && LA6_0 <= EQ)||(LA6_0 >= FALSE && LA6_0 <= INT)||(LA6_0 >= LT && LA6_0 <= PLUS)||LA6_0==READ||(LA6_0 >= TIMES && LA6_0 <= TRUE)||LA6_0==WRITE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// ..\\src\\hoken\\generator\\HokenGenerator.g:47:24: y= expr
							{
							pushFollow(FOLLOW_expr_in_expr232);
							y=expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 48:11: -> addexpr(x=$x.sty=$y.st)
					{
						retval.st = templateLib.getInstanceOf("addexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)));
					}



					}
					break;
				case 2 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:49:9: ^( MINUS x= expr (y= expr )? )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr271); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr275);
					x=expr();
					state._fsp--;

					// ..\\src\\hoken\\generator\\HokenGenerator.g:49:25: (y= expr )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= AND && LA7_0 <= ASSIGN)||LA7_0==CHAR||LA7_0==COMPOUND||(LA7_0 >= DIVIDE && LA7_0 <= EQ)||(LA7_0 >= FALSE && LA7_0 <= INT)||(LA7_0 >= LT && LA7_0 <= PLUS)||LA7_0==READ||(LA7_0 >= TIMES && LA7_0 <= TRUE)||LA7_0==WRITE) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// ..\\src\\hoken\\generator\\HokenGenerator.g:49:25: y= expr
							{
							pushFollow(FOLLOW_expr_in_expr279);
							y=expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 50:11: -> subexpr(x=$x.sty=$y.st)
					{
						retval.st = templateLib.getInstanceOf("subexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)));
					}



					}
					break;
				case 3 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:51:9: ^( NOT x= expr )
					{
					match(input,NOT,FOLLOW_NOT_in_expr318); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr322);
					x=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 52:11: -> notexpr(x=$x.st)
					{
						retval.st = templateLib.getInstanceOf("notexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)));
					}



					}
					break;
				case 4 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:53:9: ^( TIMES x= expr y= expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr353); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr357);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr361);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 54:11: -> binexpr(x=$x.sty=$y.stinstr=\"mult\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "mult"));
					}



					}
					break;
				case 5 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:55:9: ^( DIVIDE x= expr y= expr )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expr402); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr406);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr410);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 56:11: -> binexpr(x=$x.sty=$y.stinstr=\"div\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "div"));
					}



					}
					break;
				case 6 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:57:9: ^( MODULO x= expr y= expr )
					{
					match(input,MODULO,FOLLOW_MODULO_in_expr451); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr455);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr459);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 58:11: -> binexpr(x=$x.sty=$y.stinstr=\"mod\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "mod"));
					}



					}
					break;
				case 7 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:59:9: ^( COMPOUND (statements+= statement )* )
					{
					match(input,COMPOUND,FOLLOW_COMPOUND_in_expr500); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// ..\\src\\hoken\\generator\\HokenGenerator.g:59:20: (statements+= statement )*
						loop8:
						while (true) {
							int alt8=2;
							int LA8_0 = input.LA(1);
							if ( ((LA8_0 >= AND && LA8_0 <= ASSIGN)||LA8_0==CHAR||(LA8_0 >= COMPOUND && LA8_0 <= CONST)||(LA8_0 >= DIVIDE && LA8_0 <= EQ)||(LA8_0 >= FALSE && LA8_0 <= INT)||(LA8_0 >= LT && LA8_0 <= PLUS)||LA8_0==READ||(LA8_0 >= TIMES && LA8_0 <= TRUE)||(LA8_0 >= VAR && LA8_0 <= WRITE)) ) {
								alt8=1;
							}

							switch (alt8) {
							case 1 :
								// ..\\src\\hoken\\generator\\HokenGenerator.g:59:21: statements+= statement
								{
								pushFollow(FOLLOW_statement_in_expr505);
								statements=statement();
								state._fsp--;

								if (list_statements==null) list_statements=new ArrayList<Object>();
								list_statements.add(statements.getTemplate());
								}
								break;

							default :
								break loop8;
							}
						}

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 60:11: -> compound(instructions=$statements)
					{
						retval.st = templateLib.getInstanceOf("compound",new STAttrMap().put("instructions", list_statements));
					}



					}
					break;
				case 8 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:61:9: ^( AND x= expr y= expr )
					{
					match(input,AND,FOLLOW_AND_in_expr538); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr542);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr546);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 62:11: -> binexpr(x=$x.sty=$y.stinstr=\"and\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "and"));
					}



					}
					break;
				case 9 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:63:9: ^( OR x= expr y= expr )
					{
					match(input,OR,FOLLOW_OR_in_expr587); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr591);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr595);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 64:11: -> binexpr(x=$x.sty=$y.stinstr=\"or\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "or"));
					}



					}
					break;
				case 10 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:65:9: ^( LT x= expr y= expr )
					{
					match(input,LT,FOLLOW_LT_in_expr636); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr640);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr644);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 66:11: -> binexpr(x=$x.sty=$y.stinstr=\"lt\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "lt"));
					}



					}
					break;
				case 11 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:67:9: ^( LTE x= expr y= expr )
					{
					match(input,LTE,FOLLOW_LTE_in_expr685); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr689);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr693);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 68:11: -> binexpr(x=$x.sty=$y.stinstr=\"le\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "le"));
					}



					}
					break;
				case 12 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:69:9: ^( GT x= expr y= expr )
					{
					match(input,GT,FOLLOW_GT_in_expr734); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr738);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr742);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 70:11: -> binexpr(x=$x.sty=$y.stinstr=\"gt\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "gt"));
					}



					}
					break;
				case 13 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:71:9: ^( GTE x= expr y= expr )
					{
					match(input,GTE,FOLLOW_GTE_in_expr783); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr787);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr791);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 72:11: -> binexpr(x=$x.sty=$y.stinstr=\"ge\")
					{
						retval.st = templateLib.getInstanceOf("binexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "ge"));
					}



					}
					break;
				case 14 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:73:9: ^( EQ x= expr y= expr )
					{
					match(input,EQ,FOLLOW_EQ_in_expr832); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr836);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr840);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 74:11: -> ifexpr(x=$x.sty=$y.stinstr=\"eq\")
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "eq"));
					}



					}
					break;
				case 15 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:75:9: ^( NEQ x= expr y= expr )
					{
					match(input,NEQ,FOLLOW_NEQ_in_expr881); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr885);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr889);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 76:11: -> ifexpr(x=$x.sty=$y.stinstr=\"ne\")
					{
						retval.st = templateLib.getInstanceOf("ifexpr",new STAttrMap().put("x", (x!=null?((StringTemplate)x.getTemplate()):null)).put("y", (y!=null?((StringTemplate)y.getTemplate()):null)).put("instr", "ne"));
					}



					}
					break;
				case 16 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:77:9: ^(assign= ASSIGN id= ID e= expr )
					{
					assign=(HokenNode)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr932); 
					match(input, Token.DOWN, null); 
					id=(HokenNode)match(input,ID,FOLLOW_ID_in_expr936); 
					pushFollow(FOLLOW_expr_in_expr940);
					e=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 78:11: -> assign(expr=$e.staddr=((IdNode)$id).declaration.address)
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("expr", (e!=null?((StringTemplate)e.getTemplate()):null)).put("addr", ((IdNode)id).declaration.address));
					}



					}
					break;
				case 17 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:79:9: ^(write= WRITE (exprs+= expr )+ )
					{
					write=(HokenNode)match(input,WRITE,FOLLOW_WRITE_in_expr978); 
					match(input, Token.DOWN, null); 
					// ..\\src\\hoken\\generator\\HokenGenerator.g:79:23: (exprs+= expr )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= AND && LA9_0 <= ASSIGN)||LA9_0==CHAR||LA9_0==COMPOUND||(LA9_0 >= DIVIDE && LA9_0 <= EQ)||(LA9_0 >= FALSE && LA9_0 <= INT)||(LA9_0 >= LT && LA9_0 <= PLUS)||LA9_0==READ||(LA9_0 >= TIMES && LA9_0 <= TRUE)||LA9_0==WRITE) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// ..\\src\\hoken\\generator\\HokenGenerator.g:79:24: exprs+= expr
							{
							pushFollow(FOLLOW_expr_in_expr983);
							exprs=expr();
							state._fsp--;

							if (list_exprs==null) list_exprs=new ArrayList<Object>();
							list_exprs.add(exprs.getTemplate());
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					match(input, Token.UP, null); 


					    		List<IOInstruction> writes = new ArrayList<IOInstruction>();
					    		for(Object child : write.getChildren()) {
					    			HokenNode expr = (HokenNode)child;
					    			writes.add(new IOInstruction(list_exprs.get(expr.childIndex), expr.type));
					    		}  
					    	
					// TEMPLATE REWRITE
					// 87:11: -> write(writes=writes)
					{
						retval.st = templateLib.getInstanceOf("write",new STAttrMap().put("writes", writes));
					}



					}
					break;
				case 18 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:88:9: ^(read= READ (ids+= ID )+ )
					{
					read=(HokenNode)match(input,READ,FOLLOW_READ_in_expr1025); 
					match(input, Token.DOWN, null); 
					// ..\\src\\hoken\\generator\\HokenGenerator.g:88:21: (ids+= ID )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==ID) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// ..\\src\\hoken\\generator\\HokenGenerator.g:88:22: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_expr1030); 
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
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


					            List<IOInstruction> reads = new ArrayList<IOInstruction>();
					            for(Object child : list_ids) {
					                IdNode I = (IdNode)child;
					                reads.add(new IOInstruction(I.declaration.address, I.declaration.type));
					            }
					        
					// TEMPLATE REWRITE
					// 96:11: -> read(reads=reads)
					{
						retval.st = templateLib.getInstanceOf("read",new STAttrMap().put("reads", reads));
					}



					}
					break;
				case 19 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:97:9: operand
					{
					pushFollow(FOLLOW_operand_in_expr1072);
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
	// ..\\src\\hoken\\generator\\HokenGenerator.g:100:1: operand : (id= ID -> load(addr=((IdNode)$id).declaration.address)|intval= INT -> integer(val=$intval.text)|charval= CHAR -> integer(val=(int)$charval.text.charAt(1))| TRUE -> integer(val=1)| FALSE -> integer(val=0));
	public final HokenGenerator.operand_return operand() throws RecognitionException {
		HokenGenerator.operand_return retval = new HokenGenerator.operand_return();
		retval.start = input.LT(1);

		HokenNode id=null;
		HokenNode intval=null;
		HokenNode charval=null;

		try {
			// ..\\src\\hoken\\generator\\HokenGenerator.g:101:5: (id= ID -> load(addr=((IdNode)$id).declaration.address)|intval= INT -> integer(val=$intval.text)|charval= CHAR -> integer(val=(int)$charval.text.charAt(1))| TRUE -> integer(val=1)| FALSE -> integer(val=0))
			int alt12=5;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt12=1;
				}
				break;
			case INT:
				{
				alt12=2;
				}
				break;
			case CHAR:
				{
				alt12=3;
				}
				break;
			case TRUE:
				{
				alt12=4;
				}
				break;
			case FALSE:
				{
				alt12=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:101:9: id= ID
					{
					id=(HokenNode)match(input,ID,FOLLOW_ID_in_operand1099); 
					// TEMPLATE REWRITE
					// 102:11: -> load(addr=((IdNode)$id).declaration.address)
					{
						retval.st = templateLib.getInstanceOf("load",new STAttrMap().put("addr", ((IdNode)id).declaration.address));
					}



					}
					break;
				case 2 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:103:9: intval= INT
					{
					intval=(HokenNode)match(input,INT,FOLLOW_INT_in_operand1130); 
					// TEMPLATE REWRITE
					// 104:11: -> integer(val=$intval.text)
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", (intval!=null?intval.getText():null)));
					}



					}
					break;
				case 3 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:105:9: charval= CHAR
					{
					charval=(HokenNode)match(input,CHAR,FOLLOW_CHAR_in_operand1161); 
					// TEMPLATE REWRITE
					// 106:11: -> integer(val=(int)$charval.text.charAt(1))
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", (int)(charval!=null?charval.getText():null).charAt(1)));
					}



					}
					break;
				case 4 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:107:9: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_operand1190); 
					// TEMPLATE REWRITE
					// 108:11: -> integer(val=1)
					{
						retval.st = templateLib.getInstanceOf("integer",new STAttrMap().put("val", 1));
					}



					}
					break;
				case 5 :
					// ..\\src\\hoken\\generator\\HokenGenerator.g:109:9: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_operand1219); 
					// TEMPLATE REWRITE
					// 110:11: -> integer(val=0)
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
	public static final BitSet FOLLOW_CONST_in_statement179 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_statement181 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_statement192 = new BitSet(new long[]{0x0000020000640080L});
	public static final BitSet FOLLOW_operand_in_statement196 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr228 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_expr_in_expr232 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr271 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr275 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_expr_in_expr279 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr318 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr322 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TIMES_in_expr353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr357 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr361 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expr402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr406 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr410 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MODULO_in_expr451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr455 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr459 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_expr505 = new BitSet(new long[]{0x00001B27F87DB0B8L});
	public static final BitSet FOLLOW_AND_in_expr538 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr542 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr546 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_in_expr587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr591 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr595 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_in_expr636 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr640 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_expr685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr689 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_expr734 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr738 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_expr783 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr787 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr791 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQ_in_expr832 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr836 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr840 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQ_in_expr881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr885 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr889 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSIGN_in_expr932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr936 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr940 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WRITE_in_expr978 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr983 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_READ_in_expr1025 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr1030 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_operand_in_expr1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_operand1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_operand1130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_operand1161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_operand1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_operand1219 = new BitSet(new long[]{0x0000000000000002L});
}

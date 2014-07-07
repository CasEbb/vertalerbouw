// $ANTLR 3.5.2 src\\hoken\\checker\\HokenChecker.g 2014-07-07 17:47:35

package hoken.checker;
import hoken.HokenException;
import hoken.ast.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HokenChecker extends TreeParser {
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


	public HokenChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public HokenChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return HokenChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\hoken\\checker\\HokenChecker.g"; }


	private int errors = 0;
	private SymbolTable symtab = new SymbolTable();

	public int getErrorCount() {
	    return this.errors;
	}

	@Override
	public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	{
	    this.errors++;
	    if(e instanceof HokenException)
	        emitErrorMessage(e.getMessage());
	    else
	        super.displayRecognitionError(tokenNames, e);
	}



	// $ANTLR start "program"
	// src\\hoken\\checker\\HokenChecker.g:34:1: program : ^( PROGRAM ( statement )* ) ;
	public final void program() throws RecognitionException {
		try {
			// src\\hoken\\checker\\HokenChecker.g:35:5: ( ^( PROGRAM ( statement )* ) )
			// src\\hoken\\checker\\HokenChecker.g:35:9: ^( PROGRAM ( statement )* )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program63); 
			symtab.openScope();
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// src\\hoken\\checker\\HokenChecker.g:37:13: ( statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= AND && LA1_0 <= ASSIGN)||LA1_0==CHAR||(LA1_0 >= COMPOUND && LA1_0 <= CONST)||(LA1_0 >= DIVIDE && LA1_0 <= EQ)||(LA1_0 >= FALSE && LA1_0 <= INT)||(LA1_0 >= LT && LA1_0 <= PLUS)||LA1_0==READ||(LA1_0 >= TIMES && LA1_0 <= TRUE)||(LA1_0 >= VAR && LA1_0 <= WRITE)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// src\\hoken\\checker\\HokenChecker.g:37:13: statement
						{
						pushFollow(FOLLOW_statement_in_program91);
						statement();
						state._fsp--;

						}
						break;

					default :
						break loop1;
					}
				}

				symtab.closeScope();
				match(input, Token.UP, null); 
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
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// src\\hoken\\checker\\HokenChecker.g:42:1: statement : ( ^(declaration= VAR type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) | ^(declaration= CONST type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ operand ) | expr );
	public final void statement() throws RecognitionException {
		HokenNode declaration=null;
		HokenNode type=null;
		HokenNode ids=null;
		List<Object> list_ids=null;

		try {
			// src\\hoken\\checker\\HokenChecker.g:43:5: ( ^(declaration= VAR type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) | ^(declaration= CONST type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ operand ) | expr )
			int alt4=3;
			switch ( input.LA(1) ) {
			case VAR:
				{
				alt4=1;
				}
				break;
			case CONST:
				{
				alt4=2;
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
					// src\\hoken\\checker\\HokenChecker.g:43:9: ^(declaration= VAR type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ )
					{
					declaration=(HokenNode)match(input,VAR,FOLLOW_VAR_in_statement139); 
					match(input, Token.DOWN, null); 
					type=(HokenNode)input.LT(1);
					if ( input.LA(1)==BOOLEAN||input.LA(1)==CHARACTER||input.LA(1)==INTEGER ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// src\\hoken\\checker\\HokenChecker.g:43:60: (ids+= ID )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==ID) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// src\\hoken\\checker\\HokenChecker.g:43:61: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_statement154); 
							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);
							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					match(input, Token.UP, null); 


					            	declaration.type = Type.getType((type!=null?type.getText():null));
					                for(Object child : list_ids) {
					                	String id = ((HokenNode)child).getText();
					                    symtab.enter(id, (DeclarationNode)declaration);
					                    ((DeclarationNode)declaration).ids.add(id);
					                }
					            
					}
					break;
				case 2 :
					// src\\hoken\\checker\\HokenChecker.g:52:9: ^(declaration= CONST type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ operand )
					{
					declaration=(HokenNode)match(input,CONST,FOLLOW_CONST_in_statement184); 
					match(input, Token.DOWN, null); 
					type=(HokenNode)input.LT(1);
					if ( input.LA(1)==BOOLEAN||input.LA(1)==CHARACTER||input.LA(1)==INTEGER ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// src\\hoken\\checker\\HokenChecker.g:52:62: (ids+= ID )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==ID) ) {
							int LA3_1 = input.LA(2);
							if ( (LA3_1==CHAR||LA3_1==FALSE||(LA3_1 >= ID && LA3_1 <= INT)||LA3_1==TRUE) ) {
								alt3=1;
							}

						}

						switch (alt3) {
						case 1 :
							// src\\hoken\\checker\\HokenChecker.g:52:63: ids+= ID
							{
							ids=(HokenNode)match(input,ID,FOLLOW_ID_in_statement199); 
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

					pushFollow(FOLLOW_operand_in_statement203);
					operand();
					state._fsp--;

					match(input, Token.UP, null); 


					                declaration.type = Type.getType((type!=null?type.getText():null));
					                ((DeclarationNode)declaration).isConstant = true;
					                for(Object child : list_ids) {
					                	String id = ((HokenNode)child).getText();
					                    symtab.enter(id, (DeclarationNode)declaration);
					                    ((DeclarationNode)declaration).ids.add(id);
					                }
					            
					}
					break;
				case 3 :
					// src\\hoken\\checker\\HokenChecker.g:62:9: expr
					{
					pushFollow(FOLLOW_expr_in_statement228);
					expr();
					state._fsp--;

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
	}
	// $ANTLR end "statement"



	// $ANTLR start "expr"
	// src\\hoken\\checker\\HokenChecker.g:65:1: expr : ( ^(exp= ( PLUS | MINUS ) expr ( expr )? ) | ^(exp= NOT expr ) | ^(exp= ( DIVIDE | MODULO | TIMES | AND | OR | LT | LTE | GT | GTE | EQ | NEQ ) expr expr ) | ^(compound= COMPOUND ( statement )* ) | ^(assign= ASSIGN expr expr ) | ^(write= WRITE ( expr )+ ) | ^(read= READ ( idref )+ ) | operand );
	public final void expr() throws RecognitionException {
		HokenNode exp=null;
		HokenNode compound=null;
		HokenNode assign=null;
		HokenNode write=null;
		HokenNode read=null;

		try {
			// src\\hoken\\checker\\HokenChecker.g:65:5: ( ^(exp= ( PLUS | MINUS ) expr ( expr )? ) | ^(exp= NOT expr ) | ^(exp= ( DIVIDE | MODULO | TIMES | AND | OR | LT | LTE | GT | GTE | EQ | NEQ ) expr expr ) | ^(compound= COMPOUND ( statement )* ) | ^(assign= ASSIGN expr expr ) | ^(write= WRITE ( expr )+ ) | ^(read= READ ( idref )+ ) | operand )
			int alt9=8;
			switch ( input.LA(1) ) {
			case MINUS:
			case PLUS:
				{
				alt9=1;
				}
				break;
			case NOT:
				{
				alt9=2;
				}
				break;
			case AND:
			case DIVIDE:
			case EQ:
			case GT:
			case GTE:
			case LT:
			case LTE:
			case MODULO:
			case NEQ:
			case OR:
			case TIMES:
				{
				alt9=3;
				}
				break;
			case COMPOUND:
				{
				alt9=4;
				}
				break;
			case ASSIGN:
				{
				alt9=5;
				}
				break;
			case WRITE:
				{
				alt9=6;
				}
				break;
			case READ:
				{
				alt9=7;
				}
				break;
			case CHAR:
			case FALSE:
			case ID:
			case INT:
			case TRUE:
				{
				alt9=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// src\\hoken\\checker\\HokenChecker.g:65:9: ^(exp= ( PLUS | MINUS ) expr ( expr )? )
					{
					exp=(HokenNode)input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr251);
					expr();
					state._fsp--;

					// src\\hoken\\checker\\HokenChecker.g:65:33: ( expr )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= AND && LA5_0 <= ASSIGN)||LA5_0==CHAR||LA5_0==COMPOUND||(LA5_0 >= DIVIDE && LA5_0 <= EQ)||(LA5_0 >= FALSE && LA5_0 <= INT)||(LA5_0 >= LT && LA5_0 <= PLUS)||LA5_0==READ||(LA5_0 >= TIMES && LA5_0 <= TRUE)||LA5_0==WRITE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// src\\hoken\\checker\\HokenChecker.g:65:33: expr
							{
							pushFollow(FOLLOW_expr_in_expr253);
							expr();
							state._fsp--;

							}
							break;

					}

					match(input, Token.UP, null); 

					((ExpressionNode)exp).check();
					}
					break;
				case 2 :
					// src\\hoken\\checker\\HokenChecker.g:67:9: ^(exp= NOT expr )
					{
					exp=(HokenNode)match(input,NOT,FOLLOW_NOT_in_expr282); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr284);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					((ExpressionNode)exp).check();
					}
					break;
				case 3 :
					// src\\hoken\\checker\\HokenChecker.g:69:9: ^(exp= ( DIVIDE | MODULO | TIMES | AND | OR | LT | LTE | GT | GTE | EQ | NEQ ) expr expr )
					{
					exp=(HokenNode)input.LT(1);
					if ( input.LA(1)==AND||(input.LA(1) >= DIVIDE && input.LA(1) <= EQ)||(input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||(input.LA(1) >= MODULO && input.LA(1) <= NEQ)||input.LA(1)==OR||input.LA(1)==TIMES ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr336);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr338);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					((ExpressionNode)exp).check();
					}
					break;
				case 4 :
					// src\\hoken\\checker\\HokenChecker.g:71:9: ^(compound= COMPOUND ( statement )* )
					{
					compound=(HokenNode)match(input,COMPOUND,FOLLOW_COMPOUND_in_expr366); 
					symtab.openScope();
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// src\\hoken\\checker\\HokenChecker.g:73:13: ( statement )*
						loop6:
						while (true) {
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( ((LA6_0 >= AND && LA6_0 <= ASSIGN)||LA6_0==CHAR||(LA6_0 >= COMPOUND && LA6_0 <= CONST)||(LA6_0 >= DIVIDE && LA6_0 <= EQ)||(LA6_0 >= FALSE && LA6_0 <= INT)||(LA6_0 >= LT && LA6_0 <= PLUS)||LA6_0==READ||(LA6_0 >= TIMES && LA6_0 <= TRUE)||(LA6_0 >= VAR && LA6_0 <= WRITE)) ) {
								alt6=1;
							}

							switch (alt6) {
							case 1 :
								// src\\hoken\\checker\\HokenChecker.g:73:13: statement
								{
								pushFollow(FOLLOW_statement_in_expr395);
								statement();
								state._fsp--;

								}
								break;

							default :
								break loop6;
							}
						}

						symtab.closeScope();
						compound.type = ((HokenNode)compound.getChild(compound.getChildCount()-1)).type;
						match(input, Token.UP, null); 
					}

					}
					break;
				case 5 :
					// src\\hoken\\checker\\HokenChecker.g:77:9: ^(assign= ASSIGN expr expr )
					{
					assign=(HokenNode)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr447); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr449);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr451);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


					            IdNode id;
					            if(((HokenNode)assign.getChild(0)).getType() != ID) {
					                throw new HokenException(assign, "Linkerkant van een toekenning moet een identifier zijn.");
					            } else {
					                id = (IdNode)assign.getChild(0);
					            }
					            if(id.declaration.isConstant) {
					                throw new HokenException(assign, "Identifier '" + id.getText() + "' is een constante.");
					            }
					            Type ex_type = ((HokenNode)assign.getChild(1)).type;
					            if(id.type != ex_type) {
					                throw new HokenException(assign, "Verkeerde combinatie: identifier '" + id.getText() + "' is van type " + id.type.toString() + ", maar er wordt " + ex_type.toString() + " toegekend");
					            }
					            ((HokenNode)assign).type = ex_type;
					        
					}
					break;
				case 6 :
					// src\\hoken\\checker\\HokenChecker.g:94:9: ^(write= WRITE ( expr )+ )
					{
					write=(HokenNode)match(input,WRITE,FOLLOW_WRITE_in_expr475); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\checker\\HokenChecker.g:94:23: ( expr )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= AND && LA7_0 <= ASSIGN)||LA7_0==CHAR||LA7_0==COMPOUND||(LA7_0 >= DIVIDE && LA7_0 <= EQ)||(LA7_0 >= FALSE && LA7_0 <= INT)||(LA7_0 >= LT && LA7_0 <= PLUS)||LA7_0==READ||(LA7_0 >= TIMES && LA7_0 <= TRUE)||LA7_0==WRITE) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// src\\hoken\\checker\\HokenChecker.g:94:23: expr
							{
							pushFollow(FOLLOW_expr_in_expr477);
							expr();
							state._fsp--;

							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match(input, Token.UP, null); 

					 
					            for(Object child : write.getChildren()) {
					                HokenNode expr = (HokenNode)child;
					                if(expr.type == Type.VOID)
					                    throw new HokenException(write, "Verkeerd argument: verwachtte [INTEGER, BOOLEAN, CHARACTER], kreeg VOID");
					            }
					            if(write.getChildCount() == 1)
					                write.type = ((HokenNode)write.getChild(0)).type;
					            else
					                write.type = Type.VOID;
					        
					}
					break;
				case 7 :
					// src\\hoken\\checker\\HokenChecker.g:106:9: ^(read= READ ( idref )+ )
					{
					read=(HokenNode)match(input,READ,FOLLOW_READ_in_expr502); 
					match(input, Token.DOWN, null); 
					// src\\hoken\\checker\\HokenChecker.g:106:21: ( idref )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==ID) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// src\\hoken\\checker\\HokenChecker.g:106:21: idref
							{
							pushFollow(FOLLOW_idref_in_expr504);
							idref();
							state._fsp--;

							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match(input, Token.UP, null); 


					            if(read.getChildCount() == 1)
					                read.type = symtab.retrieve(read.getChild(0)).type;
					            else {
					                read.type = Type.VOID;
					                for(Object id : read.getChildren())
					                    symtab.retrieve((HokenNode)id);
					            }
					        
					}
					break;
				case 8 :
					// src\\hoken\\checker\\HokenChecker.g:116:9: operand
					{
					pushFollow(FOLLOW_operand_in_expr526);
					operand();
					state._fsp--;

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
	}
	// $ANTLR end "expr"



	// $ANTLR start "operand"
	// src\\hoken\\checker\\HokenChecker.g:119:1: operand : ( idref |i= INT |c= CHAR |b= ( TRUE | FALSE ) );
	public final void operand() throws RecognitionException {
		HokenNode i=null;
		HokenNode c=null;
		HokenNode b=null;

		try {
			// src\\hoken\\checker\\HokenChecker.g:120:5: ( idref |i= INT |c= CHAR |b= ( TRUE | FALSE ) )
			int alt10=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt10=1;
				}
				break;
			case INT:
				{
				alt10=2;
				}
				break;
			case CHAR:
				{
				alt10=3;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt10=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// src\\hoken\\checker\\HokenChecker.g:120:9: idref
					{
					pushFollow(FOLLOW_idref_in_operand549);
					idref();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\hoken\\checker\\HokenChecker.g:121:9: i= INT
					{
					i=(HokenNode)match(input,INT,FOLLOW_INT_in_operand561); 
					 i.type = Type.INTEGER; 
					}
					break;
				case 3 :
					// src\\hoken\\checker\\HokenChecker.g:123:9: c= CHAR
					{
					c=(HokenNode)match(input,CHAR,FOLLOW_CHAR_in_operand583); 
					 c.type = Type.CHARACTER; 
					}
					break;
				case 4 :
					// src\\hoken\\checker\\HokenChecker.g:125:9: b= ( TRUE | FALSE )
					{
					b=(HokenNode)input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					 b.type = Type.BOOLEAN; 
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
	}
	// $ANTLR end "operand"



	// $ANTLR start "idref"
	// src\\hoken\\checker\\HokenChecker.g:129:1: idref : id= ID ;
	public final void idref() throws RecognitionException {
		HokenNode id=null;

		try {
			// src\\hoken\\checker\\HokenChecker.g:130:5: (id= ID )
			// src\\hoken\\checker\\HokenChecker.g:130:9: id= ID
			{
			id=(HokenNode)match(input,ID,FOLLOW_ID_in_idref640); 

			            DeclarationNode ref = symtab.retrieve(id);
			            ((IdNode)id).declaration = ref;
			            ((IdNode)id).type = ref.type;
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "idref"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program63 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_program91 = new BitSet(new long[]{0x00001B27F87DB0B8L});
	public static final BitSet FOLLOW_VAR_in_statement139 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_statement143 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_statement154 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_CONST_in_statement184 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_statement188 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_statement199 = new BitSet(new long[]{0x0000020000640080L});
	public static final BitSet FOLLOW_operand_in_statement203 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr251 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_expr_in_expr253 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr284 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr336 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr338 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr366 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_expr395 = new BitSet(new long[]{0x00001B27F87DB0B8L});
	public static final BitSet FOLLOW_ASSIGN_in_expr447 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr449 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WRITE_in_expr475 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr477 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_READ_in_expr502 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_idref_in_expr504 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_operand_in_expr526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idref_in_operand549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_operand561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_operand583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_idref640 = new BitSet(new long[]{0x0000000000000002L});
}

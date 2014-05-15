// $ANTLR 3.5.2 src\\vb\\week4\\xcalc\\CalcCodeGenerator.g 2014-05-15 16:17:37

package vb.week4.xcalc;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalcCodeGenerator extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BECOMES", "COLON", "COMMA", "COMMENT", 
		"DIGIT", "DIVIDE", "DO", "ELSE", "EQUALS", "GT", "GTE", "IDENTIFIER", 
		"IF", "INTEGER", "LETTER", "LOWER", "LPAREN", "LT", "LTE", "MINUS", "NEQUALS", 
		"NUMBER", "PLUS", "PRINT", "PROGRAM", "RPAREN", "SEMICOLON", "SWAP", "THEN", 
		"TIMES", "UPPER", "VAR", "WHILE", "WS"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int COLON=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int DIVIDE=9;
	public static final int DO=10;
	public static final int ELSE=11;
	public static final int EQUALS=12;
	public static final int GT=13;
	public static final int GTE=14;
	public static final int IDENTIFIER=15;
	public static final int IF=16;
	public static final int INTEGER=17;
	public static final int LETTER=18;
	public static final int LOWER=19;
	public static final int LPAREN=20;
	public static final int LT=21;
	public static final int LTE=22;
	public static final int MINUS=23;
	public static final int NEQUALS=24;
	public static final int NUMBER=25;
	public static final int PLUS=26;
	public static final int PRINT=27;
	public static final int PROGRAM=28;
	public static final int RPAREN=29;
	public static final int SEMICOLON=30;
	public static final int SWAP=31;
	public static final int THEN=32;
	public static final int TIMES=33;
	public static final int UPPER=34;
	public static final int VAR=35;
	public static final int WHILE=36;
	public static final int WS=37;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public CalcCodeGenerator(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcCodeGenerator(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CalcCodeGenerator.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\vb\\week4\\xcalc\\CalcCodeGenerator.g"; }

	 
	    private Map<String,Integer> store = new HashMap<String,Integer>();
	    private int storeCounter = 0;
	    private int labelCounter = 1;



	// $ANTLR start "program"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:20:1: program : ^( PROGRAM ( declaration | statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:21:5: ( ^( PROGRAM ( declaration | statement )+ ) )
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:21:9: ^( PROGRAM ( declaration | statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program86); 
			match(input, Token.DOWN, null); 
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:21:19: ( declaration | statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR) ) {
					alt1=1;
				}
				else if ( (LA1_0==BECOMES||LA1_0==DO||LA1_0==PRINT||LA1_0==SWAP) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:21:20: declaration
					{
					pushFollow(FOLLOW_declaration_in_program89);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:21:34: statement
					{
					pushFollow(FOLLOW_statement_in_program93);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 


			            System.out.println("HALT         ");
			        
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



	// $ANTLR start "declaration"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:27:1: declaration : ^( VAR id= IDENTIFIER type ) ;
	public final void declaration() throws RecognitionException {
		CommonTree id=null;

		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:28:5: ( ^( VAR id= IDENTIFIER type ) )
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:28:9: ^( VAR id= IDENTIFIER type )
			{
			match(input,VAR,FOLLOW_VAR_in_declaration130); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration134); 
			pushFollow(FOLLOW_type_in_declaration136);
			type();
			state._fsp--;

			match(input, Token.UP, null); 


			        	System.out.println("PUSH        1");
			        	System.out.println("LOADL       0");
			        	System.out.println("STORE(1)    " + storeCounter + "[SB]");
			        	store.put((id!=null?id.getText():null), storeCounter++);
			        
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
	// $ANTLR end "declaration"



	// $ANTLR start "statement"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:37:1: statement : ( becomes | ^( PRINT v= expr ) | ^( SWAP var1= IDENTIFIER var2= IDENTIFIER ) | ^( DO (statements= statement )+ ^( WHILE cond= expr ) ) );
	public final void statement() throws RecognitionException {
		CommonTree var1=null;
		CommonTree var2=null;

		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:38:5: ( becomes | ^( PRINT v= expr ) | ^( SWAP var1= IDENTIFIER var2= IDENTIFIER ) | ^( DO (statements= statement )+ ^( WHILE cond= expr ) ) )
			int alt3=4;
			switch ( input.LA(1) ) {
			case BECOMES:
				{
				alt3=1;
				}
				break;
			case PRINT:
				{
				alt3=2;
				}
				break;
			case SWAP:
				{
				alt3=3;
				}
				break;
			case DO:
				{
				alt3=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:38:9: becomes
					{
					pushFollow(FOLLOW_becomes_in_statement167);
					becomes();
					state._fsp--;

					 System.out.println("POP(0)      1"); 
					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:39:9: ^( PRINT v= expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement180); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement184);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


					        	System.out.println("CALL        putint");
					        	System.out.println("CALL        puteol");
					        
					}
					break;
				case 3 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:44:9: ^( SWAP var1= IDENTIFIER var2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement206); 
					match(input, Token.DOWN, null); 
					var1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement211); 
					var2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement215); 
					match(input, Token.UP, null); 


					        	System.out.println("LOAD(1)      " + store.get((var1!=null?var1.getText():null)) + "[SB]");
					        	System.out.println("LOAD(1)      " + store.get((var2!=null?var2.getText():null)) + "[SB]");
					            System.out.println("STORE(1)     " + store.get((var1!=null?var1.getText():null)) + "[SB]");
					            System.out.println("STORE(1)     " + store.get((var2!=null?var2.getText():null)) + "[SB]");   
					        
					}
					break;
				case 4 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:51:9: ^( DO (statements= statement )+ ^( WHILE cond= expr ) )
					{

					    		int labelNo = labelCounter++;
					            System.out.print("L" + labelNo + ": ");
					        
					match(input,DO,FOLLOW_DO_in_statement247); 
					match(input, Token.DOWN, null); 
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:55:24: (statements= statement )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==BECOMES||LA2_0==DO||LA2_0==PRINT||LA2_0==SWAP) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:55:24: statements= statement
							{
							pushFollow(FOLLOW_statement_in_statement251);
							statement();
							state._fsp--;

							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					match(input,WHILE,FOLLOW_WHILE_in_statement255); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement259);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					    
					        	System.out.println("LOADL       0");
					        	System.out.println("LOADL       1");
					        	System.out.println("CALL        ne");
						        System.out.println("JUMPIF(1)   L" + labelNo + "[CB]");
					        
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



	// $ANTLR start "becomes"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:64:1: becomes : ^( BECOMES id= IDENTIFIER v= assignment ) ;
	public final void becomes() throws RecognitionException {
		CommonTree id=null;

		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:65:2: ( ^( BECOMES id= IDENTIFIER v= assignment ) )
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:65:6: ^( BECOMES id= IDENTIFIER v= assignment )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_becomes288); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_becomes292); 
			pushFollow(FOLLOW_assignment_in_becomes296);
			assignment();
			state._fsp--;

			match(input, Token.UP, null); 


			        	System.out.println("STORE(1)    " + store.get((id!=null?id.getText():null)) + "[SB]");
			        	System.out.println("LOAD(1)     " + store.get((id!=null?id.getText():null)) + "[SB]");
			        	
			        
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
	// $ANTLR end "becomes"



	// $ANTLR start "assignment"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:73:1: assignment : (z= expr |z= becomes );
	public final void assignment() throws RecognitionException {
		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:74:5: (z= expr |z= becomes )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DIVIDE||(LA4_0 >= EQUALS && LA4_0 <= IF)||(LA4_0 >= LT && LA4_0 <= PLUS)||LA4_0==TIMES) ) {
				alt4=1;
			}
			else if ( (LA4_0==BECOMES) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:74:9: z= expr
					{
					pushFollow(FOLLOW_expr_in_assignment328);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:75:9: z= becomes
					{
					pushFollow(FOLLOW_becomes_in_assignment340);
					becomes();
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
	// $ANTLR end "assignment"



	// $ANTLR start "expr"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:78:1: expr : (z= binary_expr | ^( IF cond= expr trueval= expr falseval= expr ) );
	public final void expr() throws RecognitionException {
		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:79:5: (z= binary_expr | ^( IF cond= expr trueval= expr falseval= expr ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==DIVIDE||(LA5_0 >= EQUALS && LA5_0 <= IDENTIFIER)||(LA5_0 >= LT && LA5_0 <= PLUS)||LA5_0==TIMES) ) {
				alt5=1;
			}
			else if ( (LA5_0==IF) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:79:9: z= binary_expr
					{
					pushFollow(FOLLOW_binary_expr_in_expr365);
					binary_expr();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:80:9: ^( IF cond= expr trueval= expr falseval= expr )
					{
					match(input,IF,FOLLOW_IF_in_expr376); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr380);
					expr();
					state._fsp--;


					        	int falseLabel = labelCounter++;
					        	int endLabel   = labelCounter++;
					            System.out.println("LOADL       0");
					            System.out.println("LOADL       1");
					            System.out.println("CALL        ne");
					            System.out.println("JUMPIF(0)   L" + falseLabel + "[CB]");
					        
					pushFollow(FOLLOW_expr_in_expr394);
					expr();
					state._fsp--;


					        	System.out.println("JUMP        L" + endLabel + "[CB]");
					        	System.out.print("L" + falseLabel + ": ");
					        
					pushFollow(FOLLOW_expr_in_expr408);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 


					    		System.out.print("L" + endLabel + ": ");
					        
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



	// $ANTLR start "binary_expr"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:98:1: binary_expr : (z= expr1 | ^( LT a= expr b= expr ) | ^( LTE a= expr b= expr ) | ^( GT a= expr b= expr ) | ^( GTE a= expr b= expr ) | ^( EQUALS a= expr b= expr ) | ^( NEQUALS a= expr b= expr ) );
	public final void binary_expr() throws RecognitionException {
		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:99:5: (z= expr1 | ^( LT a= expr b= expr ) | ^( LTE a= expr b= expr ) | ^( GT a= expr b= expr ) | ^( GTE a= expr b= expr ) | ^( EQUALS a= expr b= expr ) | ^( NEQUALS a= expr b= expr ) )
			int alt6=7;
			switch ( input.LA(1) ) {
			case DIVIDE:
			case IDENTIFIER:
			case MINUS:
			case NUMBER:
			case PLUS:
			case TIMES:
				{
				alt6=1;
				}
				break;
			case LT:
				{
				alt6=2;
				}
				break;
			case LTE:
				{
				alt6=3;
				}
				break;
			case GT:
				{
				alt6=4;
				}
				break;
			case GTE:
				{
				alt6=5;
				}
				break;
			case EQUALS:
				{
				alt6=6;
				}
				break;
			case NEQUALS:
				{
				alt6=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:99:9: z= expr1
					{
					pushFollow(FOLLOW_expr1_in_binary_expr440);
					expr1();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:100:9: ^( LT a= expr b= expr )
					{
					match(input,LT,FOLLOW_LT_in_binary_expr451); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr460);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr464);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("CALL        lt"); 
					}
					break;
				case 3 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:101:9: ^( LTE a= expr b= expr )
					{
					match(input,LTE,FOLLOW_LTE_in_binary_expr478); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr486);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr490);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("CALL        le"); 
					}
					break;
				case 4 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:102:9: ^( GT a= expr b= expr )
					{
					match(input,GT,FOLLOW_GT_in_binary_expr504); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr513);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr517);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("CALL        gt"); 
					}
					break;
				case 5 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:103:9: ^( GTE a= expr b= expr )
					{
					match(input,GTE,FOLLOW_GTE_in_binary_expr531); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr539);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr543);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("CALL        ge"); 
					}
					break;
				case 6 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:104:9: ^( EQUALS a= expr b= expr )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_binary_expr557); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr562);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr566);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("LOADL       1"); System.out.println("CALL        eq"); 
					}
					break;
				case 7 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:105:9: ^( NEQUALS a= expr b= expr )
					{
					match(input,NEQUALS,FOLLOW_NEQUALS_in_binary_expr580); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr584);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr588);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("LOADL       1"); System.out.println("CALL        ne"); 
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
	// $ANTLR end "binary_expr"



	// $ANTLR start "expr1"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:108:1: expr1 : (z= expr2 | ^( PLUS x= expr y= expr ) | ^( MINUS x= expr y= expr ) );
	public final void expr1() throws RecognitionException {
		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:109:5: (z= expr2 | ^( PLUS x= expr y= expr ) | ^( MINUS x= expr y= expr ) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case DIVIDE:
			case IDENTIFIER:
			case NUMBER:
			case TIMES:
				{
				alt7=1;
				}
				break;
			case PLUS:
				{
				alt7=2;
				}
				break;
			case MINUS:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:109:9: z= expr2
					{
					pushFollow(FOLLOW_expr2_in_expr1616);
					expr2();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:110:9: ^( PLUS x= expr y= expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr1627); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1631);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1635);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("CALL        add");  
					}
					break;
				case 3 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:111:9: ^( MINUS x= expr y= expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr1651); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1655);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1659);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("CALL        sub");  
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
	// $ANTLR end "expr1"



	// $ANTLR start "expr2"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:114:1: expr2 : (z= operand | ^( TIMES x= expr y= expr ) | ^( DIVIDE x= expr y= expr ) );
	public final void expr2() throws RecognitionException {
		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:115:5: (z= operand | ^( TIMES x= expr y= expr ) | ^( DIVIDE x= expr y= expr ) )
			int alt8=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
				{
				alt8=1;
				}
				break;
			case TIMES:
				{
				alt8=2;
				}
				break;
			case DIVIDE:
				{
				alt8=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:115:9: z= operand
					{
					pushFollow(FOLLOW_operand_in_expr2684);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:116:9: ^( TIMES x= expr y= expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr2695); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr2699);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr2703);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("CALL        mult"); 
					}
					break;
				case 3 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:117:9: ^( DIVIDE x= expr y= expr )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expr2718); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr2722);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr2726);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("CALL        div"); 
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
	// $ANTLR end "expr2"



	// $ANTLR start "operand"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:120:1: operand : (id= IDENTIFIER |n= NUMBER );
	public final void operand() throws RecognitionException {
		CommonTree id=null;
		CommonTree n=null;

		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:121:5: (id= IDENTIFIER |n= NUMBER )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==IDENTIFIER) ) {
				alt9=1;
			}
			else if ( (LA9_0==NUMBER) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:121:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand754); 

					        	System.out.println("LOAD(1)     " + store.get((id!=null?id.getText():null)) + "[SB]");
					        
					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:125:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand777); 

					        	System.out.println("LOADL       " + (n!=null?n.getText():null));
					        
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



	// $ANTLR start "type"
	// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:131:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:132:5: ( INTEGER )
			// src\\vb\\week4\\xcalc\\CalcCodeGenerator.g:132:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type810); 
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
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program86 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_program89 = new BitSet(new long[]{0x0000000888000418L});
	public static final BitSet FOLLOW_statement_in_program93 = new BitSet(new long[]{0x0000000888000418L});
	public static final BitSet FOLLOW_VAR_in_declaration130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration134 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_type_in_declaration136 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_becomes_in_statement167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_statement180 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement206 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement211 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement215 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_statement247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_statement251 = new BitSet(new long[]{0x0000001088000410L});
	public static final BitSet FOLLOW_WHILE_in_statement255 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement259 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_becomes288 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_becomes292 = new BitSet(new long[]{0x0000000207E1F210L});
	public static final BitSet FOLLOW_assignment_in_becomes296 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_assignment328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_becomes_in_assignment340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_expr_in_expr365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr376 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr380 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr394 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr408 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr1_in_binary_expr440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_binary_expr451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr460 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr464 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_binary_expr478 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr486 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr490 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_binary_expr504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr513 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr517 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_binary_expr531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr539 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr543 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_binary_expr557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr562 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr566 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_binary_expr580 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr584 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr588 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr2_in_expr1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr1627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1631 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr1635 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr1651 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1655 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr1659 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr2684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr2695 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2699 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr2703 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expr2718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2722 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr2726 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type810 = new BitSet(new long[]{0x0000000000000002L});
}

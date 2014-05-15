// $ANTLR 3.5.2 ..\\src\\vb\\week3\\calc\\CalcInterpreter.g 2014-05-12 18:29:19

package vb.week4.xcalc;
import java.util.Map;
import java.util.HashMap;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalcInterpreter extends TreeParser {
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


	public CalcInterpreter(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcInterpreter(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CalcInterpreter.tokenNames; }
	@Override public String getGrammarFileName() { return "..\\src\\vb\\week3\\calc\\CalcInterpreter.g"; }

	 
	    private Map<String,Integer> store = new HashMap<String,Integer>();   



	// $ANTLR start "program"
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:26:1: program : ^( PROGRAM ( declaration | statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:27:5: ( ^( PROGRAM ( declaration | statement )+ ) )
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:27:9: ^( PROGRAM ( declaration | statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program94); 
			match(input, Token.DOWN, null); 
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:27:19: ( declaration | statement )+
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:27:20: declaration
					{
					pushFollow(FOLLOW_declaration_in_program97);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:27:34: statement
					{
					pushFollow(FOLLOW_statement_in_program101);
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:30:1: declaration : ^( VAR id= IDENTIFIER type ) ;
	public final void declaration() throws RecognitionException {
		CommonTree id=null;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:31:5: ( ^( VAR id= IDENTIFIER type ) )
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:31:9: ^( VAR id= IDENTIFIER type )
			{
			match(input,VAR,FOLLOW_VAR_in_declaration128); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration132); 
			pushFollow(FOLLOW_type_in_declaration134);
			type();
			state._fsp--;

			match(input, Token.UP, null); 

			 store.put((id!=null?id.getText():null), 0); 
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:35:1: statement : ( becomes | ^( PRINT v= expr ) | ^( SWAP var1= IDENTIFIER var2= IDENTIFIER ) | ^( DO (statements= statement )+ ^( WHILE cond= expr ) ) );
	public final void statement() throws RecognitionException {
		CommonTree var1=null;
		CommonTree var2=null;
		int v =0;
		int cond =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:36:5: ( becomes | ^( PRINT v= expr ) | ^( SWAP var1= IDENTIFIER var2= IDENTIFIER ) | ^( DO (statements= statement )+ ^( WHILE cond= expr ) ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:36:9: becomes
					{
					pushFollow(FOLLOW_becomes_in_statement169);
					becomes();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:37:9: ^( PRINT v= expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement180); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement184);
					v=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("" + v);   
					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:39:9: ^( SWAP var1= IDENTIFIER var2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement210); 
					match(input, Token.DOWN, null); 
					var1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement215); 
					var2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement219); 
					match(input, Token.UP, null); 

					 int new1 = store.get((var2!=null?var2.getText():null)); int new2 = store.get((var1!=null?var1.getText():null)); store.put((var1!=null?var1.getText():null), new1); store.put((var2!=null?var2.getText():null), new2); 
					}
					break;
				case 4 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:41:7: ^( DO (statements= statement )+ ^( WHILE cond= expr ) )
					{
					 int idx = input.index(); 
					match(input,DO,FOLLOW_DO_in_statement246); 
					match(input, Token.DOWN, null); 
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:41:52: (statements= statement )+
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
							// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:41:52: statements= statement
							{
							pushFollow(FOLLOW_statement_in_statement250);
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

					match(input,WHILE,FOLLOW_WHILE_in_statement254); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement258);
					cond=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					match(input, Token.UP, null); 

					    
						        if(cond != 0) {
						        	input.rewind(idx);
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
	}
	// $ANTLR end "statement"



	// $ANTLR start "becomes"
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:49:1: becomes returns [int val = 0;] : ^( BECOMES id= IDENTIFIER v= assignment ) ;
	public final int becomes() throws RecognitionException {
		int val =  0;;


		CommonTree id=null;
		int v =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:50:2: ( ^( BECOMES id= IDENTIFIER v= assignment ) )
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:50:6: ^( BECOMES id= IDENTIFIER v= assignment )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_becomes291); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_becomes295); 
			pushFollow(FOLLOW_assignment_in_becomes299);
			v=assignment();
			state._fsp--;

			match(input, Token.UP, null); 

			 store.put((id!=null?id.getText():null), v); val = v;      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "becomes"



	// $ANTLR start "assignment"
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:54:1: assignment returns [int val = 0;] : (z= expr |z= becomes );
	public final int assignment() throws RecognitionException {
		int val =  0;;


		int z =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:55:5: (z= expr |z= becomes )
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:55:9: z= expr
					{
					pushFollow(FOLLOW_expr_in_assignment339);
					z=expr();
					state._fsp--;

					 val = z; 
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:56:9: z= becomes
					{
					pushFollow(FOLLOW_becomes_in_assignment353);
					z=becomes();
					state._fsp--;

					 val = z; 
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
		return val;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "expr"
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:59:1: expr returns [int val = 0;] : (z= binary_expr | ^( IF cond= expr trueval= expr falseval= expr ) );
	public final int expr() throws RecognitionException {
		int val =  0;;


		int z =0;
		int cond =0;
		int trueval =0;
		int falseval =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:60:5: (z= binary_expr | ^( IF cond= expr trueval= expr falseval= expr ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:60:9: z= binary_expr
					{
					pushFollow(FOLLOW_binary_expr_in_expr384);
					z=binary_expr();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:61:9: ^( IF cond= expr trueval= expr falseval= expr )
					{
					match(input,IF,FOLLOW_IF_in_expr415); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr419);
					cond=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr423);
					trueval=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr427);
					falseval=expr();
					state._fsp--;

					match(input, Token.UP, null); 


					    		if(cond != 0) {
					    		  val = trueval;
					    		} else {
					    		  val = falseval;
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
		return val;
	}
	// $ANTLR end "expr"



	// $ANTLR start "binary_expr"
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:71:1: binary_expr returns [int val = 0;] : (z= expr1 | ^( LT a= expr b= expr ) | ^( LTE a= expr b= expr ) | ^( GT a= expr b= expr ) | ^( GTE a= expr b= expr ) | ^( EQUALS a= expr b= expr ) | ^( NEQUALS a= expr b= expr ) );
	public final int binary_expr() throws RecognitionException {
		int val =  0;;


		int z =0;
		int a =0;
		int b =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:72:5: (z= expr1 | ^( LT a= expr b= expr ) | ^( LTE a= expr b= expr ) | ^( GT a= expr b= expr ) | ^( GTE a= expr b= expr ) | ^( EQUALS a= expr b= expr ) | ^( NEQUALS a= expr b= expr ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:72:9: z= expr1
					{
					pushFollow(FOLLOW_expr1_in_binary_expr463);
					z=expr1();
					state._fsp--;

					 val = z; 
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:73:9: ^( LT a= expr b= expr )
					{
					match(input,LT,FOLLOW_LT_in_binary_expr476); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr485);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr489);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a <  b) ? 1 : 0; 
					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:74:9: ^( LTE a= expr b= expr )
					{
					match(input,LTE,FOLLOW_LTE_in_binary_expr503); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr511);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr515);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a <= b) ? 1 : 0; 
					}
					break;
				case 4 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:75:9: ^( GT a= expr b= expr )
					{
					match(input,GT,FOLLOW_GT_in_binary_expr529); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr538);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr542);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a >  b) ? 1 : 0; 
					}
					break;
				case 5 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:76:9: ^( GTE a= expr b= expr )
					{
					match(input,GTE,FOLLOW_GTE_in_binary_expr556); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr564);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr568);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a >= b) ? 1 : 0; 
					}
					break;
				case 6 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:77:9: ^( EQUALS a= expr b= expr )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_binary_expr582); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr587);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr591);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a == b) ? 1 : 0; 
					}
					break;
				case 7 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:78:9: ^( NEQUALS a= expr b= expr )
					{
					match(input,NEQUALS,FOLLOW_NEQUALS_in_binary_expr605); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr609);
					a=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr613);
					b=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a != b) ? 1 : 0; 
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
		return val;
	}
	// $ANTLR end "binary_expr"



	// $ANTLR start "expr1"
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:81:1: expr1 returns [int val = 0;] : (z= expr2 | ^( PLUS x= expr y= expr ) | ^( MINUS x= expr y= expr ) );
	public final int expr1() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:82:5: (z= expr2 | ^( PLUS x= expr y= expr ) | ^( MINUS x= expr y= expr ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:82:9: z= expr2
					{
					pushFollow(FOLLOW_expr2_in_expr1646);
					z=expr2();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:83:9: ^( PLUS x= expr y= expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr1677); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1681);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1685);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x + y;  
					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:84:9: ^( MINUS x= expr y= expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr1701); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1705);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1709);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x - y;  
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
		return val;
	}
	// $ANTLR end "expr1"



	// $ANTLR start "expr2"
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:87:1: expr2 returns [int val = 0;] : (z= operand | ^( TIMES x= expr y= expr ) | ^( DIVIDE x= expr y= expr ) );
	public final int expr2() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:88:5: (z= operand | ^( TIMES x= expr y= expr ) | ^( DIVIDE x= expr y= expr ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:88:9: z= operand
					{
					pushFollow(FOLLOW_operand_in_expr2738);
					z=operand();
					state._fsp--;

					 val = z;     
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:89:9: ^( TIMES x= expr y= expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr2767); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr2771);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr2775);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x * y; 
					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:90:9: ^( DIVIDE x= expr y= expr )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expr2790); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr2794);
					x=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr2798);
					y=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					   if (y == 0)
					                throw new CalcException("cannot divide by zero");
					            else 
					                val = x / y;
					        
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
		return val;
	}
	// $ANTLR end "expr2"



	// $ANTLR start "operand"
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:98:1: operand returns [int val = 0] : (id= IDENTIFIER |n= NUMBER );
	public final int operand() throws RecognitionException {
		int val =  0;


		CommonTree id=null;
		CommonTree n=null;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:99:5: (id= IDENTIFIER |n= NUMBER )
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:99:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand838); 
					 val = store.get((id!=null?id.getText():null));       
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:100:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand855); 
					 val = Integer.parseInt((n!=null?n.getText():null)); 
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
		return val;
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:103:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:104:5: ( INTEGER )
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:104:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type887); 
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



	public static final BitSet FOLLOW_PROGRAM_in_program94 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_declaration_in_program97 = new BitSet(new long[]{0x0000000888000418L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0000000888000418L});
	public static final BitSet FOLLOW_VAR_in_declaration128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration132 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_type_in_declaration134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_becomes_in_statement169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_statement180 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement184 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement215 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement219 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_statement246 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_statement250 = new BitSet(new long[]{0x0000001088000410L});
	public static final BitSet FOLLOW_WHILE_in_statement254 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement258 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_becomes291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_becomes295 = new BitSet(new long[]{0x0000000207E1F210L});
	public static final BitSet FOLLOW_assignment_in_becomes299 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_assignment339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_becomes_in_assignment353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_expr_in_expr384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr419 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr423 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr427 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr1_in_binary_expr463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_binary_expr476 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr485 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr489 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_binary_expr503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr511 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr515 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_binary_expr529 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr538 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr542 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_binary_expr556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr564 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr568 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_binary_expr582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr587 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr591 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_binary_expr605 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr609 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr613 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr2_in_expr1646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr1677 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1681 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr1685 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr1701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1705 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr1709 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr2738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr2767 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2771 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr2775 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expr2790 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2794 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr2798 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type887 = new BitSet(new long[]{0x0000000000000002L});
}

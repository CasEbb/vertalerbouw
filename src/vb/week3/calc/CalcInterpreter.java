// $ANTLR 3.5.2 ..\\src\\vb\\week3\\calc\\CalcInterpreter.g 2014-05-08 17:35:12

package vb.week3.calc;
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
		"DIGIT", "DIVIDE", "ELSE", "EQUALS", "GT", "GTE", "IDENTIFIER", "IF", 
		"INTEGER", "LETTER", "LOWER", "LPAREN", "LT", "LTE", "MINUS", "NEQUALS", 
		"NUMBER", "PLUS", "PRINT", "PROGRAM", "RPAREN", "SEMICOLON", "SWAP", "THEN", 
		"TIMES", "UPPER", "VAR", "WS"
	};
	public static final int EOF=-1;
	public static final int BECOMES=4;
	public static final int COLON=5;
	public static final int COMMA=6;
	public static final int COMMENT=7;
	public static final int DIGIT=8;
	public static final int DIVIDE=9;
	public static final int ELSE=10;
	public static final int EQUALS=11;
	public static final int GT=12;
	public static final int GTE=13;
	public static final int IDENTIFIER=14;
	public static final int IF=15;
	public static final int INTEGER=16;
	public static final int LETTER=17;
	public static final int LOWER=18;
	public static final int LPAREN=19;
	public static final int LT=20;
	public static final int LTE=21;
	public static final int MINUS=22;
	public static final int NEQUALS=23;
	public static final int NUMBER=24;
	public static final int PLUS=25;
	public static final int PRINT=26;
	public static final int PROGRAM=27;
	public static final int RPAREN=28;
	public static final int SEMICOLON=29;
	public static final int SWAP=30;
	public static final int THEN=31;
	public static final int TIMES=32;
	public static final int UPPER=33;
	public static final int VAR=34;
	public static final int WS=35;

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
				else if ( (LA1_0==BECOMES||LA1_0==PRINT||LA1_0==SWAP) ) {
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:35:1: statement : ( becomes | ^( PRINT v= expr ) | ^( SWAP var1= IDENTIFIER var2= IDENTIFIER ) );
	public final void statement() throws RecognitionException {
		CommonTree var1=null;
		CommonTree var2=null;
		int v =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:36:5: ( becomes | ^( PRINT v= expr ) | ^( SWAP var1= IDENTIFIER var2= IDENTIFIER ) )
			int alt2=3;
			switch ( input.LA(1) ) {
			case BECOMES:
				{
				alt2=1;
				}
				break;
			case PRINT:
				{
				alt2=2;
				}
				break;
			case SWAP:
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:36:9: becomes
					{
					pushFollow(FOLLOW_becomes_in_statement170);
					becomes();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:37:9: ^( PRINT v= expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement181); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement185);
					v=expr();
					state._fsp--;

					match(input, Token.UP, null); 

					 System.out.println("" + v);   
					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:39:9: ^( SWAP var1= IDENTIFIER var2= IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement211); 
					match(input, Token.DOWN, null); 
					var1=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement216); 
					var2=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement220); 
					match(input, Token.UP, null); 

					 int new1 = store.get((var2!=null?var2.getText():null)); int new2 = store.get((var1!=null?var1.getText():null)); store.put((var1!=null?var1.getText():null), new1); store.put((var2!=null?var2.getText():null), new2); 
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:43:1: becomes returns [int val = 0;] : ^( BECOMES id= IDENTIFIER v= assignment ) ;
	public final int becomes() throws RecognitionException {
		int val =  0;;


		CommonTree id=null;
		int v =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:44:2: ( ^( BECOMES id= IDENTIFIER v= assignment ) )
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:44:6: ^( BECOMES id= IDENTIFIER v= assignment )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_becomes256); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_becomes260); 
			pushFollow(FOLLOW_assignment_in_becomes264);
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:48:1: assignment returns [int val = 0;] : (z= expr |z= becomes );
	public final int assignment() throws RecognitionException {
		int val =  0;;


		int z =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:49:5: (z= expr |z= becomes )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==DIVIDE||(LA3_0 >= EQUALS && LA3_0 <= IF)||(LA3_0 >= LT && LA3_0 <= PLUS)||LA3_0==TIMES) ) {
				alt3=1;
			}
			else if ( (LA3_0==BECOMES) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:49:9: z= expr
					{
					pushFollow(FOLLOW_expr_in_assignment304);
					z=expr();
					state._fsp--;

					 val = z; 
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:50:9: z= becomes
					{
					pushFollow(FOLLOW_becomes_in_assignment318);
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:53:1: expr returns [int val = 0;] : (z= binary_expr | ^( IF cond= expr trueval= expr falseval= expr ) );
	public final int expr() throws RecognitionException {
		int val =  0;;


		int z =0;
		int cond =0;
		int trueval =0;
		int falseval =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:54:5: (z= binary_expr | ^( IF cond= expr trueval= expr falseval= expr ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==DIVIDE||(LA4_0 >= EQUALS && LA4_0 <= IDENTIFIER)||(LA4_0 >= LT && LA4_0 <= PLUS)||LA4_0==TIMES) ) {
				alt4=1;
			}
			else if ( (LA4_0==IF) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:54:9: z= binary_expr
					{
					pushFollow(FOLLOW_binary_expr_in_expr349);
					z=binary_expr();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:55:9: ^( IF cond= expr trueval= expr falseval= expr )
					{
					match(input,IF,FOLLOW_IF_in_expr380); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr384);
					cond=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr388);
					trueval=expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr392);
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:65:1: binary_expr returns [int val = 0;] : (z= expr1 | ^( LT a= expr1 b= expr1 ) | ^( LTE a= expr1 b= expr1 ) | ^( GT a= expr1 b= expr1 ) | ^( GTE a= expr1 b= expr1 ) | ^( EQUALS a= expr1 b= expr1 ) | ^( NEQUALS a= expr1 b= expr1 ) );
	public final int binary_expr() throws RecognitionException {
		int val =  0;;


		int z =0;
		int a =0;
		int b =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:66:5: (z= expr1 | ^( LT a= expr1 b= expr1 ) | ^( LTE a= expr1 b= expr1 ) | ^( GT a= expr1 b= expr1 ) | ^( GTE a= expr1 b= expr1 ) | ^( EQUALS a= expr1 b= expr1 ) | ^( NEQUALS a= expr1 b= expr1 ) )
			int alt5=7;
			switch ( input.LA(1) ) {
			case DIVIDE:
			case IDENTIFIER:
			case MINUS:
			case NUMBER:
			case PLUS:
			case TIMES:
				{
				alt5=1;
				}
				break;
			case LT:
				{
				alt5=2;
				}
				break;
			case LTE:
				{
				alt5=3;
				}
				break;
			case GT:
				{
				alt5=4;
				}
				break;
			case GTE:
				{
				alt5=5;
				}
				break;
			case EQUALS:
				{
				alt5=6;
				}
				break;
			case NEQUALS:
				{
				alt5=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:66:9: z= expr1
					{
					pushFollow(FOLLOW_expr1_in_binary_expr428);
					z=expr1();
					state._fsp--;

					 val = z; 
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:67:9: ^( LT a= expr1 b= expr1 )
					{
					match(input,LT,FOLLOW_LT_in_binary_expr441); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr450);
					a=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr454);
					b=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a <  b) ? 1 : 0; 
					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:68:9: ^( LTE a= expr1 b= expr1 )
					{
					match(input,LTE,FOLLOW_LTE_in_binary_expr468); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr476);
					a=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr480);
					b=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a <= b) ? 1 : 0; 
					}
					break;
				case 4 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:69:9: ^( GT a= expr1 b= expr1 )
					{
					match(input,GT,FOLLOW_GT_in_binary_expr494); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr503);
					a=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr507);
					b=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a >  b) ? 1 : 0; 
					}
					break;
				case 5 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:70:9: ^( GTE a= expr1 b= expr1 )
					{
					match(input,GTE,FOLLOW_GTE_in_binary_expr521); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr529);
					a=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr533);
					b=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a >= b) ? 1 : 0; 
					}
					break;
				case 6 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:71:9: ^( EQUALS a= expr1 b= expr1 )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_binary_expr547); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr552);
					a=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr556);
					b=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = (a == b) ? 1 : 0; 
					}
					break;
				case 7 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:72:9: ^( NEQUALS a= expr1 b= expr1 )
					{
					match(input,NEQUALS,FOLLOW_NEQUALS_in_binary_expr570); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr574);
					a=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr578);
					b=expr1();
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:75:1: expr1 returns [int val = 0;] : (z= expr2 | ^( PLUS x= expr2 y= expr2 ) | ^( MINUS x= expr2 y= expr2 ) );
	public final int expr1() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:76:5: (z= expr2 | ^( PLUS x= expr2 y= expr2 ) | ^( MINUS x= expr2 y= expr2 ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case DIVIDE:
			case IDENTIFIER:
			case NUMBER:
			case TIMES:
				{
				alt6=1;
				}
				break;
			case PLUS:
				{
				alt6=2;
				}
				break;
			case MINUS:
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:76:9: z= expr2
					{
					pushFollow(FOLLOW_expr2_in_expr1611);
					z=expr2();
					state._fsp--;

					 val = z;      
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:77:9: ^( PLUS x= expr2 y= expr2 )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr1642); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr1646);
					x=expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr1650);
					y=expr2();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x + y;  
					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:78:9: ^( MINUS x= expr2 y= expr2 )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr1666); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr1670);
					x=expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr1674);
					y=expr2();
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:81:1: expr2 returns [int val = 0;] : (z= operand | ^( TIMES x= expr1 y= expr1 ) | ^( DIVIDE x= expr1 y= expr1 ) );
	public final int expr2() throws RecognitionException {
		int val =  0;;


		int z =0;
		int x =0;
		int y =0;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:82:5: (z= operand | ^( TIMES x= expr1 y= expr1 ) | ^( DIVIDE x= expr1 y= expr1 ) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
				{
				alt7=1;
				}
				break;
			case TIMES:
				{
				alt7=2;
				}
				break;
			case DIVIDE:
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
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:82:9: z= operand
					{
					pushFollow(FOLLOW_operand_in_expr2703);
					z=operand();
					state._fsp--;

					 val = z;     
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:83:9: ^( TIMES x= expr1 y= expr1 )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr2732); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr2736);
					x=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr2740);
					y=expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					 val = x * y; 
					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:84:9: ^( DIVIDE x= expr1 y= expr1 )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expr2755); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr2759);
					x=expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr2763);
					y=expr1();
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:92:1: operand returns [int val = 0] : (id= IDENTIFIER |n= NUMBER );
	public final int operand() throws RecognitionException {
		int val =  0;


		CommonTree id=null;
		CommonTree n=null;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:93:5: (id= IDENTIFIER |n= NUMBER )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==IDENTIFIER) ) {
				alt8=1;
			}
			else if ( (LA8_0==NUMBER) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:93:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand803); 
					 val = store.get((id!=null?id.getText():null));       
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:94:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand820); 
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
	// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:97:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:98:5: ( INTEGER )
			// ..\\src\\vb\\week3\\calc\\CalcInterpreter.g:98:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type852); 
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
	public static final BitSet FOLLOW_declaration_in_program97 = new BitSet(new long[]{0x0000000444000018L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0000000444000018L});
	public static final BitSet FOLLOW_VAR_in_declaration128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration132 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_type_in_declaration134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_becomes_in_statement170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_statement181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement211 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement216 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement220 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_becomes256 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_becomes260 = new BitSet(new long[]{0x0000000103F0FA10L});
	public static final BitSet FOLLOW_assignment_in_becomes264 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_assignment304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_becomes_in_assignment318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_expr_in_expr349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr384 = new BitSet(new long[]{0x0000000103F0FA00L});
	public static final BitSet FOLLOW_expr_in_expr388 = new BitSet(new long[]{0x0000000103F0FA00L});
	public static final BitSet FOLLOW_expr_in_expr392 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr1_in_binary_expr428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_binary_expr441 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr450 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr454 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_binary_expr468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr476 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr480 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_binary_expr494 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr503 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr507 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_binary_expr521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr529 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr533 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_binary_expr547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr552 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr556 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_binary_expr570 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr574 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr578 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr2_in_expr1611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr1642 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr1646 = new BitSet(new long[]{0x0000000101004200L});
	public static final BitSet FOLLOW_expr2_in_expr1650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr1666 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr1670 = new BitSet(new long[]{0x0000000101004200L});
	public static final BitSet FOLLOW_expr2_in_expr1674 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr2703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr2732 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr2736 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_expr2740 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expr2755 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr2759 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_expr2763 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand820 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type852 = new BitSet(new long[]{0x0000000000000002L});
}

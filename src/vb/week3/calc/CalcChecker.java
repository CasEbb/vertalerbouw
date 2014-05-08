// $ANTLR 3.5.2 ..\\src\\vb\\week3\\calc\\CalcChecker.g 2014-05-08 17:35:08

package vb.week3.calc;
import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CalcChecker extends TreeParser {
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


	public CalcChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CalcChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "..\\src\\vb\\week3\\calc\\CalcChecker.g"; }


	    // idset - a set of declared identifiers.
	    private Set<String> idset = new HashSet<String>();   
	    
	    public boolean  isDeclared(String s)     { return idset.contains(s); }
	    public void     declare(String s)        { idset.add(s);             }



	// $ANTLR start "program"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:30:1: program : ^( PROGRAM ( declaration | statement )+ ) ;
	public final void program() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:31:5: ( ^( PROGRAM ( declaration | statement )+ ) )
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:31:9: ^( PROGRAM ( declaration | statement )+ )
			{
			match(input,PROGRAM,FOLLOW_PROGRAM_in_program94); 
			match(input, Token.DOWN, null); 
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:31:19: ( declaration | statement )+
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:31:20: declaration
					{
					pushFollow(FOLLOW_declaration_in_program97);
					declaration();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:31:34: statement
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
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "declaration"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:34:1: declaration : ^( VAR id= IDENTIFIER type ) ;
	public final void declaration() throws RecognitionException {
		CommonTree id=null;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:35:5: ( ^( VAR id= IDENTIFIER type ) )
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:35:9: ^( VAR id= IDENTIFIER type )
			{
			match(input,VAR,FOLLOW_VAR_in_declaration128); 
			match(input, Token.DOWN, null); 
			id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration132); 
			pushFollow(FOLLOW_type_in_declaration134);
			type();
			state._fsp--;

			match(input, Token.UP, null); 

			   if (isDeclared((id!=null?id.getText():null)))
			                throw new CalcException(id, "is already declared");
			            else 
			                declare(id.getText()); 
			        
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declaration"



	// $ANTLR start "statement"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:43:1: statement : ( ^( BECOMES id= IDENTIFIER expr ) | ^( PRINT expr ) | ^( SWAP IDENTIFIER IDENTIFIER ) );
	public final void statement() throws RecognitionException {
		CommonTree id=null;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:44:5: ( ^( BECOMES id= IDENTIFIER expr ) | ^( PRINT expr ) | ^( SWAP IDENTIFIER IDENTIFIER ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:44:9: ^( BECOMES id= IDENTIFIER expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_statement167); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement171); 
					pushFollow(FOLLOW_expr_in_statement173);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:48:9: ^( PRINT expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement195); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement197);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:49:9: ^( SWAP IDENTIFIER IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement209); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement212); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement214); 
					match(input, Token.UP, null); 

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statement"



	// $ANTLR start "expr"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:52:1: expr : ( binary_expr | ^( IF expr expr expr ) );
	public final void expr() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:53:5: ( binary_expr | ^( IF expr expr expr ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BECOMES||LA3_0==DIVIDE||(LA3_0 >= EQUALS && LA3_0 <= IDENTIFIER)||(LA3_0 >= LT && LA3_0 <= PLUS)||LA3_0==TIMES) ) {
				alt3=1;
			}
			else if ( (LA3_0==IF) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:53:9: binary_expr
					{
					pushFollow(FOLLOW_binary_expr_in_expr234);
					binary_expr();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:54:9: ^( IF expr expr expr )
					{
					match(input,IF,FOLLOW_IF_in_expr245); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr247);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr249);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr251);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "binary_expr"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:57:1: binary_expr : ( expr1 | ^( LT expr1 expr1 ) | ^( LTE expr1 expr1 ) | ^( GT expr1 expr1 ) | ^( GTE expr1 expr1 ) | ^( EQUALS expr1 expr1 ) | ^( NEQUALS expr1 expr1 ) | ^( BECOMES IDENTIFIER binary_expr ) );
	public final void binary_expr() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:58:5: ( expr1 | ^( LT expr1 expr1 ) | ^( LTE expr1 expr1 ) | ^( GT expr1 expr1 ) | ^( GTE expr1 expr1 ) | ^( EQUALS expr1 expr1 ) | ^( NEQUALS expr1 expr1 ) | ^( BECOMES IDENTIFIER binary_expr ) )
			int alt4=8;
			switch ( input.LA(1) ) {
			case DIVIDE:
			case IDENTIFIER:
			case MINUS:
			case NUMBER:
			case PLUS:
			case TIMES:
				{
				alt4=1;
				}
				break;
			case LT:
				{
				alt4=2;
				}
				break;
			case LTE:
				{
				alt4=3;
				}
				break;
			case GT:
				{
				alt4=4;
				}
				break;
			case GTE:
				{
				alt4=5;
				}
				break;
			case EQUALS:
				{
				alt4=6;
				}
				break;
			case NEQUALS:
				{
				alt4=7;
				}
				break;
			case BECOMES:
				{
				alt4=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:58:9: expr1
					{
					pushFollow(FOLLOW_expr1_in_binary_expr275);
					expr1();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:59:9: ^( LT expr1 expr1 )
					{
					match(input,LT,FOLLOW_LT_in_binary_expr286); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr288);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr290);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:60:9: ^( LTE expr1 expr1 )
					{
					match(input,LTE,FOLLOW_LTE_in_binary_expr302); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr304);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr306);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:61:9: ^( GT expr1 expr1 )
					{
					match(input,GT,FOLLOW_GT_in_binary_expr318); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr320);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr322);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:62:9: ^( GTE expr1 expr1 )
					{
					match(input,GTE,FOLLOW_GTE_in_binary_expr334); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr336);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr338);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:63:9: ^( EQUALS expr1 expr1 )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_binary_expr350); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr352);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr354);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:64:9: ^( NEQUALS expr1 expr1 )
					{
					match(input,NEQUALS,FOLLOW_NEQUALS_in_binary_expr366); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_binary_expr368);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_binary_expr370);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:65:9: ^( BECOMES IDENTIFIER binary_expr )
					{
					match(input,BECOMES,FOLLOW_BECOMES_in_binary_expr382); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_binary_expr384); 
					pushFollow(FOLLOW_binary_expr_in_binary_expr386);
					binary_expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "binary_expr"



	// $ANTLR start "expr1"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:68:1: expr1 : ( expr2 | ^( PLUS expr2 expr2 ) | ^( MINUS expr2 expr2 ) );
	public final void expr1() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:69:5: ( expr2 | ^( PLUS expr2 expr2 ) | ^( MINUS expr2 expr2 ) )
			int alt5=3;
			switch ( input.LA(1) ) {
			case DIVIDE:
			case IDENTIFIER:
			case NUMBER:
			case TIMES:
				{
				alt5=1;
				}
				break;
			case PLUS:
				{
				alt5=2;
				}
				break;
			case MINUS:
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:69:9: expr2
					{
					pushFollow(FOLLOW_expr2_in_expr1411);
					expr2();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:70:9: ^( PLUS expr2 expr2 )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr1422); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr1424);
					expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr1426);
					expr2();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:71:9: ^( MINUS expr2 expr2 )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr1438); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr2_in_expr1440);
					expr2();
					state._fsp--;

					pushFollow(FOLLOW_expr2_in_expr1442);
					expr2();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr1"



	// $ANTLR start "expr2"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:74:1: expr2 : ( operand | ^( TIMES expr1 expr1 ) | ^( DIVIDE expr1 expr1 ) );
	public final void expr2() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:75:5: ( operand | ^( TIMES expr1 expr1 ) | ^( DIVIDE expr1 expr1 ) )
			int alt6=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case NUMBER:
				{
				alt6=1;
				}
				break;
			case TIMES:
				{
				alt6=2;
				}
				break;
			case DIVIDE:
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:75:9: operand
					{
					pushFollow(FOLLOW_operand_in_expr2466);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:76:9: ^( TIMES expr1 expr1 )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr2477); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr2479);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr2481);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:77:9: ^( DIVIDE expr1 expr1 )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expr2493); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr1_in_expr2495);
					expr1();
					state._fsp--;

					pushFollow(FOLLOW_expr1_in_expr2497);
					expr1();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expr2"



	// $ANTLR start "operand"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:80:1: operand : (id= IDENTIFIER |n= NUMBER );
	public final void operand() throws RecognitionException {
		CommonTree id=null;
		CommonTree n=null;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:81:5: (id= IDENTIFIER |n= NUMBER )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==IDENTIFIER) ) {
				alt7=1;
			}
			else if ( (LA7_0==NUMBER) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:81:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand523); 
					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:85:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand546); 
					}
					break;

			}
		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "operand"



	// $ANTLR start "type"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:88:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:89:5: ( INTEGER )
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:89:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type570); 
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
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
	public static final BitSet FOLLOW_BECOMES_in_statement167 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement171 = new BitSet(new long[]{0x0000000103F0FA10L});
	public static final BitSet FOLLOW_expr_in_statement173 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRINT_in_statement195 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement209 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement212 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement214 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_binary_expr_in_expr234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr245 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr247 = new BitSet(new long[]{0x0000000103F0FA10L});
	public static final BitSet FOLLOW_expr_in_expr249 = new BitSet(new long[]{0x0000000103F0FA10L});
	public static final BitSet FOLLOW_expr_in_expr251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr1_in_binary_expr275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_binary_expr286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr288 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_binary_expr302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr304 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr306 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_binary_expr318 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr320 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr322 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_binary_expr334 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr336 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr338 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_binary_expr350 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr352 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr354 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_binary_expr366 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_binary_expr368 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_binary_expr370 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_binary_expr382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_binary_expr384 = new BitSet(new long[]{0x0000000103F07A10L});
	public static final BitSet FOLLOW_binary_expr_in_binary_expr386 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr2_in_expr1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr1422 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr1424 = new BitSet(new long[]{0x0000000101004200L});
	public static final BitSet FOLLOW_expr2_in_expr1426 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr1438 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr2_in_expr1440 = new BitSet(new long[]{0x0000000101004200L});
	public static final BitSet FOLLOW_expr2_in_expr1442 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr2466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr2477 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr2479 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_expr2481 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expr2493 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr1_in_expr2495 = new BitSet(new long[]{0x0000000103404200L});
	public static final BitSet FOLLOW_expr1_in_expr2497 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type570 = new BitSet(new long[]{0x0000000000000002L});
}

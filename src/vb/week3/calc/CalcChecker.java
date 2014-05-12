// $ANTLR 3.5.2 ..\\src\\vb\\week3\\calc\\CalcChecker.g 2014-05-12 18:30:09

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
				else if ( (LA1_0==BECOMES||LA1_0==DO||LA1_0==PRINT||LA1_0==SWAP) ) {
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
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:43:1: statement : ( becomes | ^( PRINT expr ) | ^( SWAP IDENTIFIER IDENTIFIER ) | ^( DO ( statement )+ ^( WHILE expr ) ) );
	public final void statement() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:44:5: ( becomes | ^( PRINT expr ) | ^( SWAP IDENTIFIER IDENTIFIER ) | ^( DO ( statement )+ ^( WHILE expr ) ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:44:9: becomes
					{
					pushFollow(FOLLOW_becomes_in_statement166);
					becomes();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:45:9: ^( PRINT expr )
					{
					match(input,PRINT,FOLLOW_PRINT_in_statement177); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement179);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:46:9: ^( SWAP IDENTIFIER IDENTIFIER )
					{
					match(input,SWAP,FOLLOW_SWAP_in_statement191); 
					match(input, Token.DOWN, null); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement194); 
					match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_statement196); 
					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:47:9: ^( DO ( statement )+ ^( WHILE expr ) )
					{
					match(input,DO,FOLLOW_DO_in_statement208); 
					match(input, Token.DOWN, null); 
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:47:14: ( statement )+
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
							// ..\\src\\vb\\week3\\calc\\CalcChecker.g:47:14: statement
							{
							pushFollow(FOLLOW_statement_in_statement210);
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

					match(input,WHILE,FOLLOW_WHILE_in_statement214); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_statement216);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

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



	// $ANTLR start "becomes"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:50:1: becomes : ^( BECOMES IDENTIFIER assignment ) ;
	public final void becomes() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:51:2: ( ^( BECOMES IDENTIFIER assignment ) )
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:51:6: ^( BECOMES IDENTIFIER assignment )
			{
			match(input,BECOMES,FOLLOW_BECOMES_in_becomes235); 
			match(input, Token.DOWN, null); 
			match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_becomes237); 
			pushFollow(FOLLOW_assignment_in_becomes239);
			assignment();
			state._fsp--;

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
	// $ANTLR end "becomes"



	// $ANTLR start "assignment"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:54:1: assignment : ( expr | becomes );
	public final void assignment() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:55:5: ( expr | becomes )
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:55:9: expr
					{
					pushFollow(FOLLOW_expr_in_assignment259);
					expr();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:56:9: becomes
					{
					pushFollow(FOLLOW_becomes_in_assignment269);
					becomes();
					state._fsp--;

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
	// $ANTLR end "assignment"



	// $ANTLR start "expr"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:59:1: expr : ( binary_expr | ^( IF expr expr expr ) );
	public final void expr() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:60:5: ( binary_expr | ^( IF expr expr expr ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:60:9: binary_expr
					{
					pushFollow(FOLLOW_binary_expr_in_expr288);
					binary_expr();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:61:9: ^( IF expr expr expr )
					{
					match(input,IF,FOLLOW_IF_in_expr299); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr301);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr303);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr305);
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
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:64:1: binary_expr : ( expr1 | ^( LT expr expr ) | ^( LTE expr expr ) | ^( GT expr expr ) | ^( GTE expr expr ) | ^( EQUALS expr expr ) | ^( NEQUALS expr expr ) );
	public final void binary_expr() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:65:5: ( expr1 | ^( LT expr expr ) | ^( LTE expr expr ) | ^( GT expr expr ) | ^( GTE expr expr ) | ^( EQUALS expr expr ) | ^( NEQUALS expr expr ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:65:9: expr1
					{
					pushFollow(FOLLOW_expr1_in_binary_expr329);
					expr1();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:66:9: ^( LT expr expr )
					{
					match(input,LT,FOLLOW_LT_in_binary_expr340); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr342);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr344);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:67:9: ^( LTE expr expr )
					{
					match(input,LTE,FOLLOW_LTE_in_binary_expr356); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr358);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr360);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:68:9: ^( GT expr expr )
					{
					match(input,GT,FOLLOW_GT_in_binary_expr372); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr374);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr376);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:69:9: ^( GTE expr expr )
					{
					match(input,GTE,FOLLOW_GTE_in_binary_expr388); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr390);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr392);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:70:9: ^( EQUALS expr expr )
					{
					match(input,EQUALS,FOLLOW_EQUALS_in_binary_expr404); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr406);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr408);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:71:9: ^( NEQUALS expr expr )
					{
					match(input,NEQUALS,FOLLOW_NEQUALS_in_binary_expr420); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_binary_expr422);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_binary_expr424);
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
	// $ANTLR end "binary_expr"



	// $ANTLR start "expr1"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:74:1: expr1 : ( expr2 | ^( PLUS expr expr ) | ^( MINUS expr expr ) );
	public final void expr1() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:75:5: ( expr2 | ^( PLUS expr expr ) | ^( MINUS expr expr ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:75:9: expr2
					{
					pushFollow(FOLLOW_expr2_in_expr1449);
					expr2();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:76:9: ^( PLUS expr expr )
					{
					match(input,PLUS,FOLLOW_PLUS_in_expr1460); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1462);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1464);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:77:9: ^( MINUS expr expr )
					{
					match(input,MINUS,FOLLOW_MINUS_in_expr1476); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr1478);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr1480);
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
	// $ANTLR end "expr1"



	// $ANTLR start "expr2"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:80:1: expr2 : ( operand | ^( TIMES expr expr ) | ^( DIVIDE expr expr ) );
	public final void expr2() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:81:5: ( operand | ^( TIMES expr expr ) | ^( DIVIDE expr expr ) )
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:81:9: operand
					{
					pushFollow(FOLLOW_operand_in_expr2504);
					operand();
					state._fsp--;

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:82:9: ^( TIMES expr expr )
					{
					match(input,TIMES,FOLLOW_TIMES_in_expr2515); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr2517);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr2519);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:83:9: ^( DIVIDE expr expr )
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_expr2531); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr2533);
					expr();
					state._fsp--;

					pushFollow(FOLLOW_expr_in_expr2535);
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
	// $ANTLR end "expr2"



	// $ANTLR start "operand"
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:86:1: operand : (id= IDENTIFIER |n= NUMBER );
	public final void operand() throws RecognitionException {
		CommonTree id=null;
		CommonTree n=null;

		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:87:5: (id= IDENTIFIER |n= NUMBER )
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
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:87:9: id= IDENTIFIER
					{
					id=(CommonTree)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand561); 
					   if (!isDeclared((id!=null?id.getText():null)))
					                throw new CalcException(id, "is not declared");
					        
					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\CalcChecker.g:91:9: n= NUMBER
					{
					n=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_operand584); 
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
	// ..\\src\\vb\\week3\\calc\\CalcChecker.g:94:1: type : INTEGER ;
	public final void type() throws RecognitionException {
		try {
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:95:5: ( INTEGER )
			// ..\\src\\vb\\week3\\calc\\CalcChecker.g:95:9: INTEGER
			{
			match(input,INTEGER,FOLLOW_INTEGER_in_type608); 
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
	public static final BitSet FOLLOW_declaration_in_program97 = new BitSet(new long[]{0x0000000888000418L});
	public static final BitSet FOLLOW_statement_in_program101 = new BitSet(new long[]{0x0000000888000418L});
	public static final BitSet FOLLOW_VAR_in_declaration128 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration132 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_type_in_declaration134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_becomes_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_statement177 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement179 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWAP_in_statement191 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement194 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_statement196 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_in_statement208 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_statement210 = new BitSet(new long[]{0x0000001088000410L});
	public static final BitSet FOLLOW_WHILE_in_statement214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_statement216 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BECOMES_in_becomes235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_becomes237 = new BitSet(new long[]{0x0000000207E1F210L});
	public static final BitSet FOLLOW_assignment_in_becomes239 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_assignment259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_becomes_in_assignment269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_expr_in_expr288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_expr299 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr301 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr303 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr305 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr1_in_binary_expr329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LT_in_binary_expr340 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr342 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr344 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTE_in_binary_expr356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr358 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr360 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GT_in_binary_expr372 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr374 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr376 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GTE_in_binary_expr388 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr390 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr392 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUALS_in_binary_expr404 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr406 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr408 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_binary_expr420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binary_expr422 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_binary_expr424 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr2_in_expr1449 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_expr1460 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1462 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr1464 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_in_expr1476 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr1478 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr1480 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_operand_in_expr2504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TIMES_in_expr2515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2517 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr2519 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIVIDE_in_expr2531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr2533 = new BitSet(new long[]{0x0000000207E1F200L});
	public static final BitSet FOLLOW_expr_in_expr2535 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type608 = new BitSet(new long[]{0x0000000000000002L});
}

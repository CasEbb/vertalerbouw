// $ANTLR 3.5.2 src\\vb\\week4\\xcalc\\Calc.g 2014-05-15 14:57:59

package vb.week4.xcalc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CalcParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CalcParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CalcParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CalcParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\vb\\week4\\xcalc\\Calc.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// src\\vb\\week4\\xcalc\\Calc.g:52:1: program : commands EOF -> ^( PROGRAM commands ) ;
	public final CalcParser.program_return program() throws RecognitionException {
		CalcParser.program_return retval = new CalcParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope commands1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:53:5: ( commands EOF -> ^( PROGRAM commands ) )
			// src\\vb\\week4\\xcalc\\Calc.g:53:9: commands EOF
			{
			pushFollow(FOLLOW_commands_in_program796);
			commands1=commands();
			state._fsp--;

			stream_commands.add(commands1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program798);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 54:13: -> ^( PROGRAM commands )
			{
				// src\\vb\\week4\\xcalc\\Calc.g:54:17: ^( PROGRAM commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// src\\vb\\week4\\xcalc\\Calc.g:57:1: commands : ( declaration SEMICOLON !)* statements ( declarations statements )* ;
	public final CalcParser.commands_return commands() throws RecognitionException {
		CalcParser.commands_return retval = new CalcParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON4=null;
		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope statements5 =null;
		ParserRuleReturnScope declarations6 =null;
		ParserRuleReturnScope statements7 =null;

		Object SEMICOLON4_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:58:5: ( ( declaration SEMICOLON !)* statements ( declarations statements )* )
			// src\\vb\\week4\\xcalc\\Calc.g:58:9: ( declaration SEMICOLON !)* statements ( declarations statements )*
			{
			root_0 = (Object)adaptor.nil();


			// src\\vb\\week4\\xcalc\\Calc.g:58:9: ( declaration SEMICOLON !)*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:58:10: declaration SEMICOLON !
					{
					pushFollow(FOLLOW_declaration_in_commands839);
					declaration3=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration3.getTree());

					SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_commands841); 
					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_statements_in_commands846);
			statements5=statements();
			state._fsp--;

			adaptor.addChild(root_0, statements5.getTree());

			// src\\vb\\week4\\xcalc\\Calc.g:58:46: ( declarations statements )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:58:47: declarations statements
					{
					pushFollow(FOLLOW_declarations_in_commands849);
					declarations6=declarations();
					state._fsp--;

					adaptor.addChild(root_0, declarations6.getTree());

					pushFollow(FOLLOW_statements_in_commands851);
					statements7=statements();
					state._fsp--;

					adaptor.addChild(root_0, statements7.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commands"


	public static class declarations_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declarations"
	// src\\vb\\week4\\xcalc\\Calc.g:61:1: declarations : ( declaration SEMICOLON !)+ ;
	public final CalcParser.declarations_return declarations() throws RecognitionException {
		CalcParser.declarations_return retval = new CalcParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON9=null;
		ParserRuleReturnScope declaration8 =null;

		Object SEMICOLON9_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:62:5: ( ( declaration SEMICOLON !)+ )
			// src\\vb\\week4\\xcalc\\Calc.g:62:9: ( declaration SEMICOLON !)+
			{
			root_0 = (Object)adaptor.nil();


			// src\\vb\\week4\\xcalc\\Calc.g:62:9: ( declaration SEMICOLON !)+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==VAR) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:62:10: declaration SEMICOLON !
					{
					pushFollow(FOLLOW_declaration_in_declarations877);
					declaration8=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration8.getTree());

					SEMICOLON9=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations879); 
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// src\\vb\\week4\\xcalc\\Calc.g:65:1: statements : ( statement SEMICOLON !)+ ;
	public final CalcParser.statements_return statements() throws RecognitionException {
		CalcParser.statements_return retval = new CalcParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON11=null;
		ParserRuleReturnScope statement10 =null;

		Object SEMICOLON11_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:66:5: ( ( statement SEMICOLON !)+ )
			// src\\vb\\week4\\xcalc\\Calc.g:66:9: ( statement SEMICOLON !)+
			{
			root_0 = (Object)adaptor.nil();


			// src\\vb\\week4\\xcalc\\Calc.g:66:9: ( statement SEMICOLON !)+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==DO||(LA4_0 >= IDENTIFIER && LA4_0 <= IF)||LA4_0==LPAREN||LA4_0==NUMBER||LA4_0==PRINT||LA4_0==SWAP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:66:10: statement SEMICOLON !
					{
					pushFollow(FOLLOW_statement_in_statements906);
					statement10=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement10.getTree());

					SEMICOLON11=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements908); 
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// src\\vb\\week4\\xcalc\\Calc.g:69:1: declaration : VAR ^ IDENTIFIER COLON ! type ;
	public final CalcParser.declaration_return declaration() throws RecognitionException {
		CalcParser.declaration_return retval = new CalcParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VAR12=null;
		Token IDENTIFIER13=null;
		Token COLON14=null;
		ParserRuleReturnScope type15 =null;

		Object VAR12_tree=null;
		Object IDENTIFIER13_tree=null;
		Object COLON14_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:70:5: ( VAR ^ IDENTIFIER COLON ! type )
			// src\\vb\\week4\\xcalc\\Calc.g:70:9: VAR ^ IDENTIFIER COLON ! type
			{
			root_0 = (Object)adaptor.nil();


			VAR12=(Token)match(input,VAR,FOLLOW_VAR_in_declaration930); 
			VAR12_tree = (Object)adaptor.create(VAR12);
			root_0 = (Object)adaptor.becomeRoot(VAR12_tree, root_0);

			IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration933); 
			IDENTIFIER13_tree = (Object)adaptor.create(IDENTIFIER13);
			adaptor.addChild(root_0, IDENTIFIER13_tree);

			COLON14=(Token)match(input,COLON,FOLLOW_COLON_in_declaration935); 
			pushFollow(FOLLOW_type_in_declaration938);
			type15=type();
			state._fsp--;

			adaptor.addChild(root_0, type15.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// src\\vb\\week4\\xcalc\\Calc.g:73:1: statement : ( expr | print_stat | swap_stat | dowhile_stat );
	public final CalcParser.statement_return statement() throws RecognitionException {
		CalcParser.statement_return retval = new CalcParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expr16 =null;
		ParserRuleReturnScope print_stat17 =null;
		ParserRuleReturnScope swap_stat18 =null;
		ParserRuleReturnScope dowhile_stat19 =null;


		try {
			// src\\vb\\week4\\xcalc\\Calc.g:74:5: ( expr | print_stat | swap_stat | dowhile_stat )
			int alt5=4;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
			case IF:
			case LPAREN:
			case NUMBER:
				{
				alt5=1;
				}
				break;
			case PRINT:
				{
				alt5=2;
				}
				break;
			case SWAP:
				{
				alt5=3;
				}
				break;
			case DO:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:74:9: expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expr_in_statement961);
					expr16=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr16.getTree());

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\Calc.g:75:9: print_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_stat_in_statement971);
					print_stat17=print_stat();
					state._fsp--;

					adaptor.addChild(root_0, print_stat17.getTree());

					}
					break;
				case 3 :
					// src\\vb\\week4\\xcalc\\Calc.g:76:9: swap_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_swap_stat_in_statement981);
					swap_stat18=swap_stat();
					state._fsp--;

					adaptor.addChild(root_0, swap_stat18.getTree());

					}
					break;
				case 4 :
					// src\\vb\\week4\\xcalc\\Calc.g:77:9: dowhile_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_dowhile_stat_in_statement991);
					dowhile_stat19=dowhile_stat();
					state._fsp--;

					adaptor.addChild(root_0, dowhile_stat19.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// src\\vb\\week4\\xcalc\\Calc.g:80:1: expr : ( if_expr | binary_expr );
	public final CalcParser.expr_return expr() throws RecognitionException {
		CalcParser.expr_return retval = new CalcParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope if_expr20 =null;
		ParserRuleReturnScope binary_expr21 =null;


		try {
			// src\\vb\\week4\\xcalc\\Calc.g:81:5: ( if_expr | binary_expr )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==IF) ) {
				alt6=1;
			}
			else if ( (LA6_0==IDENTIFIER||LA6_0==LPAREN||LA6_0==NUMBER) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:81:9: if_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_expr_in_expr1014);
					if_expr20=if_expr();
					state._fsp--;

					adaptor.addChild(root_0, if_expr20.getTree());

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\Calc.g:82:9: binary_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_binary_expr_in_expr1024);
					binary_expr21=binary_expr();
					state._fsp--;

					adaptor.addChild(root_0, binary_expr21.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class print_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print_stat"
	// src\\vb\\week4\\xcalc\\Calc.g:85:1: print_stat : PRINT ^ LPAREN ! expr RPAREN !;
	public final CalcParser.print_stat_return print_stat() throws RecognitionException {
		CalcParser.print_stat_return retval = new CalcParser.print_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PRINT22=null;
		Token LPAREN23=null;
		Token RPAREN25=null;
		ParserRuleReturnScope expr24 =null;

		Object PRINT22_tree=null;
		Object LPAREN23_tree=null;
		Object RPAREN25_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:86:5: ( PRINT ^ LPAREN ! expr RPAREN !)
			// src\\vb\\week4\\xcalc\\Calc.g:86:9: PRINT ^ LPAREN ! expr RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT22=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stat1043); 
			PRINT22_tree = (Object)adaptor.create(PRINT22);
			root_0 = (Object)adaptor.becomeRoot(PRINT22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_stat1046); 
			pushFollow(FOLLOW_expr_in_print_stat1049);
			expr24=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr24.getTree());

			RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_stat1051); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "print_stat"


	public static class swap_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "swap_stat"
	// src\\vb\\week4\\xcalc\\Calc.g:89:1: swap_stat : SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !;
	public final CalcParser.swap_stat_return swap_stat() throws RecognitionException {
		CalcParser.swap_stat_return retval = new CalcParser.swap_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SWAP26=null;
		Token LPAREN27=null;
		Token IDENTIFIER28=null;
		Token COMMA29=null;
		Token IDENTIFIER30=null;
		Token RPAREN31=null;

		Object SWAP26_tree=null;
		Object LPAREN27_tree=null;
		Object IDENTIFIER28_tree=null;
		Object COMMA29_tree=null;
		Object IDENTIFIER30_tree=null;
		Object RPAREN31_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:90:5: ( SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !)
			// src\\vb\\week4\\xcalc\\Calc.g:90:9: SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			SWAP26=(Token)match(input,SWAP,FOLLOW_SWAP_in_swap_stat1071); 
			SWAP26_tree = (Object)adaptor.create(SWAP26);
			root_0 = (Object)adaptor.becomeRoot(SWAP26_tree, root_0);

			LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_swap_stat1074); 
			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat1077); 
			IDENTIFIER28_tree = (Object)adaptor.create(IDENTIFIER28);
			adaptor.addChild(root_0, IDENTIFIER28_tree);

			COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_swap_stat1079); 
			IDENTIFIER30=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat1082); 
			IDENTIFIER30_tree = (Object)adaptor.create(IDENTIFIER30);
			adaptor.addChild(root_0, IDENTIFIER30_tree);

			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_swap_stat1084); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "swap_stat"


	public static class dowhile_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "dowhile_stat"
	// src\\vb\\week4\\xcalc\\Calc.g:93:1: dowhile_stat : DO statements WHILE expr -> ^( DO statements ^( WHILE expr ) ) ;
	public final CalcParser.dowhile_stat_return dowhile_stat() throws RecognitionException {
		CalcParser.dowhile_stat_return retval = new CalcParser.dowhile_stat_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DO32=null;
		Token WHILE34=null;
		ParserRuleReturnScope statements33 =null;
		ParserRuleReturnScope expr35 =null;

		Object DO32_tree=null;
		Object WHILE34_tree=null;
		RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
		RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:94:5: ( DO statements WHILE expr -> ^( DO statements ^( WHILE expr ) ) )
			// src\\vb\\week4\\xcalc\\Calc.g:94:9: DO statements WHILE expr
			{
			DO32=(Token)match(input,DO,FOLLOW_DO_in_dowhile_stat1104);  
			stream_DO.add(DO32);

			pushFollow(FOLLOW_statements_in_dowhile_stat1106);
			statements33=statements();
			state._fsp--;

			stream_statements.add(statements33.getTree());
			WHILE34=(Token)match(input,WHILE,FOLLOW_WHILE_in_dowhile_stat1108);  
			stream_WHILE.add(WHILE34);

			pushFollow(FOLLOW_expr_in_dowhile_stat1110);
			expr35=expr();
			state._fsp--;

			stream_expr.add(expr35.getTree());
			// AST REWRITE
			// elements: statements, expr, DO, WHILE
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 94:34: -> ^( DO statements ^( WHILE expr ) )
			{
				// src\\vb\\week4\\xcalc\\Calc.g:94:37: ^( DO statements ^( WHILE expr ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot(stream_DO.nextNode(), root_1);
				adaptor.addChild(root_1, stream_statements.nextTree());
				// src\\vb\\week4\\xcalc\\Calc.g:94:53: ^( WHILE expr )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot(stream_WHILE.nextNode(), root_2);
				adaptor.addChild(root_2, stream_expr.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dowhile_stat"


	public static class if_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_expr"
	// src\\vb\\week4\\xcalc\\Calc.g:97:1: if_expr : IF ^ expr THEN ! expr ELSE ! expr ;
	public final CalcParser.if_expr_return if_expr() throws RecognitionException {
		CalcParser.if_expr_return retval = new CalcParser.if_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF36=null;
		Token THEN38=null;
		Token ELSE40=null;
		ParserRuleReturnScope expr37 =null;
		ParserRuleReturnScope expr39 =null;
		ParserRuleReturnScope expr41 =null;

		Object IF36_tree=null;
		Object THEN38_tree=null;
		Object ELSE40_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:98:5: ( IF ^ expr THEN ! expr ELSE ! expr )
			// src\\vb\\week4\\xcalc\\Calc.g:98:9: IF ^ expr THEN ! expr ELSE ! expr
			{
			root_0 = (Object)adaptor.nil();


			IF36=(Token)match(input,IF,FOLLOW_IF_in_if_expr1143); 
			IF36_tree = (Object)adaptor.create(IF36);
			root_0 = (Object)adaptor.becomeRoot(IF36_tree, root_0);

			pushFollow(FOLLOW_expr_in_if_expr1146);
			expr37=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr37.getTree());

			THEN38=(Token)match(input,THEN,FOLLOW_THEN_in_if_expr1148); 
			pushFollow(FOLLOW_expr_in_if_expr1151);
			expr39=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr39.getTree());

			ELSE40=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expr1153); 
			pushFollow(FOLLOW_expr_in_if_expr1156);
			expr41=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr41.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_expr"


	public static class lvalue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lvalue"
	// src\\vb\\week4\\xcalc\\Calc.g:101:1: lvalue : IDENTIFIER ;
	public final CalcParser.lvalue_return lvalue() throws RecognitionException {
		CalcParser.lvalue_return retval = new CalcParser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER42=null;

		Object IDENTIFIER42_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:102:5: ( IDENTIFIER )
			// src\\vb\\week4\\xcalc\\Calc.g:102:9: IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER42=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue1175); 
			IDENTIFIER42_tree = (Object)adaptor.create(IDENTIFIER42);
			adaptor.addChild(root_0, IDENTIFIER42_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lvalue"


	public static class binary_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binary_expr"
	// src\\vb\\week4\\xcalc\\Calc.g:105:1: binary_expr : add_expr ( ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^) add_expr ) | ( BECOMES ^ expr ) )? ;
	public final CalcParser.binary_expr_return binary_expr() throws RecognitionException {
		CalcParser.binary_expr_return retval = new CalcParser.binary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT44=null;
		Token LTE45=null;
		Token GT46=null;
		Token GTE47=null;
		Token EQUALS48=null;
		Token NEQUALS49=null;
		Token BECOMES51=null;
		ParserRuleReturnScope add_expr43 =null;
		ParserRuleReturnScope add_expr50 =null;
		ParserRuleReturnScope expr52 =null;

		Object LT44_tree=null;
		Object LTE45_tree=null;
		Object GT46_tree=null;
		Object GTE47_tree=null;
		Object EQUALS48_tree=null;
		Object NEQUALS49_tree=null;
		Object BECOMES51_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:106:5: ( add_expr ( ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^) add_expr ) | ( BECOMES ^ expr ) )? )
			// src\\vb\\week4\\xcalc\\Calc.g:106:9: add_expr ( ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^) add_expr ) | ( BECOMES ^ expr ) )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_add_expr_in_binary_expr1198);
			add_expr43=add_expr();
			state._fsp--;

			adaptor.addChild(root_0, add_expr43.getTree());

			// src\\vb\\week4\\xcalc\\Calc.g:106:18: ( ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^) add_expr ) | ( BECOMES ^ expr ) )?
			int alt8=3;
			int LA8_0 = input.LA(1);
			if ( ((LA8_0 >= EQUALS && LA8_0 <= GTE)||(LA8_0 >= LT && LA8_0 <= LTE)||LA8_0==NEQUALS) ) {
				alt8=1;
			}
			else if ( (LA8_0==BECOMES) ) {
				alt8=2;
			}
			switch (alt8) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:106:19: ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^) add_expr )
					{
					// src\\vb\\week4\\xcalc\\Calc.g:106:19: ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^) add_expr )
					// src\\vb\\week4\\xcalc\\Calc.g:106:20: ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^) add_expr
					{
					// src\\vb\\week4\\xcalc\\Calc.g:106:20: ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^)
					int alt7=6;
					switch ( input.LA(1) ) {
					case LT:
						{
						alt7=1;
						}
						break;
					case LTE:
						{
						alt7=2;
						}
						break;
					case GT:
						{
						alt7=3;
						}
						break;
					case GTE:
						{
						alt7=4;
						}
						break;
					case EQUALS:
						{
						alt7=5;
						}
						break;
					case NEQUALS:
						{
						alt7=6;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// src\\vb\\week4\\xcalc\\Calc.g:106:21: LT ^
							{
							LT44=(Token)match(input,LT,FOLLOW_LT_in_binary_expr1203); 
							LT44_tree = (Object)adaptor.create(LT44);
							root_0 = (Object)adaptor.becomeRoot(LT44_tree, root_0);

							}
							break;
						case 2 :
							// src\\vb\\week4\\xcalc\\Calc.g:106:27: LTE ^
							{
							LTE45=(Token)match(input,LTE,FOLLOW_LTE_in_binary_expr1208); 
							LTE45_tree = (Object)adaptor.create(LTE45);
							root_0 = (Object)adaptor.becomeRoot(LTE45_tree, root_0);

							}
							break;
						case 3 :
							// src\\vb\\week4\\xcalc\\Calc.g:106:34: GT ^
							{
							GT46=(Token)match(input,GT,FOLLOW_GT_in_binary_expr1213); 
							GT46_tree = (Object)adaptor.create(GT46);
							root_0 = (Object)adaptor.becomeRoot(GT46_tree, root_0);

							}
							break;
						case 4 :
							// src\\vb\\week4\\xcalc\\Calc.g:106:40: GTE ^
							{
							GTE47=(Token)match(input,GTE,FOLLOW_GTE_in_binary_expr1218); 
							GTE47_tree = (Object)adaptor.create(GTE47);
							root_0 = (Object)adaptor.becomeRoot(GTE47_tree, root_0);

							}
							break;
						case 5 :
							// src\\vb\\week4\\xcalc\\Calc.g:106:47: EQUALS ^
							{
							EQUALS48=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_binary_expr1223); 
							EQUALS48_tree = (Object)adaptor.create(EQUALS48);
							root_0 = (Object)adaptor.becomeRoot(EQUALS48_tree, root_0);

							}
							break;
						case 6 :
							// src\\vb\\week4\\xcalc\\Calc.g:106:57: NEQUALS ^
							{
							NEQUALS49=(Token)match(input,NEQUALS,FOLLOW_NEQUALS_in_binary_expr1228); 
							NEQUALS49_tree = (Object)adaptor.create(NEQUALS49);
							root_0 = (Object)adaptor.becomeRoot(NEQUALS49_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_add_expr_in_binary_expr1232);
					add_expr50=add_expr();
					state._fsp--;

					adaptor.addChild(root_0, add_expr50.getTree());

					}

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\Calc.g:106:79: ( BECOMES ^ expr )
					{
					// src\\vb\\week4\\xcalc\\Calc.g:106:79: ( BECOMES ^ expr )
					// src\\vb\\week4\\xcalc\\Calc.g:106:80: BECOMES ^ expr
					{
					BECOMES51=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_binary_expr1238); 
					BECOMES51_tree = (Object)adaptor.create(BECOMES51);
					root_0 = (Object)adaptor.becomeRoot(BECOMES51_tree, root_0);

					pushFollow(FOLLOW_expr_in_binary_expr1241);
					expr52=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr52.getTree());

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binary_expr"


	public static class add_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "add_expr"
	// src\\vb\\week4\\xcalc\\Calc.g:109:1: add_expr : mult_expr ( ( PLUS ^| MINUS ^) mult_expr )* ;
	public final CalcParser.add_expr_return add_expr() throws RecognitionException {
		CalcParser.add_expr_return retval = new CalcParser.add_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS54=null;
		Token MINUS55=null;
		ParserRuleReturnScope mult_expr53 =null;
		ParserRuleReturnScope mult_expr56 =null;

		Object PLUS54_tree=null;
		Object MINUS55_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:110:5: ( mult_expr ( ( PLUS ^| MINUS ^) mult_expr )* )
			// src\\vb\\week4\\xcalc\\Calc.g:110:9: mult_expr ( ( PLUS ^| MINUS ^) mult_expr )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_mult_expr_in_add_expr1268);
			mult_expr53=mult_expr();
			state._fsp--;

			adaptor.addChild(root_0, mult_expr53.getTree());

			// src\\vb\\week4\\xcalc\\Calc.g:110:19: ( ( PLUS ^| MINUS ^) mult_expr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:110:20: ( PLUS ^| MINUS ^) mult_expr
					{
					// src\\vb\\week4\\xcalc\\Calc.g:110:20: ( PLUS ^| MINUS ^)
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==PLUS) ) {
						alt9=1;
					}
					else if ( (LA9_0==MINUS) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// src\\vb\\week4\\xcalc\\Calc.g:110:21: PLUS ^
							{
							PLUS54=(Token)match(input,PLUS,FOLLOW_PLUS_in_add_expr1272); 
							PLUS54_tree = (Object)adaptor.create(PLUS54);
							root_0 = (Object)adaptor.becomeRoot(PLUS54_tree, root_0);

							}
							break;
						case 2 :
							// src\\vb\\week4\\xcalc\\Calc.g:110:29: MINUS ^
							{
							MINUS55=(Token)match(input,MINUS,FOLLOW_MINUS_in_add_expr1277); 
							MINUS55_tree = (Object)adaptor.create(MINUS55);
							root_0 = (Object)adaptor.becomeRoot(MINUS55_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_mult_expr_in_add_expr1281);
					mult_expr56=mult_expr();
					state._fsp--;

					adaptor.addChild(root_0, mult_expr56.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "add_expr"


	public static class mult_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "mult_expr"
	// src\\vb\\week4\\xcalc\\Calc.g:113:1: mult_expr : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
	public final CalcParser.mult_expr_return mult_expr() throws RecognitionException {
		CalcParser.mult_expr_return retval = new CalcParser.mult_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES58=null;
		Token DIVIDE59=null;
		ParserRuleReturnScope operand57 =null;
		ParserRuleReturnScope operand60 =null;

		Object TIMES58_tree=null;
		Object DIVIDE59_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:114:5: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// src\\vb\\week4\\xcalc\\Calc.g:114:9: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_mult_expr1303);
			operand57=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand57.getTree());

			// src\\vb\\week4\\xcalc\\Calc.g:114:17: ( ( TIMES ^| DIVIDE ^) operand )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==DIVIDE||LA12_0==TIMES) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:114:18: ( TIMES ^| DIVIDE ^) operand
					{
					// src\\vb\\week4\\xcalc\\Calc.g:114:18: ( TIMES ^| DIVIDE ^)
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==TIMES) ) {
						alt11=1;
					}
					else if ( (LA11_0==DIVIDE) ) {
						alt11=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// src\\vb\\week4\\xcalc\\Calc.g:114:19: TIMES ^
							{
							TIMES58=(Token)match(input,TIMES,FOLLOW_TIMES_in_mult_expr1307); 
							TIMES58_tree = (Object)adaptor.create(TIMES58);
							root_0 = (Object)adaptor.becomeRoot(TIMES58_tree, root_0);

							}
							break;
						case 2 :
							// src\\vb\\week4\\xcalc\\Calc.g:114:28: DIVIDE ^
							{
							DIVIDE59=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_mult_expr1312); 
							DIVIDE59_tree = (Object)adaptor.create(DIVIDE59);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE59_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_mult_expr1316);
					operand60=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand60.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mult_expr"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// src\\vb\\week4\\xcalc\\Calc.g:117:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !);
	public final CalcParser.operand_return operand() throws RecognitionException {
		CalcParser.operand_return retval = new CalcParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER61=null;
		Token NUMBER62=null;
		Token LPAREN63=null;
		Token RPAREN65=null;
		ParserRuleReturnScope expr64 =null;

		Object IDENTIFIER61_tree=null;
		Object NUMBER62_tree=null;
		Object LPAREN63_tree=null;
		Object RPAREN65_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:118:5: ( IDENTIFIER | NUMBER | LPAREN ! expr RPAREN !)
			int alt13=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
				{
				alt13=1;
				}
				break;
			case NUMBER:
				{
				alt13=2;
				}
				break;
			case LPAREN:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// src\\vb\\week4\\xcalc\\Calc.g:118:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER61=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1338); 
					IDENTIFIER61_tree = (Object)adaptor.create(IDENTIFIER61);
					adaptor.addChild(root_0, IDENTIFIER61_tree);

					}
					break;
				case 2 :
					// src\\vb\\week4\\xcalc\\Calc.g:119:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER62=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1348); 
					NUMBER62_tree = (Object)adaptor.create(NUMBER62);
					adaptor.addChild(root_0, NUMBER62_tree);

					}
					break;
				case 3 :
					// src\\vb\\week4\\xcalc\\Calc.g:120:9: LPAREN ! expr RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN63=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1358); 
					pushFollow(FOLLOW_expr_in_operand1361);
					expr64=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr64.getTree());

					RPAREN65=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1363); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// src\\vb\\week4\\xcalc\\Calc.g:123:1: type : INTEGER ;
	public final CalcParser.type_return type() throws RecognitionException {
		CalcParser.type_return retval = new CalcParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER66=null;

		Object INTEGER66_tree=null;

		try {
			// src\\vb\\week4\\xcalc\\Calc.g:124:5: ( INTEGER )
			// src\\vb\\week4\\xcalc\\Calc.g:124:9: INTEGER
			{
			root_0 = (Object)adaptor.nil();


			INTEGER66=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1383); 
			INTEGER66_tree = (Object)adaptor.create(INTEGER66);
			adaptor.addChild(root_0, INTEGER66_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"

	// Delegated rules



	public static final BitSet FOLLOW_commands_in_program796 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_commands839 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_commands841 = new BitSet(new long[]{0x000000088A118400L});
	public static final BitSet FOLLOW_statements_in_commands846 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_declarations_in_commands849 = new BitSet(new long[]{0x000000008A118400L});
	public static final BitSet FOLLOW_statements_in_commands851 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_declaration_in_declarations877 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations879 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_statement_in_statements906 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements908 = new BitSet(new long[]{0x000000008A118402L});
	public static final BitSet FOLLOW_VAR_in_declaration930 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration933 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_declaration935 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_type_in_declaration938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_stat_in_statement971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_swap_stat_in_statement981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dowhile_stat_in_statement991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_expr_in_expr1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_expr_in_expr1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_stat1043 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_print_stat1046 = new BitSet(new long[]{0x0000000002118000L});
	public static final BitSet FOLLOW_expr_in_print_stat1049 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_print_stat1051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWAP_in_swap_stat1071 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_swap_stat1074 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat1077 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_swap_stat1079 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat1082 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_swap_stat1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_in_dowhile_stat1104 = new BitSet(new long[]{0x000000008A118400L});
	public static final BitSet FOLLOW_statements_in_dowhile_stat1106 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WHILE_in_dowhile_stat1108 = new BitSet(new long[]{0x0000000002118000L});
	public static final BitSet FOLLOW_expr_in_dowhile_stat1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_expr1143 = new BitSet(new long[]{0x0000000002118000L});
	public static final BitSet FOLLOW_expr_in_if_expr1146 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_THEN_in_if_expr1148 = new BitSet(new long[]{0x0000000002118000L});
	public static final BitSet FOLLOW_expr_in_if_expr1151 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_ELSE_in_if_expr1153 = new BitSet(new long[]{0x0000000002118000L});
	public static final BitSet FOLLOW_expr_in_if_expr1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_lvalue1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_add_expr_in_binary_expr1198 = new BitSet(new long[]{0x0000000001607012L});
	public static final BitSet FOLLOW_LT_in_binary_expr1203 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_LTE_in_binary_expr1208 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_GT_in_binary_expr1213 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_GTE_in_binary_expr1218 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_EQUALS_in_binary_expr1223 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_NEQUALS_in_binary_expr1228 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_add_expr_in_binary_expr1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BECOMES_in_binary_expr1238 = new BitSet(new long[]{0x0000000002118000L});
	public static final BitSet FOLLOW_expr_in_binary_expr1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr1268 = new BitSet(new long[]{0x0000000004800002L});
	public static final BitSet FOLLOW_PLUS_in_add_expr1272 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_MINUS_in_add_expr1277 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_mult_expr_in_add_expr1281 = new BitSet(new long[]{0x0000000004800002L});
	public static final BitSet FOLLOW_operand_in_mult_expr1303 = new BitSet(new long[]{0x0000000200000202L});
	public static final BitSet FOLLOW_TIMES_in_mult_expr1307 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_DIVIDE_in_mult_expr1312 = new BitSet(new long[]{0x0000000002108000L});
	public static final BitSet FOLLOW_operand_in_mult_expr1316 = new BitSet(new long[]{0x0000000200000202L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1358 = new BitSet(new long[]{0x0000000002118000L});
	public static final BitSet FOLLOW_expr_in_operand1361 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1383 = new BitSet(new long[]{0x0000000000000002L});
}

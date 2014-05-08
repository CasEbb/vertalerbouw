// $ANTLR 3.5.2 ..\\src\\vb\\week3\\calc\\Calc.g 2014-05-08 17:35:04

package vb.week3.calc;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CalcParser extends Parser {
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
	@Override public String getGrammarFileName() { return "..\\src\\vb\\week3\\calc\\Calc.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// ..\\src\\vb\\week3\\calc\\Calc.g:50:1: program : commands EOF -> ^( PROGRAM commands ) ;
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
			// ..\\src\\vb\\week3\\calc\\Calc.g:51:5: ( commands EOF -> ^( PROGRAM commands ) )
			// ..\\src\\vb\\week3\\calc\\Calc.g:51:9: commands EOF
			{
			pushFollow(FOLLOW_commands_in_program742);
			commands1=commands();
			state._fsp--;

			stream_commands.add(commands1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program744);  
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
			// 52:13: -> ^( PROGRAM commands )
			{
				// ..\\src\\vb\\week3\\calc\\Calc.g:52:17: ^( PROGRAM commands )
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
	// ..\\src\\vb\\week3\\calc\\Calc.g:55:1: commands : ( declaration SEMICOLON !)* statements ( declarations statements )* ;
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
			// ..\\src\\vb\\week3\\calc\\Calc.g:56:5: ( ( declaration SEMICOLON !)* statements ( declarations statements )* )
			// ..\\src\\vb\\week3\\calc\\Calc.g:56:9: ( declaration SEMICOLON !)* statements ( declarations statements )*
			{
			root_0 = (Object)adaptor.nil();


			// ..\\src\\vb\\week3\\calc\\Calc.g:56:9: ( declaration SEMICOLON !)*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==VAR) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:56:10: declaration SEMICOLON !
					{
					pushFollow(FOLLOW_declaration_in_commands785);
					declaration3=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration3.getTree());

					SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_commands787); 
					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_statements_in_commands792);
			statements5=statements();
			state._fsp--;

			adaptor.addChild(root_0, statements5.getTree());

			// ..\\src\\vb\\week3\\calc\\Calc.g:56:46: ( declarations statements )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==VAR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:56:47: declarations statements
					{
					pushFollow(FOLLOW_declarations_in_commands795);
					declarations6=declarations();
					state._fsp--;

					adaptor.addChild(root_0, declarations6.getTree());

					pushFollow(FOLLOW_statements_in_commands797);
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
	// ..\\src\\vb\\week3\\calc\\Calc.g:59:1: declarations : ( declaration SEMICOLON !)+ ;
	public final CalcParser.declarations_return declarations() throws RecognitionException {
		CalcParser.declarations_return retval = new CalcParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON9=null;
		ParserRuleReturnScope declaration8 =null;

		Object SEMICOLON9_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:60:5: ( ( declaration SEMICOLON !)+ )
			// ..\\src\\vb\\week3\\calc\\Calc.g:60:9: ( declaration SEMICOLON !)+
			{
			root_0 = (Object)adaptor.nil();


			// ..\\src\\vb\\week3\\calc\\Calc.g:60:9: ( declaration SEMICOLON !)+
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
					// ..\\src\\vb\\week3\\calc\\Calc.g:60:10: declaration SEMICOLON !
					{
					pushFollow(FOLLOW_declaration_in_declarations823);
					declaration8=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration8.getTree());

					SEMICOLON9=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations825); 
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
	// ..\\src\\vb\\week3\\calc\\Calc.g:63:1: statements : ( statement SEMICOLON !)+ ;
	public final CalcParser.statements_return statements() throws RecognitionException {
		CalcParser.statements_return retval = new CalcParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON11=null;
		ParserRuleReturnScope statement10 =null;

		Object SEMICOLON11_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:64:5: ( ( statement SEMICOLON !)+ )
			// ..\\src\\vb\\week3\\calc\\Calc.g:64:9: ( statement SEMICOLON !)+
			{
			root_0 = (Object)adaptor.nil();


			// ..\\src\\vb\\week3\\calc\\Calc.g:64:9: ( statement SEMICOLON !)+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==IDENTIFIER||LA4_0==PRINT||LA4_0==SWAP) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:64:10: statement SEMICOLON !
					{
					pushFollow(FOLLOW_statement_in_statements852);
					statement10=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement10.getTree());

					SEMICOLON11=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements854); 
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
	// ..\\src\\vb\\week3\\calc\\Calc.g:67:1: declaration : VAR ^ IDENTIFIER COLON ! type ;
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
			// ..\\src\\vb\\week3\\calc\\Calc.g:68:5: ( VAR ^ IDENTIFIER COLON ! type )
			// ..\\src\\vb\\week3\\calc\\Calc.g:68:9: VAR ^ IDENTIFIER COLON ! type
			{
			root_0 = (Object)adaptor.nil();


			VAR12=(Token)match(input,VAR,FOLLOW_VAR_in_declaration876); 
			VAR12_tree = (Object)adaptor.create(VAR12);
			root_0 = (Object)adaptor.becomeRoot(VAR12_tree, root_0);

			IDENTIFIER13=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_declaration879); 
			IDENTIFIER13_tree = (Object)adaptor.create(IDENTIFIER13);
			adaptor.addChild(root_0, IDENTIFIER13_tree);

			COLON14=(Token)match(input,COLON,FOLLOW_COLON_in_declaration881); 
			pushFollow(FOLLOW_type_in_declaration884);
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
	// ..\\src\\vb\\week3\\calc\\Calc.g:71:1: statement : ( assignment | print_stat | swap_stat );
	public final CalcParser.statement_return statement() throws RecognitionException {
		CalcParser.statement_return retval = new CalcParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope assignment16 =null;
		ParserRuleReturnScope print_stat17 =null;
		ParserRuleReturnScope swap_stat18 =null;


		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:72:5: ( assignment | print_stat | swap_stat )
			int alt5=3;
			switch ( input.LA(1) ) {
			case IDENTIFIER:
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:72:9: assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_statement907);
					assignment16=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment16.getTree());

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:73:9: print_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_print_stat_in_statement917);
					print_stat17=print_stat();
					state._fsp--;

					adaptor.addChild(root_0, print_stat17.getTree());

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:74:9: swap_stat
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_swap_stat_in_statement927);
					swap_stat18=swap_stat();
					state._fsp--;

					adaptor.addChild(root_0, swap_stat18.getTree());

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


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// ..\\src\\vb\\week3\\calc\\Calc.g:77:1: assignment : lvalue BECOMES ^ expr ;
	public final CalcParser.assignment_return assignment() throws RecognitionException {
		CalcParser.assignment_return retval = new CalcParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BECOMES20=null;
		ParserRuleReturnScope lvalue19 =null;
		ParserRuleReturnScope expr21 =null;

		Object BECOMES20_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:78:5: ( lvalue BECOMES ^ expr )
			// ..\\src\\vb\\week3\\calc\\Calc.g:78:9: lvalue BECOMES ^ expr
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_lvalue_in_assignment946);
			lvalue19=lvalue();
			state._fsp--;

			adaptor.addChild(root_0, lvalue19.getTree());

			BECOMES20=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_assignment948); 
			BECOMES20_tree = (Object)adaptor.create(BECOMES20);
			root_0 = (Object)adaptor.becomeRoot(BECOMES20_tree, root_0);

			pushFollow(FOLLOW_expr_in_assignment951);
			expr21=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr21.getTree());

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
	// $ANTLR end "assignment"


	public static class print_stat_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "print_stat"
	// ..\\src\\vb\\week3\\calc\\Calc.g:81:1: print_stat : PRINT ^ LPAREN ! expr RPAREN !;
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
			// ..\\src\\vb\\week3\\calc\\Calc.g:82:5: ( PRINT ^ LPAREN ! expr RPAREN !)
			// ..\\src\\vb\\week3\\calc\\Calc.g:82:9: PRINT ^ LPAREN ! expr RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			PRINT22=(Token)match(input,PRINT,FOLLOW_PRINT_in_print_stat970); 
			PRINT22_tree = (Object)adaptor.create(PRINT22);
			root_0 = (Object)adaptor.becomeRoot(PRINT22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_print_stat973); 
			pushFollow(FOLLOW_expr_in_print_stat976);
			expr24=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr24.getTree());

			RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_print_stat978); 
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
	// ..\\src\\vb\\week3\\calc\\Calc.g:85:1: swap_stat : SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !;
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
			// ..\\src\\vb\\week3\\calc\\Calc.g:86:5: ( SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !)
			// ..\\src\\vb\\week3\\calc\\Calc.g:86:9: SWAP ^ LPAREN ! IDENTIFIER COMMA ! IDENTIFIER RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			SWAP26=(Token)match(input,SWAP,FOLLOW_SWAP_in_swap_stat998); 
			SWAP26_tree = (Object)adaptor.create(SWAP26);
			root_0 = (Object)adaptor.becomeRoot(SWAP26_tree, root_0);

			LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_swap_stat1001); 
			IDENTIFIER28=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat1004); 
			IDENTIFIER28_tree = (Object)adaptor.create(IDENTIFIER28);
			adaptor.addChild(root_0, IDENTIFIER28_tree);

			COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_swap_stat1006); 
			IDENTIFIER30=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_swap_stat1009); 
			IDENTIFIER30_tree = (Object)adaptor.create(IDENTIFIER30);
			adaptor.addChild(root_0, IDENTIFIER30_tree);

			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_swap_stat1011); 
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


	public static class if_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_expr"
	// ..\\src\\vb\\week3\\calc\\Calc.g:89:1: if_expr : IF ^ expr THEN ! expr ELSE ! expr ;
	public final CalcParser.if_expr_return if_expr() throws RecognitionException {
		CalcParser.if_expr_return retval = new CalcParser.if_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF32=null;
		Token THEN34=null;
		Token ELSE36=null;
		ParserRuleReturnScope expr33 =null;
		ParserRuleReturnScope expr35 =null;
		ParserRuleReturnScope expr37 =null;

		Object IF32_tree=null;
		Object THEN34_tree=null;
		Object ELSE36_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:90:5: ( IF ^ expr THEN ! expr ELSE ! expr )
			// ..\\src\\vb\\week3\\calc\\Calc.g:90:9: IF ^ expr THEN ! expr ELSE ! expr
			{
			root_0 = (Object)adaptor.nil();


			IF32=(Token)match(input,IF,FOLLOW_IF_in_if_expr1031); 
			IF32_tree = (Object)adaptor.create(IF32);
			root_0 = (Object)adaptor.becomeRoot(IF32_tree, root_0);

			pushFollow(FOLLOW_expr_in_if_expr1034);
			expr33=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr33.getTree());

			THEN34=(Token)match(input,THEN,FOLLOW_THEN_in_if_expr1036); 
			pushFollow(FOLLOW_expr_in_if_expr1039);
			expr35=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr35.getTree());

			ELSE36=(Token)match(input,ELSE,FOLLOW_ELSE_in_if_expr1041); 
			pushFollow(FOLLOW_expr_in_if_expr1044);
			expr37=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr37.getTree());

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
	// ..\\src\\vb\\week3\\calc\\Calc.g:93:1: lvalue : IDENTIFIER ;
	public final CalcParser.lvalue_return lvalue() throws RecognitionException {
		CalcParser.lvalue_return retval = new CalcParser.lvalue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER38=null;

		Object IDENTIFIER38_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:94:5: ( IDENTIFIER )
			// ..\\src\\vb\\week3\\calc\\Calc.g:94:9: IDENTIFIER
			{
			root_0 = (Object)adaptor.nil();


			IDENTIFIER38=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_lvalue1063); 
			IDENTIFIER38_tree = (Object)adaptor.create(IDENTIFIER38);
			adaptor.addChild(root_0, IDENTIFIER38_tree);

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


	public static class expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// ..\\src\\vb\\week3\\calc\\Calc.g:97:1: expr : ( if_expr | binary_expr );
	public final CalcParser.expr_return expr() throws RecognitionException {
		CalcParser.expr_return retval = new CalcParser.expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope if_expr39 =null;
		ParserRuleReturnScope binary_expr40 =null;


		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:98:5: ( if_expr | binary_expr )
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
					// ..\\src\\vb\\week3\\calc\\Calc.g:98:9: if_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if_expr_in_expr1082);
					if_expr39=if_expr();
					state._fsp--;

					adaptor.addChild(root_0, if_expr39.getTree());

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:99:9: binary_expr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_binary_expr_in_expr1092);
					binary_expr40=binary_expr();
					state._fsp--;

					adaptor.addChild(root_0, binary_expr40.getTree());

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


	public static class binary_expr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "binary_expr"
	// ..\\src\\vb\\week3\\calc\\Calc.g:102:1: binary_expr : expr1 ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^| BECOMES ^) binary_expr )? ;
	public final CalcParser.binary_expr_return binary_expr() throws RecognitionException {
		CalcParser.binary_expr_return retval = new CalcParser.binary_expr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LT42=null;
		Token LTE43=null;
		Token GT44=null;
		Token GTE45=null;
		Token EQUALS46=null;
		Token NEQUALS47=null;
		Token BECOMES48=null;
		ParserRuleReturnScope expr141 =null;
		ParserRuleReturnScope binary_expr49 =null;

		Object LT42_tree=null;
		Object LTE43_tree=null;
		Object GT44_tree=null;
		Object GTE45_tree=null;
		Object EQUALS46_tree=null;
		Object NEQUALS47_tree=null;
		Object BECOMES48_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:103:5: ( expr1 ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^| BECOMES ^) binary_expr )? )
			// ..\\src\\vb\\week3\\calc\\Calc.g:103:9: expr1 ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^| BECOMES ^) binary_expr )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr1_in_binary_expr1115);
			expr141=expr1();
			state._fsp--;

			adaptor.addChild(root_0, expr141.getTree());

			// ..\\src\\vb\\week3\\calc\\Calc.g:103:15: ( ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^| BECOMES ^) binary_expr )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==BECOMES||(LA8_0 >= EQUALS && LA8_0 <= GTE)||(LA8_0 >= LT && LA8_0 <= LTE)||LA8_0==NEQUALS) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:103:16: ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^| BECOMES ^) binary_expr
					{
					// ..\\src\\vb\\week3\\calc\\Calc.g:103:16: ( LT ^| LTE ^| GT ^| GTE ^| EQUALS ^| NEQUALS ^| BECOMES ^)
					int alt7=7;
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
					case BECOMES:
						{
						alt7=7;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}
					switch (alt7) {
						case 1 :
							// ..\\src\\vb\\week3\\calc\\Calc.g:103:17: LT ^
							{
							LT42=(Token)match(input,LT,FOLLOW_LT_in_binary_expr1119); 
							LT42_tree = (Object)adaptor.create(LT42);
							root_0 = (Object)adaptor.becomeRoot(LT42_tree, root_0);

							}
							break;
						case 2 :
							// ..\\src\\vb\\week3\\calc\\Calc.g:103:23: LTE ^
							{
							LTE43=(Token)match(input,LTE,FOLLOW_LTE_in_binary_expr1124); 
							LTE43_tree = (Object)adaptor.create(LTE43);
							root_0 = (Object)adaptor.becomeRoot(LTE43_tree, root_0);

							}
							break;
						case 3 :
							// ..\\src\\vb\\week3\\calc\\Calc.g:103:30: GT ^
							{
							GT44=(Token)match(input,GT,FOLLOW_GT_in_binary_expr1129); 
							GT44_tree = (Object)adaptor.create(GT44);
							root_0 = (Object)adaptor.becomeRoot(GT44_tree, root_0);

							}
							break;
						case 4 :
							// ..\\src\\vb\\week3\\calc\\Calc.g:103:36: GTE ^
							{
							GTE45=(Token)match(input,GTE,FOLLOW_GTE_in_binary_expr1134); 
							GTE45_tree = (Object)adaptor.create(GTE45);
							root_0 = (Object)adaptor.becomeRoot(GTE45_tree, root_0);

							}
							break;
						case 5 :
							// ..\\src\\vb\\week3\\calc\\Calc.g:103:43: EQUALS ^
							{
							EQUALS46=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_binary_expr1139); 
							EQUALS46_tree = (Object)adaptor.create(EQUALS46);
							root_0 = (Object)adaptor.becomeRoot(EQUALS46_tree, root_0);

							}
							break;
						case 6 :
							// ..\\src\\vb\\week3\\calc\\Calc.g:103:53: NEQUALS ^
							{
							NEQUALS47=(Token)match(input,NEQUALS,FOLLOW_NEQUALS_in_binary_expr1144); 
							NEQUALS47_tree = (Object)adaptor.create(NEQUALS47);
							root_0 = (Object)adaptor.becomeRoot(NEQUALS47_tree, root_0);

							}
							break;
						case 7 :
							// ..\\src\\vb\\week3\\calc\\Calc.g:103:64: BECOMES ^
							{
							BECOMES48=(Token)match(input,BECOMES,FOLLOW_BECOMES_in_binary_expr1149); 
							BECOMES48_tree = (Object)adaptor.create(BECOMES48);
							root_0 = (Object)adaptor.becomeRoot(BECOMES48_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_binary_expr_in_binary_expr1153);
					binary_expr49=binary_expr();
					state._fsp--;

					adaptor.addChild(root_0, binary_expr49.getTree());

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


	public static class expr1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr1"
	// ..\\src\\vb\\week3\\calc\\Calc.g:106:1: expr1 : expr2 ( ( PLUS ^| MINUS ^) expr2 )* ;
	public final CalcParser.expr1_return expr1() throws RecognitionException {
		CalcParser.expr1_return retval = new CalcParser.expr1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS51=null;
		Token MINUS52=null;
		ParserRuleReturnScope expr250 =null;
		ParserRuleReturnScope expr253 =null;

		Object PLUS51_tree=null;
		Object MINUS52_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:107:5: ( expr2 ( ( PLUS ^| MINUS ^) expr2 )* )
			// ..\\src\\vb\\week3\\calc\\Calc.g:107:9: expr2 ( ( PLUS ^| MINUS ^) expr2 )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expr2_in_expr11179);
			expr250=expr2();
			state._fsp--;

			adaptor.addChild(root_0, expr250.getTree());

			// ..\\src\\vb\\week3\\calc\\Calc.g:107:15: ( ( PLUS ^| MINUS ^) expr2 )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:107:16: ( PLUS ^| MINUS ^) expr2
					{
					// ..\\src\\vb\\week3\\calc\\Calc.g:107:16: ( PLUS ^| MINUS ^)
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
							// ..\\src\\vb\\week3\\calc\\Calc.g:107:17: PLUS ^
							{
							PLUS51=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr11183); 
							PLUS51_tree = (Object)adaptor.create(PLUS51);
							root_0 = (Object)adaptor.becomeRoot(PLUS51_tree, root_0);

							}
							break;
						case 2 :
							// ..\\src\\vb\\week3\\calc\\Calc.g:107:25: MINUS ^
							{
							MINUS52=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr11188); 
							MINUS52_tree = (Object)adaptor.create(MINUS52);
							root_0 = (Object)adaptor.becomeRoot(MINUS52_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_expr2_in_expr11192);
					expr253=expr2();
					state._fsp--;

					adaptor.addChild(root_0, expr253.getTree());

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
	// $ANTLR end "expr1"


	public static class expr2_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expr2"
	// ..\\src\\vb\\week3\\calc\\Calc.g:110:1: expr2 : operand ( ( TIMES ^| DIVIDE ^) operand )* ;
	public final CalcParser.expr2_return expr2() throws RecognitionException {
		CalcParser.expr2_return retval = new CalcParser.expr2_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES55=null;
		Token DIVIDE56=null;
		ParserRuleReturnScope operand54 =null;
		ParserRuleReturnScope operand57 =null;

		Object TIMES55_tree=null;
		Object DIVIDE56_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:111:5: ( operand ( ( TIMES ^| DIVIDE ^) operand )* )
			// ..\\src\\vb\\week3\\calc\\Calc.g:111:9: operand ( ( TIMES ^| DIVIDE ^) operand )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_operand_in_expr21214);
			operand54=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand54.getTree());

			// ..\\src\\vb\\week3\\calc\\Calc.g:111:17: ( ( TIMES ^| DIVIDE ^) operand )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==DIVIDE||LA12_0==TIMES) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:111:18: ( TIMES ^| DIVIDE ^) operand
					{
					// ..\\src\\vb\\week3\\calc\\Calc.g:111:18: ( TIMES ^| DIVIDE ^)
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
							// ..\\src\\vb\\week3\\calc\\Calc.g:111:19: TIMES ^
							{
							TIMES55=(Token)match(input,TIMES,FOLLOW_TIMES_in_expr21218); 
							TIMES55_tree = (Object)adaptor.create(TIMES55);
							root_0 = (Object)adaptor.becomeRoot(TIMES55_tree, root_0);

							}
							break;
						case 2 :
							// ..\\src\\vb\\week3\\calc\\Calc.g:111:28: DIVIDE ^
							{
							DIVIDE56=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr21223); 
							DIVIDE56_tree = (Object)adaptor.create(DIVIDE56);
							root_0 = (Object)adaptor.becomeRoot(DIVIDE56_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_operand_in_expr21227);
					operand57=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand57.getTree());

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
	// $ANTLR end "expr2"


	public static class operand_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// ..\\src\\vb\\week3\\calc\\Calc.g:114:1: operand : ( IDENTIFIER | NUMBER | LPAREN ! expr1 RPAREN !);
	public final CalcParser.operand_return operand() throws RecognitionException {
		CalcParser.operand_return retval = new CalcParser.operand_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IDENTIFIER58=null;
		Token NUMBER59=null;
		Token LPAREN60=null;
		Token RPAREN62=null;
		ParserRuleReturnScope expr161 =null;

		Object IDENTIFIER58_tree=null;
		Object NUMBER59_tree=null;
		Object LPAREN60_tree=null;
		Object RPAREN62_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:115:5: ( IDENTIFIER | NUMBER | LPAREN ! expr1 RPAREN !)
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
					// ..\\src\\vb\\week3\\calc\\Calc.g:115:9: IDENTIFIER
					{
					root_0 = (Object)adaptor.nil();


					IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_operand1249); 
					IDENTIFIER58_tree = (Object)adaptor.create(IDENTIFIER58);
					adaptor.addChild(root_0, IDENTIFIER58_tree);

					}
					break;
				case 2 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:116:9: NUMBER
					{
					root_0 = (Object)adaptor.nil();


					NUMBER59=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_operand1259); 
					NUMBER59_tree = (Object)adaptor.create(NUMBER59);
					adaptor.addChild(root_0, NUMBER59_tree);

					}
					break;
				case 3 :
					// ..\\src\\vb\\week3\\calc\\Calc.g:117:9: LPAREN ! expr1 RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN60=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1269); 
					pushFollow(FOLLOW_expr1_in_operand1272);
					expr161=expr1();
					state._fsp--;

					adaptor.addChild(root_0, expr161.getTree());

					RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1274); 
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
	// ..\\src\\vb\\week3\\calc\\Calc.g:120:1: type : INTEGER ;
	public final CalcParser.type_return type() throws RecognitionException {
		CalcParser.type_return retval = new CalcParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTEGER63=null;

		Object INTEGER63_tree=null;

		try {
			// ..\\src\\vb\\week3\\calc\\Calc.g:121:5: ( INTEGER )
			// ..\\src\\vb\\week3\\calc\\Calc.g:121:9: INTEGER
			{
			root_0 = (Object)adaptor.nil();


			INTEGER63=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_type1294); 
			INTEGER63_tree = (Object)adaptor.create(INTEGER63);
			adaptor.addChild(root_0, INTEGER63_tree);

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



	public static final BitSet FOLLOW_commands_in_program742 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_commands785 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_commands787 = new BitSet(new long[]{0x0000000444004000L});
	public static final BitSet FOLLOW_statements_in_commands792 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_declarations_in_commands795 = new BitSet(new long[]{0x0000000044004000L});
	public static final BitSet FOLLOW_statements_in_commands797 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_declaration_in_declarations823 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_declarations825 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_statement_in_statements852 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements854 = new BitSet(new long[]{0x0000000044004002L});
	public static final BitSet FOLLOW_VAR_in_declaration876 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_declaration879 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_COLON_in_declaration881 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_type_in_declaration884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_stat_in_statement917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_swap_stat_in_statement927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lvalue_in_assignment946 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_BECOMES_in_assignment948 = new BitSet(new long[]{0x000000000108C000L});
	public static final BitSet FOLLOW_expr_in_assignment951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_print_stat970 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAREN_in_print_stat973 = new BitSet(new long[]{0x000000000108C000L});
	public static final BitSet FOLLOW_expr_in_print_stat976 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_print_stat978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWAP_in_swap_stat998 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_LPAREN_in_swap_stat1001 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat1004 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_COMMA_in_swap_stat1006 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_swap_stat1009 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_swap_stat1011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_if_expr1031 = new BitSet(new long[]{0x000000000108C000L});
	public static final BitSet FOLLOW_expr_in_if_expr1034 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_THEN_in_if_expr1036 = new BitSet(new long[]{0x000000000108C000L});
	public static final BitSet FOLLOW_expr_in_if_expr1039 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ELSE_in_if_expr1041 = new BitSet(new long[]{0x000000000108C000L});
	public static final BitSet FOLLOW_expr_in_if_expr1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_lvalue1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_expr_in_expr1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binary_expr_in_expr1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr1_in_binary_expr1115 = new BitSet(new long[]{0x0000000000B03812L});
	public static final BitSet FOLLOW_LT_in_binary_expr1119 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_LTE_in_binary_expr1124 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_GT_in_binary_expr1129 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_GTE_in_binary_expr1134 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_EQUALS_in_binary_expr1139 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_NEQUALS_in_binary_expr1144 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_BECOMES_in_binary_expr1149 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_binary_expr_in_binary_expr1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr2_in_expr11179 = new BitSet(new long[]{0x0000000002400002L});
	public static final BitSet FOLLOW_PLUS_in_expr11183 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_MINUS_in_expr11188 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_expr2_in_expr11192 = new BitSet(new long[]{0x0000000002400002L});
	public static final BitSet FOLLOW_operand_in_expr21214 = new BitSet(new long[]{0x0000000100000202L});
	public static final BitSet FOLLOW_TIMES_in_expr21218 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_DIVIDE_in_expr21223 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_operand_in_expr21227 = new BitSet(new long[]{0x0000000100000202L});
	public static final BitSet FOLLOW_IDENTIFIER_in_operand1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_operand1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1269 = new BitSet(new long[]{0x0000000001084000L});
	public static final BitSet FOLLOW_expr1_in_operand1272 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTEGER_in_type1294 = new BitSet(new long[]{0x0000000000000002L});
}

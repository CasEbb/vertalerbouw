// $ANTLR 3.5.2 src\\hoken\\parser\\Hoken.g 2014-07-07 17:37:32

package hoken.parser;
import hoken.HokenException;
import hoken.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class HokenParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public HokenParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public HokenParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HokenParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\hoken\\parser\\Hoken.g"; }


	private int errors = 0;

	public int getErrorCount() {
	    return this.errors;
	}

	@Override
	public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	{
	    this.errors++;
	    emitErrorMessage("'" + e.token.getText() + "' (regel: " + e.line + ", kolom: " + e.charPositionInLine + ") " + getErrorMessage(e, tokenNames));
	}


	public static class program_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "program"
	// src\\hoken\\parser\\Hoken.g:82:1: program : statements EOF -> ^( PROGRAM statements ) ;
	public final HokenParser.program_return program() throws RecognitionException {
		HokenParser.program_return retval = new HokenParser.program_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope statements1 =null;

		HokenNode EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");

		try {
			// src\\hoken\\parser\\Hoken.g:83:5: ( statements EOF -> ^( PROGRAM statements ) )
			// src\\hoken\\parser\\Hoken.g:83:9: statements EOF
			{
			pushFollow(FOLLOW_statements_in_program487);
			statements1=statements();
			state._fsp--;

			stream_statements.add(statements1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program489);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: statements
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (HokenNode)adaptor.nil();
			// 84:9: -> ^( PROGRAM statements )
			{
				// src\\hoken\\parser\\Hoken.g:84:12: ^( PROGRAM statements )
				{
				HokenNode root_1 = (HokenNode)adaptor.nil();
				root_1 = (HokenNode)adaptor.becomeRoot((HokenNode)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_statements.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statements_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// src\\hoken\\parser\\Hoken.g:87:1: statements : ( statement SEMICOLON !)* ;
	public final HokenParser.statements_return statements() throws RecognitionException {
		HokenParser.statements_return retval = new HokenParser.statements_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token SEMICOLON4=null;
		ParserRuleReturnScope statement3 =null;

		HokenNode SEMICOLON4_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:88:5: ( ( statement SEMICOLON !)* )
			// src\\hoken\\parser\\Hoken.g:88:9: ( statement SEMICOLON !)*
			{
			root_0 = (HokenNode)adaptor.nil();


			// src\\hoken\\parser\\Hoken.g:88:9: ( statement SEMICOLON !)*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= BOOLEAN && LA1_0 <= CHARACTER)||LA1_0==CONST||LA1_0==FALSE||(LA1_0 >= ID && LA1_0 <= LCURLY)||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NOT||LA1_0==PLUS||LA1_0==READ||LA1_0==TRUE||LA1_0==WRITE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:88:10: statement SEMICOLON !
					{
					pushFollow(FOLLOW_statement_in_statements525);
					statement3=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement3.getTree());

					SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements527); 
					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statement_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// src\\hoken\\parser\\Hoken.g:91:1: statement : ( decl | expr );
	public final HokenParser.statement_return statement() throws RecognitionException {
		HokenParser.statement_return retval = new HokenParser.statement_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		ParserRuleReturnScope decl5 =null;
		ParserRuleReturnScope expr6 =null;


		try {
			// src\\hoken\\parser\\Hoken.g:92:5: ( decl | expr )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==BOOLEAN||LA2_0==CHARACTER||LA2_0==CONST||LA2_0==INTEGER) ) {
				alt2=1;
			}
			else if ( (LA2_0==CHAR||LA2_0==FALSE||(LA2_0 >= ID && LA2_0 <= INT)||LA2_0==LCURLY||LA2_0==LPAREN||LA2_0==MINUS||LA2_0==NOT||LA2_0==PLUS||LA2_0==READ||LA2_0==TRUE||LA2_0==WRITE) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:92:9: decl
					{
					root_0 = (HokenNode)adaptor.nil();


					pushFollow(FOLLOW_decl_in_statement549);
					decl5=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl5.getTree());

					}
					break;
				case 2 :
					// src\\hoken\\parser\\Hoken.g:93:9: expr
					{
					root_0 = (HokenNode)adaptor.nil();


					pushFollow(FOLLOW_expr_in_statement559);
					expr6=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr6.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class decl_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// src\\hoken\\parser\\Hoken.g:96:1: decl : ( type id_list -> ^( VAR type id_list ) | CONST ^ type id_list EQUALS ! value );
	public final HokenParser.decl_return decl() throws RecognitionException {
		HokenParser.decl_return retval = new HokenParser.decl_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token CONST9=null;
		Token EQUALS12=null;
		ParserRuleReturnScope type7 =null;
		ParserRuleReturnScope id_list8 =null;
		ParserRuleReturnScope type10 =null;
		ParserRuleReturnScope id_list11 =null;
		ParserRuleReturnScope value13 =null;

		HokenNode CONST9_tree=null;
		HokenNode EQUALS12_tree=null;
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
		RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");

		try {
			// src\\hoken\\parser\\Hoken.g:96:5: ( type id_list -> ^( VAR type id_list ) | CONST ^ type id_list EQUALS ! value )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==BOOLEAN||LA3_0==CHARACTER||LA3_0==INTEGER) ) {
				alt3=1;
			}
			else if ( (LA3_0==CONST) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:96:9: type id_list
					{
					pushFollow(FOLLOW_type_in_decl573);
					type7=type();
					state._fsp--;

					stream_type.add(type7.getTree());
					pushFollow(FOLLOW_id_list_in_decl575);
					id_list8=id_list();
					state._fsp--;

					stream_id_list.add(id_list8.getTree());
					// AST REWRITE
					// elements: id_list, type
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (HokenNode)adaptor.nil();
					// 97:9: -> ^( VAR type id_list )
					{
						// src\\hoken\\parser\\Hoken.g:97:12: ^( VAR type id_list )
						{
						HokenNode root_1 = (HokenNode)adaptor.nil();
						root_1 = (HokenNode)adaptor.becomeRoot(new DeclarationNode(VAR), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_id_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// src\\hoken\\parser\\Hoken.g:98:9: CONST ^ type id_list EQUALS ! value
					{
					root_0 = (HokenNode)adaptor.nil();


					CONST9=(Token)match(input,CONST,FOLLOW_CONST_in_decl606); 
					CONST9_tree = new DeclarationNode(CONST9) ;
					root_0 = (HokenNode)adaptor.becomeRoot(CONST9_tree, root_0);

					pushFollow(FOLLOW_type_in_decl612);
					type10=type();
					state._fsp--;

					adaptor.addChild(root_0, type10.getTree());

					pushFollow(FOLLOW_id_list_in_decl614);
					id_list11=id_list();
					state._fsp--;

					adaptor.addChild(root_0, id_list11.getTree());

					EQUALS12=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_decl616); 
					pushFollow(FOLLOW_value_in_decl619);
					value13=value();
					state._fsp--;

					adaptor.addChild(root_0, value13.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class expr_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// src\\hoken\\parser\\Hoken.g:101:1: expr : assignment_expr ;
	public final HokenParser.expr_return expr() throws RecognitionException {
		HokenParser.expr_return retval = new HokenParser.expr_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		ParserRuleReturnScope assignment_expr14 =null;


		try {
			// src\\hoken\\parser\\Hoken.g:101:5: ( assignment_expr )
			// src\\hoken\\parser\\Hoken.g:101:9: assignment_expr
			{
			root_0 = (HokenNode)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expr637);
			assignment_expr14=assignment_expr();
			state._fsp--;

			adaptor.addChild(root_0, assignment_expr14.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class assignment_expr_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "assignment_expr"
	// src\\hoken\\parser\\Hoken.g:104:1: assignment_expr : logical_or_expr ( ASSIGN ^ assignment_expr )? ;
	public final HokenParser.assignment_expr_return assignment_expr() throws RecognitionException {
		HokenParser.assignment_expr_return retval = new HokenParser.assignment_expr_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token ASSIGN16=null;
		ParserRuleReturnScope logical_or_expr15 =null;
		ParserRuleReturnScope assignment_expr17 =null;

		HokenNode ASSIGN16_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:105:5: ( logical_or_expr ( ASSIGN ^ assignment_expr )? )
			// src\\hoken\\parser\\Hoken.g:105:9: logical_or_expr ( ASSIGN ^ assignment_expr )?
			{
			root_0 = (HokenNode)adaptor.nil();


			pushFollow(FOLLOW_logical_or_expr_in_assignment_expr656);
			logical_or_expr15=logical_or_expr();
			state._fsp--;

			adaptor.addChild(root_0, logical_or_expr15.getTree());

			// src\\hoken\\parser\\Hoken.g:105:25: ( ASSIGN ^ assignment_expr )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ASSIGN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:105:26: ASSIGN ^ assignment_expr
					{
					ASSIGN16=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expr659); 
					ASSIGN16_tree = (HokenNode)adaptor.create(ASSIGN16);
					root_0 = (HokenNode)adaptor.becomeRoot(ASSIGN16_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr662);
					assignment_expr17=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr17.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_expr"


	public static class read_stat_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "read_stat"
	// src\\hoken\\parser\\Hoken.g:108:1: read_stat : READ ^ LPAREN ! id_list RPAREN !;
	public final HokenParser.read_stat_return read_stat() throws RecognitionException {
		HokenParser.read_stat_return retval = new HokenParser.read_stat_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token READ18=null;
		Token LPAREN19=null;
		Token RPAREN21=null;
		ParserRuleReturnScope id_list20 =null;

		HokenNode READ18_tree=null;
		HokenNode LPAREN19_tree=null;
		HokenNode RPAREN21_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:109:5: ( READ ^ LPAREN ! id_list RPAREN !)
			// src\\hoken\\parser\\Hoken.g:109:9: READ ^ LPAREN ! id_list RPAREN !
			{
			root_0 = (HokenNode)adaptor.nil();


			READ18=(Token)match(input,READ,FOLLOW_READ_in_read_stat683); 
			READ18_tree = (HokenNode)adaptor.create(READ18);
			root_0 = (HokenNode)adaptor.becomeRoot(READ18_tree, root_0);

			LPAREN19=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_stat686); 
			pushFollow(FOLLOW_id_list_in_read_stat689);
			id_list20=id_list();
			state._fsp--;

			adaptor.addChild(root_0, id_list20.getTree());

			RPAREN21=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_stat691); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read_stat"


	public static class write_stat_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "write_stat"
	// src\\hoken\\parser\\Hoken.g:112:1: write_stat : WRITE ^ LPAREN ! expr_list RPAREN !;
	public final HokenParser.write_stat_return write_stat() throws RecognitionException {
		HokenParser.write_stat_return retval = new HokenParser.write_stat_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token WRITE22=null;
		Token LPAREN23=null;
		Token RPAREN25=null;
		ParserRuleReturnScope expr_list24 =null;

		HokenNode WRITE22_tree=null;
		HokenNode LPAREN23_tree=null;
		HokenNode RPAREN25_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:113:5: ( WRITE ^ LPAREN ! expr_list RPAREN !)
			// src\\hoken\\parser\\Hoken.g:113:9: WRITE ^ LPAREN ! expr_list RPAREN !
			{
			root_0 = (HokenNode)adaptor.nil();


			WRITE22=(Token)match(input,WRITE,FOLLOW_WRITE_in_write_stat711); 
			WRITE22_tree = (HokenNode)adaptor.create(WRITE22);
			root_0 = (HokenNode)adaptor.becomeRoot(WRITE22_tree, root_0);

			LPAREN23=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_write_stat714); 
			pushFollow(FOLLOW_expr_list_in_write_stat717);
			expr_list24=expr_list();
			state._fsp--;

			adaptor.addChild(root_0, expr_list24.getTree());

			RPAREN25=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_write_stat719); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "write_stat"


	public static class compound_stat_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "compound_stat"
	// src\\hoken\\parser\\Hoken.g:116:1: compound_stat : LCURLY statements RCURLY -> ^( COMPOUND statements ) ;
	public final HokenParser.compound_stat_return compound_stat() throws RecognitionException {
		HokenParser.compound_stat_return retval = new HokenParser.compound_stat_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token LCURLY26=null;
		Token RCURLY28=null;
		ParserRuleReturnScope statements27 =null;

		HokenNode LCURLY26_tree=null;
		HokenNode RCURLY28_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");

		try {
			// src\\hoken\\parser\\Hoken.g:117:5: ( LCURLY statements RCURLY -> ^( COMPOUND statements ) )
			// src\\hoken\\parser\\Hoken.g:117:9: LCURLY statements RCURLY
			{
			LCURLY26=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_compound_stat739);  
			stream_LCURLY.add(LCURLY26);

			pushFollow(FOLLOW_statements_in_compound_stat741);
			statements27=statements();
			state._fsp--;

			stream_statements.add(statements27.getTree());
			RCURLY28=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_compound_stat743);  
			stream_RCURLY.add(RCURLY28);

			// AST REWRITE
			// elements: statements
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (HokenNode)adaptor.nil();
			// 118:9: -> ^( COMPOUND statements )
			{
				// src\\hoken\\parser\\Hoken.g:118:12: ^( COMPOUND statements )
				{
				HokenNode root_1 = (HokenNode)adaptor.nil();
				root_1 = (HokenNode)adaptor.becomeRoot((HokenNode)adaptor.create(COMPOUND, "COMPOUND"), root_1);
				adaptor.addChild(root_1, stream_statements.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_stat"


	public static class logical_or_expr_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "logical_or_expr"
	// src\\hoken\\parser\\Hoken.g:121:1: logical_or_expr : logical_and_expr ( OR ^ logical_and_expr )* ;
	public final HokenParser.logical_or_expr_return logical_or_expr() throws RecognitionException {
		HokenParser.logical_or_expr_return retval = new HokenParser.logical_or_expr_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token OR30=null;
		ParserRuleReturnScope logical_and_expr29 =null;
		ParserRuleReturnScope logical_and_expr31 =null;

		HokenNode OR30_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:122:5: ( logical_and_expr ( OR ^ logical_and_expr )* )
			// src\\hoken\\parser\\Hoken.g:122:9: logical_and_expr ( OR ^ logical_and_expr )*
			{
			root_0 = (HokenNode)adaptor.nil();


			pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr778);
			logical_and_expr29=logical_and_expr();
			state._fsp--;

			adaptor.addChild(root_0, logical_and_expr29.getTree());

			// src\\hoken\\parser\\Hoken.g:122:26: ( OR ^ logical_and_expr )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==OR) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:122:27: OR ^ logical_and_expr
					{
					OR30=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expr781); 
					OR30_tree = new ExpressionNode(OR30) ;
					root_0 = (HokenNode)adaptor.becomeRoot(OR30_tree, root_0);

					pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr787);
					logical_and_expr31=logical_and_expr();
					state._fsp--;

					adaptor.addChild(root_0, logical_and_expr31.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_or_expr"


	public static class logical_and_expr_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "logical_and_expr"
	// src\\hoken\\parser\\Hoken.g:125:1: logical_and_expr : logical_comparative_expr ( AND ^ logical_comparative_expr )* ;
	public final HokenParser.logical_and_expr_return logical_and_expr() throws RecognitionException {
		HokenParser.logical_and_expr_return retval = new HokenParser.logical_and_expr_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token AND33=null;
		ParserRuleReturnScope logical_comparative_expr32 =null;
		ParserRuleReturnScope logical_comparative_expr34 =null;

		HokenNode AND33_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:126:5: ( logical_comparative_expr ( AND ^ logical_comparative_expr )* )
			// src\\hoken\\parser\\Hoken.g:126:9: logical_comparative_expr ( AND ^ logical_comparative_expr )*
			{
			root_0 = (HokenNode)adaptor.nil();


			pushFollow(FOLLOW_logical_comparative_expr_in_logical_and_expr808);
			logical_comparative_expr32=logical_comparative_expr();
			state._fsp--;

			adaptor.addChild(root_0, logical_comparative_expr32.getTree());

			// src\\hoken\\parser\\Hoken.g:126:34: ( AND ^ logical_comparative_expr )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:126:35: AND ^ logical_comparative_expr
					{
					AND33=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expr811); 
					AND33_tree = new ExpressionNode(AND33) ;
					root_0 = (HokenNode)adaptor.becomeRoot(AND33_tree, root_0);

					pushFollow(FOLLOW_logical_comparative_expr_in_logical_and_expr817);
					logical_comparative_expr34=logical_comparative_expr();
					state._fsp--;

					adaptor.addChild(root_0, logical_comparative_expr34.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_and_expr"


	public static class logical_comparative_expr_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "logical_comparative_expr"
	// src\\hoken\\parser\\Hoken.g:129:1: logical_comparative_expr : additive_expr ( ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr )* ;
	public final HokenParser.logical_comparative_expr_return logical_comparative_expr() throws RecognitionException {
		HokenParser.logical_comparative_expr_return retval = new HokenParser.logical_comparative_expr_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token LT36=null;
		Token LTE37=null;
		Token GTE38=null;
		Token GT39=null;
		Token EQ40=null;
		Token NEQ41=null;
		ParserRuleReturnScope additive_expr35 =null;
		ParserRuleReturnScope additive_expr42 =null;

		HokenNode LT36_tree=null;
		HokenNode LTE37_tree=null;
		HokenNode GTE38_tree=null;
		HokenNode GT39_tree=null;
		HokenNode EQ40_tree=null;
		HokenNode NEQ41_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:130:5: ( additive_expr ( ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr )* )
			// src\\hoken\\parser\\Hoken.g:130:9: additive_expr ( ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr )*
			{
			root_0 = (HokenNode)adaptor.nil();


			pushFollow(FOLLOW_additive_expr_in_logical_comparative_expr838);
			additive_expr35=additive_expr();
			state._fsp--;

			adaptor.addChild(root_0, additive_expr35.getTree());

			// src\\hoken\\parser\\Hoken.g:131:9: ( ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==EQ||(LA8_0 >= GT && LA8_0 <= GTE)||(LA8_0 >= LT && LA8_0 <= LTE)||LA8_0==NEQ) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:132:13: ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr
					{
					// src\\hoken\\parser\\Hoken.g:132:13: ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^)
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
					case GTE:
						{
						alt7=3;
						}
						break;
					case GT:
						{
						alt7=4;
						}
						break;
					case EQ:
						{
						alt7=5;
						}
						break;
					case NEQ:
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
							// src\\hoken\\parser\\Hoken.g:132:15: LT ^
							{
							LT36=(Token)match(input,LT,FOLLOW_LT_in_logical_comparative_expr864); 
							LT36_tree = new ExpressionNode(LT36) ;
							root_0 = (HokenNode)adaptor.becomeRoot(LT36_tree, root_0);

							}
							break;
						case 2 :
							// src\\hoken\\parser\\Hoken.g:133:15: LTE ^
							{
							LTE37=(Token)match(input,LTE,FOLLOW_LTE_in_logical_comparative_expr885); 
							LTE37_tree = new ExpressionNode(LTE37) ;
							root_0 = (HokenNode)adaptor.becomeRoot(LTE37_tree, root_0);

							}
							break;
						case 3 :
							// src\\hoken\\parser\\Hoken.g:134:15: GTE ^
							{
							GTE38=(Token)match(input,GTE,FOLLOW_GTE_in_logical_comparative_expr905); 
							GTE38_tree = new ExpressionNode(GTE38) ;
							root_0 = (HokenNode)adaptor.becomeRoot(GTE38_tree, root_0);

							}
							break;
						case 4 :
							// src\\hoken\\parser\\Hoken.g:135:15: GT ^
							{
							GT39=(Token)match(input,GT,FOLLOW_GT_in_logical_comparative_expr925); 
							GT39_tree = new ExpressionNode(GT39) ;
							root_0 = (HokenNode)adaptor.becomeRoot(GT39_tree, root_0);

							}
							break;
						case 5 :
							// src\\hoken\\parser\\Hoken.g:136:15: EQ ^
							{
							EQ40=(Token)match(input,EQ,FOLLOW_EQ_in_logical_comparative_expr946); 
							EQ40_tree = new ExpressionNode(EQ40) ;
							root_0 = (HokenNode)adaptor.becomeRoot(EQ40_tree, root_0);

							}
							break;
						case 6 :
							// src\\hoken\\parser\\Hoken.g:137:15: NEQ ^
							{
							NEQ41=(Token)match(input,NEQ,FOLLOW_NEQ_in_logical_comparative_expr967); 
							NEQ41_tree = new ExpressionNode(NEQ41) ;
							root_0 = (HokenNode)adaptor.becomeRoot(NEQ41_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_additive_expr_in_logical_comparative_expr995);
					additive_expr42=additive_expr();
					state._fsp--;

					adaptor.addChild(root_0, additive_expr42.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_comparative_expr"


	public static class additive_expr_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "additive_expr"
	// src\\hoken\\parser\\Hoken.g:142:1: additive_expr : multiplicative_expr ( ( PLUS ^| MINUS ^) multiplicative_expr )* ;
	public final HokenParser.additive_expr_return additive_expr() throws RecognitionException {
		HokenParser.additive_expr_return retval = new HokenParser.additive_expr_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token PLUS44=null;
		Token MINUS45=null;
		ParserRuleReturnScope multiplicative_expr43 =null;
		ParserRuleReturnScope multiplicative_expr46 =null;

		HokenNode PLUS44_tree=null;
		HokenNode MINUS45_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:143:5: ( multiplicative_expr ( ( PLUS ^| MINUS ^) multiplicative_expr )* )
			// src\\hoken\\parser\\Hoken.g:143:9: multiplicative_expr ( ( PLUS ^| MINUS ^) multiplicative_expr )*
			{
			root_0 = (HokenNode)adaptor.nil();


			pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1016);
			multiplicative_expr43=multiplicative_expr();
			state._fsp--;

			adaptor.addChild(root_0, multiplicative_expr43.getTree());

			// src\\hoken\\parser\\Hoken.g:144:9: ( ( PLUS ^| MINUS ^) multiplicative_expr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:145:13: ( PLUS ^| MINUS ^) multiplicative_expr
					{
					// src\\hoken\\parser\\Hoken.g:145:13: ( PLUS ^| MINUS ^)
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
							// src\\hoken\\parser\\Hoken.g:145:15: PLUS ^
							{
							PLUS44=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expr1042); 
							PLUS44_tree = new ExpressionNode(PLUS44) ;
							root_0 = (HokenNode)adaptor.becomeRoot(PLUS44_tree, root_0);

							}
							break;
						case 2 :
							// src\\hoken\\parser\\Hoken.g:146:15: MINUS ^
							{
							MINUS45=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expr1063); 
							MINUS45_tree = new ExpressionNode(MINUS45) ;
							root_0 = (HokenNode)adaptor.becomeRoot(MINUS45_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1091);
					multiplicative_expr46=multiplicative_expr();
					state._fsp--;

					adaptor.addChild(root_0, multiplicative_expr46.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_expr"


	public static class multiplicative_expr_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_expr"
	// src\\hoken\\parser\\Hoken.g:151:1: multiplicative_expr : unary_expr ( ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr )* ;
	public final HokenParser.multiplicative_expr_return multiplicative_expr() throws RecognitionException {
		HokenParser.multiplicative_expr_return retval = new HokenParser.multiplicative_expr_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token TIMES48=null;
		Token DIVIDE49=null;
		Token MODULO50=null;
		ParserRuleReturnScope unary_expr47 =null;
		ParserRuleReturnScope unary_expr51 =null;

		HokenNode TIMES48_tree=null;
		HokenNode DIVIDE49_tree=null;
		HokenNode MODULO50_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:152:5: ( unary_expr ( ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr )* )
			// src\\hoken\\parser\\Hoken.g:152:9: unary_expr ( ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr )*
			{
			root_0 = (HokenNode)adaptor.nil();


			pushFollow(FOLLOW_unary_expr_in_multiplicative_expr1112);
			unary_expr47=unary_expr();
			state._fsp--;

			adaptor.addChild(root_0, unary_expr47.getTree());

			// src\\hoken\\parser\\Hoken.g:153:9: ( ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==DIVIDE||LA12_0==MODULO||LA12_0==TIMES) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:154:13: ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr
					{
					// src\\hoken\\parser\\Hoken.g:154:13: ( TIMES ^| DIVIDE ^| MODULO ^)
					int alt11=3;
					switch ( input.LA(1) ) {
					case TIMES:
						{
						alt11=1;
						}
						break;
					case DIVIDE:
						{
						alt11=2;
						}
						break;
					case MODULO:
						{
						alt11=3;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}
					switch (alt11) {
						case 1 :
							// src\\hoken\\parser\\Hoken.g:154:15: TIMES ^
							{
							TIMES48=(Token)match(input,TIMES,FOLLOW_TIMES_in_multiplicative_expr1138); 
							TIMES48_tree = new ExpressionNode(TIMES48) ;
							root_0 = (HokenNode)adaptor.becomeRoot(TIMES48_tree, root_0);

							}
							break;
						case 2 :
							// src\\hoken\\parser\\Hoken.g:155:15: DIVIDE ^
							{
							DIVIDE49=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expr1159); 
							DIVIDE49_tree = new ExpressionNode(DIVIDE49) ;
							root_0 = (HokenNode)adaptor.becomeRoot(DIVIDE49_tree, root_0);

							}
							break;
						case 3 :
							// src\\hoken\\parser\\Hoken.g:156:15: MODULO ^
							{
							MODULO50=(Token)match(input,MODULO,FOLLOW_MODULO_in_multiplicative_expr1179); 
							MODULO50_tree = new ExpressionNode(MODULO50) ;
							root_0 = (HokenNode)adaptor.becomeRoot(MODULO50_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_expr_in_multiplicative_expr1195);
					unary_expr51=unary_expr();
					state._fsp--;

					adaptor.addChild(root_0, unary_expr51.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative_expr"


	public static class unary_expr_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "unary_expr"
	// src\\hoken\\parser\\Hoken.g:160:1: unary_expr : ( PLUS ^| MINUS ^| NOT ^)? operand ;
	public final HokenParser.unary_expr_return unary_expr() throws RecognitionException {
		HokenParser.unary_expr_return retval = new HokenParser.unary_expr_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token PLUS52=null;
		Token MINUS53=null;
		Token NOT54=null;
		ParserRuleReturnScope operand55 =null;

		HokenNode PLUS52_tree=null;
		HokenNode MINUS53_tree=null;
		HokenNode NOT54_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:161:5: ( ( PLUS ^| MINUS ^| NOT ^)? operand )
			// src\\hoken\\parser\\Hoken.g:161:9: ( PLUS ^| MINUS ^| NOT ^)? operand
			{
			root_0 = (HokenNode)adaptor.nil();


			// src\\hoken\\parser\\Hoken.g:161:9: ( PLUS ^| MINUS ^| NOT ^)?
			int alt13=4;
			switch ( input.LA(1) ) {
				case PLUS:
					{
					alt13=1;
					}
					break;
				case MINUS:
					{
					alt13=2;
					}
					break;
				case NOT:
					{
					alt13=3;
					}
					break;
			}
			switch (alt13) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:161:11: PLUS ^
					{
					PLUS52=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expr1218); 
					PLUS52_tree = new ExpressionNode(PLUS52) ;
					root_0 = (HokenNode)adaptor.becomeRoot(PLUS52_tree, root_0);

					}
					break;
				case 2 :
					// src\\hoken\\parser\\Hoken.g:162:11: MINUS ^
					{
					MINUS53=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expr1234); 
					MINUS53_tree = new ExpressionNode(MINUS53) ;
					root_0 = (HokenNode)adaptor.becomeRoot(MINUS53_tree, root_0);

					}
					break;
				case 3 :
					// src\\hoken\\parser\\Hoken.g:163:11: NOT ^
					{
					NOT54=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr1250); 
					NOT54_tree = new ExpressionNode(NOT54) ;
					root_0 = (HokenNode)adaptor.becomeRoot(NOT54_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_unary_expr1267);
			operand55=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand55.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_expr"


	public static class operand_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// src\\hoken\\parser\\Hoken.g:167:1: operand : ( ID | value | read_stat | write_stat | compound_stat | LPAREN ! expr RPAREN !);
	public final HokenParser.operand_return operand() throws RecognitionException {
		HokenParser.operand_return retval = new HokenParser.operand_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token ID56=null;
		Token LPAREN61=null;
		Token RPAREN63=null;
		ParserRuleReturnScope value57 =null;
		ParserRuleReturnScope read_stat58 =null;
		ParserRuleReturnScope write_stat59 =null;
		ParserRuleReturnScope compound_stat60 =null;
		ParserRuleReturnScope expr62 =null;

		HokenNode ID56_tree=null;
		HokenNode LPAREN61_tree=null;
		HokenNode RPAREN63_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:168:5: ( ID | value | read_stat | write_stat | compound_stat | LPAREN ! expr RPAREN !)
			int alt14=6;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt14=1;
				}
				break;
			case CHAR:
			case FALSE:
			case INT:
			case TRUE:
				{
				alt14=2;
				}
				break;
			case READ:
				{
				alt14=3;
				}
				break;
			case WRITE:
				{
				alt14=4;
				}
				break;
			case LCURLY:
				{
				alt14=5;
				}
				break;
			case LPAREN:
				{
				alt14=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:168:9: ID
					{
					root_0 = (HokenNode)adaptor.nil();


					ID56=(Token)match(input,ID,FOLLOW_ID_in_operand1286); 
					ID56_tree = new IdNode(ID56) ;
					adaptor.addChild(root_0, ID56_tree);

					}
					break;
				case 2 :
					// src\\hoken\\parser\\Hoken.g:169:9: value
					{
					root_0 = (HokenNode)adaptor.nil();


					pushFollow(FOLLOW_value_in_operand1299);
					value57=value();
					state._fsp--;

					adaptor.addChild(root_0, value57.getTree());

					}
					break;
				case 3 :
					// src\\hoken\\parser\\Hoken.g:170:9: read_stat
					{
					root_0 = (HokenNode)adaptor.nil();


					pushFollow(FOLLOW_read_stat_in_operand1309);
					read_stat58=read_stat();
					state._fsp--;

					adaptor.addChild(root_0, read_stat58.getTree());

					}
					break;
				case 4 :
					// src\\hoken\\parser\\Hoken.g:171:9: write_stat
					{
					root_0 = (HokenNode)adaptor.nil();


					pushFollow(FOLLOW_write_stat_in_operand1319);
					write_stat59=write_stat();
					state._fsp--;

					adaptor.addChild(root_0, write_stat59.getTree());

					}
					break;
				case 5 :
					// src\\hoken\\parser\\Hoken.g:172:9: compound_stat
					{
					root_0 = (HokenNode)adaptor.nil();


					pushFollow(FOLLOW_compound_stat_in_operand1329);
					compound_stat60=compound_stat();
					state._fsp--;

					adaptor.addChild(root_0, compound_stat60.getTree());

					}
					break;
				case 6 :
					// src\\hoken\\parser\\Hoken.g:173:9: LPAREN ! expr RPAREN !
					{
					root_0 = (HokenNode)adaptor.nil();


					LPAREN61=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1339); 
					pushFollow(FOLLOW_expr_in_operand1342);
					expr62=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr62.getTree());

					RPAREN63=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1344); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class id_list_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "id_list"
	// src\\hoken\\parser\\Hoken.g:179:1: id_list : ID ( COMMA ! ID )* ;
	public final HokenParser.id_list_return id_list() throws RecognitionException {
		HokenParser.id_list_return retval = new HokenParser.id_list_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token ID64=null;
		Token COMMA65=null;
		Token ID66=null;

		HokenNode ID64_tree=null;
		HokenNode COMMA65_tree=null;
		HokenNode ID66_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:180:5: ( ID ( COMMA ! ID )* )
			// src\\hoken\\parser\\Hoken.g:180:9: ID ( COMMA ! ID )*
			{
			root_0 = (HokenNode)adaptor.nil();


			ID64=(Token)match(input,ID,FOLLOW_ID_in_id_list1367); 
			ID64_tree = new IdNode(ID64) ;
			adaptor.addChild(root_0, ID64_tree);

			// src\\hoken\\parser\\Hoken.g:180:20: ( COMMA ! ID )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:180:21: COMMA ! ID
					{
					COMMA65=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list1373); 
					ID66=(Token)match(input,ID,FOLLOW_ID_in_id_list1376); 
					ID66_tree = new IdNode(ID66) ;
					adaptor.addChild(root_0, ID66_tree);

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id_list"


	public static class expr_list_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// src\\hoken\\parser\\Hoken.g:183:1: expr_list : expr ( COMMA ! expr )* ;
	public final HokenParser.expr_list_return expr_list() throws RecognitionException {
		HokenParser.expr_list_return retval = new HokenParser.expr_list_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token COMMA68=null;
		ParserRuleReturnScope expr67 =null;
		ParserRuleReturnScope expr69 =null;

		HokenNode COMMA68_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:184:5: ( expr ( COMMA ! expr )* )
			// src\\hoken\\parser\\Hoken.g:184:9: expr ( COMMA ! expr )*
			{
			root_0 = (HokenNode)adaptor.nil();


			pushFollow(FOLLOW_expr_in_expr_list1400);
			expr67=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr67.getTree());

			// src\\hoken\\parser\\Hoken.g:184:14: ( COMMA ! expr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:184:15: COMMA ! expr
					{
					COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list1403); 
					pushFollow(FOLLOW_expr_in_expr_list1406);
					expr69=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr69.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_list"


	public static class value_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "value"
	// src\\hoken\\parser\\Hoken.g:190:1: value : ( CHAR | INT | bool );
	public final HokenParser.value_return value() throws RecognitionException {
		HokenParser.value_return retval = new HokenParser.value_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token CHAR70=null;
		Token INT71=null;
		ParserRuleReturnScope bool72 =null;

		HokenNode CHAR70_tree=null;
		HokenNode INT71_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:191:5: ( CHAR | INT | bool )
			int alt17=3;
			switch ( input.LA(1) ) {
			case CHAR:
				{
				alt17=1;
				}
				break;
			case INT:
				{
				alt17=2;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt17=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:191:9: CHAR
					{
					root_0 = (HokenNode)adaptor.nil();


					CHAR70=(Token)match(input,CHAR,FOLLOW_CHAR_in_value1430); 
					CHAR70_tree = (HokenNode)adaptor.create(CHAR70);
					adaptor.addChild(root_0, CHAR70_tree);

					}
					break;
				case 2 :
					// src\\hoken\\parser\\Hoken.g:192:9: INT
					{
					root_0 = (HokenNode)adaptor.nil();


					INT71=(Token)match(input,INT,FOLLOW_INT_in_value1440); 
					INT71_tree = (HokenNode)adaptor.create(INT71);
					adaptor.addChild(root_0, INT71_tree);

					}
					break;
				case 3 :
					// src\\hoken\\parser\\Hoken.g:193:9: bool
					{
					root_0 = (HokenNode)adaptor.nil();


					pushFollow(FOLLOW_bool_in_value1450);
					bool72=bool();
					state._fsp--;

					adaptor.addChild(root_0, bool72.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class type_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "type"
	// src\\hoken\\parser\\Hoken.g:196:1: type : ( INTEGER | BOOLEAN | CHARACTER );
	public final HokenParser.type_return type() throws RecognitionException {
		HokenParser.type_return retval = new HokenParser.type_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token set73=null;

		HokenNode set73_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:196:5: ( INTEGER | BOOLEAN | CHARACTER )
			// src\\hoken\\parser\\Hoken.g:
			{
			root_0 = (HokenNode)adaptor.nil();


			set73=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHARACTER||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (HokenNode)adaptor.create(set73));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class bool_return extends ParserRuleReturnScope {
		HokenNode tree;
		@Override
		public HokenNode getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// src\\hoken\\parser\\Hoken.g:210:1: bool : ( TRUE | FALSE );
	public final HokenParser.bool_return bool() throws RecognitionException {
		HokenParser.bool_return retval = new HokenParser.bool_return();
		retval.start = input.LT(1);

		HokenNode root_0 = null;

		Token set74=null;

		HokenNode set74_tree=null;

		try {
			// src\\hoken\\parser\\Hoken.g:210:5: ( TRUE | FALSE )
			// src\\hoken\\parser\\Hoken.g:
			{
			root_0 = (HokenNode)adaptor.nil();


			set74=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				adaptor.addChild(root_0, (HokenNode)adaptor.create(set74));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (HokenNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (HokenNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool"

	// Delegated rules



	public static final BitSet FOLLOW_statements_in_program487 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements525 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements527 = new BitSet(new long[]{0x0000122525E421C2L});
	public static final BitSet FOLLOW_decl_in_statement549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_decl573 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_id_list_in_decl575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_decl606 = new BitSet(new long[]{0x0000000000800140L});
	public static final BitSet FOLLOW_type_in_decl612 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_id_list_in_decl614 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EQUALS_in_decl616 = new BitSet(new long[]{0x0000020000440080L});
	public static final BitSet FOLLOW_value_in_decl619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expr637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expr_in_assignment_expr656 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment_expr659 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_stat683 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_stat686 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_id_list_in_read_stat689 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read_stat691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WRITE_in_write_stat711 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_write_stat714 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_expr_list_in_write_stat717 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RPAREN_in_write_stat719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_compound_stat739 = new BitSet(new long[]{0x0000123525E421C0L});
	public static final BitSet FOLLOW_statements_in_compound_stat741 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RCURLY_in_compound_stat743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr778 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_OR_in_logical_or_expr781 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr787 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_logical_comparative_expr_in_logical_and_expr808 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_logical_and_expr811 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_logical_comparative_expr_in_logical_and_expr817 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_additive_expr_in_logical_comparative_expr838 = new BitSet(new long[]{0x0000000098190002L});
	public static final BitSet FOLLOW_LT_in_logical_comparative_expr864 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_LTE_in_logical_comparative_expr885 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_GTE_in_logical_comparative_expr905 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_GT_in_logical_comparative_expr925 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_EQ_in_logical_comparative_expr946 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_NEQ_in_logical_comparative_expr967 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_additive_expr_in_logical_comparative_expr995 = new BitSet(new long[]{0x0000000098190002L});
	public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1016 = new BitSet(new long[]{0x0000000420000002L});
	public static final BitSet FOLLOW_PLUS_in_additive_expr1042 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_MINUS_in_additive_expr1063 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1091 = new BitSet(new long[]{0x0000000420000002L});
	public static final BitSet FOLLOW_unary_expr_in_multiplicative_expr1112 = new BitSet(new long[]{0x0000010040008002L});
	public static final BitSet FOLLOW_TIMES_in_multiplicative_expr1138 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expr1159 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_MODULO_in_multiplicative_expr1179 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_unary_expr_in_multiplicative_expr1195 = new BitSet(new long[]{0x0000010040008002L});
	public static final BitSet FOLLOW_PLUS_in_unary_expr1218 = new BitSet(new long[]{0x0000122005640080L});
	public static final BitSet FOLLOW_MINUS_in_unary_expr1234 = new BitSet(new long[]{0x0000122005640080L});
	public static final BitSet FOLLOW_NOT_in_unary_expr1250 = new BitSet(new long[]{0x0000122005640080L});
	public static final BitSet FOLLOW_operand_in_unary_expr1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_operand1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_operand1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_stat_in_operand1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_write_stat_in_operand1319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_stat_in_operand1329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1339 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_expr_in_operand1342 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list1367 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_id_list1373 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_id_list1376 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expr_in_expr_list1400 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_expr_list1403 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_expr_in_expr_list1406 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_CHAR_in_value1430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_value1440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_value1450 = new BitSet(new long[]{0x0000000000000002L});
}

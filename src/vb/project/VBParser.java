// $ANTLR 3.5.2 ..\\src\\vb\\project\\VB.g 2014-07-02 13:52:52

package vb.project;
import vb.project.nodes.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class VBParser extends Parser {
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


	public VBParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public VBParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return VBParser.tokenNames; }
	@Override public String getGrammarFileName() { return "..\\src\\vb\\project\\VB.g"; }


	public static class program_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "program"
	// ..\\src\\vb\\project\\VB.g:66:1: program : statements EOF -> ^( PROGRAM statements ) ;
	public final VBParser.program_return program() throws RecognitionException {
		VBParser.program_return retval = new VBParser.program_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope statements1 =null;

		VBNode EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");

		try {
			// ..\\src\\vb\\project\\VB.g:67:5: ( statements EOF -> ^( PROGRAM statements ) )
			// ..\\src\\vb\\project\\VB.g:67:9: statements EOF
			{
			pushFollow(FOLLOW_statements_in_program482);
			statements1=statements();
			state._fsp--;

			stream_statements.add(statements1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program484);  
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

			root_0 = (VBNode)adaptor.nil();
			// 68:9: -> ^( PROGRAM statements )
			{
				// ..\\src\\vb\\project\\VB.g:68:12: ^( PROGRAM statements )
				{
				VBNode root_1 = (VBNode)adaptor.nil();
				root_1 = (VBNode)adaptor.becomeRoot((VBNode)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_statements.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statements_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// ..\\src\\vb\\project\\VB.g:71:1: statements : ( statement SEMICOLON !)* ;
	public final VBParser.statements_return statements() throws RecognitionException {
		VBParser.statements_return retval = new VBParser.statements_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token SEMICOLON4=null;
		ParserRuleReturnScope statement3 =null;

		VBNode SEMICOLON4_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:72:5: ( ( statement SEMICOLON !)* )
			// ..\\src\\vb\\project\\VB.g:72:9: ( statement SEMICOLON !)*
			{
			root_0 = (VBNode)adaptor.nil();


			// ..\\src\\vb\\project\\VB.g:72:9: ( statement SEMICOLON !)*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CHAR||LA1_0==CONST||LA1_0==FALSE||(LA1_0 >= ID && LA1_0 <= INT)||LA1_0==LCURLY||LA1_0==LPAREN||LA1_0==MINUS||LA1_0==NOT||LA1_0==PLUS||LA1_0==READ||LA1_0==TRUE||(LA1_0 >= VAR && LA1_0 <= WRITE)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:72:10: statement SEMICOLON !
					{
					pushFollow(FOLLOW_statement_in_statements520);
					statement3=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement3.getTree());

					SEMICOLON4=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements522); 
					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statement_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// ..\\src\\vb\\project\\VB.g:75:1: statement : ( decl | expr );
	public final VBParser.statement_return statement() throws RecognitionException {
		VBParser.statement_return retval = new VBParser.statement_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		ParserRuleReturnScope decl5 =null;
		ParserRuleReturnScope expr6 =null;


		try {
			// ..\\src\\vb\\project\\VB.g:76:5: ( decl | expr )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==CONST||LA2_0==VAR) ) {
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
					// ..\\src\\vb\\project\\VB.g:76:9: decl
					{
					root_0 = (VBNode)adaptor.nil();


					pushFollow(FOLLOW_decl_in_statement544);
					decl5=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl5.getTree());

					}
					break;
				case 2 :
					// ..\\src\\vb\\project\\VB.g:77:9: expr
					{
					root_0 = (VBNode)adaptor.nil();


					pushFollow(FOLLOW_expr_in_statement554);
					expr6=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr6.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class decl_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// ..\\src\\vb\\project\\VB.g:80:1: decl : ( VAR ^ type id_list | CONST ^ type id_list EQUALS ! value );
	public final VBParser.decl_return decl() throws RecognitionException {
		VBParser.decl_return retval = new VBParser.decl_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token VAR7=null;
		Token CONST10=null;
		Token EQUALS13=null;
		ParserRuleReturnScope type8 =null;
		ParserRuleReturnScope id_list9 =null;
		ParserRuleReturnScope type11 =null;
		ParserRuleReturnScope id_list12 =null;
		ParserRuleReturnScope value14 =null;

		VBNode VAR7_tree=null;
		VBNode CONST10_tree=null;
		VBNode EQUALS13_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:80:5: ( VAR ^ type id_list | CONST ^ type id_list EQUALS ! value )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==VAR) ) {
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
					// ..\\src\\vb\\project\\VB.g:80:9: VAR ^ type id_list
					{
					root_0 = (VBNode)adaptor.nil();


					VAR7=(Token)match(input,VAR,FOLLOW_VAR_in_decl568); 
					VAR7_tree = new DeclarationNode(VAR7) ;
					root_0 = (VBNode)adaptor.becomeRoot(VAR7_tree, root_0);

					pushFollow(FOLLOW_type_in_decl574);
					type8=type();
					state._fsp--;

					adaptor.addChild(root_0, type8.getTree());

					pushFollow(FOLLOW_id_list_in_decl576);
					id_list9=id_list();
					state._fsp--;

					adaptor.addChild(root_0, id_list9.getTree());

					}
					break;
				case 2 :
					// ..\\src\\vb\\project\\VB.g:81:9: CONST ^ type id_list EQUALS ! value
					{
					root_0 = (VBNode)adaptor.nil();


					CONST10=(Token)match(input,CONST,FOLLOW_CONST_in_decl586); 
					CONST10_tree = new DeclarationNode(CONST10) ;
					root_0 = (VBNode)adaptor.becomeRoot(CONST10_tree, root_0);

					pushFollow(FOLLOW_type_in_decl592);
					type11=type();
					state._fsp--;

					adaptor.addChild(root_0, type11.getTree());

					pushFollow(FOLLOW_id_list_in_decl594);
					id_list12=id_list();
					state._fsp--;

					adaptor.addChild(root_0, id_list12.getTree());

					EQUALS13=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_decl596); 
					pushFollow(FOLLOW_value_in_decl599);
					value14=value();
					state._fsp--;

					adaptor.addChild(root_0, value14.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "decl"


	public static class expr_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// ..\\src\\vb\\project\\VB.g:84:1: expr : assignment_expr ;
	public final VBParser.expr_return expr() throws RecognitionException {
		VBParser.expr_return retval = new VBParser.expr_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		ParserRuleReturnScope assignment_expr15 =null;


		try {
			// ..\\src\\vb\\project\\VB.g:84:5: ( assignment_expr )
			// ..\\src\\vb\\project\\VB.g:84:9: assignment_expr
			{
			root_0 = (VBNode)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_expr617);
			assignment_expr15=assignment_expr();
			state._fsp--;

			adaptor.addChild(root_0, assignment_expr15.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class assignment_expr_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "assignment_expr"
	// ..\\src\\vb\\project\\VB.g:87:1: assignment_expr : logical_or_expr ( ASSIGN ^ assignment_expr )? ;
	public final VBParser.assignment_expr_return assignment_expr() throws RecognitionException {
		VBParser.assignment_expr_return retval = new VBParser.assignment_expr_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token ASSIGN17=null;
		ParserRuleReturnScope logical_or_expr16 =null;
		ParserRuleReturnScope assignment_expr18 =null;

		VBNode ASSIGN17_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:88:5: ( logical_or_expr ( ASSIGN ^ assignment_expr )? )
			// ..\\src\\vb\\project\\VB.g:88:9: logical_or_expr ( ASSIGN ^ assignment_expr )?
			{
			root_0 = (VBNode)adaptor.nil();


			pushFollow(FOLLOW_logical_or_expr_in_assignment_expr636);
			logical_or_expr16=logical_or_expr();
			state._fsp--;

			adaptor.addChild(root_0, logical_or_expr16.getTree());

			// ..\\src\\vb\\project\\VB.g:88:25: ( ASSIGN ^ assignment_expr )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ASSIGN) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:88:26: ASSIGN ^ assignment_expr
					{
					ASSIGN17=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expr639); 
					ASSIGN17_tree = (VBNode)adaptor.create(ASSIGN17);
					root_0 = (VBNode)adaptor.becomeRoot(ASSIGN17_tree, root_0);

					pushFollow(FOLLOW_assignment_expr_in_assignment_expr642);
					assignment_expr18=assignment_expr();
					state._fsp--;

					adaptor.addChild(root_0, assignment_expr18.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_expr"


	public static class read_stat_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "read_stat"
	// ..\\src\\vb\\project\\VB.g:91:1: read_stat : READ ^ LPAREN ! id_list RPAREN !;
	public final VBParser.read_stat_return read_stat() throws RecognitionException {
		VBParser.read_stat_return retval = new VBParser.read_stat_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token READ19=null;
		Token LPAREN20=null;
		Token RPAREN22=null;
		ParserRuleReturnScope id_list21 =null;

		VBNode READ19_tree=null;
		VBNode LPAREN20_tree=null;
		VBNode RPAREN22_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:92:5: ( READ ^ LPAREN ! id_list RPAREN !)
			// ..\\src\\vb\\project\\VB.g:92:9: READ ^ LPAREN ! id_list RPAREN !
			{
			root_0 = (VBNode)adaptor.nil();


			READ19=(Token)match(input,READ,FOLLOW_READ_in_read_stat663); 
			READ19_tree = (VBNode)adaptor.create(READ19);
			root_0 = (VBNode)adaptor.becomeRoot(READ19_tree, root_0);

			LPAREN20=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_read_stat666); 
			pushFollow(FOLLOW_id_list_in_read_stat669);
			id_list21=id_list();
			state._fsp--;

			adaptor.addChild(root_0, id_list21.getTree());

			RPAREN22=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_read_stat671); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "read_stat"


	public static class write_stat_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "write_stat"
	// ..\\src\\vb\\project\\VB.g:95:1: write_stat : WRITE ^ LPAREN ! expr_list RPAREN !;
	public final VBParser.write_stat_return write_stat() throws RecognitionException {
		VBParser.write_stat_return retval = new VBParser.write_stat_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token WRITE23=null;
		Token LPAREN24=null;
		Token RPAREN26=null;
		ParserRuleReturnScope expr_list25 =null;

		VBNode WRITE23_tree=null;
		VBNode LPAREN24_tree=null;
		VBNode RPAREN26_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:96:5: ( WRITE ^ LPAREN ! expr_list RPAREN !)
			// ..\\src\\vb\\project\\VB.g:96:9: WRITE ^ LPAREN ! expr_list RPAREN !
			{
			root_0 = (VBNode)adaptor.nil();


			WRITE23=(Token)match(input,WRITE,FOLLOW_WRITE_in_write_stat691); 
			WRITE23_tree = (VBNode)adaptor.create(WRITE23);
			root_0 = (VBNode)adaptor.becomeRoot(WRITE23_tree, root_0);

			LPAREN24=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_write_stat694); 
			pushFollow(FOLLOW_expr_list_in_write_stat697);
			expr_list25=expr_list();
			state._fsp--;

			adaptor.addChild(root_0, expr_list25.getTree());

			RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_write_stat699); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "write_stat"


	public static class compound_stat_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "compound_stat"
	// ..\\src\\vb\\project\\VB.g:99:1: compound_stat : LCURLY statements RCURLY -> ^( COMPOUND statements ) ;
	public final VBParser.compound_stat_return compound_stat() throws RecognitionException {
		VBParser.compound_stat_return retval = new VBParser.compound_stat_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token LCURLY27=null;
		Token RCURLY29=null;
		ParserRuleReturnScope statements28 =null;

		VBNode LCURLY27_tree=null;
		VBNode RCURLY29_tree=null;
		RewriteRuleTokenStream stream_LCURLY=new RewriteRuleTokenStream(adaptor,"token LCURLY");
		RewriteRuleTokenStream stream_RCURLY=new RewriteRuleTokenStream(adaptor,"token RCURLY");
		RewriteRuleSubtreeStream stream_statements=new RewriteRuleSubtreeStream(adaptor,"rule statements");

		try {
			// ..\\src\\vb\\project\\VB.g:100:5: ( LCURLY statements RCURLY -> ^( COMPOUND statements ) )
			// ..\\src\\vb\\project\\VB.g:100:9: LCURLY statements RCURLY
			{
			LCURLY27=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_compound_stat719);  
			stream_LCURLY.add(LCURLY27);

			pushFollow(FOLLOW_statements_in_compound_stat721);
			statements28=statements();
			state._fsp--;

			stream_statements.add(statements28.getTree());
			RCURLY29=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_compound_stat723);  
			stream_RCURLY.add(RCURLY29);

			// AST REWRITE
			// elements: statements
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (VBNode)adaptor.nil();
			// 101:9: -> ^( COMPOUND statements )
			{
				// ..\\src\\vb\\project\\VB.g:101:12: ^( COMPOUND statements )
				{
				VBNode root_1 = (VBNode)adaptor.nil();
				root_1 = (VBNode)adaptor.becomeRoot((VBNode)adaptor.create(COMPOUND, "COMPOUND"), root_1);
				adaptor.addChild(root_1, stream_statements.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_stat"


	public static class logical_or_expr_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "logical_or_expr"
	// ..\\src\\vb\\project\\VB.g:104:1: logical_or_expr : logical_and_expr ( OR ^ logical_and_expr )* ;
	public final VBParser.logical_or_expr_return logical_or_expr() throws RecognitionException {
		VBParser.logical_or_expr_return retval = new VBParser.logical_or_expr_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token OR31=null;
		ParserRuleReturnScope logical_and_expr30 =null;
		ParserRuleReturnScope logical_and_expr32 =null;

		VBNode OR31_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:105:5: ( logical_and_expr ( OR ^ logical_and_expr )* )
			// ..\\src\\vb\\project\\VB.g:105:9: logical_and_expr ( OR ^ logical_and_expr )*
			{
			root_0 = (VBNode)adaptor.nil();


			pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr758);
			logical_and_expr30=logical_and_expr();
			state._fsp--;

			adaptor.addChild(root_0, logical_and_expr30.getTree());

			// ..\\src\\vb\\project\\VB.g:105:26: ( OR ^ logical_and_expr )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==OR) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:105:27: OR ^ logical_and_expr
					{
					OR31=(Token)match(input,OR,FOLLOW_OR_in_logical_or_expr761); 
					OR31_tree = new ExpressionNode(OR31) ;
					root_0 = (VBNode)adaptor.becomeRoot(OR31_tree, root_0);

					pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr767);
					logical_and_expr32=logical_and_expr();
					state._fsp--;

					adaptor.addChild(root_0, logical_and_expr32.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_or_expr"


	public static class logical_and_expr_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "logical_and_expr"
	// ..\\src\\vb\\project\\VB.g:108:1: logical_and_expr : logical_comparative_expr ( AND ^ logical_comparative_expr )* ;
	public final VBParser.logical_and_expr_return logical_and_expr() throws RecognitionException {
		VBParser.logical_and_expr_return retval = new VBParser.logical_and_expr_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token AND34=null;
		ParserRuleReturnScope logical_comparative_expr33 =null;
		ParserRuleReturnScope logical_comparative_expr35 =null;

		VBNode AND34_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:109:5: ( logical_comparative_expr ( AND ^ logical_comparative_expr )* )
			// ..\\src\\vb\\project\\VB.g:109:9: logical_comparative_expr ( AND ^ logical_comparative_expr )*
			{
			root_0 = (VBNode)adaptor.nil();


			pushFollow(FOLLOW_logical_comparative_expr_in_logical_and_expr788);
			logical_comparative_expr33=logical_comparative_expr();
			state._fsp--;

			adaptor.addChild(root_0, logical_comparative_expr33.getTree());

			// ..\\src\\vb\\project\\VB.g:109:34: ( AND ^ logical_comparative_expr )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==AND) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:109:35: AND ^ logical_comparative_expr
					{
					AND34=(Token)match(input,AND,FOLLOW_AND_in_logical_and_expr791); 
					AND34_tree = new ExpressionNode(AND34) ;
					root_0 = (VBNode)adaptor.becomeRoot(AND34_tree, root_0);

					pushFollow(FOLLOW_logical_comparative_expr_in_logical_and_expr797);
					logical_comparative_expr35=logical_comparative_expr();
					state._fsp--;

					adaptor.addChild(root_0, logical_comparative_expr35.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_and_expr"


	public static class logical_comparative_expr_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "logical_comparative_expr"
	// ..\\src\\vb\\project\\VB.g:112:1: logical_comparative_expr : additive_expr ( ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr )* ;
	public final VBParser.logical_comparative_expr_return logical_comparative_expr() throws RecognitionException {
		VBParser.logical_comparative_expr_return retval = new VBParser.logical_comparative_expr_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token LT37=null;
		Token LTE38=null;
		Token GTE39=null;
		Token GT40=null;
		Token EQ41=null;
		Token NEQ42=null;
		ParserRuleReturnScope additive_expr36 =null;
		ParserRuleReturnScope additive_expr43 =null;

		VBNode LT37_tree=null;
		VBNode LTE38_tree=null;
		VBNode GTE39_tree=null;
		VBNode GT40_tree=null;
		VBNode EQ41_tree=null;
		VBNode NEQ42_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:113:5: ( additive_expr ( ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr )* )
			// ..\\src\\vb\\project\\VB.g:113:9: additive_expr ( ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr )*
			{
			root_0 = (VBNode)adaptor.nil();


			pushFollow(FOLLOW_additive_expr_in_logical_comparative_expr818);
			additive_expr36=additive_expr();
			state._fsp--;

			adaptor.addChild(root_0, additive_expr36.getTree());

			// ..\\src\\vb\\project\\VB.g:114:9: ( ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==EQ||(LA8_0 >= GT && LA8_0 <= GTE)||(LA8_0 >= LT && LA8_0 <= LTE)||LA8_0==NEQ) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:115:13: ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^) additive_expr
					{
					// ..\\src\\vb\\project\\VB.g:115:13: ( LT ^| LTE ^| GTE ^| GT ^| EQ ^| NEQ ^)
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
							// ..\\src\\vb\\project\\VB.g:115:15: LT ^
							{
							LT37=(Token)match(input,LT,FOLLOW_LT_in_logical_comparative_expr844); 
							LT37_tree = new ExpressionNode(LT37) ;
							root_0 = (VBNode)adaptor.becomeRoot(LT37_tree, root_0);

							}
							break;
						case 2 :
							// ..\\src\\vb\\project\\VB.g:116:15: LTE ^
							{
							LTE38=(Token)match(input,LTE,FOLLOW_LTE_in_logical_comparative_expr865); 
							LTE38_tree = new ExpressionNode(LTE38) ;
							root_0 = (VBNode)adaptor.becomeRoot(LTE38_tree, root_0);

							}
							break;
						case 3 :
							// ..\\src\\vb\\project\\VB.g:117:15: GTE ^
							{
							GTE39=(Token)match(input,GTE,FOLLOW_GTE_in_logical_comparative_expr885); 
							GTE39_tree = new ExpressionNode(GTE39) ;
							root_0 = (VBNode)adaptor.becomeRoot(GTE39_tree, root_0);

							}
							break;
						case 4 :
							// ..\\src\\vb\\project\\VB.g:118:15: GT ^
							{
							GT40=(Token)match(input,GT,FOLLOW_GT_in_logical_comparative_expr905); 
							GT40_tree = new ExpressionNode(GT40) ;
							root_0 = (VBNode)adaptor.becomeRoot(GT40_tree, root_0);

							}
							break;
						case 5 :
							// ..\\src\\vb\\project\\VB.g:119:15: EQ ^
							{
							EQ41=(Token)match(input,EQ,FOLLOW_EQ_in_logical_comparative_expr926); 
							EQ41_tree = new ExpressionNode(EQ41) ;
							root_0 = (VBNode)adaptor.becomeRoot(EQ41_tree, root_0);

							}
							break;
						case 6 :
							// ..\\src\\vb\\project\\VB.g:120:15: NEQ ^
							{
							NEQ42=(Token)match(input,NEQ,FOLLOW_NEQ_in_logical_comparative_expr947); 
							NEQ42_tree = new ExpressionNode(NEQ42) ;
							root_0 = (VBNode)adaptor.becomeRoot(NEQ42_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_additive_expr_in_logical_comparative_expr975);
					additive_expr43=additive_expr();
					state._fsp--;

					adaptor.addChild(root_0, additive_expr43.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_comparative_expr"


	public static class additive_expr_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "additive_expr"
	// ..\\src\\vb\\project\\VB.g:125:1: additive_expr : multiplicative_expr ( ( PLUS ^| MINUS ^) multiplicative_expr )* ;
	public final VBParser.additive_expr_return additive_expr() throws RecognitionException {
		VBParser.additive_expr_return retval = new VBParser.additive_expr_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token PLUS45=null;
		Token MINUS46=null;
		ParserRuleReturnScope multiplicative_expr44 =null;
		ParserRuleReturnScope multiplicative_expr47 =null;

		VBNode PLUS45_tree=null;
		VBNode MINUS46_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:126:5: ( multiplicative_expr ( ( PLUS ^| MINUS ^) multiplicative_expr )* )
			// ..\\src\\vb\\project\\VB.g:126:9: multiplicative_expr ( ( PLUS ^| MINUS ^) multiplicative_expr )*
			{
			root_0 = (VBNode)adaptor.nil();


			pushFollow(FOLLOW_multiplicative_expr_in_additive_expr996);
			multiplicative_expr44=multiplicative_expr();
			state._fsp--;

			adaptor.addChild(root_0, multiplicative_expr44.getTree());

			// ..\\src\\vb\\project\\VB.g:127:9: ( ( PLUS ^| MINUS ^) multiplicative_expr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==MINUS||LA10_0==PLUS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:128:13: ( PLUS ^| MINUS ^) multiplicative_expr
					{
					// ..\\src\\vb\\project\\VB.g:128:13: ( PLUS ^| MINUS ^)
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
							// ..\\src\\vb\\project\\VB.g:128:15: PLUS ^
							{
							PLUS45=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expr1022); 
							PLUS45_tree = new ExpressionNode(PLUS45) ;
							root_0 = (VBNode)adaptor.becomeRoot(PLUS45_tree, root_0);

							}
							break;
						case 2 :
							// ..\\src\\vb\\project\\VB.g:129:15: MINUS ^
							{
							MINUS46=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expr1043); 
							MINUS46_tree = new ExpressionNode(MINUS46) ;
							root_0 = (VBNode)adaptor.becomeRoot(MINUS46_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_multiplicative_expr_in_additive_expr1071);
					multiplicative_expr47=multiplicative_expr();
					state._fsp--;

					adaptor.addChild(root_0, multiplicative_expr47.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_expr"


	public static class multiplicative_expr_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_expr"
	// ..\\src\\vb\\project\\VB.g:134:1: multiplicative_expr : unary_expr ( ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr )* ;
	public final VBParser.multiplicative_expr_return multiplicative_expr() throws RecognitionException {
		VBParser.multiplicative_expr_return retval = new VBParser.multiplicative_expr_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token TIMES49=null;
		Token DIVIDE50=null;
		Token MODULO51=null;
		ParserRuleReturnScope unary_expr48 =null;
		ParserRuleReturnScope unary_expr52 =null;

		VBNode TIMES49_tree=null;
		VBNode DIVIDE50_tree=null;
		VBNode MODULO51_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:135:5: ( unary_expr ( ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr )* )
			// ..\\src\\vb\\project\\VB.g:135:9: unary_expr ( ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr )*
			{
			root_0 = (VBNode)adaptor.nil();


			pushFollow(FOLLOW_unary_expr_in_multiplicative_expr1092);
			unary_expr48=unary_expr();
			state._fsp--;

			adaptor.addChild(root_0, unary_expr48.getTree());

			// ..\\src\\vb\\project\\VB.g:136:9: ( ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==DIVIDE||LA12_0==MODULO||LA12_0==TIMES) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:137:13: ( TIMES ^| DIVIDE ^| MODULO ^) unary_expr
					{
					// ..\\src\\vb\\project\\VB.g:137:13: ( TIMES ^| DIVIDE ^| MODULO ^)
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
							// ..\\src\\vb\\project\\VB.g:137:15: TIMES ^
							{
							TIMES49=(Token)match(input,TIMES,FOLLOW_TIMES_in_multiplicative_expr1118); 
							TIMES49_tree = new ExpressionNode(TIMES49) ;
							root_0 = (VBNode)adaptor.becomeRoot(TIMES49_tree, root_0);

							}
							break;
						case 2 :
							// ..\\src\\vb\\project\\VB.g:138:15: DIVIDE ^
							{
							DIVIDE50=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplicative_expr1139); 
							DIVIDE50_tree = new ExpressionNode(DIVIDE50) ;
							root_0 = (VBNode)adaptor.becomeRoot(DIVIDE50_tree, root_0);

							}
							break;
						case 3 :
							// ..\\src\\vb\\project\\VB.g:139:15: MODULO ^
							{
							MODULO51=(Token)match(input,MODULO,FOLLOW_MODULO_in_multiplicative_expr1159); 
							MODULO51_tree = new ExpressionNode(MODULO51) ;
							root_0 = (VBNode)adaptor.becomeRoot(MODULO51_tree, root_0);

							}
							break;

					}

					pushFollow(FOLLOW_unary_expr_in_multiplicative_expr1175);
					unary_expr52=unary_expr();
					state._fsp--;

					adaptor.addChild(root_0, unary_expr52.getTree());

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative_expr"


	public static class unary_expr_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "unary_expr"
	// ..\\src\\vb\\project\\VB.g:143:1: unary_expr : ( PLUS ^| MINUS ^| NOT ^)? operand ;
	public final VBParser.unary_expr_return unary_expr() throws RecognitionException {
		VBParser.unary_expr_return retval = new VBParser.unary_expr_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token PLUS53=null;
		Token MINUS54=null;
		Token NOT55=null;
		ParserRuleReturnScope operand56 =null;

		VBNode PLUS53_tree=null;
		VBNode MINUS54_tree=null;
		VBNode NOT55_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:144:5: ( ( PLUS ^| MINUS ^| NOT ^)? operand )
			// ..\\src\\vb\\project\\VB.g:144:9: ( PLUS ^| MINUS ^| NOT ^)? operand
			{
			root_0 = (VBNode)adaptor.nil();


			// ..\\src\\vb\\project\\VB.g:144:9: ( PLUS ^| MINUS ^| NOT ^)?
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
					// ..\\src\\vb\\project\\VB.g:144:11: PLUS ^
					{
					PLUS53=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expr1198); 
					PLUS53_tree = new ExpressionNode(PLUS53) ;
					root_0 = (VBNode)adaptor.becomeRoot(PLUS53_tree, root_0);

					}
					break;
				case 2 :
					// ..\\src\\vb\\project\\VB.g:145:11: MINUS ^
					{
					MINUS54=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary_expr1214); 
					MINUS54_tree = new ExpressionNode(MINUS54) ;
					root_0 = (VBNode)adaptor.becomeRoot(MINUS54_tree, root_0);

					}
					break;
				case 3 :
					// ..\\src\\vb\\project\\VB.g:146:11: NOT ^
					{
					NOT55=(Token)match(input,NOT,FOLLOW_NOT_in_unary_expr1230); 
					NOT55_tree = new ExpressionNode(NOT55) ;
					root_0 = (VBNode)adaptor.becomeRoot(NOT55_tree, root_0);

					}
					break;

			}

			pushFollow(FOLLOW_operand_in_unary_expr1247);
			operand56=operand();
			state._fsp--;

			adaptor.addChild(root_0, operand56.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_expr"


	public static class operand_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// ..\\src\\vb\\project\\VB.g:150:1: operand : ( ID | value | read_stat | write_stat | compound_stat | LPAREN ! expr RPAREN !);
	public final VBParser.operand_return operand() throws RecognitionException {
		VBParser.operand_return retval = new VBParser.operand_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token ID57=null;
		Token LPAREN62=null;
		Token RPAREN64=null;
		ParserRuleReturnScope value58 =null;
		ParserRuleReturnScope read_stat59 =null;
		ParserRuleReturnScope write_stat60 =null;
		ParserRuleReturnScope compound_stat61 =null;
		ParserRuleReturnScope expr63 =null;

		VBNode ID57_tree=null;
		VBNode LPAREN62_tree=null;
		VBNode RPAREN64_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:151:5: ( ID | value | read_stat | write_stat | compound_stat | LPAREN ! expr RPAREN !)
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
					// ..\\src\\vb\\project\\VB.g:151:9: ID
					{
					root_0 = (VBNode)adaptor.nil();


					ID57=(Token)match(input,ID,FOLLOW_ID_in_operand1266); 
					ID57_tree = new IdNode(ID57) ;
					adaptor.addChild(root_0, ID57_tree);

					}
					break;
				case 2 :
					// ..\\src\\vb\\project\\VB.g:152:9: value
					{
					root_0 = (VBNode)adaptor.nil();


					pushFollow(FOLLOW_value_in_operand1279);
					value58=value();
					state._fsp--;

					adaptor.addChild(root_0, value58.getTree());

					}
					break;
				case 3 :
					// ..\\src\\vb\\project\\VB.g:153:9: read_stat
					{
					root_0 = (VBNode)adaptor.nil();


					pushFollow(FOLLOW_read_stat_in_operand1289);
					read_stat59=read_stat();
					state._fsp--;

					adaptor.addChild(root_0, read_stat59.getTree());

					}
					break;
				case 4 :
					// ..\\src\\vb\\project\\VB.g:154:9: write_stat
					{
					root_0 = (VBNode)adaptor.nil();


					pushFollow(FOLLOW_write_stat_in_operand1299);
					write_stat60=write_stat();
					state._fsp--;

					adaptor.addChild(root_0, write_stat60.getTree());

					}
					break;
				case 5 :
					// ..\\src\\vb\\project\\VB.g:155:9: compound_stat
					{
					root_0 = (VBNode)adaptor.nil();


					pushFollow(FOLLOW_compound_stat_in_operand1309);
					compound_stat61=compound_stat();
					state._fsp--;

					adaptor.addChild(root_0, compound_stat61.getTree());

					}
					break;
				case 6 :
					// ..\\src\\vb\\project\\VB.g:156:9: LPAREN ! expr RPAREN !
					{
					root_0 = (VBNode)adaptor.nil();


					LPAREN62=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_operand1319); 
					pushFollow(FOLLOW_expr_in_operand1322);
					expr63=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr63.getTree());

					RPAREN64=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_operand1324); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"


	public static class id_list_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "id_list"
	// ..\\src\\vb\\project\\VB.g:162:1: id_list : ID ( COMMA ! ID )* ;
	public final VBParser.id_list_return id_list() throws RecognitionException {
		VBParser.id_list_return retval = new VBParser.id_list_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token ID65=null;
		Token COMMA66=null;
		Token ID67=null;

		VBNode ID65_tree=null;
		VBNode COMMA66_tree=null;
		VBNode ID67_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:163:5: ( ID ( COMMA ! ID )* )
			// ..\\src\\vb\\project\\VB.g:163:9: ID ( COMMA ! ID )*
			{
			root_0 = (VBNode)adaptor.nil();


			ID65=(Token)match(input,ID,FOLLOW_ID_in_id_list1347); 
			ID65_tree = new IdNode(ID65) ;
			adaptor.addChild(root_0, ID65_tree);

			// ..\\src\\vb\\project\\VB.g:163:20: ( COMMA ! ID )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==COMMA) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:163:21: COMMA ! ID
					{
					COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_id_list1353); 
					ID67=(Token)match(input,ID,FOLLOW_ID_in_id_list1356); 
					ID67_tree = new IdNode(ID67) ;
					adaptor.addChild(root_0, ID67_tree);

					}
					break;

				default :
					break loop15;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "id_list"


	public static class expr_list_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// ..\\src\\vb\\project\\VB.g:166:1: expr_list : expr ( COMMA ! expr )* ;
	public final VBParser.expr_list_return expr_list() throws RecognitionException {
		VBParser.expr_list_return retval = new VBParser.expr_list_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token COMMA69=null;
		ParserRuleReturnScope expr68 =null;
		ParserRuleReturnScope expr70 =null;

		VBNode COMMA69_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:167:5: ( expr ( COMMA ! expr )* )
			// ..\\src\\vb\\project\\VB.g:167:9: expr ( COMMA ! expr )*
			{
			root_0 = (VBNode)adaptor.nil();


			pushFollow(FOLLOW_expr_in_expr_list1380);
			expr68=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr68.getTree());

			// ..\\src\\vb\\project\\VB.g:167:14: ( COMMA ! expr )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==COMMA) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:167:15: COMMA ! expr
					{
					COMMA69=(Token)match(input,COMMA,FOLLOW_COMMA_in_expr_list1383); 
					pushFollow(FOLLOW_expr_in_expr_list1386);
					expr70=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr70.getTree());

					}
					break;

				default :
					break loop16;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_list"


	public static class value_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "value"
	// ..\\src\\vb\\project\\VB.g:173:1: value : ( CHAR | INT | bool );
	public final VBParser.value_return value() throws RecognitionException {
		VBParser.value_return retval = new VBParser.value_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token CHAR71=null;
		Token INT72=null;
		ParserRuleReturnScope bool73 =null;

		VBNode CHAR71_tree=null;
		VBNode INT72_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:174:5: ( CHAR | INT | bool )
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
					// ..\\src\\vb\\project\\VB.g:174:9: CHAR
					{
					root_0 = (VBNode)adaptor.nil();


					CHAR71=(Token)match(input,CHAR,FOLLOW_CHAR_in_value1410); 
					CHAR71_tree = (VBNode)adaptor.create(CHAR71);
					adaptor.addChild(root_0, CHAR71_tree);

					}
					break;
				case 2 :
					// ..\\src\\vb\\project\\VB.g:175:9: INT
					{
					root_0 = (VBNode)adaptor.nil();


					INT72=(Token)match(input,INT,FOLLOW_INT_in_value1420); 
					INT72_tree = (VBNode)adaptor.create(INT72);
					adaptor.addChild(root_0, INT72_tree);

					}
					break;
				case 3 :
					// ..\\src\\vb\\project\\VB.g:176:9: bool
					{
					root_0 = (VBNode)adaptor.nil();


					pushFollow(FOLLOW_bool_in_value1430);
					bool73=bool();
					state._fsp--;

					adaptor.addChild(root_0, bool73.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class type_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "type"
	// ..\\src\\vb\\project\\VB.g:179:1: type : ( INTEGER | BOOLEAN | CHARACTER );
	public final VBParser.type_return type() throws RecognitionException {
		VBParser.type_return retval = new VBParser.type_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token set74=null;

		VBNode set74_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:179:5: ( INTEGER | BOOLEAN | CHARACTER )
			// ..\\src\\vb\\project\\VB.g:
			{
			root_0 = (VBNode)adaptor.nil();


			set74=input.LT(1);
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHARACTER||input.LA(1)==INTEGER ) {
				input.consume();
				adaptor.addChild(root_0, (VBNode)adaptor.create(set74));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class bool_return extends ParserRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// ..\\src\\vb\\project\\VB.g:193:1: bool : ( TRUE | FALSE );
	public final VBParser.bool_return bool() throws RecognitionException {
		VBParser.bool_return retval = new VBParser.bool_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		Token set75=null;

		VBNode set75_tree=null;

		try {
			// ..\\src\\vb\\project\\VB.g:193:5: ( TRUE | FALSE )
			// ..\\src\\vb\\project\\VB.g:
			{
			root_0 = (VBNode)adaptor.nil();


			set75=input.LT(1);
			if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
				input.consume();
				adaptor.addChild(root_0, (VBNode)adaptor.create(set75));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (VBNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool"

	// Delegated rules



	public static final BitSet FOLLOW_statements_in_program482 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements520 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements522 = new BitSet(new long[]{0x00001A2525642082L});
	public static final BitSet FOLLOW_decl_in_statement544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_decl568 = new BitSet(new long[]{0x0000000000800140L});
	public static final BitSet FOLLOW_type_in_decl574 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_id_list_in_decl576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_in_decl586 = new BitSet(new long[]{0x0000000000800140L});
	public static final BitSet FOLLOW_type_in_decl592 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_id_list_in_decl594 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_EQUALS_in_decl596 = new BitSet(new long[]{0x0000020000440080L});
	public static final BitSet FOLLOW_value_in_decl599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expr_in_expr617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expr_in_assignment_expr636 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment_expr639 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_assignment_expr_in_assignment_expr642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_read_stat663 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_read_stat666 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_id_list_in_read_stat669 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RPAREN_in_read_stat671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WRITE_in_write_stat691 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_LPAREN_in_write_stat694 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_expr_list_in_write_stat697 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RPAREN_in_write_stat699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_compound_stat719 = new BitSet(new long[]{0x00001A3525642080L});
	public static final BitSet FOLLOW_statements_in_compound_stat721 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_RCURLY_in_compound_stat723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr758 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_OR_in_logical_or_expr761 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr767 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_logical_comparative_expr_in_logical_and_expr788 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_logical_and_expr791 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_logical_comparative_expr_in_logical_and_expr797 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_additive_expr_in_logical_comparative_expr818 = new BitSet(new long[]{0x0000000098190002L});
	public static final BitSet FOLLOW_LT_in_logical_comparative_expr844 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_LTE_in_logical_comparative_expr865 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_GTE_in_logical_comparative_expr885 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_GT_in_logical_comparative_expr905 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_EQ_in_logical_comparative_expr926 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_NEQ_in_logical_comparative_expr947 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_additive_expr_in_logical_comparative_expr975 = new BitSet(new long[]{0x0000000098190002L});
	public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr996 = new BitSet(new long[]{0x0000000420000002L});
	public static final BitSet FOLLOW_PLUS_in_additive_expr1022 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_MINUS_in_additive_expr1043 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr1071 = new BitSet(new long[]{0x0000000420000002L});
	public static final BitSet FOLLOW_unary_expr_in_multiplicative_expr1092 = new BitSet(new long[]{0x0000010040008002L});
	public static final BitSet FOLLOW_TIMES_in_multiplicative_expr1118 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_DIVIDE_in_multiplicative_expr1139 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_MODULO_in_multiplicative_expr1159 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_unary_expr_in_multiplicative_expr1175 = new BitSet(new long[]{0x0000010040008002L});
	public static final BitSet FOLLOW_PLUS_in_unary_expr1198 = new BitSet(new long[]{0x0000122005640080L});
	public static final BitSet FOLLOW_MINUS_in_unary_expr1214 = new BitSet(new long[]{0x0000122005640080L});
	public static final BitSet FOLLOW_NOT_in_unary_expr1230 = new BitSet(new long[]{0x0000122005640080L});
	public static final BitSet FOLLOW_operand_in_unary_expr1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_operand1266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_operand1279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_read_stat_in_operand1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_write_stat_in_operand1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_stat_in_operand1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_operand1319 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_expr_in_operand1322 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_RPAREN_in_operand1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id_list1347 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_id_list1353 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_id_list1356 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expr_in_expr_list1380 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_expr_list1383 = new BitSet(new long[]{0x0000122525640080L});
	public static final BitSet FOLLOW_expr_in_expr_list1386 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_CHAR_in_value1410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_value1420 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_value1430 = new BitSet(new long[]{0x0000000000000002L});
}

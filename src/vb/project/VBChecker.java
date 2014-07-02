// $ANTLR 3.5.2 ..\\src\\vb\\project\\VBChecker.g 2014-07-02 16:25:26

package vb.project;
import vb.project.nodes.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class VBChecker extends TreeParser {
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


	public VBChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public VBChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return VBChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "..\\src\\vb\\project\\VBChecker.g"; }


	private SymbolTable symtab = new SymbolTable();


	public static class program_return extends TreeRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "program"
	// ..\\src\\vb\\project\\VBChecker.g:25:1: program : ^( PROGRAM (statements+= statement )* ) ;
	public final VBChecker.program_return program() throws RecognitionException {
		VBChecker.program_return retval = new VBChecker.program_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		VBNode _first_0 = null;
		VBNode _last = null;


		VBNode PROGRAM1=null;
		List<Object> list_statements=null;
		RuleReturnScope statements = null;
		VBNode PROGRAM1_tree=null;

		try {
			// ..\\src\\vb\\project\\VBChecker.g:26:5: ( ^( PROGRAM (statements+= statement )* ) )
			// ..\\src\\vb\\project\\VBChecker.g:26:9: ^( PROGRAM (statements+= statement )* )
			{
			root_0 = (VBNode)adaptor.nil();


			_last = (VBNode)input.LT(1);
			{
			VBNode _save_last_1 = _last;
			VBNode _first_1 = null;
			VBNode root_1 = (VBNode)adaptor.nil();
			_last = (VBNode)input.LT(1);
			PROGRAM1=(VBNode)match(input,PROGRAM,FOLLOW_PROGRAM_in_program78); 
			PROGRAM1_tree = (VBNode)adaptor.dupNode(PROGRAM1);


			root_1 = (VBNode)adaptor.becomeRoot(PROGRAM1_tree, root_1);

			symtab.openScope();
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ..\\src\\vb\\project\\VBChecker.g:28:13: (statements+= statement )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= AND && LA1_0 <= ASSIGN)||LA1_0==CHAR||(LA1_0 >= COMPOUND && LA1_0 <= CONST)||(LA1_0 >= DIVIDE && LA1_0 <= EQ)||(LA1_0 >= FALSE && LA1_0 <= INT)||(LA1_0 >= LT && LA1_0 <= PLUS)||LA1_0==READ||(LA1_0 >= TIMES && LA1_0 <= TRUE)||(LA1_0 >= VAR && LA1_0 <= WRITE)) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// ..\\src\\vb\\project\\VBChecker.g:28:14: statements+= statement
						{
						_last = (VBNode)input.LT(1);
						pushFollow(FOLLOW_statement_in_program109);
						statements=statement();
						state._fsp--;

						adaptor.addChild(root_1, statements.getTree());

						if (list_statements==null) list_statements=new ArrayList<Object>();
						list_statements.add(statements.getTree());

						}
						break;

					default :
						break loop1;
					}
				}

				symtab.closeScope();
				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statement_return extends TreeRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// ..\\src\\vb\\project\\VBChecker.g:33:1: statement : ( ^(declaration= VAR type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) | ^(declaration= CONST type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ operand ) | expr );
	public final VBChecker.statement_return statement() throws RecognitionException {
		VBChecker.statement_return retval = new VBChecker.statement_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		VBNode _first_0 = null;
		VBNode _last = null;


		VBNode declaration=null;
		VBNode type=null;
		VBNode ids=null;
		List<Object> list_ids=null;
		TreeRuleReturnScope operand2 =null;
		TreeRuleReturnScope expr3 =null;

		VBNode declaration_tree=null;
		VBNode type_tree=null;
		VBNode ids_tree=null;

		try {
			// ..\\src\\vb\\project\\VBChecker.g:34:5: ( ^(declaration= VAR type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ ) | ^(declaration= CONST type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ operand ) | expr )
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
					// ..\\src\\vb\\project\\VBChecker.g:34:9: ^(declaration= VAR type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					{
					VBNode _save_last_1 = _last;
					VBNode _first_1 = null;
					VBNode root_1 = (VBNode)adaptor.nil();
					_last = (VBNode)input.LT(1);
					declaration=(VBNode)match(input,VAR,FOLLOW_VAR_in_statement158); 
					declaration_tree = (VBNode)adaptor.dupNode(declaration);


					root_1 = (VBNode)adaptor.becomeRoot(declaration_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (VBNode)input.LT(1);
					type=(VBNode)input.LT(1);
					if ( input.LA(1)==BOOLEAN||input.LA(1)==CHARACTER||input.LA(1)==INTEGER ) {
						input.consume();
						type_tree = (VBNode)adaptor.dupNode(type);


						adaptor.addChild(root_1, type_tree);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					// ..\\src\\vb\\project\\VBChecker.g:34:60: (ids+= ID )+
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
							// ..\\src\\vb\\project\\VBChecker.g:34:61: ids+= ID
							{
							_last = (VBNode)input.LT(1);
							ids=(VBNode)match(input,ID,FOLLOW_ID_in_statement173); 
							ids_tree = (VBNode)adaptor.dupNode(ids);


							adaptor.addChild(root_1, ids_tree);

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
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					                for(Object id : list_ids) {
					                    symtab.enter(((CommonTree)id).getText(), (DeclarationNode)declaration);
					                    ((DeclarationNode)declaration).type = Type.valueOf((type!=null?type.getText():null).toUpperCase());
					                }
					            
					}
					break;
				case 2 :
					// ..\\src\\vb\\project\\VBChecker.g:41:9: ^(declaration= CONST type= ( INTEGER | CHARACTER | BOOLEAN ) (ids+= ID )+ operand )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					{
					VBNode _save_last_1 = _last;
					VBNode _first_1 = null;
					VBNode root_1 = (VBNode)adaptor.nil();
					_last = (VBNode)input.LT(1);
					declaration=(VBNode)match(input,CONST,FOLLOW_CONST_in_statement203); 
					declaration_tree = (VBNode)adaptor.dupNode(declaration);


					root_1 = (VBNode)adaptor.becomeRoot(declaration_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (VBNode)input.LT(1);
					type=(VBNode)input.LT(1);
					if ( input.LA(1)==BOOLEAN||input.LA(1)==CHARACTER||input.LA(1)==INTEGER ) {
						input.consume();
						type_tree = (VBNode)adaptor.dupNode(type);


						adaptor.addChild(root_1, type_tree);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					// ..\\src\\vb\\project\\VBChecker.g:41:62: (ids+= ID )+
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
							// ..\\src\\vb\\project\\VBChecker.g:41:63: ids+= ID
							{
							_last = (VBNode)input.LT(1);
							ids=(VBNode)match(input,ID,FOLLOW_ID_in_statement218); 
							ids_tree = (VBNode)adaptor.dupNode(ids);


							adaptor.addChild(root_1, ids_tree);

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

					_last = (VBNode)input.LT(1);
					pushFollow(FOLLOW_operand_in_statement222);
					operand2=operand();
					state._fsp--;

					adaptor.addChild(root_1, operand2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					                for(Object id : list_ids) {
					                    symtab.enter(((CommonTree)id).getText(), (DeclarationNode)declaration);
					                    ((DeclarationNode)declaration).type = Type.valueOf((type!=null?type.getText():null).toUpperCase());
					                    ((DeclarationNode)declaration).isConstant = true;
					                }
					            
					}
					break;
				case 3 :
					// ..\\src\\vb\\project\\VBChecker.g:49:9: expr
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					pushFollow(FOLLOW_expr_in_statement247);
					expr3=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr3.getTree());

					}
					break;

			}
			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class expr_return extends TreeRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// ..\\src\\vb\\project\\VBChecker.g:52:1: expr : ( ^(exp= ( PLUS | MINUS ) expr ( expr )? ) | ^(exp= NOT expr ) | ^(exp= ( DIVIDE | MODULO | TIMES | AND | OR | LT | LTE | GT | GTE | EQ | NEQ ) expr expr ) | ^(compound= COMPOUND (stats+= statement )* ) | ^(assign= ASSIGN expr expr ) | ^(write= WRITE (exprs+= expr )+ ) | ^(read= READ (ids+= ID )+ ) | operand );
	public final VBChecker.expr_return expr() throws RecognitionException {
		VBChecker.expr_return retval = new VBChecker.expr_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		VBNode _first_0 = null;
		VBNode _last = null;


		VBNode exp=null;
		VBNode compound=null;
		VBNode assign=null;
		VBNode write=null;
		VBNode read=null;
		VBNode ids=null;
		List<Object> list_ids=null;
		List<Object> list_stats=null;
		List<Object> list_exprs=null;
		TreeRuleReturnScope expr4 =null;
		TreeRuleReturnScope expr5 =null;
		TreeRuleReturnScope expr6 =null;
		TreeRuleReturnScope expr7 =null;
		TreeRuleReturnScope expr8 =null;
		TreeRuleReturnScope expr9 =null;
		TreeRuleReturnScope expr10 =null;
		TreeRuleReturnScope operand11 =null;
		RuleReturnScope stats = null;
		RuleReturnScope exprs = null;
		VBNode exp_tree=null;
		VBNode compound_tree=null;
		VBNode assign_tree=null;
		VBNode write_tree=null;
		VBNode read_tree=null;
		VBNode ids_tree=null;

		try {
			// ..\\src\\vb\\project\\VBChecker.g:52:5: ( ^(exp= ( PLUS | MINUS ) expr ( expr )? ) | ^(exp= NOT expr ) | ^(exp= ( DIVIDE | MODULO | TIMES | AND | OR | LT | LTE | GT | GTE | EQ | NEQ ) expr expr ) | ^(compound= COMPOUND (stats+= statement )* ) | ^(assign= ASSIGN expr expr ) | ^(write= WRITE (exprs+= expr )+ ) | ^(read= READ (ids+= ID )+ ) | operand )
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
					// ..\\src\\vb\\project\\VBChecker.g:52:9: ^(exp= ( PLUS | MINUS ) expr ( expr )? )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					{
					VBNode _save_last_1 = _last;
					VBNode _first_1 = null;
					VBNode root_1 = (VBNode)adaptor.nil();
					exp=(VBNode)input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						exp_tree = (VBNode)adaptor.dupNode(exp);


						root_1 = (VBNode)adaptor.becomeRoot(exp_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (VBNode)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr270);
					expr4=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr4.getTree());

					// ..\\src\\vb\\project\\VBChecker.g:52:33: ( expr )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= AND && LA5_0 <= ASSIGN)||LA5_0==CHAR||LA5_0==COMPOUND||(LA5_0 >= DIVIDE && LA5_0 <= EQ)||(LA5_0 >= FALSE && LA5_0 <= INT)||(LA5_0 >= LT && LA5_0 <= PLUS)||LA5_0==READ||(LA5_0 >= TIMES && LA5_0 <= TRUE)||LA5_0==WRITE) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// ..\\src\\vb\\project\\VBChecker.g:52:33: expr
							{
							_last = (VBNode)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr272);
							expr5=expr();
							state._fsp--;

							adaptor.addChild(root_1, expr5.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					((ExpressionNode)exp).check();
					}
					break;
				case 2 :
					// ..\\src\\vb\\project\\VBChecker.g:54:9: ^(exp= NOT expr )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					{
					VBNode _save_last_1 = _last;
					VBNode _first_1 = null;
					VBNode root_1 = (VBNode)adaptor.nil();
					_last = (VBNode)input.LT(1);
					exp=(VBNode)match(input,NOT,FOLLOW_NOT_in_expr301); 
					exp_tree = (VBNode)adaptor.dupNode(exp);


					root_1 = (VBNode)adaptor.becomeRoot(exp_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (VBNode)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr303);
					expr6=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr6.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					((ExpressionNode)exp).check();
					}
					break;
				case 3 :
					// ..\\src\\vb\\project\\VBChecker.g:56:9: ^(exp= ( DIVIDE | MODULO | TIMES | AND | OR | LT | LTE | GT | GTE | EQ | NEQ ) expr expr )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					{
					VBNode _save_last_1 = _last;
					VBNode _first_1 = null;
					VBNode root_1 = (VBNode)adaptor.nil();
					exp=(VBNode)input.LT(1);
					if ( input.LA(1)==AND||(input.LA(1) >= DIVIDE && input.LA(1) <= EQ)||(input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||(input.LA(1) >= MODULO && input.LA(1) <= NEQ)||input.LA(1)==OR||input.LA(1)==TIMES ) {
						input.consume();
						exp_tree = (VBNode)adaptor.dupNode(exp);


						root_1 = (VBNode)adaptor.becomeRoot(exp_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (VBNode)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr355);
					expr7=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr7.getTree());

					_last = (VBNode)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr357);
					expr8=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr8.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					((ExpressionNode)exp).check();
					}
					break;
				case 4 :
					// ..\\src\\vb\\project\\VBChecker.g:58:9: ^(compound= COMPOUND (stats+= statement )* )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					{
					VBNode _save_last_1 = _last;
					VBNode _first_1 = null;
					VBNode root_1 = (VBNode)adaptor.nil();
					_last = (VBNode)input.LT(1);
					compound=(VBNode)match(input,COMPOUND,FOLLOW_COMPOUND_in_expr385); 
					compound_tree = (VBNode)adaptor.dupNode(compound);


					root_1 = (VBNode)adaptor.becomeRoot(compound_tree, root_1);

					symtab.openScope();
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// ..\\src\\vb\\project\\VBChecker.g:60:13: (stats+= statement )*
						loop6:
						while (true) {
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( ((LA6_0 >= AND && LA6_0 <= ASSIGN)||LA6_0==CHAR||(LA6_0 >= COMPOUND && LA6_0 <= CONST)||(LA6_0 >= DIVIDE && LA6_0 <= EQ)||(LA6_0 >= FALSE && LA6_0 <= INT)||(LA6_0 >= LT && LA6_0 <= PLUS)||LA6_0==READ||(LA6_0 >= TIMES && LA6_0 <= TRUE)||(LA6_0 >= VAR && LA6_0 <= WRITE)) ) {
								alt6=1;
							}

							switch (alt6) {
							case 1 :
								// ..\\src\\vb\\project\\VBChecker.g:60:14: stats+= statement
								{
								_last = (VBNode)input.LT(1);
								pushFollow(FOLLOW_statement_in_expr417);
								stats=statement();
								state._fsp--;

								adaptor.addChild(root_1, stats.getTree());

								if (list_stats==null) list_stats=new ArrayList<Object>();
								list_stats.add(stats.getTree());

								}
								break;

							default :
								break loop6;
							}
						}

						symtab.closeScope();
						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            VBNode C = (VBNode)compound;
					            C.type = Type.VOID;
					            for(int i = list_stats.size() - 1; i >= 0; i--) {
					                VBNode child = (VBNode)C.getChild(i);
					                if(child.type != Type.VOID) {
					                    C.type = child.type;
					                    break;
					                }
					            }
					        
					}
					break;
				case 5 :
					// ..\\src\\vb\\project\\VBChecker.g:74:9: ^(assign= ASSIGN expr expr )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					{
					VBNode _save_last_1 = _last;
					VBNode _first_1 = null;
					VBNode root_1 = (VBNode)adaptor.nil();
					_last = (VBNode)input.LT(1);
					assign=(VBNode)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr466); 
					assign_tree = (VBNode)adaptor.dupNode(assign);


					root_1 = (VBNode)adaptor.becomeRoot(assign_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (VBNode)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr468);
					expr9=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr9.getTree());

					_last = (VBNode)input.LT(1);
					pushFollow(FOLLOW_expr_in_expr470);
					expr10=expr();
					state._fsp--;

					adaptor.addChild(root_1, expr10.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            IdNode id;
					            if(((VBNode)assign.getChild(0)).getType() != ID) {
					                throw new VBException(assign, "Linkerkant van een toekenning moet een identifier zijn.");
					            } else {
					                id = (IdNode)assign.getChild(0);
					            }
					            if(id.declaration.isConstant) {
					                throw new VBException(assign, "Identifier '" + id.getText() + "' is een constante.");
					            }
					            Type ex_type = ((VBNode)assign.getChild(1)).type;
					            if(id.type != ex_type) {
					                throw new VBException(assign, "Verkeerde combinatie: identifier '" + id.getText() + "' is van type " + id.type.toString() + ", maar er wordt " + ex_type.toString() + " toegekend");
					            }
					            ((VBNode)assign).type = ex_type;
					        
					}
					break;
				case 6 :
					// ..\\src\\vb\\project\\VBChecker.g:91:9: ^(write= WRITE (exprs+= expr )+ )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					{
					VBNode _save_last_1 = _last;
					VBNode _first_1 = null;
					VBNode root_1 = (VBNode)adaptor.nil();
					_last = (VBNode)input.LT(1);
					write=(VBNode)match(input,WRITE,FOLLOW_WRITE_in_expr494); 
					write_tree = (VBNode)adaptor.dupNode(write);


					root_1 = (VBNode)adaptor.becomeRoot(write_tree, root_1);

					match(input, Token.DOWN, null); 
					// ..\\src\\vb\\project\\VBChecker.g:91:23: (exprs+= expr )+
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
							// ..\\src\\vb\\project\\VBChecker.g:91:24: exprs+= expr
							{
							_last = (VBNode)input.LT(1);
							pushFollow(FOLLOW_expr_in_expr499);
							exprs=expr();
							state._fsp--;

							adaptor.addChild(root_1, exprs.getTree());

							if (list_exprs==null) list_exprs=new ArrayList<Object>();
							list_exprs.add(exprs.getTree());

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
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            VBNode W = (VBNode)write;
					            for(int i = 0; i < list_exprs.size(); i++) {
					                if(((VBNode)write.getChild(i)).type == Type.VOID) {
					                    throw new VBException(write, "Verkeerd argument: verwachtte [INTEGER, BOOLEAN, CHARACTER], kreeg VOID");
					                }
					            }
					            if(list_exprs.size() == 1) {
					                W.type = ((VBNode)W.getChild(0)).type;
					            } else {
					                W.type = Type.VOID;
					            }
					        
					}
					break;
				case 7 :
					// ..\\src\\vb\\project\\VBChecker.g:105:9: ^(read= READ (ids+= ID )+ )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					{
					VBNode _save_last_1 = _last;
					VBNode _first_1 = null;
					VBNode root_1 = (VBNode)adaptor.nil();
					_last = (VBNode)input.LT(1);
					read=(VBNode)match(input,READ,FOLLOW_READ_in_expr525); 
					read_tree = (VBNode)adaptor.dupNode(read);


					root_1 = (VBNode)adaptor.becomeRoot(read_tree, root_1);

					match(input, Token.DOWN, null); 
					// ..\\src\\vb\\project\\VBChecker.g:105:21: (ids+= ID )+
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
							// ..\\src\\vb\\project\\VBChecker.g:105:22: ids+= ID
							{
							_last = (VBNode)input.LT(1);
							ids=(VBNode)match(input,ID,FOLLOW_ID_in_expr530); 
							ids_tree = (VBNode)adaptor.dupNode(ids);


							adaptor.addChild(root_1, ids_tree);

							if (list_ids==null) list_ids=new ArrayList<Object>();
							list_ids.add(ids);

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
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					            VBNode R = (VBNode)read;
					            R.type = Type.VOID;
					            if(list_ids.size() == 1) {
					                R.type = symtab.retrieve(((IdNode)R.getChild(0)).getText()).type;
					            } else {
					                for(Object id : list_ids) {
					                    symtab.retrieve(((VBNode)id).getText());
					                }
					            }
					        
					}
					break;
				case 8 :
					// ..\\src\\vb\\project\\VBChecker.g:117:9: operand
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					pushFollow(FOLLOW_operand_in_expr553);
					operand11=operand();
					state._fsp--;

					adaptor.addChild(root_0, operand11.getTree());

					}
					break;

			}
			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr"


	public static class operand_return extends TreeRuleReturnScope {
		VBNode tree;
		@Override
		public VBNode getTree() { return tree; }
	};


	// $ANTLR start "operand"
	// ..\\src\\vb\\project\\VBChecker.g:120:1: operand : (id= ID |i= INT |c= CHAR |b= ( TRUE | FALSE ) );
	public final VBChecker.operand_return operand() throws RecognitionException {
		VBChecker.operand_return retval = new VBChecker.operand_return();
		retval.start = input.LT(1);

		VBNode root_0 = null;

		VBNode _first_0 = null;
		VBNode _last = null;


		VBNode id=null;
		VBNode i=null;
		VBNode c=null;
		VBNode b=null;

		VBNode id_tree=null;
		VBNode i_tree=null;
		VBNode c_tree=null;
		VBNode b_tree=null;

		try {
			// ..\\src\\vb\\project\\VBChecker.g:121:5: (id= ID |i= INT |c= CHAR |b= ( TRUE | FALSE ) )
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
					// ..\\src\\vb\\project\\VBChecker.g:122:9: id= ID
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					id=(VBNode)match(input,ID,FOLLOW_ID_in_operand587); 
					id_tree = (VBNode)adaptor.dupNode(id);


					adaptor.addChild(root_0, id_tree);


					            IdNode I = (IdNode)id;
					            DeclarationNode ref = symtab.retrieve((id!=null?id.getText():null));
					            I.declaration = ref;
					            I.type = ref.type;
					        
					}
					break;
				case 2 :
					// ..\\src\\vb\\project\\VBChecker.g:129:9: i= INT
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					i=(VBNode)match(input,INT,FOLLOW_INT_in_operand609); 
					i_tree = (VBNode)adaptor.dupNode(i);


					adaptor.addChild(root_0, i_tree);

					 ((VBNode)i).type = Type.INTEGER; 
					}
					break;
				case 3 :
					// ..\\src\\vb\\project\\VBChecker.g:131:9: c= CHAR
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					c=(VBNode)match(input,CHAR,FOLLOW_CHAR_in_operand631); 
					c_tree = (VBNode)adaptor.dupNode(c);


					adaptor.addChild(root_0, c_tree);

					 ((VBNode)c).type = Type.CHARACTER; 
					}
					break;
				case 4 :
					// ..\\src\\vb\\project\\VBChecker.g:133:9: b= ( TRUE | FALSE )
					{
					root_0 = (VBNode)adaptor.nil();


					_last = (VBNode)input.LT(1);
					b=(VBNode)input.LT(1);
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						b_tree = (VBNode)adaptor.dupNode(b);


						adaptor.addChild(root_0, b_tree);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					 ((VBNode)b).type = Type.BOOLEAN; 
					}
					break;

			}
			retval.tree = (VBNode)adaptor.rulePostProcessing(root_0);

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"

	// Delegated rules



	public static final BitSet FOLLOW_PROGRAM_in_program78 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_program109 = new BitSet(new long[]{0x00001B27F87DB0B8L});
	public static final BitSet FOLLOW_VAR_in_statement158 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_statement162 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_statement173 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_CONST_in_statement203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_statement207 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ID_in_statement218 = new BitSet(new long[]{0x0000020000640080L});
	public static final BitSet FOLLOW_operand_in_statement222 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expr_in_statement247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_expr264 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr270 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_expr_in_expr272 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_expr301 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_expr331 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr355 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr357 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_COMPOUND_in_expr385 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_expr417 = new BitSet(new long[]{0x00001B27F87DB0B8L});
	public static final BitSet FOLLOW_ASSIGN_in_expr466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr468 = new BitSet(new long[]{0x00001327F87D90B0L});
	public static final BitSet FOLLOW_expr_in_expr470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_WRITE_in_expr494 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr499 = new BitSet(new long[]{0x00001327F87D90B8L});
	public static final BitSet FOLLOW_READ_in_expr525 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_expr530 = new BitSet(new long[]{0x0000000000200008L});
	public static final BitSet FOLLOW_operand_in_expr553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_operand587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_operand609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_operand631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_operand653 = new BitSet(new long[]{0x0000000000000002L});
}

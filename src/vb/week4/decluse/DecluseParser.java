// $ANTLR 3.5.2 src\\vb\\week4\\decluse\\Decluse.g 2014-05-15 14:00:37

package vb.week4.decluse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class DecluseParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECL", "DECLUSE", "ID", "LETTER", 
		"LOWER", "LPAREN", "RPAREN", "UPPER", "USE", "WS"
	};
	public static final int EOF=-1;
	public static final int DECL=4;
	public static final int DECLUSE=5;
	public static final int ID=6;
	public static final int LETTER=7;
	public static final int LOWER=8;
	public static final int LPAREN=9;
	public static final int RPAREN=10;
	public static final int UPPER=11;
	public static final int USE=12;
	public static final int WS=13;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public DecluseParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public DecluseParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return DecluseParser.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\vb\\week4\\decluse\\Decluse.g"; }


	public static class decluse_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decluse"
	// src\\vb\\week4\\decluse\\Decluse.g:25:1: decluse : serie EOF -> ^( DECLUSE serie ) ;
	public final DecluseParser.decluse_return decluse() throws RecognitionException {
		DecluseParser.decluse_return retval = new DecluseParser.decluse_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope serie1 =null;

		Object EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_serie=new RewriteRuleSubtreeStream(adaptor,"rule serie");

		try {
			// src\\vb\\week4\\decluse\\Decluse.g:26:3: ( serie EOF -> ^( DECLUSE serie ) )
			// src\\vb\\week4\\decluse\\Decluse.g:26:6: serie EOF
			{
			pushFollow(FOLLOW_serie_in_decluse104);
			serie1=serie();
			state._fsp--;

			stream_serie.add(serie1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_decluse106);  
			stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: serie
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 26:16: -> ^( DECLUSE serie )
			{
				// src\\vb\\week4\\decluse\\Decluse.g:26:19: ^( DECLUSE serie )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECLUSE, "DECLUSE"), root_1);
				adaptor.addChild(root_1, stream_serie.nextTree());
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
	// $ANTLR end "decluse"


	public static class serie_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "serie"
	// src\\vb\\week4\\decluse\\Decluse.g:29:1: serie : LPAREN ^ ( unit )* RPAREN !;
	public final DecluseParser.serie_return serie() throws RecognitionException {
		DecluseParser.serie_return retval = new DecluseParser.serie_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN3=null;
		Token RPAREN5=null;
		ParserRuleReturnScope unit4 =null;

		Object LPAREN3_tree=null;
		Object RPAREN5_tree=null;

		try {
			// src\\vb\\week4\\decluse\\Decluse.g:30:3: ( LPAREN ^ ( unit )* RPAREN !)
			// src\\vb\\week4\\decluse\\Decluse.g:30:6: LPAREN ^ ( unit )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			LPAREN3=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_serie128); 
			LPAREN3_tree = (Object)adaptor.create(LPAREN3);
			root_0 = (Object)adaptor.becomeRoot(LPAREN3_tree, root_0);

			// src\\vb\\week4\\decluse\\Decluse.g:30:14: ( unit )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==DECL||LA1_0==LPAREN||LA1_0==USE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\vb\\week4\\decluse\\Decluse.g:30:14: unit
					{
					pushFollow(FOLLOW_unit_in_serie131);
					unit4=unit();
					state._fsp--;

					adaptor.addChild(root_0, unit4.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			RPAREN5=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_serie134); 
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
	// $ANTLR end "serie"


	public static class unit_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unit"
	// src\\vb\\week4\\decluse\\Decluse.g:33:1: unit : ( DECL ^ ID | USE ^ ID | serie );
	public final DecluseParser.unit_return unit() throws RecognitionException {
		DecluseParser.unit_return retval = new DecluseParser.unit_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DECL6=null;
		Token ID7=null;
		Token USE8=null;
		Token ID9=null;
		ParserRuleReturnScope serie10 =null;

		Object DECL6_tree=null;
		Object ID7_tree=null;
		Object USE8_tree=null;
		Object ID9_tree=null;

		try {
			// src\\vb\\week4\\decluse\\Decluse.g:34:3: ( DECL ^ ID | USE ^ ID | serie )
			int alt2=3;
			switch ( input.LA(1) ) {
			case DECL:
				{
				alt2=1;
				}
				break;
			case USE:
				{
				alt2=2;
				}
				break;
			case LPAREN:
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
					// src\\vb\\week4\\decluse\\Decluse.g:34:6: DECL ^ ID
					{
					root_0 = (Object)adaptor.nil();


					DECL6=(Token)match(input,DECL,FOLLOW_DECL_in_unit149); 
					DECL6_tree = (Object)adaptor.create(DECL6);
					root_0 = (Object)adaptor.becomeRoot(DECL6_tree, root_0);

					ID7=(Token)match(input,ID,FOLLOW_ID_in_unit152); 
					ID7_tree = (Object)adaptor.create(ID7);
					adaptor.addChild(root_0, ID7_tree);

					}
					break;
				case 2 :
					// src\\vb\\week4\\decluse\\Decluse.g:35:6: USE ^ ID
					{
					root_0 = (Object)adaptor.nil();


					USE8=(Token)match(input,USE,FOLLOW_USE_in_unit159); 
					USE8_tree = (Object)adaptor.create(USE8);
					root_0 = (Object)adaptor.becomeRoot(USE8_tree, root_0);

					ID9=(Token)match(input,ID,FOLLOW_ID_in_unit162); 
					ID9_tree = (Object)adaptor.create(ID9);
					adaptor.addChild(root_0, ID9_tree);

					}
					break;
				case 3 :
					// src\\vb\\week4\\decluse\\Decluse.g:36:6: serie
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_serie_in_unit169);
					serie10=serie();
					state._fsp--;

					adaptor.addChild(root_0, serie10.getTree());

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
	// $ANTLR end "unit"

	// Delegated rules



	public static final BitSet FOLLOW_serie_in_decluse104 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_decluse106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_serie128 = new BitSet(new long[]{0x0000000000001610L});
	public static final BitSet FOLLOW_unit_in_serie131 = new BitSet(new long[]{0x0000000000001610L});
	public static final BitSet FOLLOW_RPAREN_in_serie134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECL_in_unit149 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_unit152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_in_unit159 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_unit162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_serie_in_unit169 = new BitSet(new long[]{0x0000000000000002L});
}

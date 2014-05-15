// $ANTLR 3.5.2 src\\vb\\week4\\decluse\\DecluseChecker.g 2014-05-15 14:17:44

package vb.week4.decluse;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DecluseChecker extends TreeParser {
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
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public DecluseChecker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public DecluseChecker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return DecluseChecker.tokenNames; }
	@Override public String getGrammarFileName() { return "src\\vb\\week4\\decluse\\DecluseChecker.g"; }

	 
	private SymbolTable symtab = new SymbolTable();



	// $ANTLR start "decluse"
	// src\\vb\\week4\\decluse\\DecluseChecker.g:22:1: decluse : ^( DECLUSE ( element )* ) ;
	public final void decluse() throws RecognitionException {
		try {
			// src\\vb\\week4\\decluse\\DecluseChecker.g:23:5: ( ^( DECLUSE ( element )* ) )
			// src\\vb\\week4\\decluse\\DecluseChecker.g:23:9: ^( DECLUSE ( element )* )
			{
			 symtab.openScope(); 
			match(input,DECLUSE,FOLLOW_DECLUSE_in_decluse94); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// src\\vb\\week4\\decluse\\DecluseChecker.g:23:43: ( element )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==DECL||LA1_0==LPAREN||LA1_0==USE) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// src\\vb\\week4\\decluse\\DecluseChecker.g:23:43: element
						{
						pushFollow(FOLLOW_element_in_decluse96);
						element();
						state._fsp--;

						}
						break;

					default :
						break loop1;
					}
				}

				match(input, Token.UP, null); 
			}

			 symtab.closeScope(); 
			}

		}
		 
		    catch (RecognitionException e) { 
		        throw e; 
		    } 

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decluse"



	// $ANTLR start "element"
	// src\\vb\\week4\\decluse\\DecluseChecker.g:26:1: element : ( ^( DECL id= ID ) | ^( USE id= ID ) | ^( LPAREN ( element )* ) );
	public final void element() throws RecognitionException {
		CommonTree id=null;

		try {
			// src\\vb\\week4\\decluse\\DecluseChecker.g:27:5: ( ^( DECL id= ID ) | ^( USE id= ID ) | ^( LPAREN ( element )* ) )
			int alt3=3;
			switch ( input.LA(1) ) {
			case DECL:
				{
				alt3=1;
				}
				break;
			case USE:
				{
				alt3=2;
				}
				break;
			case LPAREN:
				{
				alt3=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// src\\vb\\week4\\decluse\\DecluseChecker.g:27:9: ^( DECL id= ID )
					{
					match(input,DECL,FOLLOW_DECL_in_element120); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,ID,FOLLOW_ID_in_element124); 
					match(input, Token.UP, null); 

					 symtab.enter((id!=null?id.getText():null), new Attribute("")); 
					}
					break;
				case 2 :
					// src\\vb\\week4\\decluse\\DecluseChecker.g:28:9: ^( USE id= ID )
					{
					match(input,USE,FOLLOW_USE_in_element138); 
					match(input, Token.DOWN, null); 
					id=(CommonTree)match(input,ID,FOLLOW_ID_in_element143); 
					match(input, Token.UP, null); 

					 symtab.retrieve((id!=null?id.getText():null)); 
					}
					break;
				case 3 :
					// src\\vb\\week4\\decluse\\DecluseChecker.g:29:9: ^( LPAREN ( element )* )
					{
					 symtab.openScope(); 
					match(input,LPAREN,FOLLOW_LPAREN_in_element159); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// src\\vb\\week4\\decluse\\DecluseChecker.g:29:42: ( element )*
						loop2:
						while (true) {
							int alt2=2;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==DECL||LA2_0==LPAREN||LA2_0==USE) ) {
								alt2=1;
							}

							switch (alt2) {
							case 1 :
								// src\\vb\\week4\\decluse\\DecluseChecker.g:29:42: element
								{
								pushFollow(FOLLOW_element_in_element161);
								element();
								state._fsp--;

								}
								break;

							default :
								break loop2;
							}
						}

						match(input, Token.UP, null); 
					}

					 symtab.closeScope(); 
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
	// $ANTLR end "element"

	// Delegated rules



	public static final BitSet FOLLOW_DECLUSE_in_decluse94 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_element_in_decluse96 = new BitSet(new long[]{0x0000000000001218L});
	public static final BitSet FOLLOW_DECL_in_element120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_element124 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_USE_in_element138 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_element143 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LPAREN_in_element159 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_element_in_element161 = new BitSet(new long[]{0x0000000000001218L});
}

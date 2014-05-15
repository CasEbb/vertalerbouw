// $ANTLR 3.5.2 src\\vb\\week4\\decluse\\Decluse.g 2014-05-15 14:00:38

package vb.week4.decluse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class DecluseLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public DecluseLexer() {} 
	public DecluseLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public DecluseLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "src\\vb\\week4\\decluse\\Decluse.g"; }

	// $ANTLR start "DECL"
	public final void mDECL() throws RecognitionException {
		try {
			int _type = DECL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week4\\decluse\\Decluse.g:11:6: ( 'D:' )
			// src\\vb\\week4\\decluse\\Decluse.g:11:8: 'D:'
			{
			match("D:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECL"

	// $ANTLR start "DECLUSE"
	public final void mDECLUSE() throws RecognitionException {
		try {
			int _type = DECLUSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week4\\decluse\\Decluse.g:12:9: ( 'DECLUSE' )
			// src\\vb\\week4\\decluse\\Decluse.g:12:11: 'DECLUSE'
			{
			match("DECLUSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLUSE"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week4\\decluse\\Decluse.g:13:8: ( '(' )
			// src\\vb\\week4\\decluse\\Decluse.g:13:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week4\\decluse\\Decluse.g:14:8: ( ')' )
			// src\\vb\\week4\\decluse\\Decluse.g:14:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "USE"
	public final void mUSE() throws RecognitionException {
		try {
			int _type = USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week4\\decluse\\Decluse.g:15:5: ( 'U:' )
			// src\\vb\\week4\\decluse\\Decluse.g:15:7: 'U:'
			{
			match("U:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week4\\decluse\\Decluse.g:40:3: ( ( LETTER )+ )
			// src\\vb\\week4\\decluse\\Decluse.g:40:6: ( LETTER )+
			{
			// src\\vb\\week4\\decluse\\Decluse.g:40:6: ( LETTER )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\vb\\week4\\decluse\\Decluse.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\vb\\week4\\decluse\\Decluse.g:44:3: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
			// src\\vb\\week4\\decluse\\Decluse.g:44:6: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			{
			// src\\vb\\week4\\decluse\\Decluse.g:44:6: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\vb\\week4\\decluse\\Decluse.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LOWER"
	public final void mLOWER() throws RecognitionException {
		try {
			// src\\vb\\week4\\decluse\\Decluse.g:48:17: ( ( 'a' .. 'z' ) )
			// src\\vb\\week4\\decluse\\Decluse.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWER"

	// $ANTLR start "UPPER"
	public final void mUPPER() throws RecognitionException {
		try {
			// src\\vb\\week4\\decluse\\Decluse.g:49:17: ( ( 'A' .. 'Z' ) )
			// src\\vb\\week4\\decluse\\Decluse.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPPER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// src\\vb\\week4\\decluse\\Decluse.g:50:17: ( LOWER | UPPER )
			// src\\vb\\week4\\decluse\\Decluse.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	@Override
	public void mTokens() throws RecognitionException {
		// src\\vb\\week4\\decluse\\Decluse.g:1:8: ( DECL | DECLUSE | LPAREN | RPAREN | USE | ID | WS )
		int alt3=7;
		switch ( input.LA(1) ) {
		case 'D':
			{
			switch ( input.LA(2) ) {
			case ':':
				{
				alt3=1;
				}
				break;
			case 'E':
				{
				int LA3_8 = input.LA(3);
				if ( (LA3_8=='C') ) {
					int LA3_10 = input.LA(4);
					if ( (LA3_10=='L') ) {
						int LA3_11 = input.LA(5);
						if ( (LA3_11=='U') ) {
							int LA3_12 = input.LA(6);
							if ( (LA3_12=='S') ) {
								int LA3_13 = input.LA(7);
								if ( (LA3_13=='E') ) {
									int LA3_14 = input.LA(8);
									if ( ((LA3_14 >= 'A' && LA3_14 <= 'Z')||(LA3_14 >= 'a' && LA3_14 <= 'z')) ) {
										alt3=6;
									}

									else {
										alt3=2;
									}

								}

								else {
									alt3=6;
								}

							}

							else {
								alt3=6;
							}

						}

						else {
							alt3=6;
						}

					}

					else {
						alt3=6;
					}

				}

				else {
					alt3=6;
				}

				}
				break;
			default:
				alt3=6;
			}
			}
			break;
		case '(':
			{
			alt3=3;
			}
			break;
		case ')':
			{
			alt3=4;
			}
			break;
		case 'U':
			{
			int LA3_4 = input.LA(2);
			if ( (LA3_4==':') ) {
				alt3=5;
			}

			else {
				alt3=6;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt3=6;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt3=7;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// src\\vb\\week4\\decluse\\Decluse.g:1:10: DECL
				{
				mDECL(); 

				}
				break;
			case 2 :
				// src\\vb\\week4\\decluse\\Decluse.g:1:15: DECLUSE
				{
				mDECLUSE(); 

				}
				break;
			case 3 :
				// src\\vb\\week4\\decluse\\Decluse.g:1:23: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 4 :
				// src\\vb\\week4\\decluse\\Decluse.g:1:30: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 5 :
				// src\\vb\\week4\\decluse\\Decluse.g:1:37: USE
				{
				mUSE(); 

				}
				break;
			case 6 :
				// src\\vb\\week4\\decluse\\Decluse.g:1:41: ID
				{
				mID(); 

				}
				break;
			case 7 :
				// src\\vb\\week4\\decluse\\Decluse.g:1:44: WS
				{
				mWS(); 

				}
				break;

		}
	}



}

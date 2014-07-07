// $ANTLR 3.5.2 src\\hoken\\parser\\Hoken.g 2014-07-07 23:29:18

package hoken.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HokenLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BOOLEAN=6;
	public static final int CHAR=7;
	public static final int CHARACTER=8;
	public static final int COMMA=9;
	public static final int COMMENT=10;
	public static final int COMPOUND=11;
	public static final int CONST=12;
	public static final int DIGIT=13;
	public static final int DIVIDE=14;
	public static final int EQ=15;
	public static final int EQUALS=16;
	public static final int FALSE=17;
	public static final int GT=18;
	public static final int GTE=19;
	public static final int ID=20;
	public static final int INT=21;
	public static final int INTEGER=22;
	public static final int LCURLY=23;
	public static final int LETTER=24;
	public static final int LPAREN=25;
	public static final int LT=26;
	public static final int LTE=27;
	public static final int MINUS=28;
	public static final int MODULO=29;
	public static final int NEQ=30;
	public static final int NOT=31;
	public static final int OR=32;
	public static final int PLUS=33;
	public static final int PROGRAM=34;
	public static final int RCURLY=35;
	public static final int READ=36;
	public static final int RPAREN=37;
	public static final int SEMICOLON=38;
	public static final int TIMES=39;
	public static final int TRUE=40;
	public static final int UNDERSCORE=41;
	public static final int VAR=42;
	public static final int WRITE=43;
	public static final int WS=44;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HokenLexer() {} 
	public HokenLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HokenLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "src\\hoken\\parser\\Hoken.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:11:5: ( '&&' )
			// src\\hoken\\parser\\Hoken.g:11:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:12:8: ( ':=' )
			// src\\hoken\\parser\\Hoken.g:12:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:13:9: ( 'walofneet' )
			// src\\hoken\\parser\\Hoken.g:13:11: 'walofneet'
			{
			match("walofneet"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "CHARACTER"
	public final void mCHARACTER() throws RecognitionException {
		try {
			int _type = CHARACTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:14:11: ( 'lettertjen' )
			// src\\hoken\\parser\\Hoken.g:14:13: 'lettertjen'
			{
			match("lettertjen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:15:7: ( ',' )
			// src\\hoken\\parser\\Hoken.g:15:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "CONST"
	public final void mCONST() throws RecognitionException {
		try {
			int _type = CONST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:16:7: ( 'blievend' )
			// src\\hoken\\parser\\Hoken.g:16:9: 'blievend'
			{
			match("blievend"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:17:8: ( '/' )
			// src\\hoken\\parser\\Hoken.g:17:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:18:4: ( '==' )
			// src\\hoken\\parser\\Hoken.g:18:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:19:8: ( '=' )
			// src\\hoken\\parser\\Hoken.g:19:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:20:7: ( 'neet' )
			// src\\hoken\\parser\\Hoken.g:20:9: 'neet'
			{
			match("neet"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:21:4: ( '>' )
			// src\\hoken\\parser\\Hoken.g:21:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GTE"
	public final void mGTE() throws RecognitionException {
		try {
			int _type = GTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:22:5: ( '>=' )
			// src\\hoken\\parser\\Hoken.g:22:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTE"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:23:9: ( 'getalletjen' )
			// src\\hoken\\parser\\Hoken.g:23:11: 'getalletjen'
			{
			match("getalletjen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:24:8: ( '{' )
			// src\\hoken\\parser\\Hoken.g:24:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:25:8: ( '(' )
			// src\\hoken\\parser\\Hoken.g:25:10: '('
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

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:26:4: ( '<' )
			// src\\hoken\\parser\\Hoken.g:26:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LTE"
	public final void mLTE() throws RecognitionException {
		try {
			int _type = LTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:27:5: ( '<=' )
			// src\\hoken\\parser\\Hoken.g:27:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTE"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:28:7: ( '-' )
			// src\\hoken\\parser\\Hoken.g:28:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MODULO"
	public final void mMODULO() throws RecognitionException {
		try {
			int _type = MODULO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:29:8: ( '%' )
			// src\\hoken\\parser\\Hoken.g:29:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODULO"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:30:5: ( '<>' )
			// src\\hoken\\parser\\Hoken.g:30:7: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:31:5: ( '!' )
			// src\\hoken\\parser\\Hoken.g:31:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:32:4: ( '||' )
			// src\\hoken\\parser\\Hoken.g:32:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:33:6: ( '+' )
			// src\\hoken\\parser\\Hoken.g:33:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:34:8: ( '}' )
			// src\\hoken\\parser\\Hoken.g:34:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:35:6: ( 'vraogen' )
			// src\\hoken\\parser\\Hoken.g:35:8: 'vraogen'
			{
			match("vraogen"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:36:8: ( ')' )
			// src\\hoken\\parser\\Hoken.g:36:10: ')'
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

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:37:11: ( ';' )
			// src\\hoken\\parser\\Hoken.g:37:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:38:7: ( '*' )
			// src\\hoken\\parser\\Hoken.g:38:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMES"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:39:6: ( 'wal' )
			// src\\hoken\\parser\\Hoken.g:39:8: 'wal'
			{
			match("wal"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:40:7: ( 'skrieben' )
			// src\\hoken\\parser\\Hoken.g:40:9: 'skrieben'
			{
			match("skrieben"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:202:5: ( ( LETTER | UNDERSCORE ) ( LETTER | DIGIT | UNDERSCORE )* )
			// src\\hoken\\parser\\Hoken.g:202:9: ( LETTER | UNDERSCORE ) ( LETTER | DIGIT | UNDERSCORE )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// src\\hoken\\parser\\Hoken.g:202:29: ( LETTER | DIGIT | UNDERSCORE )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop1;
				}
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:205:5: ( ( DIGIT )+ )
			// src\\hoken\\parser\\Hoken.g:205:9: ( DIGIT )+
			{
			// src\\hoken\\parser\\Hoken.g:205:9: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:208:5: ( '\\'' LETTER '\\'' )
			// src\\hoken\\parser\\Hoken.g:208:8: '\\'' LETTER '\\''
			{
			match('\''); 
			mLETTER(); 

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:219:5: ( 'dunoffel!' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | 'hennigan!' ( options {greedy=false; } : . )* 'deurgoan!' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='d') ) {
				alt6=1;
			}
			else if ( (LA6_0=='h') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// src\\hoken\\parser\\Hoken.g:219:9: 'dunoffel!' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("dunoffel!"); 

					// src\\hoken\\parser\\Hoken.g:219:21: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// src\\hoken\\parser\\Hoken.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
							break loop3;
						}
					}

					// src\\hoken\\parser\\Hoken.g:219:35: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// src\\hoken\\parser\\Hoken.g:219:35: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// src\\hoken\\parser\\Hoken.g:220:9: 'hennigan!' ( options {greedy=false; } : . )* 'deurgoan!'
					{
					match("hennigan!"); 

					// src\\hoken\\parser\\Hoken.g:220:21: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='d') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='e') ) {
								int LA5_3 = input.LA(3);
								if ( (LA5_3=='u') ) {
									int LA5_4 = input.LA(4);
									if ( (LA5_4=='r') ) {
										int LA5_5 = input.LA(5);
										if ( (LA5_5=='g') ) {
											int LA5_6 = input.LA(6);
											if ( (LA5_6=='o') ) {
												int LA5_7 = input.LA(7);
												if ( (LA5_7=='a') ) {
													int LA5_8 = input.LA(8);
													if ( (LA5_8=='n') ) {
														int LA5_9 = input.LA(9);
														if ( (LA5_9=='!') ) {
															alt5=2;
														}
														else if ( ((LA5_9 >= '\u0000' && LA5_9 <= ' ')||(LA5_9 >= '\"' && LA5_9 <= '\uFFFF')) ) {
															alt5=1;
														}

													}
													else if ( ((LA5_8 >= '\u0000' && LA5_8 <= 'm')||(LA5_8 >= 'o' && LA5_8 <= '\uFFFF')) ) {
														alt5=1;
													}

												}
												else if ( ((LA5_7 >= '\u0000' && LA5_7 <= '`')||(LA5_7 >= 'b' && LA5_7 <= '\uFFFF')) ) {
													alt5=1;
												}

											}
											else if ( ((LA5_6 >= '\u0000' && LA5_6 <= 'n')||(LA5_6 >= 'p' && LA5_6 <= '\uFFFF')) ) {
												alt5=1;
											}

										}
										else if ( ((LA5_5 >= '\u0000' && LA5_5 <= 'f')||(LA5_5 >= 'h' && LA5_5 <= '\uFFFF')) ) {
											alt5=1;
										}

									}
									else if ( ((LA5_4 >= '\u0000' && LA5_4 <= 'q')||(LA5_4 >= 's' && LA5_4 <= '\uFFFF')) ) {
										alt5=1;
									}

								}
								else if ( ((LA5_3 >= '\u0000' && LA5_3 <= 't')||(LA5_3 >= 'v' && LA5_3 <= '\uFFFF')) ) {
									alt5=1;
								}

							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= 'd')||(LA5_1 >= 'f' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= 'c')||(LA5_0 >= 'e' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// src\\hoken\\parser\\Hoken.g:220:49: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match("deurgoan!"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// src\\hoken\\parser\\Hoken.g:223:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// src\\hoken\\parser\\Hoken.g:223:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
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

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// src\\hoken\\parser\\Hoken.g:236:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// src\\hoken\\parser\\Hoken.g:
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

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// src\\hoken\\parser\\Hoken.g:242:5: ( '0' .. '9' )
			// src\\hoken\\parser\\Hoken.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
	// $ANTLR end "DIGIT"

	// $ANTLR start "UNDERSCORE"
	public final void mUNDERSCORE() throws RecognitionException {
		try {
			// src\\hoken\\parser\\Hoken.g:247:5: ( '_' )
			// src\\hoken\\parser\\Hoken.g:247:9: '_'
			{
			match('_'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNDERSCORE"

	@Override
	public void mTokens() throws RecognitionException {
		// src\\hoken\\parser\\Hoken.g:1:8: ( AND | ASSIGN | BOOLEAN | CHARACTER | COMMA | CONST | DIVIDE | EQ | EQUALS | FALSE | GT | GTE | INTEGER | LCURLY | LPAREN | LT | LTE | MINUS | MODULO | NEQ | NOT | OR | PLUS | RCURLY | READ | RPAREN | SEMICOLON | TIMES | TRUE | WRITE | ID | INT | CHAR | COMMENT | WS )
		int alt7=35;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// src\\hoken\\parser\\Hoken.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// src\\hoken\\parser\\Hoken.g:1:14: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// src\\hoken\\parser\\Hoken.g:1:21: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 4 :
				// src\\hoken\\parser\\Hoken.g:1:29: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 5 :
				// src\\hoken\\parser\\Hoken.g:1:39: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 6 :
				// src\\hoken\\parser\\Hoken.g:1:45: CONST
				{
				mCONST(); 

				}
				break;
			case 7 :
				// src\\hoken\\parser\\Hoken.g:1:51: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 8 :
				// src\\hoken\\parser\\Hoken.g:1:58: EQ
				{
				mEQ(); 

				}
				break;
			case 9 :
				// src\\hoken\\parser\\Hoken.g:1:61: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 10 :
				// src\\hoken\\parser\\Hoken.g:1:68: FALSE
				{
				mFALSE(); 

				}
				break;
			case 11 :
				// src\\hoken\\parser\\Hoken.g:1:74: GT
				{
				mGT(); 

				}
				break;
			case 12 :
				// src\\hoken\\parser\\Hoken.g:1:77: GTE
				{
				mGTE(); 

				}
				break;
			case 13 :
				// src\\hoken\\parser\\Hoken.g:1:81: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 14 :
				// src\\hoken\\parser\\Hoken.g:1:89: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 15 :
				// src\\hoken\\parser\\Hoken.g:1:96: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 16 :
				// src\\hoken\\parser\\Hoken.g:1:103: LT
				{
				mLT(); 

				}
				break;
			case 17 :
				// src\\hoken\\parser\\Hoken.g:1:106: LTE
				{
				mLTE(); 

				}
				break;
			case 18 :
				// src\\hoken\\parser\\Hoken.g:1:110: MINUS
				{
				mMINUS(); 

				}
				break;
			case 19 :
				// src\\hoken\\parser\\Hoken.g:1:116: MODULO
				{
				mMODULO(); 

				}
				break;
			case 20 :
				// src\\hoken\\parser\\Hoken.g:1:123: NEQ
				{
				mNEQ(); 

				}
				break;
			case 21 :
				// src\\hoken\\parser\\Hoken.g:1:127: NOT
				{
				mNOT(); 

				}
				break;
			case 22 :
				// src\\hoken\\parser\\Hoken.g:1:131: OR
				{
				mOR(); 

				}
				break;
			case 23 :
				// src\\hoken\\parser\\Hoken.g:1:134: PLUS
				{
				mPLUS(); 

				}
				break;
			case 24 :
				// src\\hoken\\parser\\Hoken.g:1:139: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 25 :
				// src\\hoken\\parser\\Hoken.g:1:146: READ
				{
				mREAD(); 

				}
				break;
			case 26 :
				// src\\hoken\\parser\\Hoken.g:1:151: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 27 :
				// src\\hoken\\parser\\Hoken.g:1:158: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 28 :
				// src\\hoken\\parser\\Hoken.g:1:168: TIMES
				{
				mTIMES(); 

				}
				break;
			case 29 :
				// src\\hoken\\parser\\Hoken.g:1:174: TRUE
				{
				mTRUE(); 

				}
				break;
			case 30 :
				// src\\hoken\\parser\\Hoken.g:1:179: WRITE
				{
				mWRITE(); 

				}
				break;
			case 31 :
				// src\\hoken\\parser\\Hoken.g:1:185: ID
				{
				mID(); 

				}
				break;
			case 32 :
				// src\\hoken\\parser\\Hoken.g:1:188: INT
				{
				mINT(); 

				}
				break;
			case 33 :
				// src\\hoken\\parser\\Hoken.g:1:192: CHAR
				{
				mCHAR(); 

				}
				break;
			case 34 :
				// src\\hoken\\parser\\Hoken.g:1:197: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 35 :
				// src\\hoken\\parser\\Hoken.g:1:205: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\3\uffff\2\36\1\uffff\1\36\1\uffff\1\44\1\36\1\47\1\36\2\uffff\1\53\6"+
		"\uffff\1\36\3\uffff\2\36\2\uffff\1\36\2\uffff\3\36\2\uffff\1\36\2\uffff"+
		"\1\36\3\uffff\4\36\1\72\11\36\1\uffff\2\36\1\106\10\36\1\uffff\21\36\1"+
		"\140\5\36\1\146\1\36\1\uffff\1\150\2\36\1\152\1\36\1\uffff\1\36\3\uffff"+
		"\1\155\1\36\1\uffff\1\157\1\uffff";
	static final String DFA7_eofS =
		"\160\uffff";
	static final String DFA7_minS =
		"\1\11\2\uffff\1\141\1\145\1\uffff\1\154\1\uffff\1\75\1\145\1\75\1\145"+
		"\2\uffff\1\75\6\uffff\1\162\3\uffff\1\153\1\165\2\uffff\1\145\2\uffff"+
		"\1\154\1\164\1\151\2\uffff\1\145\2\uffff\1\164\3\uffff\1\141\1\162\2\156"+
		"\1\60\1\164\1\145\1\164\1\141\1\157\1\151\1\157\1\156\1\146\1\uffff\1"+
		"\145\1\166\1\60\1\154\1\147\1\145\1\146\1\151\1\156\1\162\1\145\1\uffff"+
		"\1\154\1\145\1\142\1\146\1\147\1\145\1\164\1\156\1\145\1\156\2\145\1\141"+
		"\1\145\1\152\1\144\1\164\1\60\1\156\1\154\1\156\1\164\1\145\1\60\1\152"+
		"\1\uffff\1\60\2\41\1\60\1\156\1\uffff\1\145\3\uffff\1\60\1\156\1\uffff"+
		"\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\175\2\uffff\1\141\1\145\1\uffff\1\154\1\uffff\1\75\1\145\1\75\1\145"+
		"\2\uffff\1\76\6\uffff\1\162\3\uffff\1\153\1\165\2\uffff\1\145\2\uffff"+
		"\1\154\1\164\1\151\2\uffff\1\145\2\uffff\1\164\3\uffff\1\141\1\162\2\156"+
		"\1\172\1\164\1\145\1\164\1\141\1\157\1\151\1\157\1\156\1\146\1\uffff\1"+
		"\145\1\166\1\172\1\154\1\147\1\145\1\146\1\151\1\156\1\162\1\145\1\uffff"+
		"\1\154\1\145\1\142\1\146\1\147\1\145\1\164\1\156\1\145\1\156\2\145\1\141"+
		"\1\145\1\152\1\144\1\164\1\172\1\156\1\154\1\156\1\164\1\145\1\172\1\152"+
		"\1\uffff\1\172\2\41\1\172\1\156\1\uffff\1\145\3\uffff\1\172\1\156\1\uffff"+
		"\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\2\uffff\1\5\1\uffff\1\7\4\uffff\1\16\1\17\1\uffff\1\22"+
		"\1\23\1\25\1\26\1\27\1\30\1\uffff\1\32\1\33\1\34\2\uffff\1\40\1\41\1\uffff"+
		"\1\37\1\43\3\uffff\1\10\1\11\1\uffff\1\14\1\13\1\uffff\1\21\1\24\1\20"+
		"\16\uffff\1\35\13\uffff\1\12\31\uffff\1\31\5\uffff\1\6\1\uffff\1\36\1"+
		"\42\1\3\2\uffff\1\4\1\uffff\1\15";
	static final String DFA7_specialS =
		"\160\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\37\2\uffff\1\37\22\uffff\1\37\1\21\3\uffff\1\20\1\1\1\34\1\15\1\26"+
			"\1\30\1\23\1\5\1\17\1\uffff\1\7\12\33\1\2\1\27\1\16\1\10\1\12\2\uffff"+
			"\32\36\4\uffff\1\36\1\uffff\1\36\1\6\1\36\1\32\2\36\1\13\1\35\3\36\1"+
			"\4\1\36\1\11\4\36\1\31\2\36\1\25\1\3\3\36\1\14\1\22\1\24",
			"",
			"",
			"\1\40",
			"\1\41",
			"",
			"\1\42",
			"",
			"\1\43",
			"\1\45",
			"\1\46",
			"\1\50",
			"",
			"",
			"\1\51\1\52",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\54",
			"",
			"",
			"",
			"\1\55",
			"\1\56",
			"",
			"",
			"\1\57",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"",
			"",
			"\1\63",
			"",
			"",
			"\1\64",
			"",
			"",
			"",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\71\13\36",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"",
			"\1\104",
			"\1\105",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\147",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\151",
			"\1\151",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\153",
			"",
			"\1\154",
			"",
			"",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\156",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ASSIGN | BOOLEAN | CHARACTER | COMMA | CONST | DIVIDE | EQ | EQUALS | FALSE | GT | GTE | INTEGER | LCURLY | LPAREN | LT | LTE | MINUS | MODULO | NEQ | NOT | OR | PLUS | RCURLY | READ | RPAREN | SEMICOLON | TIMES | TRUE | WRITE | ID | INT | CHAR | COMMENT | WS );";
		}
	}

}

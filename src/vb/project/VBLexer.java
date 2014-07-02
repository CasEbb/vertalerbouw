// $ANTLR 3.5.2 ..\\src\\vb\\project\\VB.g 2014-07-02 13:52:52

package vb.project;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class VBLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public VBLexer() {} 
	public VBLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public VBLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "..\\src\\vb\\project\\VB.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ..\\src\\vb\\project\\VB.g:11:5: ( '&&' )
			// ..\\src\\vb\\project\\VB.g:11:7: '&&'
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
			// ..\\src\\vb\\project\\VB.g:12:8: ( ':=' )
			// ..\\src\\vb\\project\\VB.g:12:10: ':='
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
			// ..\\src\\vb\\project\\VB.g:13:9: ( 'boolean' )
			// ..\\src\\vb\\project\\VB.g:13:11: 'boolean'
			{
			match("boolean"); 

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
			// ..\\src\\vb\\project\\VB.g:14:11: ( 'character' )
			// ..\\src\\vb\\project\\VB.g:14:13: 'character'
			{
			match("character"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHARACTER"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ..\\src\\vb\\project\\VB.g:15:7: ( ':' )
			// ..\\src\\vb\\project\\VB.g:15:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ..\\src\\vb\\project\\VB.g:16:7: ( ',' )
			// ..\\src\\vb\\project\\VB.g:16:9: ','
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
			// ..\\src\\vb\\project\\VB.g:17:7: ( 'const' )
			// ..\\src\\vb\\project\\VB.g:17:9: 'const'
			{
			match("const"); 

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
			// ..\\src\\vb\\project\\VB.g:18:8: ( '/' )
			// ..\\src\\vb\\project\\VB.g:18:10: '/'
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
			// ..\\src\\vb\\project\\VB.g:19:4: ( '==' )
			// ..\\src\\vb\\project\\VB.g:19:6: '=='
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
			// ..\\src\\vb\\project\\VB.g:20:8: ( '=' )
			// ..\\src\\vb\\project\\VB.g:20:10: '='
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
			// ..\\src\\vb\\project\\VB.g:21:7: ( 'false' )
			// ..\\src\\vb\\project\\VB.g:21:9: 'false'
			{
			match("false"); 

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
			// ..\\src\\vb\\project\\VB.g:22:4: ( '>' )
			// ..\\src\\vb\\project\\VB.g:22:6: '>'
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
			// ..\\src\\vb\\project\\VB.g:23:5: ( '>=' )
			// ..\\src\\vb\\project\\VB.g:23:7: '>='
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
			// ..\\src\\vb\\project\\VB.g:24:9: ( 'integer' )
			// ..\\src\\vb\\project\\VB.g:24:11: 'integer'
			{
			match("integer"); 

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
			// ..\\src\\vb\\project\\VB.g:25:8: ( '{' )
			// ..\\src\\vb\\project\\VB.g:25:10: '{'
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
			// ..\\src\\vb\\project\\VB.g:26:8: ( '(' )
			// ..\\src\\vb\\project\\VB.g:26:10: '('
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
			// ..\\src\\vb\\project\\VB.g:27:4: ( '<' )
			// ..\\src\\vb\\project\\VB.g:27:6: '<'
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
			// ..\\src\\vb\\project\\VB.g:28:5: ( '<=' )
			// ..\\src\\vb\\project\\VB.g:28:7: '<='
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
			// ..\\src\\vb\\project\\VB.g:29:7: ( '-' )
			// ..\\src\\vb\\project\\VB.g:29:9: '-'
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
			// ..\\src\\vb\\project\\VB.g:30:8: ( '%' )
			// ..\\src\\vb\\project\\VB.g:30:10: '%'
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
			// ..\\src\\vb\\project\\VB.g:31:5: ( '<>' )
			// ..\\src\\vb\\project\\VB.g:31:7: '<>'
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
			// ..\\src\\vb\\project\\VB.g:32:5: ( '!' )
			// ..\\src\\vb\\project\\VB.g:32:7: '!'
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
			// ..\\src\\vb\\project\\VB.g:33:4: ( '||' )
			// ..\\src\\vb\\project\\VB.g:33:6: '||'
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
			// ..\\src\\vb\\project\\VB.g:34:6: ( '+' )
			// ..\\src\\vb\\project\\VB.g:34:8: '+'
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
			// ..\\src\\vb\\project\\VB.g:35:8: ( '}' )
			// ..\\src\\vb\\project\\VB.g:35:10: '}'
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
			// ..\\src\\vb\\project\\VB.g:36:6: ( 'read' )
			// ..\\src\\vb\\project\\VB.g:36:8: 'read'
			{
			match("read"); 

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
			// ..\\src\\vb\\project\\VB.g:37:8: ( ')' )
			// ..\\src\\vb\\project\\VB.g:37:10: ')'
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
			// ..\\src\\vb\\project\\VB.g:38:11: ( ';' )
			// ..\\src\\vb\\project\\VB.g:38:13: ';'
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
			// ..\\src\\vb\\project\\VB.g:39:7: ( '*' )
			// ..\\src\\vb\\project\\VB.g:39:9: '*'
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
			// ..\\src\\vb\\project\\VB.g:40:6: ( 'true' )
			// ..\\src\\vb\\project\\VB.g:40:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ..\\src\\vb\\project\\VB.g:41:5: ( 'var' )
			// ..\\src\\vb\\project\\VB.g:41:7: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// ..\\src\\vb\\project\\VB.g:42:7: ( 'write' )
			// ..\\src\\vb\\project\\VB.g:42:9: 'write'
			{
			match("write"); 

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
			// ..\\src\\vb\\project\\VB.g:184:5: ( ( LETTER | UNDERSCORE ) ( LETTER | DIGIT | UNDERSCORE )* )
			// ..\\src\\vb\\project\\VB.g:184:9: ( LETTER | UNDERSCORE ) ( LETTER | DIGIT | UNDERSCORE )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// ..\\src\\vb\\project\\VB.g:184:29: ( LETTER | DIGIT | UNDERSCORE )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:
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
			// ..\\src\\vb\\project\\VB.g:187:5: ( ( DIGIT )+ )
			// ..\\src\\vb\\project\\VB.g:187:9: ( DIGIT )+
			{
			// ..\\src\\vb\\project\\VB.g:187:9: ( DIGIT )+
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
					// ..\\src\\vb\\project\\VB.g:
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
			// ..\\src\\vb\\project\\VB.g:190:5: ( '\\'' LETTER '\\'' )
			// ..\\src\\vb\\project\\VB.g:190:8: '\\'' LETTER '\\''
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
			// ..\\src\\vb\\project\\VB.g:201:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// ..\\src\\vb\\project\\VB.g:201:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// ..\\src\\vb\\project\\VB.g:201:14: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// ..\\src\\vb\\project\\VB.g:
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

					// ..\\src\\vb\\project\\VB.g:201:28: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// ..\\src\\vb\\project\\VB.g:201:28: '\\r'
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
					// ..\\src\\vb\\project\\VB.g:202:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// ..\\src\\vb\\project\\VB.g:202:14: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// ..\\src\\vb\\project\\VB.g:202:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

					match("*/"); 

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
			// ..\\src\\vb\\project\\VB.g:205:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// ..\\src\\vb\\project\\VB.g:205:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// ..\\src\\vb\\project\\VB.g:218:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// ..\\src\\vb\\project\\VB.g:
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
			// ..\\src\\vb\\project\\VB.g:224:5: ( '0' .. '9' )
			// ..\\src\\vb\\project\\VB.g:
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
			// ..\\src\\vb\\project\\VB.g:229:5: ( '_' )
			// ..\\src\\vb\\project\\VB.g:229:9: '_'
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
		// ..\\src\\vb\\project\\VB.g:1:8: ( AND | ASSIGN | BOOLEAN | CHARACTER | COLON | COMMA | CONST | DIVIDE | EQ | EQUALS | FALSE | GT | GTE | INTEGER | LCURLY | LPAREN | LT | LTE | MINUS | MODULO | NEQ | NOT | OR | PLUS | RCURLY | READ | RPAREN | SEMICOLON | TIMES | TRUE | VAR | WRITE | ID | INT | CHAR | COMMENT | WS )
		int alt7=37;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// ..\\src\\vb\\project\\VB.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// ..\\src\\vb\\project\\VB.g:1:14: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// ..\\src\\vb\\project\\VB.g:1:21: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 4 :
				// ..\\src\\vb\\project\\VB.g:1:29: CHARACTER
				{
				mCHARACTER(); 

				}
				break;
			case 5 :
				// ..\\src\\vb\\project\\VB.g:1:39: COLON
				{
				mCOLON(); 

				}
				break;
			case 6 :
				// ..\\src\\vb\\project\\VB.g:1:45: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 7 :
				// ..\\src\\vb\\project\\VB.g:1:51: CONST
				{
				mCONST(); 

				}
				break;
			case 8 :
				// ..\\src\\vb\\project\\VB.g:1:57: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 9 :
				// ..\\src\\vb\\project\\VB.g:1:64: EQ
				{
				mEQ(); 

				}
				break;
			case 10 :
				// ..\\src\\vb\\project\\VB.g:1:67: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 11 :
				// ..\\src\\vb\\project\\VB.g:1:74: FALSE
				{
				mFALSE(); 

				}
				break;
			case 12 :
				// ..\\src\\vb\\project\\VB.g:1:80: GT
				{
				mGT(); 

				}
				break;
			case 13 :
				// ..\\src\\vb\\project\\VB.g:1:83: GTE
				{
				mGTE(); 

				}
				break;
			case 14 :
				// ..\\src\\vb\\project\\VB.g:1:87: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 15 :
				// ..\\src\\vb\\project\\VB.g:1:95: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 16 :
				// ..\\src\\vb\\project\\VB.g:1:102: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 17 :
				// ..\\src\\vb\\project\\VB.g:1:109: LT
				{
				mLT(); 

				}
				break;
			case 18 :
				// ..\\src\\vb\\project\\VB.g:1:112: LTE
				{
				mLTE(); 

				}
				break;
			case 19 :
				// ..\\src\\vb\\project\\VB.g:1:116: MINUS
				{
				mMINUS(); 

				}
				break;
			case 20 :
				// ..\\src\\vb\\project\\VB.g:1:122: MODULO
				{
				mMODULO(); 

				}
				break;
			case 21 :
				// ..\\src\\vb\\project\\VB.g:1:129: NEQ
				{
				mNEQ(); 

				}
				break;
			case 22 :
				// ..\\src\\vb\\project\\VB.g:1:133: NOT
				{
				mNOT(); 

				}
				break;
			case 23 :
				// ..\\src\\vb\\project\\VB.g:1:137: OR
				{
				mOR(); 

				}
				break;
			case 24 :
				// ..\\src\\vb\\project\\VB.g:1:140: PLUS
				{
				mPLUS(); 

				}
				break;
			case 25 :
				// ..\\src\\vb\\project\\VB.g:1:145: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 26 :
				// ..\\src\\vb\\project\\VB.g:1:152: READ
				{
				mREAD(); 

				}
				break;
			case 27 :
				// ..\\src\\vb\\project\\VB.g:1:157: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 28 :
				// ..\\src\\vb\\project\\VB.g:1:164: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 29 :
				// ..\\src\\vb\\project\\VB.g:1:174: TIMES
				{
				mTIMES(); 

				}
				break;
			case 30 :
				// ..\\src\\vb\\project\\VB.g:1:180: TRUE
				{
				mTRUE(); 

				}
				break;
			case 31 :
				// ..\\src\\vb\\project\\VB.g:1:185: VAR
				{
				mVAR(); 

				}
				break;
			case 32 :
				// ..\\src\\vb\\project\\VB.g:1:189: WRITE
				{
				mWRITE(); 

				}
				break;
			case 33 :
				// ..\\src\\vb\\project\\VB.g:1:195: ID
				{
				mID(); 

				}
				break;
			case 34 :
				// ..\\src\\vb\\project\\VB.g:1:198: INT
				{
				mINT(); 

				}
				break;
			case 35 :
				// ..\\src\\vb\\project\\VB.g:1:202: CHAR
				{
				mCHAR(); 

				}
				break;
			case 36 :
				// ..\\src\\vb\\project\\VB.g:1:207: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 37 :
				// ..\\src\\vb\\project\\VB.g:1:215: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\2\uffff\1\40\2\33\1\uffff\1\45\1\47\1\33\1\52\1\33\2\uffff\1\56\6\uffff"+
		"\1\33\3\uffff\3\33\6\uffff\3\33\4\uffff\1\33\2\uffff\1\33\3\uffff\13\33"+
		"\1\103\6\33\1\112\1\113\1\uffff\3\33\1\117\1\120\1\33\2\uffff\1\122\2"+
		"\33\2\uffff\1\33\1\uffff\1\126\1\33\1\130\1\uffff\1\33\1\uffff\1\132\1"+
		"\uffff";
	static final String DFA7_eofS =
		"\133\uffff";
	static final String DFA7_minS =
		"\1\11\1\uffff\1\75\1\157\1\150\1\uffff\1\52\1\75\1\141\1\75\1\156\2\uffff"+
		"\1\75\6\uffff\1\145\3\uffff\1\162\1\141\1\162\6\uffff\1\157\1\141\1\156"+
		"\4\uffff\1\154\2\uffff\1\164\3\uffff\1\141\1\165\1\162\1\151\1\154\1\162"+
		"\2\163\1\145\1\144\1\145\1\60\1\164\1\145\1\141\1\164\1\145\1\147\2\60"+
		"\1\uffff\1\145\1\141\1\143\2\60\1\145\2\uffff\1\60\1\156\1\164\2\uffff"+
		"\1\162\1\uffff\1\60\1\145\1\60\1\uffff\1\162\1\uffff\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\175\1\uffff\1\75\2\157\1\uffff\1\57\1\75\1\141\1\75\1\156\2\uffff\1"+
		"\76\6\uffff\1\145\3\uffff\1\162\1\141\1\162\6\uffff\1\157\1\141\1\156"+
		"\4\uffff\1\154\2\uffff\1\164\3\uffff\1\141\1\165\1\162\1\151\1\154\1\162"+
		"\2\163\1\145\1\144\1\145\1\172\1\164\1\145\1\141\1\164\1\145\1\147\2\172"+
		"\1\uffff\1\145\1\141\1\143\2\172\1\145\2\uffff\1\172\1\156\1\164\2\uffff"+
		"\1\162\1\uffff\1\172\1\145\1\172\1\uffff\1\162\1\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\3\uffff\1\6\5\uffff\1\17\1\20\1\uffff\1\23\1\24\1\26\1\27"+
		"\1\30\1\31\1\uffff\1\33\1\34\1\35\3\uffff\1\41\1\42\1\43\1\45\1\2\1\5"+
		"\3\uffff\1\44\1\10\1\11\1\12\1\uffff\1\15\1\14\1\uffff\1\22\1\25\1\21"+
		"\24\uffff\1\37\6\uffff\1\32\1\36\3\uffff\1\7\1\13\1\uffff\1\40\3\uffff"+
		"\1\3\1\uffff\1\16\1\uffff\1\4";
	static final String DFA7_specialS =
		"\133\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\36\2\uffff\1\36\22\uffff\1\36\1\20\3\uffff\1\17\1\1\1\35\1\14\1\25"+
			"\1\27\1\22\1\5\1\16\1\uffff\1\6\12\34\1\2\1\26\1\15\1\7\1\11\2\uffff"+
			"\32\33\4\uffff\1\33\1\uffff\1\33\1\3\1\4\2\33\1\10\2\33\1\12\10\33\1"+
			"\24\1\33\1\30\1\33\1\31\1\32\3\33\1\13\1\21\1\23",
			"",
			"\1\37",
			"\1\41",
			"\1\42\6\uffff\1\43",
			"",
			"\1\44\4\uffff\1\44",
			"\1\46",
			"\1\50",
			"\1\51",
			"\1\53",
			"",
			"",
			"\1\54\1\55",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\57",
			"",
			"",
			"",
			"\1\60",
			"\1\61",
			"\1\62",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"",
			"",
			"",
			"\1\66",
			"",
			"",
			"\1\67",
			"",
			"",
			"",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\1\114",
			"\1\115",
			"\1\116",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\121",
			"",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\123",
			"\1\124",
			"",
			"",
			"\1\125",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\127",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\1\131",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
			return "1:1: Tokens : ( AND | ASSIGN | BOOLEAN | CHARACTER | COLON | COMMA | CONST | DIVIDE | EQ | EQUALS | FALSE | GT | GTE | INTEGER | LCURLY | LPAREN | LT | LTE | MINUS | MODULO | NEQ | NOT | OR | PLUS | RCURLY | READ | RPAREN | SEMICOLON | TIMES | TRUE | VAR | WRITE | ID | INT | CHAR | COMMENT | WS );";
		}
	}

}

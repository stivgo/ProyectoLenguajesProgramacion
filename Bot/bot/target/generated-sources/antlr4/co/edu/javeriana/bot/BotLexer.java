// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BotLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UP=1, DOWN=2, LEFT=3, RIGHT=4, PICK=5, DROP=6, ID=7, ASSIGN=8, SEMICOLON=9, 
		VAR=10, STRING=11, BOOL=12, NUMBER=13, IF=14, ASIGNIF=15, ELSE=16, END=17, 
		WHILE=18, PLUS=19, MINUS=20, MULT=21, DIV=22, AND=23, OR=24, NOT=25, GT=26, 
		LT=27, GEQ=28, LEQ=29, EQ=30, NEQ=31, DEFINE=32, RETURN=33, PAR_OPEN=34, 
		PAR_CLOSE=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"UP", "DOWN", "LEFT", "RIGHT", "PICK", "DROP", "ID", "ASSIGN", "SEMICOLON", 
		"VAR", "STRING", "BOOL", "NUMBER", "IF", "ASIGNIF", "ELSE", "END", "WHILE", 
		"PLUS", "MINUS", "MULT", "DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", 
		"LEQ", "EQ", "NEQ", "DEFINE", "RETURN", "PAR_OPEN", "PAR_CLOSE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'V'", null, null, "'P'", "'D'", null, "'<-'", "';'", "'''", 
		"'\"'", "'@'", null, "'if'", "'->'", "'else'", "'end'", "'while'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'!'", null, null, "'>='", "'<='", 
		"'='", "'<>'", "'define'", "'return'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "UP", "DOWN", "LEFT", "RIGHT", "PICK", "DROP", "ID", "ASSIGN", "SEMICOLON", 
		"VAR", "STRING", "BOOL", "NUMBER", "IF", "ASIGNIF", "ELSE", "END", "WHILE", 
		"PLUS", "MINUS", "MULT", "DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", 
		"LEQ", "EQ", "NEQ", "DEFINE", "RETURN", "PAR_OPEN", "PAR_CLOSE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BotLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00b9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\6\16k\n\16\r\16\16\16l\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3"+
		"$\3%\6%\u00b4\n%\r%\16%\u00b5\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\6\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u00bb\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3"+
		"\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2"+
		"\2\2\21^\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33j\3"+
		"\2\2\2\35n\3\2\2\2\37q\3\2\2\2!t\3\2\2\2#y\3\2\2\2%}\3\2\2\2\'\u0083\3"+
		"\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61"+
		"\u008d\3\2\2\2\63\u008f\3\2\2\2\65\u0091\3\2\2\2\67\u0093\3\2\2\29\u0095"+
		"\3\2\2\2;\u0098\3\2\2\2=\u009b\3\2\2\2?\u009d\3\2\2\2A\u00a0\3\2\2\2C"+
		"\u00a7\3\2\2\2E\u00ae\3\2\2\2G\u00b0\3\2\2\2I\u00b3\3\2\2\2KL\7`\2\2L"+
		"\4\3\2\2\2MN\7X\2\2N\6\3\2\2\2OP\7>\2\2P\b\3\2\2\2QR\7@\2\2R\n\3\2\2\2"+
		"ST\7R\2\2T\f\3\2\2\2UV\7F\2\2V\16\3\2\2\2W[\t\2\2\2XZ\t\3\2\2YX\3\2\2"+
		"\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\20\3\2\2\2][\3\2\2\2^_\7>\2\2_`\7"+
		"/\2\2`\22\3\2\2\2ab\7=\2\2b\24\3\2\2\2cd\7)\2\2d\26\3\2\2\2ef\7$\2\2f"+
		"\30\3\2\2\2gh\7B\2\2h\32\3\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2m\34\3\2\2\2no\7k\2\2op\7h\2\2p\36\3\2\2\2qr\7/\2\2rs\7@\2"+
		"\2s \3\2\2\2tu\7g\2\2uv\7n\2\2vw\7u\2\2wx\7g\2\2x\"\3\2\2\2yz\7g\2\2z"+
		"{\7p\2\2{|\7f\2\2|$\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082&\3\2\2\2\u0083\u0084\7-\2\2\u0084"+
		"(\3\2\2\2\u0085\u0086\7/\2\2\u0086*\3\2\2\2\u0087\u0088\7,\2\2\u0088,"+
		"\3\2\2\2\u0089\u008a\7\61\2\2\u008a.\3\2\2\2\u008b\u008c\7(\2\2\u008c"+
		"\60\3\2\2\2\u008d\u008e\7~\2\2\u008e\62\3\2\2\2\u008f\u0090\7#\2\2\u0090"+
		"\64\3\2\2\2\u0091\u0092\7@\2\2\u0092\66\3\2\2\2\u0093\u0094\7>\2\2\u0094"+
		"8\3\2\2\2\u0095\u0096\7@\2\2\u0096\u0097\7?\2\2\u0097:\3\2\2\2\u0098\u0099"+
		"\7>\2\2\u0099\u009a\7?\2\2\u009a<\3\2\2\2\u009b\u009c\7?\2\2\u009c>\3"+
		"\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7@\2\2\u009f@\3\2\2\2\u00a0\u00a1"+
		"\7f\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7p\2\2\u00a5\u00a6\7g\2\2\u00a6B\3\2\2\2\u00a7\u00a8\7t\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7t\2\2"+
		"\u00ac\u00ad\7p\2\2\u00adD\3\2\2\2\u00ae\u00af\7*\2\2\u00afF\3\2\2\2\u00b0"+
		"\u00b1\7+\2\2\u00b1H\3\2\2\2\u00b2\u00b4\t\5\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\b%\2\2\u00b8J\3\2\2\2\6\2[l\u00b5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		UP=1, DOWN=2, LEFT=3, RIGHT=4, PICK=5, DROP=6, ASSIGNVAR=7, SEMICOLON=8, 
		VAR=9, NUMBER=10, STRING=11, BOOL=12, TRUE=13, FALSE=14, IF=15, ASSIGNFUN=16, 
		ELSE=17, END=18, WHILE=19, READ=20, WRITE=21, PLUS=22, MINUS=23, MULT=24, 
		DIV=25, AND=26, OR=27, NOT=28, GT=29, LT=30, GEQ=31, LEQ=32, EQ=33, NEQ=34, 
		DEFINE=35, RETURN=36, PAR_OPEN=37, PAR_CLOSE=38, ID=39, WS=40;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"UP", "DOWN", "LEFT", "RIGHT", "PICK", "DROP", "ASSIGNVAR", "SEMICOLON", 
		"VAR", "NUMBER", "STRING", "BOOL", "TRUE", "FALSE", "IF", "ASSIGNFUN", 
		"ELSE", "END", "WHILE", "READ", "WRITE", "PLUS", "MINUS", "MULT", "DIV", 
		"AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "DEFINE", "RETURN", 
		"PAR_OPEN", "PAR_CLOSE", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'V'", null, null, "'P'", "'D'", "'<-'", "';'", "'''", null, 
		"'\"'", "'@'", "'T'", "'F'", "'if'", "'->'", "'else'", "'end'", "'while'", 
		"'?'", "'$'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'!'", null, null, 
		"'>='", "'<='", "'='", "'<>'", "'define'", "'return'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "UP", "DOWN", "LEFT", "RIGHT", "PICK", "DROP", "ASSIGNVAR", "SEMICOLON", 
		"VAR", "NUMBER", "STRING", "BOOL", "TRUE", "FALSE", "IF", "ASSIGNFUN", 
		"ELSE", "END", "WHILE", "READ", "WRITE", "PLUS", "MINUS", "MULT", "DIV", 
		"AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "DEFINE", "RETURN", 
		"PAR_OPEN", "PAR_CLOSE", "ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2*\u00c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\6"+
		"\13h\n\13\r\13\16\13i\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3\'\3\'\3(\3(\7(\u00be\n(\f(\16(\u00c1\13(\3)\6)\u00c4\n)\r)\16"+
		")\u00c5\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*\3\2\6\3\2\62;\5\2C\\aac|"+
		"\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2"+
		"\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25g\3\2"+
		"\2\2\27k\3\2\2\2\31m\3\2\2\2\33o\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!v\3\2"+
		"\2\2#y\3\2\2\2%~\3\2\2\2\'\u0082\3\2\2\2)\u0088\3\2\2\2+\u008a\3\2\2\2"+
		"-\u008c\3\2\2\2/\u008e\3\2\2\2\61\u0090\3\2\2\2\63\u0092\3\2\2\2\65\u0094"+
		"\3\2\2\2\67\u0096\3\2\2\29\u0098\3\2\2\2;\u009a\3\2\2\2=\u009c\3\2\2\2"+
		"?\u009e\3\2\2\2A\u00a1\3\2\2\2C\u00a4\3\2\2\2E\u00a6\3\2\2\2G\u00a9\3"+
		"\2\2\2I\u00b0\3\2\2\2K\u00b7\3\2\2\2M\u00b9\3\2\2\2O\u00bb\3\2\2\2Q\u00c3"+
		"\3\2\2\2ST\7`\2\2T\4\3\2\2\2UV\7X\2\2V\6\3\2\2\2WX\7>\2\2X\b\3\2\2\2Y"+
		"Z\7@\2\2Z\n\3\2\2\2[\\\7R\2\2\\\f\3\2\2\2]^\7F\2\2^\16\3\2\2\2_`\7>\2"+
		"\2`a\7/\2\2a\20\3\2\2\2bc\7=\2\2c\22\3\2\2\2de\7)\2\2e\24\3\2\2\2fh\t"+
		"\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\26\3\2\2\2kl\7$\2\2l\30"+
		"\3\2\2\2mn\7B\2\2n\32\3\2\2\2op\7V\2\2p\34\3\2\2\2qr\7H\2\2r\36\3\2\2"+
		"\2st\7k\2\2tu\7h\2\2u \3\2\2\2vw\7/\2\2wx\7@\2\2x\"\3\2\2\2yz\7g\2\2z"+
		"{\7n\2\2{|\7u\2\2|}\7g\2\2}$\3\2\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080"+
		"\u0081\7f\2\2\u0081&\3\2\2\2\u0082\u0083\7y\2\2\u0083\u0084\7j\2\2\u0084"+
		"\u0085\7k\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087(\3\2\2\2\u0088"+
		"\u0089\7A\2\2\u0089*\3\2\2\2\u008a\u008b\7&\2\2\u008b,\3\2\2\2\u008c\u008d"+
		"\7-\2\2\u008d.\3\2\2\2\u008e\u008f\7/\2\2\u008f\60\3\2\2\2\u0090\u0091"+
		"\7,\2\2\u0091\62\3\2\2\2\u0092\u0093\7\61\2\2\u0093\64\3\2\2\2\u0094\u0095"+
		"\7(\2\2\u0095\66\3\2\2\2\u0096\u0097\7~\2\2\u00978\3\2\2\2\u0098\u0099"+
		"\7#\2\2\u0099:\3\2\2\2\u009a\u009b\7@\2\2\u009b<\3\2\2\2\u009c\u009d\7"+
		">\2\2\u009d>\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0@\3\2"+
		"\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7?\2\2\u00a3B\3\2\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5D\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7@\2\2\u00a8F\3"+
		"\2\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7h\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7g\2\2\u00afH\3\2\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7w\2\2"+
		"\u00b4\u00b5\7t\2\2\u00b5\u00b6\7p\2\2\u00b6J\3\2\2\2\u00b7\u00b8\7*\2"+
		"\2\u00b8L\3\2\2\2\u00b9\u00ba\7+\2\2\u00baN\3\2\2\2\u00bb\u00bf\t\3\2"+
		"\2\u00bc\u00be\t\4\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0P\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c4\t\5\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b)\2\2\u00c8"+
		"R\3\2\2\2\6\2i\u00bf\u00c5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
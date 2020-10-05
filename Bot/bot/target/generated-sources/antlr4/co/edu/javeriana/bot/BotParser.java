// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BotParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_movUp = 2, RULE_movDown = 3, 
		RULE_movRight = 4, RULE_movLeft = 5, RULE_expression = 6;
	public static final String[] ruleNames = {
		"program", "sentence", "movUp", "movDown", "movRight", "movLeft", "expression"
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

	@Override
	public String getGrammarFileName() { return "Bot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		
	Map<String,Object> symbolTable = new HashMap<String,Object>();

	private Bot bot;

	public BotParser(TokenStream input, Bot bot) {
	    this(input);
	    this.bot = bot;
	}


	public BotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT))) != 0)) {
				{
				{
				setState(14);
				sentence();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public MovUpContext movUp() {
			return getRuleContext(MovUpContext.class,0);
		}
		public MovDownContext movDown() {
			return getRuleContext(MovDownContext.class,0);
		}
		public MovRightContext movRight() {
			return getRuleContext(MovRightContext.class,0);
		}
		public MovLeftContext movLeft() {
			return getRuleContext(MovLeftContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(24);
			switch (_input.LA(1)) {
			case UP:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				movUp();
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				movDown();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				movRight();
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				movLeft();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovUpContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode UP() { return getToken(BotParser.UP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public MovUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movUp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterMovUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitMovUp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitMovUp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovUpContext movUp() throws RecognitionException {
		MovUpContext _localctx = new MovUpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_movUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(UP);
			setState(27);
			((MovUpContext)_localctx).expression = expression();
			setState(28);
			match(SEMICOLON);

				System.out.println("ARRIBA ");
				System.out.println(((MovUpContext)_localctx).expression.value);
				bot.up(Integer.parseInt(((MovUpContext)_localctx).expression.value.toString()));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovDownContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode DOWN() { return getToken(BotParser.DOWN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public MovDownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movDown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterMovDown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitMovDown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitMovDown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovDownContext movDown() throws RecognitionException {
		MovDownContext _localctx = new MovDownContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_movDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(DOWN);
			setState(32);
			((MovDownContext)_localctx).expression = expression();
			setState(33);
			match(SEMICOLON);

				System.out.println("ABAJO ");
				System.out.println(((MovDownContext)_localctx).expression.value);
				bot.down(Integer.parseInt(((MovDownContext)_localctx).expression.value.toString()));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovRightContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode RIGHT() { return getToken(BotParser.RIGHT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public MovRightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movRight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterMovRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitMovRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitMovRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovRightContext movRight() throws RecognitionException {
		MovRightContext _localctx = new MovRightContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_movRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(RIGHT);
			setState(37);
			((MovRightContext)_localctx).expression = expression();
			setState(38);
			match(SEMICOLON);

				System.out.println("DERECHA ");
				System.out.println(((MovRightContext)_localctx).expression.value);
				bot.right(Integer.parseInt(((MovRightContext)_localctx).expression.value.toString()));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MovLeftContext extends ParserRuleContext {
		public ExpressionContext expression;
		public TerminalNode LEFT() { return getToken(BotParser.LEFT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public MovLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterMovLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitMovLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitMovLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovLeftContext movLeft() throws RecognitionException {
		MovLeftContext _localctx = new MovLeftContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_movLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(LEFT);
			setState(42);
			((MovLeftContext)_localctx).expression = expression();
			setState(43);
			match(SEMICOLON);

				System.out.println("IZQUIERDA ");
				System.out.println(((MovLeftContext)_localctx).expression.value);
				bot.left(Integer.parseInt(((MovLeftContext)_localctx).expression.value.toString()));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			((ExpressionContext)_localctx).NUMBER = match(NUMBER);
			((ExpressionContext)_localctx).value =  Integer.parseInt((((ExpressionContext)_localctx).NUMBER!=null?((ExpressionContext)_localctx).NUMBER.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\64\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t\2\4\6"+
		"\b\n\f\16\2\2\60\2\23\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b!\3\2\2\2\n&"+
		"\3\2\2\2\f+\3\2\2\2\16\60\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3"+
		"\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\23\3\2\2\2\26\33\5"+
		"\6\4\2\27\33\5\b\5\2\30\33\5\n\6\2\31\33\5\f\7\2\32\26\3\2\2\2\32\27\3"+
		"\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\7\3\2\2\35\36\5"+
		"\16\b\2\36\37\7\13\2\2\37 \b\4\1\2 \7\3\2\2\2!\"\7\4\2\2\"#\5\16\b\2#"+
		"$\7\13\2\2$%\b\5\1\2%\t\3\2\2\2&\'\7\6\2\2\'(\5\16\b\2()\7\13\2\2)*\b"+
		"\6\1\2*\13\3\2\2\2+,\7\5\2\2,-\5\16\b\2-.\7\13\2\2./\b\7\1\2/\r\3\2\2"+
		"\2\60\61\7\17\2\2\61\62\b\b\1\2\62\17\3\2\2\2\4\23\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
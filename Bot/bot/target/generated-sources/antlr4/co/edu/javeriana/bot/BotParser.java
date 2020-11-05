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
		UP=1, DOWN=2, LEFT=3, RIGHT=4, PICK=5, DROP=6, ASSIGNVAR=7, SEMICOLON=8, 
		VAR=9, NUMBER=10, STRING=11, BOOL=12, TRUE=13, FALSE=14, IF=15, ASSIGNFUN=16, 
		ELSE=17, END=18, WHILE=19, READ=20, WRITE=21, PLUS=22, MINUS=23, MULT=24, 
		DIV=25, AND=26, OR=27, NOT=28, GT=29, LT=30, GEQ=31, LEQ=32, EQ=33, NEQ=34, 
		DEFINE=35, RETURN=36, PAR_OPEN=37, PAR_CLOSE=38, ID=39, WS=40;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_movUp = 2, RULE_movDown = 3, 
		RULE_movRight = 4, RULE_movLeft = 5, RULE_pick = 6, RULE_drop = 7, RULE_defvar = 8, 
		RULE_asignvar = 9, RULE_twicevar = 10, RULE_dato = 11, RULE_conditionif = 12, 
		RULE_conditionifelse = 13, RULE_conditionwhile = 14, RULE_condition = 15, 
		RULE_readscreen = 16, RULE_printscreen = 17, RULE_datoprint = 18, RULE_function = 19, 
		RULE_params = 20, RULE_expression = 21;
	public static final String[] ruleNames = {
		"program", "sentence", "movUp", "movDown", "movRight", "movLeft", "pick", 
		"drop", "defvar", "asignvar", "twicevar", "dato", "conditionif", "conditionifelse", 
		"conditionwhile", "condition", "readscreen", "printscreen", "datoprint", 
		"function", "params", "expression"
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
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(44);
				sentence();
				}
				}
				setState(49);
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
		public PickContext pick() {
			return getRuleContext(PickContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public AsignvarContext asignvar() {
			return getRuleContext(AsignvarContext.class,0);
		}
		public TwicevarContext twicevar() {
			return getRuleContext(TwicevarContext.class,0);
		}
		public ConditionifContext conditionif() {
			return getRuleContext(ConditionifContext.class,0);
		}
		public ConditionifelseContext conditionifelse() {
			return getRuleContext(ConditionifelseContext.class,0);
		}
		public ConditionwhileContext conditionwhile() {
			return getRuleContext(ConditionwhileContext.class,0);
		}
		public ReadscreenContext readscreen() {
			return getRuleContext(ReadscreenContext.class,0);
		}
		public PrintscreenContext printscreen() {
			return getRuleContext(PrintscreenContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				movUp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				movDown();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				movRight();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				movLeft();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				pick();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				drop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				defvar();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				asignvar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				twicevar();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(59);
				conditionif();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(60);
				conditionifelse();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(61);
				conditionwhile();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(62);
				readscreen();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(63);
				printscreen();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(64);
				function();
				}
				break;
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
			setState(67);
			match(UP);
			setState(68);
			((MovUpContext)_localctx).expression = expression();
			setState(69);
			match(SEMICOLON);

				System.out.println("ARRIBA ");
				System.out.println(((MovUpContext)_localctx).expression.value);
				bot.up((Integer)((MovUpContext)_localctx).expression.value);

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
			setState(72);
			match(DOWN);
			setState(73);
			((MovDownContext)_localctx).expression = expression();
			setState(74);
			match(SEMICOLON);

				System.out.println("ABAJO ");
				System.out.println(((MovDownContext)_localctx).expression.value);
				bot.down((Integer)((MovDownContext)_localctx).expression.value);

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
			setState(77);
			match(RIGHT);
			setState(78);
			((MovRightContext)_localctx).expression = expression();
			setState(79);
			match(SEMICOLON);

				System.out.println("DERECHA ");
				System.out.println(((MovRightContext)_localctx).expression.value);
				bot.right((Integer)((MovRightContext)_localctx).expression.value);

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
			setState(82);
			match(LEFT);
			setState(83);
			((MovLeftContext)_localctx).expression = expression();
			setState(84);
			match(SEMICOLON);

				System.out.println("IZQUIERDA ");
				System.out.println(((MovLeftContext)_localctx).expression.value);
				bot.left((Integer)((MovLeftContext)_localctx).expression.value);

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

	public static class PickContext extends ParserRuleContext {
		public TerminalNode PICK() { return getToken(BotParser.PICK, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public PickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterPick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitPick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitPick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickContext pick() throws RecognitionException {
		PickContext _localctx = new PickContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(PICK);
			setState(88);
			match(SEMICOLON);

				bot.pick();

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

	public static class DropContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(BotParser.DROP, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(DROP);
			setState(92);
			match(SEMICOLON);

				bot.drop();

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

	public static class DefvarContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(VAR);
			setState(96);
			((DefvarContext)_localctx).ID = match(ID);
			setState(97);
			match(SEMICOLON);

				 symbolTable.put((((DefvarContext)_localctx).ID!=null?((DefvarContext)_localctx).ID.getText():null),0); 

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

	public static class AsignvarContext extends ParserRuleContext {
		public Token ID;
		public DatoContext dato;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode ASSIGNVAR() { return getToken(BotParser.ASSIGNVAR, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public AsignvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterAsignvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitAsignvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitAsignvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignvarContext asignvar() throws RecognitionException {
		AsignvarContext _localctx = new AsignvarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((AsignvarContext)_localctx).ID = match(ID);
			setState(101);
			match(ASSIGNVAR);
			setState(102);
			((AsignvarContext)_localctx).dato = dato();
			setState(103);
			match(SEMICOLON);

				symbolTable.put((((AsignvarContext)_localctx).ID!=null?((AsignvarContext)_localctx).ID.getText():null),((AsignvarContext)_localctx).dato.value);
				System.out.println(((AsignvarContext)_localctx).dato.value);

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

	public static class TwicevarContext extends ParserRuleContext {
		public Token ID;
		public DatoContext dato;
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode ASSIGNVAR() { return getToken(BotParser.ASSIGNVAR, 0); }
		public DatoContext dato() {
			return getRuleContext(DatoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TwicevarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_twicevar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterTwicevar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitTwicevar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitTwicevar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TwicevarContext twicevar() throws RecognitionException {
		TwicevarContext _localctx = new TwicevarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_twicevar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(VAR);
			setState(107);
			((TwicevarContext)_localctx).ID = match(ID);
			setState(108);
			match(ASSIGNVAR);
			setState(109);
			((TwicevarContext)_localctx).dato = dato();
			setState(110);
			match(SEMICOLON);

				symbolTable.put((((TwicevarContext)_localctx).ID!=null?((TwicevarContext)_localctx).ID.getText():null),((TwicevarContext)_localctx).dato.value);
				System.out.println(((TwicevarContext)_localctx).dato.value);

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

	public static class DatoContext extends ParserRuleContext {
		public Object value;
		public Token ID;
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(BotParser.BOOL, 0); }
		public TerminalNode TRUE() { return getToken(BotParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BotParser.FALSE, 0); }
		public List<TerminalNode> STRING() { return getTokens(BotParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BotParser.STRING, i);
		}
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dato);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(BOOL);
				setState(115);
				match(TRUE);
				 ((DatoContext)_localctx).value =  "True";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(BOOL);
				setState(118);
				match(FALSE);
				 ((DatoContext)_localctx).value =  "False";
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(STRING);
				setState(121);
				((DatoContext)_localctx).ID = match(ID);
				setState(122);
				match(STRING);
				 ((DatoContext)_localctx).value =   (((DatoContext)_localctx).ID!=null?((DatoContext)_localctx).ID.getText():null);
				}
				break;
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

	public static class ConditionifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BotParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ASSIGNFUN() { return getToken(BotParser.ASSIGNFUN, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterConditionif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitConditionif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitConditionif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionifContext conditionif() throws RecognitionException {
		ConditionifContext _localctx = new ConditionifContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditionif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(IF);
			setState(127);
			condition();
			setState(128);
			match(ASSIGNFUN);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(129);
				sentence();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(END);
			setState(136);
			match(SEMICOLON);
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

	public static class ConditionifelseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BotParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ASSIGNFUN() { return getToken(BotParser.ASSIGNFUN, 0); }
		public TerminalNode ELSE() { return getToken(BotParser.ELSE, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionifelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionifelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterConditionifelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitConditionifelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitConditionifelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionifelseContext conditionifelse() throws RecognitionException {
		ConditionifelseContext _localctx = new ConditionifelseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionifelse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IF);
			setState(139);
			condition();
			setState(140);
			match(ASSIGNFUN);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(141);
				sentence();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(ELSE);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(148);
				sentence();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(END);
			setState(155);
			match(SEMICOLON);
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

	public static class ConditionwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BotParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ASSIGNFUN() { return getToken(BotParser.ASSIGNFUN, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ConditionwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterConditionwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitConditionwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitConditionwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionwhileContext conditionwhile() throws RecognitionException {
		ConditionwhileContext _localctx = new ConditionwhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(WHILE);
			setState(158);
			condition();
			setState(159);
			match(ASSIGNFUN);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(160);
				sentence();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(END);
			setState(167);
			match(SEMICOLON);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class ReadscreenContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(BotParser.READ, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public ReadscreenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readscreen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterReadscreen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitReadscreen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitReadscreen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadscreenContext readscreen() throws RecognitionException {
		ReadscreenContext _localctx = new ReadscreenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_readscreen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(READ);
			setState(172);
			match(SEMICOLON);
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

	public static class PrintscreenContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(BotParser.WRITE, 0); }
		public DatoprintContext datoprint() {
			return getRuleContext(DatoprintContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public PrintscreenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printscreen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterPrintscreen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitPrintscreen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitPrintscreen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintscreenContext printscreen() throws RecognitionException {
		PrintscreenContext _localctx = new PrintscreenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_printscreen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(WRITE);
			setState(175);
			datoprint();
			setState(176);
			match(SEMICOLON);
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

	public static class DatoprintContext extends ParserRuleContext {
		public Object value;
		public Token ID;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public DatoprintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datoprint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterDatoprint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitDatoprint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitDatoprint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatoprintContext datoprint() throws RecognitionException {
		DatoprintContext _localctx = new DatoprintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_datoprint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((DatoprintContext)_localctx).ID = match(ID);
			 ((DatoprintContext)_localctx).value =   symbolTable.get((((DatoprintContext)_localctx).ID!=null?((DatoprintContext)_localctx).ID.getText():null));
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(BotParser.DEFINE, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BotParser.PAR_OPEN, 0); }
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(BotParser.PAR_CLOSE, 0); }
		public TerminalNode ASSIGNFUN() { return getToken(BotParser.ASSIGNFUN, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(DEFINE);
			setState(182);
			match(ID);
			setState(183);
			match(PAR_OPEN);
			setState(184);
			match(VAR);
			setState(185);
			params();
			setState(186);
			match(PAR_CLOSE);
			setState(187);
			match(ASSIGNFUN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(188);
				sentence();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(END);
			setState(195);
			match(SEMICOLON);
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 42, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\177\n\r\3\16\3\16\3\16\3\16"+
		"\7\16\u0085\n\16\f\16\16\16\u0088\13\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\7\17\u0091\n\17\f\17\16\17\u0094\13\17\3\17\3\17\7\17\u0098\n\17"+
		"\f\17\16\17\u009b\13\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00a4"+
		"\n\20\f\20\16\20\u00a7\13\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u00c0\n\25\f\25\16\25\u00c3\13\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,\2\2\u00cd\2\61\3\2\2\2\4C\3\2\2\2\6E\3\2\2\2\bJ\3\2\2\2\nO\3\2\2\2"+
		"\fT\3\2\2\2\16Y\3\2\2\2\20]\3\2\2\2\22a\3\2\2\2\24f\3\2\2\2\26l\3\2\2"+
		"\2\30~\3\2\2\2\32\u0080\3\2\2\2\34\u008c\3\2\2\2\36\u009f\3\2\2\2 \u00ab"+
		"\3\2\2\2\"\u00ad\3\2\2\2$\u00b0\3\2\2\2&\u00b4\3\2\2\2(\u00b7\3\2\2\2"+
		"*\u00c7\3\2\2\2,\u00c9\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64D\5\6\4\2\65D\5\b"+
		"\5\2\66D\5\n\6\2\67D\5\f\7\28D\5\16\b\29D\5\20\t\2:D\5\22\n\2;D\5\24\13"+
		"\2<D\5\26\f\2=D\5\32\16\2>D\5\34\17\2?D\5\36\20\2@D\5\"\22\2AD\5$\23\2"+
		"BD\5(\25\2C\64\3\2\2\2C\65\3\2\2\2C\66\3\2\2\2C\67\3\2\2\2C8\3\2\2\2C"+
		"9\3\2\2\2C:\3\2\2\2C;\3\2\2\2C<\3\2\2\2C=\3\2\2\2C>\3\2\2\2C?\3\2\2\2"+
		"C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EF\7\3\2\2FG\5,\27\2GH\7\n\2"+
		"\2HI\b\4\1\2I\7\3\2\2\2JK\7\4\2\2KL\5,\27\2LM\7\n\2\2MN\b\5\1\2N\t\3\2"+
		"\2\2OP\7\6\2\2PQ\5,\27\2QR\7\n\2\2RS\b\6\1\2S\13\3\2\2\2TU\7\5\2\2UV\5"+
		",\27\2VW\7\n\2\2WX\b\7\1\2X\r\3\2\2\2YZ\7\7\2\2Z[\7\n\2\2[\\\b\b\1\2\\"+
		"\17\3\2\2\2]^\7\b\2\2^_\7\n\2\2_`\b\t\1\2`\21\3\2\2\2ab\7\13\2\2bc\7)"+
		"\2\2cd\7\n\2\2de\b\n\1\2e\23\3\2\2\2fg\7)\2\2gh\7\t\2\2hi\5\30\r\2ij\7"+
		"\n\2\2jk\b\13\1\2k\25\3\2\2\2lm\7\13\2\2mn\7)\2\2no\7\t\2\2op\5\30\r\2"+
		"pq\7\n\2\2qr\b\f\1\2r\27\3\2\2\2s\177\7\f\2\2tu\7\16\2\2uv\7\17\2\2v\177"+
		"\b\r\1\2wx\7\16\2\2xy\7\20\2\2y\177\b\r\1\2z{\7\r\2\2{|\7)\2\2|}\7\r\2"+
		"\2}\177\b\r\1\2~s\3\2\2\2~t\3\2\2\2~w\3\2\2\2~z\3\2\2\2\177\31\3\2\2\2"+
		"\u0080\u0081\7\21\2\2\u0081\u0082\5 \21\2\u0082\u0086\7\22\2\2\u0083\u0085"+
		"\5\4\3\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\24"+
		"\2\2\u008a\u008b\7\n\2\2\u008b\33\3\2\2\2\u008c\u008d\7\21\2\2\u008d\u008e"+
		"\5 \21\2\u008e\u0092\7\22\2\2\u008f\u0091\5\4\3\2\u0090\u008f\3\2\2\2"+
		"\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0099\7\23\2\2\u0096\u0098\5\4\3\2"+
		"\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\24\2\2"+
		"\u009d\u009e\7\n\2\2\u009e\35\3\2\2\2\u009f\u00a0\7\25\2\2\u00a0\u00a1"+
		"\5 \21\2\u00a1\u00a5\7\22\2\2\u00a2\u00a4\5\4\3\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\7\n\2\2"+
		"\u00aa\37\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac!\3\2\2\2\u00ad\u00ae\7\26"+
		"\2\2\u00ae\u00af\7\n\2\2\u00af#\3\2\2\2\u00b0\u00b1\7\27\2\2\u00b1\u00b2"+
		"\5&\24\2\u00b2\u00b3\7\n\2\2\u00b3%\3\2\2\2\u00b4\u00b5\7)\2\2\u00b5\u00b6"+
		"\b\24\1\2\u00b6\'\3\2\2\2\u00b7\u00b8\7%\2\2\u00b8\u00b9\7)\2\2\u00b9"+
		"\u00ba\7\'\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc\5*\26\2\u00bc\u00bd\7"+
		"(\2\2\u00bd\u00c1\7\22\2\2\u00be\u00c0\5\4\3\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\24\2\2\u00c5\u00c6\7\n\2\2\u00c6"+
		")\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8+\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca"+
		"\u00cb\b\27\1\2\u00cb-\3\2\2\2\n\61C~\u0086\u0092\u0099\u00a5\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from co\edu\javeriana\bot\Bot.g4 by ANTLR 4.5.1
package co.edu.javeriana.bot;


import org.jpavlich.bot.*;
import java.util.Map;
import java.util.HashMap;
import co.edu.javeriana.bot.ast.*;


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
		VAR=9, IF=10, ASSIGNFUN=11, ELSE=12, END=13, WHILE=14, READ=15, WRITE=16, 
		PLUS=17, MINUS=18, MULT=19, DIV=20, AND=21, OR=22, NOT=23, GT=24, LT=25, 
		GEQ=26, LEQ=27, EQ=28, NEQ=29, DEFINE=30, RETURN=31, PAR_OPEN=32, PAR_CLOSE=33, 
		COMMA=34, NUMBER=35, STRING=36, BOOLTRUE=37, BOOLFALSE=38, ID=39, WS=40;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_pick = 2, RULE_drop = 3, RULE_defvar = 4, 
		RULE_assignvar = 5, RULE_conditionif = 6, RULE_conditionwhile = 7, RULE_read = 8, 
		RULE_print = 9, RULE_function = 10, RULE_expression = 11, RULE_andOr = 12, 
		RULE_comparison = 13, RULE_addition = 14, RULE_factor = 15, RULE_term = 16, 
		RULE_executeFun = 17, RULE_movUp = 18, RULE_movDown = 19, RULE_movRight = 20, 
		RULE_movLeft = 21;
	public static final String[] ruleNames = {
		"program", "sentence", "pick", "drop", "defvar", "assignvar", "conditionif", 
		"conditionwhile", "read", "print", "function", "expression", "andOr", 
		"comparison", "addition", "factor", "term", "executeFun", "movUp", "movDown", 
		"movRight", "movLeft"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'V'", null, null, "'P'", "'D'", "'<-'", "';'", "'''", "'if'", 
		"'->'", "'else'", "'end'", "'while'", "'?'", "'$'", "'+'", "'-'", "'*'", 
		"'/'", "'&'", "'|'", "'!'", null, null, "'>='", "'<='", "'='", "'<>'", 
		"'define'", "'return'", "'('", "')'", "','", null, null, "'@T'", "'@F'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "UP", "DOWN", "LEFT", "RIGHT", "PICK", "DROP", "ASSIGNVAR", "SEMICOLON", 
		"VAR", "IF", "ASSIGNFUN", "ELSE", "END", "WHILE", "READ", "WRITE", "PLUS", 
		"MINUS", "MULT", "DIV", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", 
		"EQ", "NEQ", "DEFINE", "RETURN", "PAR_OPEN", "PAR_CLOSE", "COMMA", "NUMBER", 
		"STRING", "BOOLTRUE", "BOOLFALSE", "ID", "WS"
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
		public SentenceContext sentence;
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

					 List<ASTNode>body = new ArrayList<ASTNode>();
					 Map<String,Object> symbolTable = new HashMap<String,Object>();
					 Map<String,Object> funcTable = new HashMap<String,Object>();
					
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(45);
				((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

						for(ASTNode n:body){
							n.execute(symbolTable);
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
		public ASTNode node;
		public PickContext pick;
		public DropContext drop;
		public DefvarContext defvar;
		public AssignvarContext assignvar;
		public ConditionifContext conditionif;
		public ConditionwhileContext conditionwhile;
		public ReadContext read;
		public PrintContext print;
		public FunctionContext function;
		public MovUpContext movUp;
		public MovDownContext movDown;
		public MovRightContext movRight;
		public MovLeftContext movLeft;
		public PickContext pick() {
			return getRuleContext(PickContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public AssignvarContext assignvar() {
			return getRuleContext(AssignvarContext.class,0);
		}
		public ConditionifContext conditionif() {
			return getRuleContext(ConditionifContext.class,0);
		}
		public ConditionwhileContext conditionwhile() {
			return getRuleContext(ConditionwhileContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
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
			setState(94);
			switch (_input.LA(1)) {
			case PICK:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				((SentenceContext)_localctx).pick = pick();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).pick.node;
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				((SentenceContext)_localctx).drop = drop();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).drop.node;
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				((SentenceContext)_localctx).defvar = defvar();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).defvar.node;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				((SentenceContext)_localctx).assignvar = assignvar();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).assignvar.node;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				((SentenceContext)_localctx).conditionif = conditionif();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditionif.node;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				((SentenceContext)_localctx).conditionwhile = conditionwhile();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).conditionwhile.node;
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				((SentenceContext)_localctx).read = read();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).read.node;
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				((SentenceContext)_localctx).print = print();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).print.node;
				}
				break;
			case DEFINE:
				enterOuterAlt(_localctx, 9);
				{
				setState(79);
				((SentenceContext)_localctx).function = function();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).function.node;
				}
				break;
			case UP:
				enterOuterAlt(_localctx, 10);
				{
				setState(82);
				((SentenceContext)_localctx).movUp = movUp();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).movUp.node;
				}
				break;
			case DOWN:
				enterOuterAlt(_localctx, 11);
				{
				setState(85);
				((SentenceContext)_localctx).movDown = movDown();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).movDown.node;
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 12);
				{
				setState(88);
				((SentenceContext)_localctx).movRight = movRight();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).movRight.node;
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 13);
				{
				setState(91);
				((SentenceContext)_localctx).movLeft = movLeft();
				((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).movLeft.node;
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

	public static class PickContext extends ParserRuleContext {
		public ASTNode node;
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
		enterRule(_localctx, 4, RULE_pick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(PICK);
			setState(97);
			match(SEMICOLON);

				bot.pick();
				((PickContext)_localctx).node =  new Pick(this.bot);

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
		public ASTNode node;
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
		enterRule(_localctx, 6, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(DROP);
			setState(101);
			match(SEMICOLON);

				bot.drop();
				((DropContext)_localctx).node =  new Drop(this.bot);

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
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode ASSIGNVAR() { return getToken(BotParser.ASSIGNVAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_defvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VAR);
			setState(105);
			((DefvarContext)_localctx).ID = match(ID);

				((DefvarContext)_localctx).node =  new DefVar((((DefvarContext)_localctx).ID!=null?((DefvarContext)_localctx).ID.getText():null));	 

			setState(111);
			_la = _input.LA(1);
			if (_la==ASSIGNVAR) {
				{
				setState(107);
				match(ASSIGNVAR);
				setState(108);
				((DefvarContext)_localctx).expression = expression();
				((DefvarContext)_localctx).node =  new AssignVar((((DefvarContext)_localctx).ID!=null?((DefvarContext)_localctx).ID.getText():null), ((DefvarContext)_localctx).expression.node);
				}
			}

			setState(113);
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

	public static class AssignvarContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode ASSIGNVAR() { return getToken(BotParser.ASSIGNVAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public AssignvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterAssignvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitAssignvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitAssignvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignvarContext assignvar() throws RecognitionException {
		AssignvarContext _localctx = new AssignvarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((AssignvarContext)_localctx).ID = match(ID);
			setState(116);
			match(ASSIGNVAR);
			setState(117);
			((AssignvarContext)_localctx).expression = expression();
			setState(118);
			match(SEMICOLON);

				((AssignvarContext)_localctx).node =  new AssignVar((((AssignvarContext)_localctx).ID!=null?((AssignvarContext)_localctx).ID.getText():null),((AssignvarContext)_localctx).expression.node );

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
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s1;
		public SentenceContext s2;
		public TerminalNode IF() { return getToken(BotParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGNFUN() { return getToken(BotParser.ASSIGNFUN, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public TerminalNode ELSE() { return getToken(BotParser.ELSE, 0); }
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
		enterRule(_localctx, 12, RULE_conditionif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

					List<ASTNode> body = new ArrayList<ASTNode>();
					List<ASTNode> elseBody = new ArrayList<ASTNode>();
					
			setState(122);
			match(IF);
			setState(123);
			((ConditionifContext)_localctx).expression = expression();
			setState(124);
			match(ASSIGNFUN);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(125);
				((ConditionifContext)_localctx).s1 = sentence();
				body.add(((ConditionifContext)_localctx).s1.node);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(133);
				match(ELSE);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
					{
					{
					setState(134);
					((ConditionifContext)_localctx).s2 = sentence();
					elseBody.add(((ConditionifContext)_localctx).s2.node);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(144);
			match(END);
			setState(145);
			match(SEMICOLON);

					 	((ConditionifContext)_localctx).node =  new If(((ConditionifContext)_localctx).expression.node,body,elseBody);
					 
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
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext sentence;
		public TerminalNode WHILE() { return getToken(BotParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 14, RULE_conditionwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

						List<ASTNode> body = new ArrayList<ASTNode>();
					
			setState(149);
			match(WHILE);
			setState(150);
			((ConditionwhileContext)_localctx).expression = expression();
			setState(151);
			match(ASSIGNFUN);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(152);
				((ConditionwhileContext)_localctx).sentence = sentence();
				body.add(((ConditionwhileContext)_localctx).sentence.node);
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(END);
			setState(161);
			match(SEMICOLON);

						((ConditionwhileContext)_localctx).node =  new While(((ConditionwhileContext)_localctx).expression.node,body);
					
					
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

	public static class ReadContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode READ() { return getToken(BotParser.READ, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(READ);
			setState(165);
			((ReadContext)_localctx).ID = match(ID);
			setState(166);
			match(SEMICOLON);

					((ReadContext)_localctx).node =  new Read((((ReadContext)_localctx).ID!=null?((ReadContext)_localctx).ID.getText():null));
				
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

	public static class PrintContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode WRITE() { return getToken(BotParser.WRITE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(WRITE);
			setState(170);
			((PrintContext)_localctx).expression = expression();
			setState(171);
			match(SEMICOLON);

					((PrintContext)_localctx).node =  new Print(((PrintContext)_localctx).expression.node);
					
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
		public ASTNode node;
		public Token t1;
		public Token t2;
		public Token t3;
		public SentenceContext s1;
		public AndOrContext andOr;
		public TerminalNode DEFINE() { return getToken(BotParser.DEFINE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BotParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BotParser.PAR_CLOSE, 0); }
		public TerminalNode ASSIGNFUN() { return getToken(BotParser.ASSIGNFUN, 0); }
		public TerminalNode END() { return getToken(BotParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(BotParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(BotParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BotParser.ID, i);
		}
		public TerminalNode VAR() { return getToken(BotParser.VAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BotParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BotParser.COMMA, i);
		}
		public TerminalNode RETURN() { return getToken(BotParser.RETURN, 0); }
		public AndOrContext andOr() {
			return getRuleContext(AndOrContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

							Boolean returnFun = false;
							ASTNode returnNode = new Constant("NA");
						
			setState(175);
			match(DEFINE);
			setState(176);
			((FunctionContext)_localctx).t1 = match(ID);
			setState(177);
			match(PAR_OPEN);

							List<String> params = new ArrayList<String>();
							List<ASTNode> body = new ArrayList<ASTNode>();
						
			setState(182);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(179);
				match(VAR);
				setState(180);
				((FunctionContext)_localctx).t2 = match(ID);
				params.add((((FunctionContext)_localctx).t2!=null?((FunctionContext)_localctx).t2.getText():null));
				}
			}

			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(184);
				match(COMMA);
				setState(185);
				((FunctionContext)_localctx).t3 = match(ID);
				params.add((((FunctionContext)_localctx).t3!=null?((FunctionContext)_localctx).t3.getText():null));
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(PAR_CLOSE);
			setState(193);
			match(ASSIGNFUN);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UP) | (1L << DOWN) | (1L << LEFT) | (1L << RIGHT) | (1L << PICK) | (1L << DROP) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << DEFINE) | (1L << ID))) != 0)) {
				{
				{
				setState(194);
				((FunctionContext)_localctx).s1 = sentence();
				body.add(((FunctionContext)_localctx).s1.node);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(202);
				match(RETURN);
				setState(203);
				((FunctionContext)_localctx).andOr = andOr();

							 	returnFun= true;
							 	returnNode = ((FunctionContext)_localctx).andOr.node;
							 
				}
			}

			setState(208);
			match(END);
			setState(209);
			match(SEMICOLON);

						 	((FunctionContext)_localctx).node =  new Function((((FunctionContext)_localctx).t1!=null?((FunctionContext)_localctx).t1.getText():null), params, body, returnFun, returnNode);
				
							
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
		public ASTNode node;
		public AndOrContext t1;
		public AndOrContext t2;
		public AndOrContext andOr() {
			return getRuleContext(AndOrContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BotParser.NOT, 0); }
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
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(219);
			switch (_input.LA(1)) {
			case MINUS:
			case PAR_OPEN:
			case NUMBER:
			case STRING:
			case BOOLTRUE:
			case BOOLFALSE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				((ExpressionContext)_localctx).t1 = andOr();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(NOT);
				setState(216);
				((ExpressionContext)_localctx).t2 = andOr();
				((ExpressionContext)_localctx).node =  new Negation(((ExpressionContext)_localctx).t2.node);
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

	public static class AndOrContext extends ParserRuleContext {
		public ASTNode node;
		public ComparisonContext t1;
		public ComparisonContext t2;
		public ComparisonContext t3;
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(BotParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(BotParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(BotParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(BotParser.OR, i);
		}
		public AndOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOrContext andOr() throws RecognitionException {
		AndOrContext _localctx = new AndOrContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_andOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			((AndOrContext)_localctx).t1 = comparison();
			((AndOrContext)_localctx).node =  ((AndOrContext)_localctx).t1.node;
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(231);
				switch (_input.LA(1)) {
				case AND:
					{
					setState(223);
					match(AND);
					setState(224);
					((AndOrContext)_localctx).t2 = comparison();
					((AndOrContext)_localctx).node =  new And(_localctx.node, ((AndOrContext)_localctx).t2.node);
					}
					break;
				case OR:
					{
					setState(227);
					match(OR);
					setState(228);
					((AndOrContext)_localctx).t3 = comparison();
					((AndOrContext)_localctx).node =  new Or(_localctx.node, ((AndOrContext)_localctx).t3.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(235);
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

	public static class ComparisonContext extends ParserRuleContext {
		public ASTNode node;
		public AdditionContext t1;
		public AdditionContext t2;
		public AdditionContext t3;
		public AdditionContext t4;
		public AdditionContext t5;
		public AdditionContext t6;
		public AdditionContext t7;
		public List<AdditionContext> addition() {
			return getRuleContexts(AdditionContext.class);
		}
		public AdditionContext addition(int i) {
			return getRuleContext(AdditionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(BotParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(BotParser.EQ, i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(BotParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(BotParser.RIGHT, i);
		}
		public List<TerminalNode> LEFT() { return getTokens(BotParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(BotParser.LEFT, i);
		}
		public List<TerminalNode> GEQ() { return getTokens(BotParser.GEQ); }
		public TerminalNode GEQ(int i) {
			return getToken(BotParser.GEQ, i);
		}
		public List<TerminalNode> LEQ() { return getTokens(BotParser.LEQ); }
		public TerminalNode LEQ(int i) {
			return getToken(BotParser.LEQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(BotParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(BotParser.NEQ, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((ComparisonContext)_localctx).t1 = addition();
			((ComparisonContext)_localctx).node =  ((ComparisonContext)_localctx).t1.node;
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT) | (1L << RIGHT) | (1L << GEQ) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) {
				{
				setState(262);
				switch (_input.LA(1)) {
				case EQ:
					{
					setState(238);
					match(EQ);
					setState(239);
					((ComparisonContext)_localctx).t2 = addition();
					((ComparisonContext)_localctx).node =  new Equality(_localctx.node, ((ComparisonContext)_localctx).t2.node);
					}
					break;
				case RIGHT:
					{
					setState(242);
					match(RIGHT);
					setState(243);
					((ComparisonContext)_localctx).t3 = addition();
					((ComparisonContext)_localctx).node =  new GreaterThan(_localctx.node, ((ComparisonContext)_localctx).t3.node);
					}
					break;
				case LEFT:
					{
					setState(246);
					match(LEFT);
					setState(247);
					((ComparisonContext)_localctx).t4 = addition();
					((ComparisonContext)_localctx).node =  new LessThan(_localctx.node, ((ComparisonContext)_localctx).t4.node);
					}
					break;
				case GEQ:
					{
					setState(250);
					match(GEQ);
					setState(251);
					((ComparisonContext)_localctx).t5 = addition();
					((ComparisonContext)_localctx).node =  new GreaterEqual(_localctx.node, ((ComparisonContext)_localctx).t5.node);
					}
					break;
				case LEQ:
					{
					setState(254);
					match(LEQ);
					setState(255);
					((ComparisonContext)_localctx).t6 = addition();
					((ComparisonContext)_localctx).node =  new LessEqual(_localctx.node, ((ComparisonContext)_localctx).t6.node);
					}
					break;
				case NEQ:
					{
					setState(258);
					match(NEQ);
					setState(259);
					((ComparisonContext)_localctx).t7 = addition();
					((ComparisonContext)_localctx).node =  new NotEqual(_localctx.node, ((ComparisonContext)_localctx).t7.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(266);
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

	public static class AdditionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(BotParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(BotParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(BotParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(BotParser.MINUS, i);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((AdditionContext)_localctx).t1 = factor();
			((AdditionContext)_localctx).node =  ((AdditionContext)_localctx).t1.node;
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(277);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(269);
					match(PLUS);
					setState(270);
					((AdditionContext)_localctx).t2 = factor();
					((AdditionContext)_localctx).node =  new Addition(_localctx.node, ((AdditionContext)_localctx).t2.node);
					}
					break;
				case MINUS:
					{
					setState(273);
					match(MINUS);
					setState(274);
					((AdditionContext)_localctx).t2 = factor();
					((AdditionContext)_localctx).node =  new Substraction(_localctx.node, ((AdditionContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(281);
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(BotParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(BotParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(BotParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(BotParser.DIV, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				setState(292);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(284);
					match(MULT);
					setState(285);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					break;
				case DIV:
					{
					setState(288);
					match(DIV);
					setState(289);
					((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Division(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(296);
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token ID;
		public ExpressionContext expression;
		public Token STRING;
		public ExecuteFunContext executeFun;
		public TerminalNode NUMBER() { return getToken(BotParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(BotParser.MINUS, 0); }
		public TerminalNode BOOLTRUE() { return getToken(BotParser.BOOLTRUE, 0); }
		public TerminalNode BOOLFALSE() { return getToken(BotParser.BOOLFALSE, 0); }
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BotParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(BotParser.PAR_CLOSE, 0); }
		public TerminalNode STRING() { return getToken(BotParser.STRING, 0); }
		public ExecuteFunContext executeFun() {
			return getRuleContext(ExecuteFunContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				 ((TermContext)_localctx).node =  new Constant(Float.parseFloat((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(MINUS);
				setState(300);
				((TermContext)_localctx).NUMBER = match(NUMBER);
				 ((TermContext)_localctx).node =  new InverseAdd(Float.parseFloat((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(BOOLTRUE);
				 ((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean("True"));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(BOOLFALSE);
				 ((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean("False"));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new Reference((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				match(PAR_OPEN);
				setState(309);
				((TermContext)_localctx).expression = expression();
				((TermContext)_localctx).node =  ((TermContext)_localctx).expression.node;
				setState(311);
				match(PAR_CLOSE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(313);
				((TermContext)_localctx).STRING = match(STRING);

						String string = (((TermContext)_localctx).STRING!=null?((TermContext)_localctx).STRING.getText():null);
						((TermContext)_localctx).node =  new Constant(string.substring(1, string.length()-1));
					
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(315);
				((TermContext)_localctx).executeFun = executeFun();
				((TermContext)_localctx).node =  ((TermContext)_localctx).executeFun.node;
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

	public static class ExecuteFunContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext p1;
		public ExpressionContext p2;
		public TerminalNode ID() { return getToken(BotParser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(BotParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(BotParser.PAR_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BotParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BotParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).enterExecuteFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BotListener ) ((BotListener)listener).exitExecuteFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BotVisitor ) return ((BotVisitor<? extends T>)visitor).visitExecuteFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteFunContext executeFun() throws RecognitionException {
		ExecuteFunContext _localctx = new ExecuteFunContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_executeFun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

					List<ASTNode> arguments = new ArrayList<ASTNode>();	
				
			setState(321);
			((ExecuteFunContext)_localctx).ID = match(ID);
			setState(322);
			match(PAR_OPEN);
			setState(326);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << PAR_OPEN) | (1L << NUMBER) | (1L << STRING) | (1L << BOOLTRUE) | (1L << BOOLFALSE) | (1L << ID))) != 0)) {
				{
				setState(323);
				((ExecuteFunContext)_localctx).p1 = expression();
				arguments.add(((ExecuteFunContext)_localctx).p1.node);
				}
			}

			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				match(COMMA);
				setState(329);
				((ExecuteFunContext)_localctx).p2 = expression();
				arguments.add(((ExecuteFunContext)_localctx).p2.node);
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(PAR_CLOSE);

					((ExecuteFunContext)_localctx).node =  new ExecuteFun((((ExecuteFunContext)_localctx).ID!=null?((ExecuteFunContext)_localctx).ID.getText():null), arguments);	
				
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
		public ASTNode node;
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
		enterRule(_localctx, 36, RULE_movUp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(UP);
			setState(341);
			((MovUpContext)_localctx).expression = expression();
			setState(342);
			match(SEMICOLON);

				System.out.println("ARRIBA ");
				((MovUpContext)_localctx).node =  new MovUp(this.bot,((MovUpContext)_localctx).expression.node );

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
		public ASTNode node;
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
		enterRule(_localctx, 38, RULE_movDown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(DOWN);
			setState(346);
			((MovDownContext)_localctx).expression = expression();
			setState(347);
			match(SEMICOLON);

				System.out.println("ABAJO ");
				((MovDownContext)_localctx).node =  new MovDown(this.bot,((MovDownContext)_localctx).expression.node );
				

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
		public ASTNode node;
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
		enterRule(_localctx, 40, RULE_movRight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(RIGHT);
			setState(351);
			((MovRightContext)_localctx).expression = expression();
			setState(352);
			match(SEMICOLON);

				System.out.println("DERECHA ");
				((MovRightContext)_localctx).node =  new MovRight(this.bot,((MovRightContext)_localctx).expression.node );
				

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
		public ASTNode node;
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
		enterRule(_localctx, 42, RULE_movLeft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(LEFT);
			setState(356);
			((MovLeftContext)_localctx).expression = expression();
			setState(357);
			match(SEMICOLON);

				System.out.println("IZQUIERDA ");
				((MovLeftContext)_localctx).node =  new MovLeft(this.bot,((MovLeftContext)_localctx).expression.node );

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u016b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0083\n\b\f\b\16"+
		"\b\u0086\13\b\3\b\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13\b\5\b\u0091"+
		"\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009e\n\t\f\t\16"+
		"\t\u00a1\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b9\n\f\3\f\3\f\3\f\7\f\u00be"+
		"\n\f\f\f\16\f\u00c1\13\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb"+
		"\13\f\3\f\3\f\3\f\3\f\5\f\u00d1\n\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00de\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00ea\n\16\f\16\16\16\u00ed\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0109\n\17\f\17\16\17\u010c\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0118\n\20"+
		"\f\20\16\20\u011b\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u0127\n\21\f\21\16\21\u012a\13\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u0141\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0149\n\23"+
		"\3\23\3\23\3\23\3\23\7\23\u014f\n\23\f\23\16\23\u0152\13\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,\2\2\u0180\2.\3\2\2\2\4`\3\2\2\2\6b\3\2\2\2\bf"+
		"\3\2\2\2\nj\3\2\2\2\fu\3\2\2\2\16{\3\2\2\2\20\u0096\3\2\2\2\22\u00a6\3"+
		"\2\2\2\24\u00ab\3\2\2\2\26\u00b0\3\2\2\2\30\u00dd\3\2\2\2\32\u00df\3\2"+
		"\2\2\34\u00ee\3\2\2\2\36\u010d\3\2\2\2 \u011c\3\2\2\2\"\u0140\3\2\2\2"+
		"$\u0142\3\2\2\2&\u0156\3\2\2\2(\u015b\3\2\2\2*\u0160\3\2\2\2,\u0165\3"+
		"\2\2\2.\64\b\2\1\2/\60\5\4\3\2\60\61\b\2\1\2\61\63\3\2\2\2\62/\3\2\2\2"+
		"\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2"+
		"\678\b\2\1\28\3\3\2\2\29:\5\6\4\2:;\b\3\1\2;a\3\2\2\2<=\5\b\5\2=>\b\3"+
		"\1\2>a\3\2\2\2?@\5\n\6\2@A\b\3\1\2Aa\3\2\2\2BC\5\f\7\2CD\b\3\1\2Da\3\2"+
		"\2\2EF\5\16\b\2FG\b\3\1\2Ga\3\2\2\2HI\5\20\t\2IJ\b\3\1\2Ja\3\2\2\2KL\5"+
		"\22\n\2LM\b\3\1\2Ma\3\2\2\2NO\5\24\13\2OP\b\3\1\2Pa\3\2\2\2QR\5\26\f\2"+
		"RS\b\3\1\2Sa\3\2\2\2TU\5&\24\2UV\b\3\1\2Va\3\2\2\2WX\5(\25\2XY\b\3\1\2"+
		"Ya\3\2\2\2Z[\5*\26\2[\\\b\3\1\2\\a\3\2\2\2]^\5,\27\2^_\b\3\1\2_a\3\2\2"+
		"\2`9\3\2\2\2`<\3\2\2\2`?\3\2\2\2`B\3\2\2\2`E\3\2\2\2`H\3\2\2\2`K\3\2\2"+
		"\2`N\3\2\2\2`Q\3\2\2\2`T\3\2\2\2`W\3\2\2\2`Z\3\2\2\2`]\3\2\2\2a\5\3\2"+
		"\2\2bc\7\7\2\2cd\7\n\2\2de\b\4\1\2e\7\3\2\2\2fg\7\b\2\2gh\7\n\2\2hi\b"+
		"\5\1\2i\t\3\2\2\2jk\7\13\2\2kl\7)\2\2lq\b\6\1\2mn\7\t\2\2no\5\30\r\2o"+
		"p\b\6\1\2pr\3\2\2\2qm\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\n\2\2t\13\3\2\2"+
		"\2uv\7)\2\2vw\7\t\2\2wx\5\30\r\2xy\7\n\2\2yz\b\7\1\2z\r\3\2\2\2{|\b\b"+
		"\1\2|}\7\f\2\2}~\5\30\r\2~\u0084\7\r\2\2\177\u0080\5\4\3\2\u0080\u0081"+
		"\b\b\1\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0090\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u008d\7\16\2\2\u0088\u0089\5\4\3\2\u0089\u008a\b\b\1\2\u008a"+
		"\u008c\3\2\2\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0087\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\17"+
		"\2\2\u0093\u0094\7\n\2\2\u0094\u0095\b\b\1\2\u0095\17\3\2\2\2\u0096\u0097"+
		"\b\t\1\2\u0097\u0098\7\20\2\2\u0098\u0099\5\30\r\2\u0099\u009f\7\r\2\2"+
		"\u009a\u009b\5\4\3\2\u009b\u009c\b\t\1\2\u009c\u009e\3\2\2\2\u009d\u009a"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4\7"+
		"\n\2\2\u00a4\u00a5\b\t\1\2\u00a5\21\3\2\2\2\u00a6\u00a7\7\21\2\2\u00a7"+
		"\u00a8\7)\2\2\u00a8\u00a9\7\n\2\2\u00a9\u00aa\b\n\1\2\u00aa\23\3\2\2\2"+
		"\u00ab\u00ac\7\22\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7\n\2\2\u00ae\u00af"+
		"\b\13\1\2\u00af\25\3\2\2\2\u00b0\u00b1\b\f\1\2\u00b1\u00b2\7 \2\2\u00b2"+
		"\u00b3\7)\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b8\b\f\1\2\u00b5\u00b6\7\13"+
		"\2\2\u00b6\u00b7\7)\2\2\u00b7\u00b9\b\f\1\2\u00b8\u00b5\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb\u00bc\7)\2"+
		"\2\u00bc\u00be\b\f\1\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\7#\2\2\u00c3\u00c9\7\r\2\2\u00c4\u00c5\5\4\3\2\u00c5\u00c6\b\f"+
		"\1\2\u00c6\u00c8\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d0\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cd\7!\2\2\u00cd\u00ce\5\32\16\2\u00ce\u00cf\b\f\1\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\7\17\2\2\u00d3\u00d4\7\n\2\2\u00d4\u00d5\b\f\1\2\u00d5"+
		"\27\3\2\2\2\u00d6\u00d7\5\32\16\2\u00d7\u00d8\b\r\1\2\u00d8\u00de\3\2"+
		"\2\2\u00d9\u00da\7\31\2\2\u00da\u00db\5\32\16\2\u00db\u00dc\b\r\1\2\u00dc"+
		"\u00de\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00d9\3\2\2\2\u00de\31\3\2\2"+
		"\2\u00df\u00e0\5\34\17\2\u00e0\u00eb\b\16\1\2\u00e1\u00e2\7\27\2\2\u00e2"+
		"\u00e3\5\34\17\2\u00e3\u00e4\b\16\1\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6"+
		"\7\30\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8\b\16\1\2\u00e8\u00ea\3\2\2"+
		"\2\u00e9\u00e1\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\33\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\5\36\20\2\u00ef\u010a\b\17\1\2\u00f0\u00f1\7\36\2\2\u00f1\u00f2"+
		"\5\36\20\2\u00f2\u00f3\b\17\1\2\u00f3\u0109\3\2\2\2\u00f4\u00f5\7\6\2"+
		"\2\u00f5\u00f6\5\36\20\2\u00f6\u00f7\b\17\1\2\u00f7\u0109\3\2\2\2\u00f8"+
		"\u00f9\7\5\2\2\u00f9\u00fa\5\36\20\2\u00fa\u00fb\b\17\1\2\u00fb\u0109"+
		"\3\2\2\2\u00fc\u00fd\7\34\2\2\u00fd\u00fe\5\36\20\2\u00fe\u00ff\b\17\1"+
		"\2\u00ff\u0109\3\2\2\2\u0100\u0101\7\35\2\2\u0101\u0102\5\36\20\2\u0102"+
		"\u0103\b\17\1\2\u0103\u0109\3\2\2\2\u0104\u0105\7\37\2\2\u0105\u0106\5"+
		"\36\20\2\u0106\u0107\b\17\1\2\u0107\u0109\3\2\2\2\u0108\u00f0\3\2\2\2"+
		"\u0108\u00f4\3\2\2\2\u0108\u00f8\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u0100"+
		"\3\2\2\2\u0108\u0104\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\35\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5 \21"+
		"\2\u010e\u0119\b\20\1\2\u010f\u0110\7\23\2\2\u0110\u0111\5 \21\2\u0111"+
		"\u0112\b\20\1\2\u0112\u0118\3\2\2\2\u0113\u0114\7\24\2\2\u0114\u0115\5"+
		" \21\2\u0115\u0116\b\20\1\2\u0116\u0118\3\2\2\2\u0117\u010f\3\2\2\2\u0117"+
		"\u0113\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\37\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\5\"\22\2\u011d\u0128"+
		"\b\21\1\2\u011e\u011f\7\25\2\2\u011f\u0120\5\"\22\2\u0120\u0121\b\21\1"+
		"\2\u0121\u0127\3\2\2\2\u0122\u0123\7\26\2\2\u0123\u0124\5\"\22\2\u0124"+
		"\u0125\b\21\1\2\u0125\u0127\3\2\2\2\u0126\u011e\3\2\2\2\u0126\u0122\3"+
		"\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"!\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7%\2\2\u012c\u0141\b\22\1\2"+
		"\u012d\u012e\7\24\2\2\u012e\u012f\7%\2\2\u012f\u0141\b\22\1\2\u0130\u0131"+
		"\7\'\2\2\u0131\u0141\b\22\1\2\u0132\u0133\7(\2\2\u0133\u0141\b\22\1\2"+
		"\u0134\u0135\7)\2\2\u0135\u0141\b\22\1\2\u0136\u0137\7\"\2\2\u0137\u0138"+
		"\5\30\r\2\u0138\u0139\b\22\1\2\u0139\u013a\7#\2\2\u013a\u0141\3\2\2\2"+
		"\u013b\u013c\7&\2\2\u013c\u0141\b\22\1\2\u013d\u013e\5$\23\2\u013e\u013f"+
		"\b\22\1\2\u013f\u0141\3\2\2\2\u0140\u012b\3\2\2\2\u0140\u012d\3\2\2\2"+
		"\u0140\u0130\3\2\2\2\u0140\u0132\3\2\2\2\u0140\u0134\3\2\2\2\u0140\u0136"+
		"\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013d\3\2\2\2\u0141#\3\2\2\2\u0142"+
		"\u0143\b\23\1\2\u0143\u0144\7)\2\2\u0144\u0148\7\"\2\2\u0145\u0146\5\30"+
		"\r\2\u0146\u0147\b\23\1\2\u0147\u0149\3\2\2\2\u0148\u0145\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0150\3\2\2\2\u014a\u014b\7$\2\2\u014b\u014c\5\30"+
		"\r\2\u014c\u014d\b\23\1\2\u014d\u014f\3\2\2\2\u014e\u014a\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7#\2\2\u0154\u0155\b\23\1\2\u0155"+
		"%\3\2\2\2\u0156\u0157\7\3\2\2\u0157\u0158\5\30\r\2\u0158\u0159\7\n\2\2"+
		"\u0159\u015a\b\24\1\2\u015a\'\3\2\2\2\u015b\u015c\7\4\2\2\u015c\u015d"+
		"\5\30\r\2\u015d\u015e\7\n\2\2\u015e\u015f\b\25\1\2\u015f)\3\2\2\2\u0160"+
		"\u0161\7\6\2\2\u0161\u0162\5\30\r\2\u0162\u0163\7\n\2\2\u0163\u0164\b"+
		"\26\1\2\u0164+\3\2\2\2\u0165\u0166\7\5\2\2\u0166\u0167\5\30\r\2\u0167"+
		"\u0168\7\n\2\2\u0168\u0169\b\27\1\2\u0169-\3\2\2\2\31\64`q\u0084\u008d"+
		"\u0090\u009f\u00b8\u00bf\u00c9\u00d0\u00dd\u00e9\u00eb\u0108\u010a\u0117"+
		"\u0119\u0126\u0128\u0140\u0148\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
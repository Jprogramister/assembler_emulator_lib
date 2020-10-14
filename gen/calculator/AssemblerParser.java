// Generated from /home/dmitry/IdeaProjects/Antlr4_Assembler/src/main/java/calculator/Assembler.g4 by ANTLR 4.8
package calculator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AX=3, AL=4, AH=5, BX=6, BH=7, BL=8, CX=9, CH=10, CL=11, 
		DS=12, DX=13, DH=14, DL=15, CS=16, CP=17, SS=18, SP=19, ID=20, NUMBER=21, 
		HEX_NUMBER=22, INT=23, NEWLINE=24, WS=25;
	public static final int
		RULE_programm = 0, RULE_stat = 1, RULE_labelDef = 2, RULE_unaryExpr = 3, 
		RULE_binaryExpr = 4, RULE_instruction = 5, RULE_register = 6, RULE_commonRegister = 7, 
		RULE_codeRegister = 8, RULE_stackRegister = 9, RULE_dataRegister = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "stat", "labelDef", "unaryExpr", "binaryExpr", "instruction", 
			"register", "commonRegister", "codeRegister", "stackRegister", "dataRegister"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AX", "AL", "AH", "BX", "BH", "BL", "CX", "CH", "CL", 
			"DS", "DX", "DH", "DL", "CS", "CP", "SS", "SP", "ID", "NUMBER", "HEX_NUMBER", 
			"INT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Assembler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgrammContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitProgramm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitProgramm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				stat();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class StatContext extends ParserRuleContext {
		public LabelDefContext labelDef() {
			return getRuleContext(LabelDefContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AssemblerParser.NEWLINE, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public BinaryExprContext binaryExpr() {
			return getRuleContext(BinaryExprContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				labelDef();
				setState(28);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				unaryExpr();
				setState(31);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				binaryExpr();
				setState(34);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				instruction();
				setState(37);
				match(NEWLINE);
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

	public static class LabelDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AssemblerParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(AssemblerParser.NEWLINE, 0); }
		public LabelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterLabelDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitLabelDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitLabelDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefContext labelDef() throws RecognitionException {
		LabelDefContext _localctx = new LabelDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_labelDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ID);
			setState(42);
			match(T__0);
			setState(43);
			match(NEWLINE);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExprConstContext extends UnaryExprContext {
		public TerminalNode ID() { return getToken(AssemblerParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(AssemblerParser.NUMBER, 0); }
		public UnaryExprConstContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterUnaryExprConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitUnaryExprConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitUnaryExprConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExprRegisterContext extends UnaryExprContext {
		public TerminalNode ID() { return getToken(AssemblerParser.ID, 0); }
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public UnaryExprRegisterContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterUnaryExprRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitUnaryExprRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitUnaryExprRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryExpr);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new UnaryExprConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(ID);
				setState(46);
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new UnaryExprRegisterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(ID);
				setState(48);
				register();
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

	public static class BinaryExprContext extends ParserRuleContext {
		public BinaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpr; }
	 
		public BinaryExprContext() { }
		public void copyFrom(BinaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryExprRegisterConstContext extends BinaryExprContext {
		public TerminalNode ID() { return getToken(AssemblerParser.ID, 0); }
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(AssemblerParser.NUMBER, 0); }
		public BinaryExprRegisterConstContext(BinaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterBinaryExprRegisterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitBinaryExprRegisterConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitBinaryExprRegisterConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprRegistersContext extends BinaryExprContext {
		public TerminalNode ID() { return getToken(AssemblerParser.ID, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public BinaryExprRegistersContext(BinaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterBinaryExprRegisters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitBinaryExprRegisters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitBinaryExprRegisters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExprContext binaryExpr() throws RecognitionException {
		BinaryExprContext _localctx = new BinaryExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_binaryExpr);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BinaryExprRegistersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(ID);
				setState(52);
				register();
				setState(53);
				match(T__1);
				setState(54);
				register();
				}
				break;
			case 2:
				_localctx = new BinaryExprRegisterConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(ID);
				setState(57);
				register();
				setState(58);
				match(T__1);
				setState(59);
				match(NUMBER);
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

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AssemblerParser.ID, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ID);
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

	public static class RegisterContext extends ParserRuleContext {
		public CommonRegisterContext commonRegister() {
			return getRuleContext(CommonRegisterContext.class,0);
		}
		public CodeRegisterContext codeRegister() {
			return getRuleContext(CodeRegisterContext.class,0);
		}
		public StackRegisterContext stackRegister() {
			return getRuleContext(StackRegisterContext.class,0);
		}
		public DataRegisterContext dataRegister() {
			return getRuleContext(DataRegisterContext.class,0);
		}
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_register);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				commonRegister();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				codeRegister();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				stackRegister();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				dataRegister();
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

	public static class CommonRegisterContext extends ParserRuleContext {
		public TerminalNode AX() { return getToken(AssemblerParser.AX, 0); }
		public TerminalNode AL() { return getToken(AssemblerParser.AL, 0); }
		public TerminalNode AH() { return getToken(AssemblerParser.AH, 0); }
		public TerminalNode BX() { return getToken(AssemblerParser.BX, 0); }
		public TerminalNode BH() { return getToken(AssemblerParser.BH, 0); }
		public TerminalNode BL() { return getToken(AssemblerParser.BL, 0); }
		public TerminalNode CX() { return getToken(AssemblerParser.CX, 0); }
		public TerminalNode CH() { return getToken(AssemblerParser.CH, 0); }
		public TerminalNode CL() { return getToken(AssemblerParser.CL, 0); }
		public TerminalNode DX() { return getToken(AssemblerParser.DX, 0); }
		public TerminalNode DH() { return getToken(AssemblerParser.DH, 0); }
		public TerminalNode DL() { return getToken(AssemblerParser.DL, 0); }
		public CommonRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterCommonRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitCommonRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitCommonRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonRegisterContext commonRegister() throws RecognitionException {
		CommonRegisterContext _localctx = new CommonRegisterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commonRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AX) | (1L << AL) | (1L << AH) | (1L << BX) | (1L << BH) | (1L << BL) | (1L << CX) | (1L << CH) | (1L << CL) | (1L << DX) | (1L << DH) | (1L << DL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CodeRegisterContext extends ParserRuleContext {
		public TerminalNode CS() { return getToken(AssemblerParser.CS, 0); }
		public TerminalNode CP() { return getToken(AssemblerParser.CP, 0); }
		public CodeRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterCodeRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitCodeRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitCodeRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeRegisterContext codeRegister() throws RecognitionException {
		CodeRegisterContext _localctx = new CodeRegisterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_codeRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==CS || _la==CP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StackRegisterContext extends ParserRuleContext {
		public TerminalNode SS() { return getToken(AssemblerParser.SS, 0); }
		public TerminalNode SP() { return getToken(AssemblerParser.SP, 0); }
		public StackRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterStackRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitStackRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitStackRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackRegisterContext stackRegister() throws RecognitionException {
		StackRegisterContext _localctx = new StackRegisterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stackRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !(_la==SS || _la==SP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DataRegisterContext extends ParserRuleContext {
		public TerminalNode DS() { return getToken(AssemblerParser.DS, 0); }
		public TerminalNode DX() { return getToken(AssemblerParser.DX, 0); }
		public DataRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).enterDataRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerListener ) ((AssemblerListener)listener).exitDataRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerVisitor ) return ((AssemblerVisitor<? extends T>)visitor).visitDataRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRegisterContext dataRegister() throws RecognitionException {
		DataRegisterContext _localctx = new DataRegisterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !(_la==DS || _la==DX) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\64\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\b\3\b\3\b\3\b\5"+
		"\bH\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\6\4\2\5\r\17\21\3\2\22\23\3\2\24\25\3\2\16\17\2O\2\31\3\2"+
		"\2\2\4)\3\2\2\2\6+\3\2\2\2\b\63\3\2\2\2\n?\3\2\2\2\fA\3\2\2\2\16G\3\2"+
		"\2\2\20I\3\2\2\2\22K\3\2\2\2\24M\3\2\2\2\26O\3\2\2\2\30\32\5\4\3\2\31"+
		"\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35"+
		"\36\5\6\4\2\36\37\7\32\2\2\37*\3\2\2\2 !\5\b\5\2!\"\7\32\2\2\"*\3\2\2"+
		"\2#$\5\n\6\2$%\7\32\2\2%*\3\2\2\2&\'\5\f\7\2\'(\7\32\2\2(*\3\2\2\2)\35"+
		"\3\2\2\2) \3\2\2\2)#\3\2\2\2)&\3\2\2\2*\5\3\2\2\2+,\7\26\2\2,-\7\3\2\2"+
		"-.\7\32\2\2.\7\3\2\2\2/\60\7\26\2\2\60\64\7\27\2\2\61\62\7\26\2\2\62\64"+
		"\5\16\b\2\63/\3\2\2\2\63\61\3\2\2\2\64\t\3\2\2\2\65\66\7\26\2\2\66\67"+
		"\5\16\b\2\678\7\4\2\289\5\16\b\29@\3\2\2\2:;\7\26\2\2;<\5\16\b\2<=\7\4"+
		"\2\2=>\7\27\2\2>@\3\2\2\2?\65\3\2\2\2?:\3\2\2\2@\13\3\2\2\2AB\7\26\2\2"+
		"B\r\3\2\2\2CH\5\20\t\2DH\5\22\n\2EH\5\24\13\2FH\5\26\f\2GC\3\2\2\2GD\3"+
		"\2\2\2GE\3\2\2\2GF\3\2\2\2H\17\3\2\2\2IJ\t\2\2\2J\21\3\2\2\2KL\t\3\2\2"+
		"L\23\3\2\2\2MN\t\4\2\2N\25\3\2\2\2OP\t\5\2\2P\27\3\2\2\2\7\33)\63?G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
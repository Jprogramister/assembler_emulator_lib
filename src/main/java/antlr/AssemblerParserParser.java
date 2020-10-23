// Generated from /home/dmitry/IdeaProjects/Antlr4_Assembler/src/main/java/grammar/AssemblerParser.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CS=3, CP=4, SS=5, SP=6, DS=7, DP=8, AX=9, AL=10, AH=11, 
		BX=12, BH=13, BL=14, CX=15, CH=16, CL=17, DX=18, DH=19, DL=20, NUMBER=21, 
		HEX_NUMBER=22, INT=23, NEWLINE=24, WS=25, PUSH=26, POP=27, MOV=28, ADD=29, 
		SUB=30, DIV=31, MUL=32, CALL=33, RET=34, JMP=35, ID=36;
	public static final int
		RULE_programm = 0, RULE_stat = 1, RULE_labelDef = 2, RULE_unaryOperation = 3, 
		RULE_unaryOperator = 4, RULE_binaryOperation = 5, RULE_binaryOperator = 6, 
		RULE_instruction = 7, RULE_register = 8, RULE_codeRegister = 9, RULE_stackRegister = 10, 
		RULE_dataRegister = 11, RULE_commonRegister = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programm", "stat", "labelDef", "unaryOperation", "unaryOperator", "binaryOperation", 
			"binaryOperator", "instruction", "register", "codeRegister", "stackRegister", 
			"dataRegister", "commonRegister"
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
			null, null, null, "CS", "CP", "SS", "SP", "DS", "DP", "AX", "AL", "AH", 
			"BX", "BH", "BL", "CX", "CH", "CL", "DX", "DH", "DL", "NUMBER", "HEX_NUMBER", 
			"INT", "NEWLINE", "WS", "PUSH", "POP", "MOV", "ADD", "SUB", "DIV", "MUL", 
			"CALL", "RET", "JMP", "ID"
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
	public String getGrammarFileName() { return "AssemblerParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AssemblerParserParser(TokenStream input) {
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
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitProgramm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor) return ((AssemblerParserVisitor<? extends T>)visitor).visitProgramm(this);
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				stat();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUSH) | (1L << POP) | (1L << MOV) | (1L << ADD) | (1L << SUB) | (1L << DIV) | (1L << MUL) | (1L << CALL) | (1L << RET) | (1L << JMP) | (1L << ID))) != 0) );
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
		public UnaryOperationContext unaryOperation() {
			return getRuleContext(UnaryOperationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AssemblerParserParser.NEWLINE, 0); }
		public BinaryOperationContext binaryOperation() {
			return getRuleContext(BinaryOperationContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public LabelDefContext labelDef() {
			return getRuleContext(LabelDefContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
			case POP:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				unaryOperation();
				setState(32);
				match(NEWLINE);
				}
				break;
			case MOV:
			case ADD:
			case SUB:
			case DIV:
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				binaryOperation();
				setState(35);
				match(NEWLINE);
				}
				break;
			case CALL:
			case RET:
			case JMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				instruction();
				setState(38);
				match(NEWLINE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				labelDef();
				setState(41);
				match(NEWLINE);
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

	public static class LabelDefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AssemblerParserParser.ID, 0); }
		public LabelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterLabelDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitLabelDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitLabelDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefContext labelDef() throws RecognitionException {
		LabelDefContext _localctx = new LabelDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_labelDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(ID);
			setState(46);
			match(T__0);
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

	public static class UnaryOperationContext extends ParserRuleContext {
		public UnaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperation; }
	 
		public UnaryOperationContext() { }
		public void copyFrom(UnaryOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryOperationRegisterContext extends UnaryOperationContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public UnaryOperationRegisterContext(UnaryOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterUnaryOperationRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitUnaryOperationRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitUnaryOperationRegister(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperationConstContext extends UnaryOperationContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(AssemblerParserParser.NUMBER, 0); }
		public UnaryOperationConstContext(UnaryOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterUnaryOperationConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitUnaryOperationConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitUnaryOperationConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperationContext unaryOperation() throws RecognitionException {
		UnaryOperationContext _localctx = new UnaryOperationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unaryOperation);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new UnaryOperationConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				unaryOperator();
				setState(49);
				match(NUMBER);
				}
				break;
			case 2:
				_localctx = new UnaryOperationRegisterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				unaryOperator();
				setState(52);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(AssemblerParserParser.PUSH, 0); }
		public TerminalNode POP() { return getToken(AssemblerParserParser.POP, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==PUSH || _la==POP) ) {
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

	public static class BinaryOperationContext extends ParserRuleContext {
		public BinaryOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperation; }
	 
		public BinaryOperationContext() { }
		public void copyFrom(BinaryOperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinaryExprRegisterConstContext extends BinaryOperationContext {
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(AssemblerParserParser.NUMBER, 0); }
		public BinaryExprRegisterConstContext(BinaryOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterBinaryExprRegisterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitBinaryExprRegisterConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitBinaryExprRegisterConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryExprRegistersContext extends BinaryOperationContext {
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public BinaryExprRegistersContext(BinaryOperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterBinaryExprRegisters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitBinaryExprRegisters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitBinaryExprRegisters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperationContext binaryOperation() throws RecognitionException {
		BinaryOperationContext _localctx = new BinaryOperationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binaryOperation);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BinaryExprRegistersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				binaryOperator();
				setState(59);
				register();
				setState(60);
				match(T__1);
				setState(61);
				register();
				}
				break;
			case 2:
				_localctx = new BinaryExprRegisterConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				binaryOperator();
				setState(64);
				register();
				setState(65);
				match(T__1);
				setState(66);
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(AssemblerParserParser.MOV, 0); }
		public TerminalNode ADD() { return getToken(AssemblerParserParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(AssemblerParserParser.SUB, 0); }
		public TerminalNode DIV() { return getToken(AssemblerParserParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(AssemblerParserParser.MUL, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOV) | (1L << ADD) | (1L << SUB) | (1L << DIV) | (1L << MUL))) != 0)) ) {
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

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(AssemblerParserParser.CALL, 0); }
		public TerminalNode RET() { return getToken(AssemblerParserParser.RET, 0); }
		public TerminalNode JMP() { return getToken(AssemblerParserParser.JMP, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CALL) | (1L << RET) | (1L << JMP))) != 0)) ) {
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
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_register);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AX:
			case AL:
			case AH:
			case BX:
			case BH:
			case BL:
			case CX:
			case CH:
			case CL:
			case DX:
			case DH:
			case DL:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				commonRegister();
				}
				break;
			case CS:
			case CP:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				codeRegister();
				}
				break;
			case SS:
			case SP:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				stackRegister();
				}
				break;
			case DS:
			case DP:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				dataRegister();
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

	public static class CodeRegisterContext extends ParserRuleContext {
		public TerminalNode CS() { return getToken(AssemblerParserParser.CS, 0); }
		public TerminalNode CP() { return getToken(AssemblerParserParser.CP, 0); }
		public CodeRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterCodeRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitCodeRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitCodeRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeRegisterContext codeRegister() throws RecognitionException {
		CodeRegisterContext _localctx = new CodeRegisterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_codeRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		public TerminalNode SS() { return getToken(AssemblerParserParser.SS, 0); }
		public TerminalNode SP() { return getToken(AssemblerParserParser.SP, 0); }
		public StackRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stackRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterStackRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitStackRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitStackRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StackRegisterContext stackRegister() throws RecognitionException {
		StackRegisterContext _localctx = new StackRegisterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stackRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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
		public TerminalNode DS() { return getToken(AssemblerParserParser.DS, 0); }
		public TerminalNode DP() { return getToken(AssemblerParserParser.DP, 0); }
		public DataRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterDataRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitDataRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitDataRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataRegisterContext dataRegister() throws RecognitionException {
		DataRegisterContext _localctx = new DataRegisterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dataRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==DS || _la==DP) ) {
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

	public static class CommonRegisterContext extends ParserRuleContext {
		public TerminalNode AX() { return getToken(AssemblerParserParser.AX, 0); }
		public TerminalNode AL() { return getToken(AssemblerParserParser.AL, 0); }
		public TerminalNode AH() { return getToken(AssemblerParserParser.AH, 0); }
		public TerminalNode BX() { return getToken(AssemblerParserParser.BX, 0); }
		public TerminalNode BH() { return getToken(AssemblerParserParser.BH, 0); }
		public TerminalNode BL() { return getToken(AssemblerParserParser.BL, 0); }
		public TerminalNode CX() { return getToken(AssemblerParserParser.CX, 0); }
		public TerminalNode CH() { return getToken(AssemblerParserParser.CH, 0); }
		public TerminalNode CL() { return getToken(AssemblerParserParser.CL, 0); }
		public TerminalNode DX() { return getToken(AssemblerParserParser.DX, 0); }
		public TerminalNode DH() { return getToken(AssemblerParserParser.DH, 0); }
		public TerminalNode DL() { return getToken(AssemblerParserParser.DL, 0); }
		public CommonRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).enterCommonRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AssemblerParserListener ) ((AssemblerParserListener)listener).exitCommonRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AssemblerParserVisitor ) return ((AssemblerParserVisitor<? extends T>)visitor).visitCommonRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonRegisterContext commonRegister() throws RecognitionException {
		CommonRegisterContext _localctx = new CommonRegisterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commonRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&[\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\59\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7G\n\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\nQ\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\t\3\2\34\35\3"+
		"\2\36\"\3\2#%\3\2\5\6\3\2\7\b\3\2\t\n\3\2\13\26\2V\2\35\3\2\2\2\4-\3\2"+
		"\2\2\6/\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\fF\3\2\2\2\16H\3\2\2\2\20J\3\2\2"+
		"\2\22P\3\2\2\2\24R\3\2\2\2\26T\3\2\2\2\30V\3\2\2\2\32X\3\2\2\2\34\36\5"+
		"\4\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2"+
		"\2!\"\5\b\5\2\"#\7\32\2\2#.\3\2\2\2$%\5\f\7\2%&\7\32\2\2&.\3\2\2\2\'("+
		"\5\20\t\2()\7\32\2\2).\3\2\2\2*+\5\6\4\2+,\7\32\2\2,.\3\2\2\2-!\3\2\2"+
		"\2-$\3\2\2\2-\'\3\2\2\2-*\3\2\2\2.\5\3\2\2\2/\60\7&\2\2\60\61\7\3\2\2"+
		"\61\7\3\2\2\2\62\63\5\n\6\2\63\64\7\27\2\2\649\3\2\2\2\65\66\5\n\6\2\66"+
		"\67\5\22\n\2\679\3\2\2\28\62\3\2\2\28\65\3\2\2\29\t\3\2\2\2:;\t\2\2\2"+
		";\13\3\2\2\2<=\5\16\b\2=>\5\22\n\2>?\7\4\2\2?@\5\22\n\2@G\3\2\2\2AB\5"+
		"\16\b\2BC\5\22\n\2CD\7\4\2\2DE\7\27\2\2EG\3\2\2\2F<\3\2\2\2FA\3\2\2\2"+
		"G\r\3\2\2\2HI\t\3\2\2I\17\3\2\2\2JK\t\4\2\2K\21\3\2\2\2LQ\5\32\16\2MQ"+
		"\5\24\13\2NQ\5\26\f\2OQ\5\30\r\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2"+
		"\2Q\23\3\2\2\2RS\t\5\2\2S\25\3\2\2\2TU\t\6\2\2U\27\3\2\2\2VW\t\7\2\2W"+
		"\31\3\2\2\2XY\t\b\2\2Y\33\3\2\2\2\7\37-8FP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
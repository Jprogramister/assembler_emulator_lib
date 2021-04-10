// Generated from C:/Users/User/IdeaProjects/assembler_emulator_lib/src/main/java/recognizer/grammar\Assembler.g4 by ANTLR 4.9
package recognizer.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerParser extends Parser {
  static {
    RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
          new PredictionContextCache();
  public static final int
          T__0 = 1, PUSH = 2, POP = 3, MOV = 4, ADD = 5, SUB = 6, DIV = 7, MUL = 8, CALL = 9, RET = 10,
          JMP = 11, STI = 12, ID = 13, DELIM = 14, WS = 15, NUMBER = 16, COMMA = 17;
  public static final int
          RULE_programm = 0, RULE_command = 1, RULE_labelDef = 2, RULE_instruction = 3,
          RULE_unaryOperation = 4, RULE_unaryOperator = 5, RULE_binaryOperation = 6,
          RULE_binaryOperator = 7, RULE_register = 8;

  private static String[] makeRuleNames() {
    return new String[]{
            "programm", "command", "labelDef", "instruction", "unaryOperation", "unaryOperator",
            "binaryOperation", "binaryOperator", "register"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[]{
            null, "':'"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[]{
            null, null, "PUSH", "POP", "MOV", "ADD", "SUB", "DIV", "MUL", "CALL",
            "RET", "JMP", "STI", "ID", "DELIM", "WS", "NUMBER", "COMMA"
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
  public String getGrammarFileName() {
    return "Assembler.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public AssemblerParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  public static class ProgrammContext extends ParserRuleContext {
    public List<CommandContext> command() {
      return getRuleContexts(CommandContext.class);
    }

    public CommandContext command(int i) {
      return getRuleContext(CommandContext.class, i);
    }

    public ProgrammContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_programm;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterProgramm(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitProgramm(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitProgramm(this);
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
        setState(19);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(18);
              command();
            }
          }
          setState(21);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUSH) | (1L << POP) | (1L << MOV) | (1L << ADD) | (1L << SUB) | (1L << DIV) | (1L << MUL) | (1L << CALL) | (1L << RET) | (1L << JMP) | (1L << STI) | (1L << ID))) != 0));
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class CommandContext extends ParserRuleContext {
    public UnaryOperationContext unaryOperation() {
      return getRuleContext(UnaryOperationContext.class, 0);
    }

    public TerminalNode DELIM() {
      return getToken(AssemblerParser.DELIM, 0);
    }

    public BinaryOperationContext binaryOperation() {
      return getRuleContext(BinaryOperationContext.class, 0);
    }

    public LabelDefContext labelDef() {
      return getRuleContext(LabelDefContext.class, 0);
    }

    public InstructionContext instruction() {
      return getRuleContext(InstructionContext.class, 0);
    }

    public CommandContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_command;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterCommand(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitCommand(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitCommand(this);
      else return visitor.visitChildren(this);
    }
  }

  public final CommandContext command() throws RecognitionException {
    CommandContext _localctx = new CommandContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_command);
    try {
      setState(35);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case PUSH:
        case POP:
        case CALL:
        case JMP:
          enterOuterAlt(_localctx, 1);
        {
          setState(23);
          unaryOperation();
          setState(24);
          match(DELIM);
        }
        break;
        case MOV:
        case ADD:
        case SUB:
        case DIV:
        case MUL:
          enterOuterAlt(_localctx, 2);
        {
          setState(26);
          binaryOperation();
          setState(27);
          match(DELIM);
        }
        break;
        case ID:
          enterOuterAlt(_localctx, 3);
        {
          setState(29);
          labelDef();
          setState(30);
          match(DELIM);
        }
        break;
        case RET:
        case STI:
          enterOuterAlt(_localctx, 4);
        {
          setState(32);
          instruction();
          setState(33);
          match(DELIM);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class LabelDefContext extends ParserRuleContext {
    public TerminalNode ID() {
      return getToken(AssemblerParser.ID, 0);
    }

    public LabelDefContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_labelDef;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterLabelDef(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitLabelDef(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitLabelDef(this);
      else return visitor.visitChildren(this);
    }
  }

  public final LabelDefContext labelDef() throws RecognitionException {
    LabelDefContext _localctx = new LabelDefContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_labelDef);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(37);
        match(ID);
        setState(38);
        match(T__0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class InstructionContext extends ParserRuleContext {
    public InstructionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_instruction;
    }

    public InstructionContext() {
    }

    public void copyFrom(InstructionContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class ProcedureReturnContext extends InstructionContext {
    public TerminalNode RET() {
      return getToken(AssemblerParser.RET, 0);
    }

    public ProcedureReturnContext(InstructionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterProcedureReturn(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitProcedureReturn(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitProcedureReturn(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ResetInterruptionFlagContext extends InstructionContext {
    public TerminalNode STI() {
      return getToken(AssemblerParser.STI, 0);
    }

    public ResetInterruptionFlagContext(InstructionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterResetInterruptionFlag(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitResetInterruptionFlag(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitResetInterruptionFlag(this);
      else return visitor.visitChildren(this);
    }
  }

  public final InstructionContext instruction() throws RecognitionException {
    InstructionContext _localctx = new InstructionContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_instruction);
    try {
      setState(42);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case RET:
          _localctx = new ProcedureReturnContext(_localctx);
          enterOuterAlt(_localctx, 1);
        {
          setState(40);
          match(RET);
        }
        break;
        case STI:
          _localctx = new ResetInterruptionFlagContext(_localctx);
          enterOuterAlt(_localctx, 2);
        {
          setState(41);
          match(STI);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class UnaryOperationContext extends ParserRuleContext {
    public UnaryOperationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_unaryOperation;
    }

    public UnaryOperationContext() {
    }

    public void copyFrom(UnaryOperationContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class UnaryOperationLabelJumpContext extends UnaryOperationContext {
    public TerminalNode JMP() {
      return getToken(AssemblerParser.JMP, 0);
    }

    public TerminalNode ID() {
      return getToken(AssemblerParser.ID, 0);
    }

    public UnaryOperationLabelJumpContext(UnaryOperationContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener)
        ((AssemblerListener) listener).enterUnaryOperationLabelJump(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitUnaryOperationLabelJump(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitUnaryOperationLabelJump(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class UnaryOperationProcedureCallContext extends UnaryOperationContext {
    public TerminalNode CALL() {
      return getToken(AssemblerParser.CALL, 0);
    }

    public TerminalNode ID() {
      return getToken(AssemblerParser.ID, 0);
    }

    public UnaryOperationProcedureCallContext(UnaryOperationContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener)
        ((AssemblerListener) listener).enterUnaryOperationProcedureCall(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener)
        ((AssemblerListener) listener).exitUnaryOperationProcedureCall(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitUnaryOperationProcedureCall(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class UnaryOperationRegisterContext extends UnaryOperationContext {
    public UnaryOperatorContext unaryOperator() {
      return getRuleContext(UnaryOperatorContext.class, 0);
    }

    public RegisterContext register() {
      return getRuleContext(RegisterContext.class, 0);
    }

    public UnaryOperationRegisterContext(UnaryOperationContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterUnaryOperationRegister(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitUnaryOperationRegister(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitUnaryOperationRegister(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class UnaryOperationConstContext extends UnaryOperationContext {
    public UnaryOperatorContext unaryOperator() {
      return getRuleContext(UnaryOperatorContext.class, 0);
    }

    public TerminalNode NUMBER() {
      return getToken(AssemblerParser.NUMBER, 0);
    }

    public UnaryOperationConstContext(UnaryOperationContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterUnaryOperationConst(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitUnaryOperationConst(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitUnaryOperationConst(this);
      else return visitor.visitChildren(this);
    }
  }

  public final UnaryOperationContext unaryOperation() throws RecognitionException {
    UnaryOperationContext _localctx = new UnaryOperationContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_unaryOperation);
    try {
      setState(54);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
        case 1:
          _localctx = new UnaryOperationConstContext(_localctx);
          enterOuterAlt(_localctx, 1);
        {
          setState(44);
          unaryOperator();
          setState(45);
          match(NUMBER);
        }
        break;
        case 2:
          _localctx = new UnaryOperationRegisterContext(_localctx);
          enterOuterAlt(_localctx, 2);
        {
          setState(47);
          unaryOperator();
          setState(48);
          register();
        }
        break;
        case 3:
          _localctx = new UnaryOperationProcedureCallContext(_localctx);
          enterOuterAlt(_localctx, 3);
        {
          setState(50);
          match(CALL);
          setState(51);
          match(ID);
        }
        break;
        case 4:
          _localctx = new UnaryOperationLabelJumpContext(_localctx);
          enterOuterAlt(_localctx, 4);
        {
          setState(52);
          match(JMP);
          setState(53);
          match(ID);
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class UnaryOperatorContext extends ParserRuleContext {
    public TerminalNode PUSH() {
      return getToken(AssemblerParser.PUSH, 0);
    }

    public TerminalNode POP() {
      return getToken(AssemblerParser.POP, 0);
    }

    public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_unaryOperator;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterUnaryOperator(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitUnaryOperator(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitUnaryOperator(this);
      else return visitor.visitChildren(this);
    }
  }

  public final UnaryOperatorContext unaryOperator() throws RecognitionException {
    UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_unaryOperator);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(56);
        _la = _input.LA(1);
        if (!(_la == PUSH || _la == POP)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BinaryOperationContext extends ParserRuleContext {
    public BinaryOperationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_binaryOperation;
    }

    public BinaryOperationContext() {
    }

    public void copyFrom(BinaryOperationContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class BinaryOperationRegisterConstContext extends BinaryOperationContext {
    public BinaryOperatorContext binaryOperator() {
      return getRuleContext(BinaryOperatorContext.class, 0);
    }

    public RegisterContext register() {
      return getRuleContext(RegisterContext.class, 0);
    }

    public TerminalNode COMMA() {
      return getToken(AssemblerParser.COMMA, 0);
    }

    public TerminalNode NUMBER() {
      return getToken(AssemblerParser.NUMBER, 0);
    }

    public BinaryOperationRegisterConstContext(BinaryOperationContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener)
        ((AssemblerListener) listener).enterBinaryOperationRegisterConst(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener)
        ((AssemblerListener) listener).exitBinaryOperationRegisterConst(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitBinaryOperationRegisterConst(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class BinaryOperationRegistersContext extends BinaryOperationContext {
    public BinaryOperatorContext binaryOperator() {
      return getRuleContext(BinaryOperatorContext.class, 0);
    }

    public List<RegisterContext> register() {
      return getRuleContexts(RegisterContext.class);
    }

    public RegisterContext register(int i) {
      return getRuleContext(RegisterContext.class, i);
    }

    public TerminalNode COMMA() {
      return getToken(AssemblerParser.COMMA, 0);
    }

    public BinaryOperationRegistersContext(BinaryOperationContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener)
        ((AssemblerListener) listener).enterBinaryOperationRegisters(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener)
        ((AssemblerListener) listener).exitBinaryOperationRegisters(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitBinaryOperationRegisters(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BinaryOperationContext binaryOperation() throws RecognitionException {
    BinaryOperationContext _localctx = new BinaryOperationContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_binaryOperation);
    try {
      setState(68);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
        case 1:
          _localctx = new BinaryOperationRegistersContext(_localctx);
          enterOuterAlt(_localctx, 1);
        {
          setState(58);
          binaryOperator();
          setState(59);
          register();
          setState(60);
          match(COMMA);
          setState(61);
          register();
        }
        break;
        case 2:
          _localctx = new BinaryOperationRegisterConstContext(_localctx);
          enterOuterAlt(_localctx, 2);
        {
          setState(63);
          binaryOperator();
          setState(64);
          register();
          setState(65);
          match(COMMA);
          setState(66);
          match(NUMBER);
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class BinaryOperatorContext extends ParserRuleContext {
    public TerminalNode MOV() {
      return getToken(AssemblerParser.MOV, 0);
    }

    public TerminalNode ADD() {
      return getToken(AssemblerParser.ADD, 0);
    }

    public TerminalNode SUB() {
      return getToken(AssemblerParser.SUB, 0);
    }

    public TerminalNode DIV() {
      return getToken(AssemblerParser.DIV, 0);
    }

    public TerminalNode MUL() {
      return getToken(AssemblerParser.MUL, 0);
    }

    public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_binaryOperator;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterBinaryOperator(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitBinaryOperator(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitBinaryOperator(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BinaryOperatorContext binaryOperator() throws RecognitionException {
    BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_binaryOperator);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(70);
        _la = _input.LA(1);
        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOV) | (1L << ADD) | (1L << SUB) | (1L << DIV) | (1L << MUL))) != 0))) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class RegisterContext extends ParserRuleContext {
    public TerminalNode ID() {
      return getToken(AssemblerParser.ID, 0);
    }

    public RegisterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_register;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).enterRegister(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof AssemblerListener) ((AssemblerListener) listener).exitRegister(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof AssemblerVisitor)
        return ((AssemblerVisitor<? extends T>) visitor).visitRegister(this);
      else return visitor.visitChildren(this);
    }
  }

  public final RegisterContext register() throws RecognitionException {
    RegisterContext _localctx = new RegisterContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_register);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(72);
        match(ID);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
          "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23M\4\2\t\2\4\3\t" +
                  "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26" +
                  "\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&" +
                  "\n\3\3\4\3\4\3\4\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                  "\3\6\5\69\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bG\n\b" +
                  "\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\4\3\2\4\5\3\2\6\n\2" +
                  "L\2\25\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b,\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2" +
                  "\16F\3\2\2\2\20H\3\2\2\2\22J\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27" +
                  "\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\32\5\n\6\2\32\33" +
                  "\7\20\2\2\33&\3\2\2\2\34\35\5\16\b\2\35\36\7\20\2\2\36&\3\2\2\2\37 \5" +
                  "\6\4\2 !\7\20\2\2!&\3\2\2\2\"#\5\b\5\2#$\7\20\2\2$&\3\2\2\2%\31\3\2\2" +
                  "\2%\34\3\2\2\2%\37\3\2\2\2%\"\3\2\2\2&\5\3\2\2\2\'(\7\17\2\2()\7\3\2\2" +
                  ")\7\3\2\2\2*-\7\f\2\2+-\7\16\2\2,*\3\2\2\2,+\3\2\2\2-\t\3\2\2\2./\5\f" +
                  "\7\2/\60\7\22\2\2\609\3\2\2\2\61\62\5\f\7\2\62\63\5\22\n\2\639\3\2\2\2" +
                  "\64\65\7\13\2\2\659\7\17\2\2\66\67\7\r\2\2\679\7\17\2\28.\3\2\2\28\61" +
                  "\3\2\2\28\64\3\2\2\28\66\3\2\2\29\13\3\2\2\2:;\t\2\2\2;\r\3\2\2\2<=\5" +
                  "\20\t\2=>\5\22\n\2>?\7\23\2\2?@\5\22\n\2@G\3\2\2\2AB\5\20\t\2BC\5\22\n" +
                  "\2CD\7\23\2\2DE\7\22\2\2EG\3\2\2\2F<\3\2\2\2FA\3\2\2\2G\17\3\2\2\2HI\t" +
                  "\3\2\2I\21\3\2\2\2JK\7\17\2\2K\23\3\2\2\2\7\27%,8F";
  public static final ATN _ATN =
          new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
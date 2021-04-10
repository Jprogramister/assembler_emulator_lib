// Generated from C:/Users/User/IdeaProjects/assembler_emulator_lib/src/main/java/recognizer/grammar\Assembler.g4 by ANTLR 4.9
package recognizer.generated;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerLexer extends Lexer {
  static {
    RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
          new PredictionContextCache();
  public static final int
          T__0 = 1, PUSH = 2, POP = 3, MOV = 4, ADD = 5, SUB = 6, DIV = 7, MUL = 8, CALL = 9, RET = 10,
          JMP = 11, STI = 12, ID = 13, DELIM = 14, WS = 15;
  public static String[] channelNames = {
          "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
  };

  public static String[] modeNames = {
          "DEFAULT_MODE"
  };

  private static String[] makeRuleNames() {
    return new String[]{
            "T__0", "PUSH", "POP", "MOV", "ADD", "SUB", "DIV", "MUL", "CALL", "RET",
            "JMP", "STI", "ID", "DELIM", "WS", "P", "B", "D", "C", "A", "L", "H",
            "X", "S", "U", "O", "M", "V", "I", "R", "E", "T", "J", "NUMBER", "COMMA",
            "HEX_NUMBER", "INT", "LETTER", "DIGIT"
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
            "RET", "JMP", "STI", "ID", "DELIM", "WS"
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


  public AssemblerLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
  public String[] getChannelNames() {
    return channelNames;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public static final String _serializedATN =
          "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00ce\b\1\4\2" +
                  "\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4" +
                  "\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                  "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                  "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                  " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3" +
                  "\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3" +
                  "\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3" +
                  "\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u0085\n\16" +
                  "\f\16\16\16\u0088\13\16\3\17\5\17\u008b\n\17\3\17\3\17\3\20\6\20\u0090" +
                  "\n\20\r\20\16\20\u0091\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3" +
                  "\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3" +
                  "\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#" +
                  "\5#\u00bc\n#\3$\3$\3%\3%\3%\3%\3%\3%\3&\6&\u00c7\n&\r&\16&\u00c8\3\'\3" +
                  "\'\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16" +
                  "\33\17\35\20\37\21!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2" +
                  "=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2\3\2\30\4\2\13\13\"\"\4\2RRrr\4\2DDdd\4" +
                  "\2FFff\4\2EEee\4\2CCcc\4\2NNnn\4\2JJjj\4\2ZZzz\4\2UUuu\4\2WWww\4\2QQq" +
                  "q\4\2OOoo\4\2XXxx\4\2KKkk\4\2TTtt\4\2GGgg\4\2VVvv\4\2LLll\4\2\62;C\\\3" +
                  "\2\62;\6\2C\\aac|\u0082\u0101\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2" +
                  "\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2" +
                  "\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3" +
                  "\2\2\2\2\37\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7X\3\2\2\2\t\\\3\2\2\2\13`\3" +
                  "\2\2\2\rd\3\2\2\2\17h\3\2\2\2\21l\3\2\2\2\23p\3\2\2\2\25u\3\2\2\2\27y" +
                  "\3\2\2\2\31}\3\2\2\2\33\u0081\3\2\2\2\35\u008a\3\2\2\2\37\u008f\3\2\2" +
                  "\2!\u0095\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2\'\u009b\3\2\2\2)\u009d" +
                  "\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2" +
                  "\63\u00a7\3\2\2\2\65\u00a9\3\2\2\2\67\u00ab\3\2\2\29\u00ad\3\2\2\2;\u00af" +
                  "\3\2\2\2=\u00b1\3\2\2\2?\u00b3\3\2\2\2A\u00b5\3\2\2\2C\u00b7\3\2\2\2E" +
                  "\u00bb\3\2\2\2G\u00bd\3\2\2\2I\u00bf\3\2\2\2K\u00c6\3\2\2\2M\u00ca\3\2" +
                  "\2\2O\u00cc\3\2\2\2QR\7<\2\2R\4\3\2\2\2ST\5!\21\2TU\5\63\32\2UV\5\61\31" +
                  "\2VW\5-\27\2W\6\3\2\2\2XY\5!\21\2YZ\5\65\33\2Z[\5!\21\2[\b\3\2\2\2\\]" +
                  "\5\67\34\2]^\5\65\33\2^_\59\35\2_\n\3\2\2\2`a\5)\25\2ab\5%\23\2bc\5%\23" +
                  "\2c\f\3\2\2\2de\5\61\31\2ef\5\63\32\2fg\5#\22\2g\16\3\2\2\2hi\5%\23\2" +
                  "ij\5;\36\2jk\59\35\2k\20\3\2\2\2lm\5\67\34\2mn\5\63\32\2no\5+\26\2o\22" +
                  "\3\2\2\2pq\5\'\24\2qr\5)\25\2rs\5+\26\2st\5+\26\2t\24\3\2\2\2uv\5=\37" +
                  "\2vw\5? \2wx\5A!\2x\26\3\2\2\2yz\5C\"\2z{\5\67\34\2{|\5!\21\2|\30\3\2" +
                  "\2\2}~\5\61\31\2~\177\5A!\2\177\u0080\5;\36\2\u0080\32\3\2\2\2\u0081\u0086" +
                  "\5M\'\2\u0082\u0085\5M\'\2\u0083\u0085\5O(\2\u0084\u0082\3\2\2\2\u0084" +
                  "\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2" +
                  "\2\2\u0087\34\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7\17\2\2\u008a\u0089" +
                  "\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\f\2\2\u008d" +
                  "\36\3\2\2\2\u008e\u0090\t\2\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2" +
                  "\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094" +
                  "\b\20\2\2\u0094 \3\2\2\2\u0095\u0096\t\3\2\2\u0096\"\3\2\2\2\u0097\u0098" +
                  "\t\4\2\2\u0098$\3\2\2\2\u0099\u009a\t\5\2\2\u009a&\3\2\2\2\u009b\u009c" +
                  "\t\6\2\2\u009c(\3\2\2\2\u009d\u009e\t\7\2\2\u009e*\3\2\2\2\u009f\u00a0" +
                  "\t\b\2\2\u00a0,\3\2\2\2\u00a1\u00a2\t\t\2\2\u00a2.\3\2\2\2\u00a3\u00a4" +
                  "\t\n\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\t\13\2\2\u00a6\62\3\2\2\2\u00a7" +
                  "\u00a8\t\f\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\t\r\2\2\u00aa\66\3\2\2\2\u00ab" +
                  "\u00ac\t\16\2\2\u00ac8\3\2\2\2\u00ad\u00ae\t\17\2\2\u00ae:\3\2\2\2\u00af" +
                  "\u00b0\t\20\2\2\u00b0<\3\2\2\2\u00b1\u00b2\t\21\2\2\u00b2>\3\2\2\2\u00b3" +
                  "\u00b4\t\22\2\2\u00b4@\3\2\2\2\u00b5\u00b6\t\23\2\2\u00b6B\3\2\2\2\u00b7" +
                  "\u00b8\t\24\2\2\u00b8D\3\2\2\2\u00b9\u00bc\5I%\2\u00ba\u00bc\5K&\2\u00bb" +
                  "\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bcF\3\2\2\2\u00bd\u00be\7.\2\2\u00be" +
                  "H\3\2\2\2\u00bf\u00c0\t\25\2\2\u00c0\u00c1\t\25\2\2\u00c1\u00c2\t\25\2" +
                  "\2\u00c2\u00c3\t\25\2\2\u00c3\u00c4\t\t\2\2\u00c4J\3\2\2\2\u00c5\u00c7" +
                  "\t\26\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2" +
                  "\u00c8\u00c9\3\2\2\2\u00c9L\3\2\2\2\u00ca\u00cb\t\27\2\2\u00cbN\3\2\2" +
                  "\2\u00cc\u00cd\t\26\2\2\u00cdP\3\2\2\2\t\2\u0084\u0086\u008a\u0091\u00bb" +
                  "\u00c8\3\b\2\2";
  public static final ATN _ATN =
          new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
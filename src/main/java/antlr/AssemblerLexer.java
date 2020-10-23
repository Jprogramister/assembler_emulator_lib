// Generated from /home/dmitry/IdeaProjects/Antlr4_Assembler/src/main/java/grammar/AssemblerLexer.g4 by ANTLR 4.8
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AssemblerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, HEX_NUMBER=2, INT=3, NEWLINE=4, WS=5, PUSH=6, POP=7, MOV=8, 
		ADD=9, SUB=10, DIV=11, MUL=12, CALL=13, RET=14, JMP=15, ID=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"P", "B", "D", "C", "A", "L", "H", "X", "S", "U", "O", "M", "V", "I", 
			"R", "E", "T", "J", "NUMBER", "HEX_NUMBER", "INT", "NEWLINE", "WS", "PUSH", 
			"POP", "MOV", "ADD", "SUB", "DIV", "MUL", "CALL", "RET", "JMP", "LETTER", 
			"DIGIT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "HEX_NUMBER", "INT", "NEWLINE", "WS", "PUSH", "POP", 
			"MOV", "ADD", "SUB", "DIV", "MUL", "CALL", "RET", "JMP", "ID"
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
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AssemblerLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24r"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\6\26{\n\26\r\26\16\26|\3\27\5"+
		"\27\u0080\n\27\3\27\3\27\3\30\6\30\u0085\n\30\r\30\16\30\u0086\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%"+
		"\3%\7%\u00bc\n%\f%\16%\u00bf\13%\2\2&\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21"+
		"\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\3)\4+\5-\6/\7\61\b\63"+
		"\t\65\n\67\139\f;\r=\16?\17A\20C\21E\2G\2I\22\3\2\30\4\2RRrr\4\2DDdd\4"+
		"\2FFff\4\2EEee\4\2CCcc\4\2NNnn\4\2JJjj\4\2ZZzz\4\2UUuu\4\2WWww\4\2QQq"+
		"q\4\2OOoo\4\2XXxx\4\2KKkk\4\2TTtt\4\2GGgg\4\2VVvv\4\2LLll\4\2\62;C\\\3"+
		"\2\62;\4\2\13\13\"\"\6\2C\\aac|\u0082\u0101\2\u00b1\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2"+
		"\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2\2"+
		"\2\27_\3\2\2\2\31a\3\2\2\2\33c\3\2\2\2\35e\3\2\2\2\37g\3\2\2\2!i\3\2\2"+
		"\2#k\3\2\2\2%m\3\2\2\2\'q\3\2\2\2)s\3\2\2\2+z\3\2\2\2-\177\3\2\2\2/\u0084"+
		"\3\2\2\2\61\u008a\3\2\2\2\63\u008f\3\2\2\2\65\u0093\3\2\2\2\67\u0097\3"+
		"\2\2\29\u009b\3\2\2\2;\u009f\3\2\2\2=\u00a3\3\2\2\2?\u00a7\3\2\2\2A\u00ac"+
		"\3\2\2\2C\u00b0\3\2\2\2E\u00b4\3\2\2\2G\u00b6\3\2\2\2I\u00b8\3\2\2\2K"+
		"L\t\2\2\2L\4\3\2\2\2MN\t\3\2\2N\6\3\2\2\2OP\t\4\2\2P\b\3\2\2\2QR\t\5\2"+
		"\2R\n\3\2\2\2ST\t\6\2\2T\f\3\2\2\2UV\t\7\2\2V\16\3\2\2\2WX\t\b\2\2X\20"+
		"\3\2\2\2YZ\t\t\2\2Z\22\3\2\2\2[\\\t\n\2\2\\\24\3\2\2\2]^\t\13\2\2^\26"+
		"\3\2\2\2_`\t\f\2\2`\30\3\2\2\2ab\t\r\2\2b\32\3\2\2\2cd\t\16\2\2d\34\3"+
		"\2\2\2ef\t\17\2\2f\36\3\2\2\2gh\t\20\2\2h \3\2\2\2ij\t\21\2\2j\"\3\2\2"+
		"\2kl\t\22\2\2l$\3\2\2\2mn\t\23\2\2n&\3\2\2\2or\5)\25\2pr\5+\26\2qo\3\2"+
		"\2\2qp\3\2\2\2r(\3\2\2\2st\t\24\2\2tu\t\24\2\2uv\t\24\2\2vw\t\24\2\2w"+
		"x\t\b\2\2x*\3\2\2\2y{\t\25\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"},\3\2\2\2~\u0080\7\17\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\7\f\2\2\u0082.\3\2\2\2\u0083\u0085\t\26\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\30\2\2\u0089\60\3\2\2\2\u008a\u008b"+
		"\5\3\2\2\u008b\u008c\5\25\13\2\u008c\u008d\5\23\n\2\u008d\u008e\5\17\b"+
		"\2\u008e\62\3\2\2\2\u008f\u0090\5\3\2\2\u0090\u0091\5\27\f\2\u0091\u0092"+
		"\5\3\2\2\u0092\64\3\2\2\2\u0093\u0094\5\31\r\2\u0094\u0095\5\27\f\2\u0095"+
		"\u0096\5\33\16\2\u0096\66\3\2\2\2\u0097\u0098\5\13\6\2\u0098\u0099\5\7"+
		"\4\2\u0099\u009a\5\7\4\2\u009a8\3\2\2\2\u009b\u009c\5\23\n\2\u009c\u009d"+
		"\5\25\13\2\u009d\u009e\5\5\3\2\u009e:\3\2\2\2\u009f\u00a0\5\7\4\2\u00a0"+
		"\u00a1\5\35\17\2\u00a1\u00a2\5\33\16\2\u00a2<\3\2\2\2\u00a3\u00a4\5\31"+
		"\r\2\u00a4\u00a5\5\25\13\2\u00a5\u00a6\5\r\7\2\u00a6>\3\2\2\2\u00a7\u00a8"+
		"\5\t\5\2\u00a8\u00a9\5\13\6\2\u00a9\u00aa\5\r\7\2\u00aa\u00ab\5\r\7\2"+
		"\u00ab@\3\2\2\2\u00ac\u00ad\5\37\20\2\u00ad\u00ae\5!\21\2\u00ae\u00af"+
		"\5#\22\2\u00afB\3\2\2\2\u00b0\u00b1\5%\23\2\u00b1\u00b2\5\31\r\2\u00b2"+
		"\u00b3\5\3\2\2\u00b3D\3\2\2\2\u00b4\u00b5\t\27\2\2\u00b5F\3\2\2\2\u00b6"+
		"\u00b7\t\25\2\2\u00b7H\3\2\2\2\u00b8\u00bd\5E#\2\u00b9\u00bc\5E#\2\u00ba"+
		"\u00bc\5G$\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2"+
		"\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00beJ\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\t\2q|\177\u0086\u00bb\u00bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
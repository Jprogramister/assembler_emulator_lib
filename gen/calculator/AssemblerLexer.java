// Generated from /home/dmitry/IdeaProjects/Antlr4_Assembler/src/main/java/calculator/Assembler.g4 by ANTLR 4.8
package calculator;
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
		T__0=1, T__1=2, AX=3, AL=4, AH=5, BX=6, BH=7, BL=8, CX=9, CH=10, CL=11, 
		DS=12, DX=13, DH=14, DL=15, CS=16, CP=17, SS=18, SP=19, ID=20, NUMBER=21, 
		HEX_NUMBER=22, INT=23, NEWLINE=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "AX", "AL", "AH", "BX", "BH", "BL", "CX", "CH", "CL", 
			"DS", "DX", "DH", "DL", "CS", "CP", "SS", "SP", "ID", "NUMBER", "HEX_NUMBER", 
			"INT", "NEWLINE", "WS"
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


	public AssemblerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Assembler.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\6\25n\n\25\r\25"+
		"\16\25o\3\26\3\26\5\26t\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\6\30}"+
		"\n\30\r\30\16\30~\3\31\5\31\u0082\n\31\3\31\3\31\3\32\6\32\u0087\n\32"+
		"\r\32\16\32\u0088\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\3\2\17\4\2CCcc\4\2ZZzz\4\2NNnn\4\2JJjj\4\2DDdd\4\2EE"+
		"ee\4\2FFff\4\2UUuu\4\2RRrr\4\2C\\c|\4\2\62;C\\\3\2\62;\4\2\13\13\"\"\2"+
		"\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2"+
		"\2\t<\3\2\2\2\13?\3\2\2\2\rB\3\2\2\2\17E\3\2\2\2\21H\3\2\2\2\23K\3\2\2"+
		"\2\25N\3\2\2\2\27Q\3\2\2\2\31T\3\2\2\2\33W\3\2\2\2\35Z\3\2\2\2\37]\3\2"+
		"\2\2!`\3\2\2\2#c\3\2\2\2%f\3\2\2\2\'i\3\2\2\2)m\3\2\2\2+s\3\2\2\2-u\3"+
		"\2\2\2/|\3\2\2\2\61\u0081\3\2\2\2\63\u0086\3\2\2\2\65\66\7<\2\2\66\4\3"+
		"\2\2\2\678\7.\2\28\6\3\2\2\29:\t\2\2\2:;\t\3\2\2;\b\3\2\2\2<=\t\2\2\2"+
		"=>\t\4\2\2>\n\3\2\2\2?@\t\2\2\2@A\t\5\2\2A\f\3\2\2\2BC\t\6\2\2CD\t\3\2"+
		"\2D\16\3\2\2\2EF\t\6\2\2FG\t\5\2\2G\20\3\2\2\2HI\t\6\2\2IJ\t\4\2\2J\22"+
		"\3\2\2\2KL\t\7\2\2LM\t\3\2\2M\24\3\2\2\2NO\t\7\2\2OP\t\5\2\2P\26\3\2\2"+
		"\2QR\t\7\2\2RS\t\4\2\2S\30\3\2\2\2TU\t\b\2\2UV\t\t\2\2V\32\3\2\2\2WX\t"+
		"\b\2\2XY\t\3\2\2Y\34\3\2\2\2Z[\t\b\2\2[\\\t\5\2\2\\\36\3\2\2\2]^\t\b\2"+
		"\2^_\t\4\2\2_ \3\2\2\2`a\t\7\2\2ab\t\t\2\2b\"\3\2\2\2cd\t\7\2\2de\t\n"+
		"\2\2e$\3\2\2\2fg\t\t\2\2gh\t\t\2\2h&\3\2\2\2ij\t\t\2\2jk\t\n\2\2k(\3\2"+
		"\2\2ln\t\13\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p*\3\2\2\2qt\5"+
		"-\27\2rt\5/\30\2sq\3\2\2\2sr\3\2\2\2t,\3\2\2\2uv\t\f\2\2vw\t\f\2\2wx\t"+
		"\f\2\2xy\t\f\2\2yz\t\5\2\2z.\3\2\2\2{}\t\r\2\2|{\3\2\2\2}~\3\2\2\2~|\3"+
		"\2\2\2~\177\3\2\2\2\177\60\3\2\2\2\u0080\u0082\7\17\2\2\u0081\u0080\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\f\2\2\u0084"+
		"\62\3\2\2\2\u0085\u0087\t\16\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b"+
		"\b\32\2\2\u008b\64\3\2\2\2\b\2os~\u0081\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
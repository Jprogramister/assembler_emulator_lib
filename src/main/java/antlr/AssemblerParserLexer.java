// Generated from /home/dmitry/IdeaProjects/Antlr4_Assembler/src/main/java/grammar/AssemblerParser.g4 by ANTLR 4.8
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
public class AssemblerParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CS=3, CP=4, SS=5, SP=6, DS=7, DP=8, AX=9, AL=10, AH=11, 
		BX=12, BH=13, BL=14, CX=15, CH=16, CL=17, DX=18, DH=19, DL=20, NUMBER=21, 
		HEX_NUMBER=22, INT=23, NEWLINE=24, WS=25, PUSH=26, POP=27, MOV=28, ADD=29, 
		SUB=30, DIV=31, MUL=32, CALL=33, RET=34, JMP=35, ID=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "CS", "CP", "SS", "SP", "DS", "DP", "AX", "AL", "AH", 
			"BX", "BH", "BL", "CX", "CH", "CL", "DX", "DH", "DL", "P", "B", "D", 
			"C", "A", "L", "H", "X", "S", "U", "O", "M", "V", "I", "R", "E", "T", 
			"J", "NUMBER", "HEX_NUMBER", "INT", "NEWLINE", "WS", "PUSH", "POP", "MOV", 
			"ADD", "SUB", "DIV", "MUL", "CALL", "RET", "JMP", "LETTER", "DIGIT", 
			"ID"
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


	public AssemblerParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AssemblerParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0122\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\5(\u00d4\n(\3)\3)\3)\3)\3"+
		")\3)\3*\6*\u00dd\n*\r*\16*\u00de\3+\5+\u00e2\n+\3+\3+\3,\6,\u00e7\n,\r"+
		",\16,\u00e8\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\39\79\u011e\n9\f9\169\u0121\139\2\2:\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\27"+
		"Q\30S\31U\32W\33Y\34[\35]\36_\37a c!e\"g#i$k%m\2o\2q&\3\2\30\4\2RRrr\4"+
		"\2DDdd\4\2FFff\4\2EEee\4\2CCcc\4\2NNnn\4\2JJjj\4\2ZZzz\4\2UUuu\4\2WWw"+
		"w\4\2QQqq\4\2OOoo\4\2XXxx\4\2KKkk\4\2TTtt\4\2GGgg\4\2VVvv\4\2LLll\4\2"+
		"\62;C\\\3\2\62;\4\2\13\13\"\"\6\2C\\aac|\u0082\u0101\2\u0113\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2q\3\2\2\2\3s\3"+
		"\2\2\2\5u\3\2\2\2\7w\3\2\2\2\tz\3\2\2\2\13}\3\2\2\2\r\u0080\3\2\2\2\17"+
		"\u0083\3\2\2\2\21\u0086\3\2\2\2\23\u0089\3\2\2\2\25\u008c\3\2\2\2\27\u008f"+
		"\3\2\2\2\31\u0092\3\2\2\2\33\u0095\3\2\2\2\35\u0098\3\2\2\2\37\u009b\3"+
		"\2\2\2!\u009e\3\2\2\2#\u00a1\3\2\2\2%\u00a4\3\2\2\2\'\u00a7\3\2\2\2)\u00aa"+
		"\3\2\2\2+\u00ad\3\2\2\2-\u00af\3\2\2\2/\u00b1\3\2\2\2\61\u00b3\3\2\2\2"+
		"\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3\2\2\29\u00bb\3\2\2\2;\u00bd"+
		"\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00c3\3\2\2\2C\u00c5\3\2\2\2E"+
		"\u00c7\3\2\2\2G\u00c9\3\2\2\2I\u00cb\3\2\2\2K\u00cd\3\2\2\2M\u00cf\3\2"+
		"\2\2O\u00d3\3\2\2\2Q\u00d5\3\2\2\2S\u00dc\3\2\2\2U\u00e1\3\2\2\2W\u00e6"+
		"\3\2\2\2Y\u00ec\3\2\2\2[\u00f1\3\2\2\2]\u00f5\3\2\2\2_\u00f9\3\2\2\2a"+
		"\u00fd\3\2\2\2c\u0101\3\2\2\2e\u0105\3\2\2\2g\u0109\3\2\2\2i\u010e\3\2"+
		"\2\2k\u0112\3\2\2\2m\u0116\3\2\2\2o\u0118\3\2\2\2q\u011a\3\2\2\2st\7<"+
		"\2\2t\4\3\2\2\2uv\7.\2\2v\6\3\2\2\2wx\5\61\31\2xy\5;\36\2y\b\3\2\2\2z"+
		"{\5\61\31\2{|\5+\26\2|\n\3\2\2\2}~\5;\36\2~\177\5;\36\2\177\f\3\2\2\2"+
		"\u0080\u0081\5;\36\2\u0081\u0082\5+\26\2\u0082\16\3\2\2\2\u0083\u0084"+
		"\5/\30\2\u0084\u0085\5;\36\2\u0085\20\3\2\2\2\u0086\u0087\5/\30\2\u0087"+
		"\u0088\5+\26\2\u0088\22\3\2\2\2\u0089\u008a\5\63\32\2\u008a\u008b\59\35"+
		"\2\u008b\24\3\2\2\2\u008c\u008d\5\63\32\2\u008d\u008e\5\65\33\2\u008e"+
		"\26\3\2\2\2\u008f\u0090\5\63\32\2\u0090\u0091\5\67\34\2\u0091\30\3\2\2"+
		"\2\u0092\u0093\5-\27\2\u0093\u0094\59\35\2\u0094\32\3\2\2\2\u0095\u0096"+
		"\5-\27\2\u0096\u0097\5\67\34\2\u0097\34\3\2\2\2\u0098\u0099\5-\27\2\u0099"+
		"\u009a\5\65\33\2\u009a\36\3\2\2\2\u009b\u009c\5\61\31\2\u009c\u009d\5"+
		"9\35\2\u009d \3\2\2\2\u009e\u009f\5\61\31\2\u009f\u00a0\5\67\34\2\u00a0"+
		"\"\3\2\2\2\u00a1\u00a2\5\61\31\2\u00a2\u00a3\5\65\33\2\u00a3$\3\2\2\2"+
		"\u00a4\u00a5\5/\30\2\u00a5\u00a6\59\35\2\u00a6&\3\2\2\2\u00a7\u00a8\5"+
		"/\30\2\u00a8\u00a9\5\67\34\2\u00a9(\3\2\2\2\u00aa\u00ab\5/\30\2\u00ab"+
		"\u00ac\5\65\33\2\u00ac*\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae,\3\2\2\2\u00af"+
		"\u00b0\t\3\2\2\u00b0.\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2\60\3\2\2\2\u00b3"+
		"\u00b4\t\5\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\t\6\2\2\u00b6\64\3\2\2\2\u00b7"+
		"\u00b8\t\7\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\t\b\2\2\u00ba8\3\2\2\2\u00bb"+
		"\u00bc\t\t\2\2\u00bc:\3\2\2\2\u00bd\u00be\t\n\2\2\u00be<\3\2\2\2\u00bf"+
		"\u00c0\t\13\2\2\u00c0>\3\2\2\2\u00c1\u00c2\t\f\2\2\u00c2@\3\2\2\2\u00c3"+
		"\u00c4\t\r\2\2\u00c4B\3\2\2\2\u00c5\u00c6\t\16\2\2\u00c6D\3\2\2\2\u00c7"+
		"\u00c8\t\17\2\2\u00c8F\3\2\2\2\u00c9\u00ca\t\20\2\2\u00caH\3\2\2\2\u00cb"+
		"\u00cc\t\21\2\2\u00ccJ\3\2\2\2\u00cd\u00ce\t\22\2\2\u00ceL\3\2\2\2\u00cf"+
		"\u00d0\t\23\2\2\u00d0N\3\2\2\2\u00d1\u00d4\5Q)\2\u00d2\u00d4\5S*\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4P\3\2\2\2\u00d5\u00d6\t\24\2\2"+
		"\u00d6\u00d7\t\24\2\2\u00d7\u00d8\t\24\2\2\u00d8\u00d9\t\24\2\2\u00d9"+
		"\u00da\t\b\2\2\u00daR\3\2\2\2\u00db\u00dd\t\25\2\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00dfT\3"+
		"\2\2\2\u00e0\u00e2\7\17\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\7\f\2\2\u00e4V\3\2\2\2\u00e5\u00e7\t\26\2\2"+
		"\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b,\2\2\u00ebX\3\2\2\2\u00ec\u00ed"+
		"\5+\26\2\u00ed\u00ee\5=\37\2\u00ee\u00ef\5;\36\2\u00ef\u00f0\5\67\34\2"+
		"\u00f0Z\3\2\2\2\u00f1\u00f2\5+\26\2\u00f2\u00f3\5? \2\u00f3\u00f4\5+\26"+
		"\2\u00f4\\\3\2\2\2\u00f5\u00f6\5A!\2\u00f6\u00f7\5? \2\u00f7\u00f8\5C"+
		"\"\2\u00f8^\3\2\2\2\u00f9\u00fa\5\63\32\2\u00fa\u00fb\5/\30\2\u00fb\u00fc"+
		"\5/\30\2\u00fc`\3\2\2\2\u00fd\u00fe\5;\36\2\u00fe\u00ff\5=\37\2\u00ff"+
		"\u0100\5-\27\2\u0100b\3\2\2\2\u0101\u0102\5/\30\2\u0102\u0103\5E#\2\u0103"+
		"\u0104\5C\"\2\u0104d\3\2\2\2\u0105\u0106\5A!\2\u0106\u0107\5=\37\2\u0107"+
		"\u0108\5\65\33\2\u0108f\3\2\2\2\u0109\u010a\5\61\31\2\u010a\u010b\5\63"+
		"\32\2\u010b\u010c\5\65\33\2\u010c\u010d\5\65\33\2\u010dh\3\2\2\2\u010e"+
		"\u010f\5G$\2\u010f\u0110\5I%\2\u0110\u0111\5K&\2\u0111j\3\2\2\2\u0112"+
		"\u0113\5M\'\2\u0113\u0114\5A!\2\u0114\u0115\5+\26\2\u0115l\3\2\2\2\u0116"+
		"\u0117\t\27\2\2\u0117n\3\2\2\2\u0118\u0119\t\25\2\2\u0119p\3\2\2\2\u011a"+
		"\u011f\5m\67\2\u011b\u011e\5m\67\2\u011c\u011e\5o8\2\u011d\u011b\3\2\2"+
		"\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120r\3\2\2\2\u0121\u011f\3\2\2\2\t\2\u00d3\u00de\u00e1\u00e8"+
		"\u011d\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
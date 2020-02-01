// Generated from org\pgcase\xobot\parsers\postgres\PgSqlLexer.g4 by ANTLR 4.5
package org.pgcase.xobot.parsers.postgres;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PgSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LESS_LESS=1, GREATER_GREATER=2, TYPECAST=3, DOT_DOT=4, COLON_EQUALS=5, 
		SCONST=6, BCONST=7, XCONST=8, IDENT=9, PARAM=10, FCONST=11, ICONST=12, 
		Op=13, T_comment=14, T_ccomment=15, T_space=16, T_newline=17, T_whitespace=18, 
		T_special_whitespace=19, T_horiz_whitespace=20, T_whitespace_with_newline=21, 
		T_horiz_space=22, PSQL_COMMAND=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LESS_LESS", "GREATER_GREATER", "TYPECAST", "DOT_DOT", "COLON_EQUALS", 
		"SCONST", "BCONST", "XCONST", "IDENT", "PARAM", "FCONST", "ICONST", "OP_SIMPLE", 
		"OP_MINUS", "OP_PLUS", "OP_PLUSMINUS", "OP_COMPLEX", "OP_WITH_COMPLEX", 
		"OP_WITHOUT_COMPLEX", "Op", "T_comment", "T_ccomment", "T_space", "T_newline", 
		"T_whitespace", "T_real", "T_decimal", "T_integer", "T_special_whitespace", 
		"T_horiz_whitespace", "T_whitespace_with_newline", "T_horiz_space", "T_quote", 
		"T_nonquote", "T_xeinside", "T_quotecontinue", "T_xqdouble", "XQString", 
		"XBString", "XHString", "XNString", "XEString", "DIGIT", "ODIGIT", "NOT_ODIGIT", 
		"HDIGIT", "XDOLQString", "IDENT_START", "IDENT_CONT", "XDQString", "T_dquote", 
		"T_nondquote", "T_xddouble", "T_uescape", "XUIString", "PSQL_COMMAND"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<<'", "'>>'", "'::'", "'..'", "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LESS_LESS", "GREATER_GREATER", "TYPECAST", "DOT_DOT", "COLON_EQUALS", 
		"SCONST", "BCONST", "XCONST", "IDENT", "PARAM", "FCONST", "ICONST", "Op", 
		"T_comment", "T_ccomment", "T_space", "T_newline", "T_whitespace", "T_special_whitespace", 
		"T_horiz_whitespace", "T_whitespace_with_newline", "T_horiz_space", "PSQL_COMMAND"
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


	  public static final int COMMENTS_CHANNEL = 1;
	  public static final int WS_CHANNEL = 2;



	public PgSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PgSqlLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return OP_SIMPLE_sempred((RuleContext)_localctx, predIndex);
		case 13:
			return OP_MINUS_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean OP_SIMPLE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  _input.LA(1) != '*' ;
		}
		return true;
	}
	private boolean OP_MINUS_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  _input.LA(1) != '-' ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u0247\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u0087\n\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n\u0094\13\n\5\n\u0096"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\5\f\u009d\n\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\6\16\u00a5\n\16\r\16\16\16\u00a6\3\17\3\17\3\17\3\20\3\20\3\21\3\21\5"+
		"\21\u00b0\n\21\3\22\6\22\u00b3\n\22\r\22\16\22\u00b4\3\23\3\23\7\23\u00b9"+
		"\n\23\f\23\16\23\u00bc\13\23\3\23\3\23\3\23\3\23\7\23\u00c2\n\23\f\23"+
		"\16\23\u00c5\13\23\3\24\3\24\7\24\u00c9\n\24\f\24\16\24\u00cc\13\24\3"+
		"\24\3\24\3\25\3\25\3\25\5\25\u00d3\n\25\3\26\3\26\3\26\3\26\7\26\u00d9"+
		"\n\26\f\26\16\26\u00dc\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u00e5"+
		"\n\27\f\27\16\27\u00e8\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\6\32\u00f8\n\32\r\32\16\32\u00f9\3\32\5\32"+
		"\u00fd\n\32\3\32\3\32\3\33\3\33\5\33\u0103\n\33\3\33\3\33\5\33\u0107\n"+
		"\33\3\33\6\33\u010a\n\33\r\33\16\33\u010b\3\34\7\34\u010f\n\34\f\34\16"+
		"\34\u0112\13\34\3\34\3\34\6\34\u0116\n\34\r\34\16\34\u0117\3\34\6\34\u011b"+
		"\n\34\r\34\16\34\u011c\3\34\3\34\7\34\u0121\n\34\f\34\16\34\u0124\13\34"+
		"\5\34\u0126\n\34\3\35\6\35\u0129\n\35\r\35\16\35\u012a\3\36\6\36\u012e"+
		"\n\36\r\36\16\36\u012f\3\36\3\36\3\36\5\36\u0135\n\36\3\36\3\36\3\37\3"+
		"\37\5\37\u013b\n\37\3\37\3\37\3 \7 \u0140\n \f \16 \u0143\13 \3 \3 \7"+
		" \u0147\n \f \16 \u014a\13 \3 \3 \3!\3!\3!\3!\3\"\3\"\3#\6#\u0155\n#\r"+
		"#\16#\u0156\3$\6$\u015a\n$\r$\16$\u015b\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\7\'\u0169\n\'\f\'\16\'\u016c\13\'\3\'\3\'\3(\3(\3(\3(\6(\u0174"+
		"\n(\r(\16(\u0175\7(\u0178\n(\f(\16(\u017b\13(\3(\3(\3)\3)\3)\3)\6)\u0183"+
		"\n)\r)\16)\u0184\7)\u0187\n)\f)\16)\u018a\13)\3)\3)\3*\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u0199\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u01ab\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01b6\n+\5+\u01b8\n+"+
		"\3+\7+\u01bb\n+\f+\16+\u01be\13+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\60\3\60\7\60\u01ce\n\60\f\60\16\60\u01d1\13\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u01dd\n\60\f\60\16\60\u01e0\13"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\7\60\u01f4\n\60\f\60\16\60\u01f7\13\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0203\n\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\63\7\63\u020c\n\63\f\63\16\63\u020f\13\63\3\63"+
		"\3\63\3\64\3\64\3\65\6\65\u0216\n\65\r\65\16\65\u0217\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0225\n\67\f\67\16\67\u0228"+
		"\13\67\3\67\3\67\7\67\u022c\n\67\f\67\16\67\u022f\13\67\3\67\3\67\38\3"+
		"8\38\38\78\u0237\n8\f8\168\u023a\138\38\58\u023d\n8\39\39\79\u0241\n9"+
		"\f9\169\u0244\139\39\39\b\u00e6\u01cf\u01de\u01f5\u020d\u022d\2:\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\2!\2"+
		"#\2%\2\'\2)\17+\20-\21/\22\61\23\63\24\65\2\67\29\2;\25=\26?\27A\30C\2"+
		"E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\31"+
		"\3\2\31\n\2##%%\'(AB``bb~~\u0080\u0080\4\2\f\f\17\17\5\2\13\f\16\17\""+
		"\"\4\2GGgg\4\2--//\5\2\13\13\16\16\"\"\3\2))\4\2))^^\4\2DDdd\3\2\62\63"+
		"\4\2ZZzz\4\2PPpp\3\2\62;\3\2\629\5\2\62;CHch\5\2C\\aac|\b\2&&\62;C\\^"+
		"^aac|\3\2$$\4\2WWww\4\2UUuu\4\2EEee\4\2CCcc\4\2RRrr\u0270\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5v"+
		"\3\2\2\2\7y\3\2\2\2\t|\3\2\2\2\13\177\3\2\2\2\r\u0086\3\2\2\2\17\u0088"+
		"\3\2\2\2\21\u008a\3\2\2\2\23\u0095\3\2\2\2\25\u0097\3\2\2\2\27\u009c\3"+
		"\2\2\2\31\u009e\3\2\2\2\33\u00a4\3\2\2\2\35\u00a8\3\2\2\2\37\u00ab\3\2"+
		"\2\2!\u00af\3\2\2\2#\u00b2\3\2\2\2%\u00ba\3\2\2\2\'\u00ca\3\2\2\2)\u00d2"+
		"\3\2\2\2+\u00d4\3\2\2\2-\u00df\3\2\2\2/\u00ee\3\2\2\2\61\u00f2\3\2\2\2"+
		"\63\u00fc\3\2\2\2\65\u0102\3\2\2\2\67\u0125\3\2\2\29\u0128\3\2\2\2;\u0134"+
		"\3\2\2\2=\u013a\3\2\2\2?\u0141\3\2\2\2A\u014d\3\2\2\2C\u0151\3\2\2\2E"+
		"\u0154\3\2\2\2G\u0159\3\2\2\2I\u015d\3\2\2\2K\u0161\3\2\2\2M\u0164\3\2"+
		"\2\2O\u016f\3\2\2\2Q\u017e\3\2\2\2S\u018d\3\2\2\2U\u0190\3\2\2\2W\u01c1"+
		"\3\2\2\2Y\u01c3\3\2\2\2[\u01c5\3\2\2\2]\u01c7\3\2\2\2_\u0202\3\2\2\2a"+
		"\u0204\3\2\2\2c\u0206\3\2\2\2e\u0208\3\2\2\2g\u0212\3\2\2\2i\u0215\3\2"+
		"\2\2k\u0219\3\2\2\2m\u021c\3\2\2\2o\u0232\3\2\2\2q\u023e\3\2\2\2st\7>"+
		"\2\2tu\7>\2\2u\4\3\2\2\2vw\7@\2\2wx\7@\2\2x\6\3\2\2\2yz\7<\2\2z{\7<\2"+
		"\2{\b\3\2\2\2|}\7\60\2\2}~\7\60\2\2~\n\3\2\2\2\177\u0080\7<\2\2\u0080"+
		"\u0081\7?\2\2\u0081\f\3\2\2\2\u0082\u0087\5M\'\2\u0083\u0087\5S*\2\u0084"+
		"\u0087\5U+\2\u0085\u0087\5_\60\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\16\3\2\2\2\u0088\u0089"+
		"\5O(\2\u0089\20\3\2\2\2\u008a\u008b\5Q)\2\u008b\22\3\2\2\2\u008c\u0096"+
		"\5e\63\2\u008d\u0096\5o8\2\u008e\u0092\5a\61\2\u008f\u0091\5c\62\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u008c\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0096\24\3\2\2\2\u0097\u0098\7&\2\2"+
		"\u0098\u0099\59\35\2\u0099\26\3\2\2\2\u009a\u009d\5\65\33\2\u009b\u009d"+
		"\5\67\34\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\30\3\2\2\2\u009e"+
		"\u009f\59\35\2\u009f\32\3\2\2\2\u00a0\u00a5\4>@\2\u00a1\u00a2\7\61\2\2"+
		"\u00a2\u00a5\6\16\2\2\u00a3\u00a5\7,\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa\6\17\3"+
		"\2\u00aa\36\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac \3\2\2\2\u00ad\u00b0\5\37"+
		"\20\2\u00ae\u00b0\5\35\17\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\"\3\2\2\2\u00b1\u00b3\t\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5$\3\2\2\2\u00b6\u00b9\5"+
		"!\21\2\u00b7\u00b9\5\33\16\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c3\5#\22\2\u00be\u00c2\5!\21\2\u00bf"+
		"\u00c2\5\33\16\2\u00c0\u00c2\5#\22\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3"+
		"\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4&\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\5\33\16"+
		"\2\u00c7\u00c9\5!\21\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\5\33\16\2\u00ce(\3\2\2\2\u00cf\u00d3\5\'\24"+
		"\2\u00d0\u00d3\5%\23\2\u00d1\u00d3\5!\21\2\u00d2\u00cf\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3*\3\2\2\2\u00d4\u00d5\7/\2\2\u00d5\u00d6"+
		"\7/\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\n\3\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\b\26\2\2\u00de,\3\2\2\2\u00df\u00e0"+
		"\7\61\2\2\u00e0\u00e1\7,\2\2\u00e1\u00e6\3\2\2\2\u00e2\u00e5\5-\27\2\u00e3"+
		"\u00e5\13\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3"+
		"\2\2\2\u00e6\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\b\27\2\2\u00ed.\3\2\2\2\u00ee\u00ef\t\4\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\b\30\2\2\u00f1\60\3\2\2\2\u00f2\u00f3\t\3\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\b\31\2\2\u00f5\62\3\2\2\2\u00f6\u00f8\5/\30"+
		"\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00fd\5+\26\2\u00fc\u00f7\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\32\2\2\u00ff\64\3\2\2"+
		"\2\u0100\u0103\59\35\2\u0101\u0103\5\67\34\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\t\5\2\2\u0105\u0107\t\6"+
		"\2\2\u0106\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u010a\5W,\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2"+
		"\2\u010b\u010c\3\2\2\2\u010c\66\3\2\2\2\u010d\u010f\5W,\2\u010e\u010d"+
		"\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\7\60\2\2\u0114\u0116\5"+
		"W,\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0126\3\2\2\2\u0119\u011b\5W,\2\u011a\u0119\3\2\2"+
		"\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u0122\7\60\2\2\u011f\u0121\5W,\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0126\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0110\3\2\2\2\u0125\u011a\3\2\2\2\u0126"+
		"8\3\2\2\2\u0127\u0129\5W,\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b:\3\2\2\2\u012c\u012e\5/\30\2"+
		"\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0135\3\2\2\2\u0131\u0132\5+\26\2\u0132\u0133\5\61\31\2"+
		"\u0133\u0135\3\2\2\2\u0134\u012d\3\2\2\2\u0134\u0131\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0137\b\36\2\2\u0137<\3\2\2\2\u0138\u013b\5A!\2\u0139\u013b"+
		"\5+\26\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\b\37\2\2\u013d>\3\2\2\2\u013e\u0140\5=\37\2\u013f\u013e\3\2\2\2"+
		"\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0148\5\61\31\2\u0145\u0147\5;\36\2"+
		"\u0146\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149"+
		"\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\b \2\2\u014c"+
		"@\3\2\2\2\u014d\u014e\t\7\2\2\u014e\u014f\3\2\2\2\u014f\u0150\b!\2\2\u0150"+
		"B\3\2\2\2\u0151\u0152\7)\2\2\u0152D\3\2\2\2\u0153\u0155\n\b\2\2\u0154"+
		"\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0157F\3\2\2\2\u0158\u015a\n\t\2\2\u0159\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015cH\3\2\2\2\u015d"+
		"\u015e\5C\"\2\u015e\u015f\5? \2\u015f\u0160\5C\"\2\u0160J\3\2\2\2\u0161"+
		"\u0162\5C\"\2\u0162\u0163\5C\"\2\u0163L\3\2\2\2\u0164\u016a\5C\"\2\u0165"+
		"\u0169\5K&\2\u0166\u0169\5I%\2\u0167\u0169\5E#\2\u0168\u0165\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u016e\5C\"\2\u016eN\3\2\2\2\u016f\u0170\t\n\2\2\u0170\u0179\5C\"\2\u0171"+
		"\u0178\5I%\2\u0172\u0174\t\13\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177"+
		"\u0171\3\2\2\2\u0177\u0173\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2"+
		"\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017d\5C\"\2\u017dP\3\2\2\2\u017e\u017f\t\f\2\2\u017f\u0188\5C\"\2\u0180"+
		"\u0187\5I%\2\u0181\u0183\5]/\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2"+
		"\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0180"+
		"\3\2\2\2\u0186\u0182\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\5C"+
		"\"\2\u018cR\3\2\2\2\u018d\u018e\t\r\2\2\u018e\u018f\5M\'\2\u018fT\3\2"+
		"\2\2\u0190\u0191\t\5\2\2\u0191\u01bc\5C\"\2\u0192\u01bb\5K&\2\u0193\u01bb"+
		"\5I%\2\u0194\u01b7\7^\2\2\u0195\u0196\7z\2\2\u0196\u0198\5]/\2\u0197\u0199"+
		"\5]/\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u01b8\3\2\2\2\u019a"+
		"\u019b\7w\2\2\u019b\u019c\5]/\2\u019c\u019d\5]/\2\u019d\u019e\5]/\2\u019e"+
		"\u019f\5]/\2\u019f\u01ab\3\2\2\2\u01a0\u01a1\7W\2\2\u01a1\u01a2\5]/\2"+
		"\u01a2\u01a3\5]/\2\u01a3\u01a4\5]/\2\u01a4\u01a5\5]/\2\u01a5\u01a6\5]"+
		"/\2\u01a6\u01a7\5]/\2\u01a7\u01a8\5]/\2\u01a8\u01a9\5]/\2\u01a9\u01ab"+
		"\3\2\2\2\u01aa\u019a\3\2\2\2\u01aa\u01a0\3\2\2\2\u01ab\u01b8\3\2\2\2\u01ac"+
		"\u01b8\5[.\2\u01ad\u01ae\5Y-\2\u01ae\u01af\5Y-\2\u01af\u01b0\5Y-\2\u01b0"+
		"\u01b6\3\2\2\2\u01b1\u01b2\5Y-\2\u01b2\u01b3\5Y-\2\u01b3\u01b6\3\2\2\2"+
		"\u01b4\u01b6\5Y-\2\u01b5\u01ad\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b5\u01b4"+
		"\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u0195\3\2\2\2\u01b7\u01aa\3\2\2\2\u01b7"+
		"\u01ac\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01bb\5G"+
		"$\2\u01ba\u0192\3\2\2\2\u01ba\u0193\3\2\2\2\u01ba\u0194\3\2\2\2\u01ba"+
		"\u01b9\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\5C\"\2\u01c0"+
		"V\3\2\2\2\u01c1\u01c2\t\16\2\2\u01c2X\3\2\2\2\u01c3\u01c4\t\17\2\2\u01c4"+
		"Z\3\2\2\2\u01c5\u01c6\n\17\2\2\u01c6\\\3\2\2\2\u01c7\u01c8\t\20\2\2\u01c8"+
		"^\3\2\2\2\u01c9\u01ca\7&\2\2\u01ca\u01cb\7&\2\2\u01cb\u01cf\3\2\2\2\u01cc"+
		"\u01ce\13\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01d0\3"+
		"\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2"+
		"\u01d3\7&\2\2\u01d3\u0203\7&\2\2\u01d4\u01d5\7&\2\2\u01d5\u01d6\7D\2\2"+
		"\u01d6\u01d7\7Q\2\2\u01d7\u01d8\7F\2\2\u01d8\u01d9\7[\2\2\u01d9\u01da"+
		"\7&\2\2\u01da\u01de\3\2\2\2\u01db\u01dd\13\2\2\2\u01dc\u01db\3\2\2\2\u01dd"+
		"\u01e0\3\2\2\2\u01de\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e1\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\7&\2\2\u01e2\u01e3\7D\2\2\u01e3\u01e4"+
		"\7Q\2\2\u01e4\u01e5\7F\2\2\u01e5\u01e6\7[\2\2\u01e6\u0203\7&\2\2\u01e7"+
		"\u01e8\7&\2\2\u01e8\u01e9\7h\2\2\u01e9\u01ea\7w\2\2\u01ea\u01eb\7p\2\2"+
		"\u01eb\u01ec\7e\2\2\u01ec\u01ed\7v\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef"+
		"\7q\2\2\u01ef\u01f0\7p\2\2\u01f0\u01f1\7&\2\2\u01f1\u01f5\3\2\2\2\u01f2"+
		"\u01f4\13\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f6\3"+
		"\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01f9\7&\2\2\u01f9\u01fa\7h\2\2\u01fa\u01fb\7w\2\2\u01fb\u01fc\7p\2\2"+
		"\u01fc\u01fd\7e\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7k\2\2\u01ff\u0200"+
		"\7q\2\2\u0200\u0201\7p\2\2\u0201\u0203\7&\2\2\u0202\u01c9\3\2\2\2\u0202"+
		"\u01d4\3\2\2\2\u0202\u01e7\3\2\2\2\u0203`\3\2\2\2\u0204\u0205\t\21\2\2"+
		"\u0205b\3\2\2\2\u0206\u0207\t\22\2\2\u0207d\3\2\2\2\u0208\u020d\5g\64"+
		"\2\u0209\u020c\5k\66\2\u020a\u020c\5i\65\2\u020b\u0209\3\2\2\2\u020b\u020a"+
		"\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020e\3\2\2\2\u020d\u020b\3\2\2\2\u020e"+
		"\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\5g\64\2\u0211f\3\2\2\2"+
		"\u0212\u0213\7$\2\2\u0213h\3\2\2\2\u0214\u0216\n\23\2\2\u0215\u0214\3"+
		"\2\2\2\u0216\u0217\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"j\3\2\2\2\u0219\u021a\5g\64\2\u021a\u021b\5g\64\2\u021bl\3\2\2\2\u021c"+
		"\u021d\t\24\2\2\u021d\u021e\t\5\2\2\u021e\u021f\t\25\2\2\u021f\u0220\t"+
		"\26\2\2\u0220\u0221\t\27\2\2\u0221\u0222\t\30\2\2\u0222\u0226\t\5\2\2"+
		"\u0223\u0225\5\63\32\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229"+
		"\u022d\5C\"\2\u022a\u022c\5i\65\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\3\2\2\2\u022f"+
		"\u022d\3\2\2\2\u0230\u0231\5C\"\2\u0231n\3\2\2\2\u0232\u0233\t\24\2\2"+
		"\u0233\u0234\7(\2\2\u0234\u023c\5e\63\2\u0235\u0237\5\63\32\2\u0236\u0235"+
		"\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023b\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023d\5m\67\2\u023c\u0238\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023dp\3\2\2\2\u023e\u0242\7^\2\2\u023f\u0241"+
		"\n\3\2\2\u0240\u023f\3\2\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\b9"+
		"\2\2\u0246r\3\2\2\2A\2\u0086\u0092\u0095\u009c\u00a4\u00a6\u00af\u00b4"+
		"\u00b8\u00ba\u00c1\u00c3\u00c8\u00ca\u00d2\u00da\u00e4\u00e6\u00f9\u00fc"+
		"\u0102\u0106\u010b\u0110\u0117\u011c\u0122\u0125\u012a\u012f\u0134\u013a"+
		"\u0141\u0148\u0156\u015b\u0168\u016a\u0175\u0177\u0179\u0184\u0186\u0188"+
		"\u0198\u01aa\u01b5\u01b7\u01ba\u01bc\u01cf\u01de\u01f5\u0202\u020b\u020d"+
		"\u0217\u0226\u022d\u0238\u023c\u0242\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
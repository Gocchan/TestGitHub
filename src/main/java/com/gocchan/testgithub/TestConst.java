package com.gocchan.testgithub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestConst {


    private static final Map<String, List<String>> ROMAN_0 = new HashMap<String, List<String>>() {
    	{
    		put("", Arrays.asList("あ", "い", "う", "え", "お"));
    	}
    };

    private static final Map<String, List<String>> ROMAN_1 = new HashMap<String, List<String>>() {
    	{
    		put("k", Arrays.asList("か", "き", "く", "け", "こ"));
    		put("g", Arrays.asList("が", "ぎ", "ぐ", "げ", "ご"));
    		put("s", Arrays.asList("さ", "し", "す", "せ", "そ"));
    		put("z", Arrays.asList("ざ", "じ", "ず", "ぜ", "ぞ"));
    		put("t", Arrays.asList("た", "ち", "つ", "て", "と"));
    		put("d", Arrays.asList("だ", "ぢ", "づ", "で", "ど"));
    		put("n", Arrays.asList("な", "に", "ぬ", "ね", "の"));
    		put("h", Arrays.asList("は", "ひ", "ふ", "へ", "ほ"));
    		put("b", Arrays.asList("ば", "び", "ぶ", "べ", "ぼ"));
    		put("p", Arrays.asList("ぱ", "ぴ", "ぷ", "ぺ", "ぽ"));
    		put("m", Arrays.asList("ま", "み", "む", "め", "も"));
    		put("y", Arrays.asList("や", "い", "ゆ", "いぇ", "よ"));
    		put("r", Arrays.asList("ら", "り", "る", "れ", "ろ"));
    		put("w", Arrays.asList("わ", "うぃ", "う", "うぇ", "を"));
    		put("j", Arrays.asList("じゃ", "じ", "じゅ", "じぇ", "じょ"));
    		put("f", Arrays.asList("ふぁ", "ふぃ", "ふ", "ふぇ", "ふぉ"));
    		put("x", Arrays.asList("ぁ", "ぃ", "ぅ", "ぇ", "ぉ"));
	    	// SJISなら仕方なくコッチだけど
    		//put("v", Arrays.asList("ヴぁ", "ヴぃ", "ヴ", "ヴぇ", "ヴぉ"));

    		// ↓ のほうがGoogle API にて "エヴァンゲリオン"と正しく変換されるため。
    		//put("v", Arrays.asList("ゔぁ", "ゔぃ", "ゔ", "ゔぇ", "ゔぉ"));
    		put("q", Arrays.asList("くぁ", "くぃ", "く", "くぇ", "くぉ"));
    		put("l", Arrays.asList("ぁ", "ぃ", "ぅ" , "ぇ" , "ぉ"));
    		put("c", Arrays.asList("か", "し", "く", "せ", "こ"));
    	}
    };

    private static final Map<String, List<String>> ROMAN_2 = new HashMap<String, List<String>>() {
    	{
	    	put("wy", Arrays.asList("", "ゐ", "", "ゑ", ""));
	    	put("ky", Arrays.asList("きゃ", "きぃ", "きゅ", "きぇ", "きょ"));
	    	put("gy", Arrays.asList("ぎゃ", "ぎぃ", "ぎゅ", "ぎぇ", "ぎょ"));
	    	put("sy", Arrays.asList("しゃ", "しぃ", "しゅ", "しぇ", "しょ"));
	    	put("sh", Arrays.asList("しゃ", "し", "しゅ", "しぇ", "しょ"));
	    	put("zy", Arrays.asList("じゃ", "じぃ", "じゅ", "じぇ", "じょ"));
	    	put("ty", Arrays.asList("ちゃ", "ちぃ", "ちゅ", "ちぇ", "ちょ"));
	    	put("ch", Arrays.asList("ちゃ", "ち", "ちゅ", "ちぇ", "ちょ"));
	    	put("dy", Arrays.asList("ぢゃ", "ぢぃ", "ぢゅ", "ぢぇ", "ぢょ"));
	    	put("ny", Arrays.asList("にゃ", "にぃ", "にゅ", "にぇ", "にょ"));
	    	put("hy", Arrays.asList("ひゃ", "ひぃ", "ひゅ", "ひぇ", "ひょ"));
	    	put("by", Arrays.asList("びゃ", "びぃ", "びゅ", "びぇ", "びょ"));
	    	put("py", Arrays.asList("ぴゃ", "ぴぃ", "ぴゅ", "ぴぇ", "ぴょ"));
	    	put("my", Arrays.asList("みゃ", "みぃ", "みゅ", "みぇ", "みょ"));
	    	put("ry", Arrays.asList("りゃ", "りぃ", "りゅ", "りぇ", "りょ"));
	    	put("ts", Arrays.asList("つぁ", "つぃ", "つ", "つぇ", "つぉ"));
	    	put("th", Arrays.asList("てゃ", "てぃ", "てゅ", "てぇ", "てょ"));
	    	put("dh", Arrays.asList("でゃ", "でぃ", "でゅ", "でぇ", "でょ"));
	    	//put("xk", Arrays.asList("ヵ", "", "", "ヶ", ""));
	    	put("xk", Arrays.asList("ゕ", "", "", "ゖ", ""));
	    	put("xt", Arrays.asList("", "", "っ", "", ""));
	    	put("xy", Arrays.asList("ゃ", "ぃ", "ゅ", "ぇ", "ょ"));
	    	put("xw", Arrays.asList("ゎ", "", "", "", ""));
	    	put("wh", Arrays.asList("うぁ", "うぃ", "う", "うぇ", "うぉ"));

	    	// SJISなら仕方なくコッチだけど
	    	//put("vy", Arrays.asList("ヴゃ", "ヴぃ", "ヴゅ", "ヴぇ", "ヴょ"));
	    	put("vy", Arrays.asList("ゔゃ", "ゔぃ", "ゔゅ", "ゔぇ", "ゔょ"));
	    	put("kw", Arrays.asList("くぁ", "くぃ", "くぅ", "くぇ", "くぉ"));
	    	put("gw", Arrays.asList("ぐぁ", "ぐぃ", "ぐぅ", "ぐぇ", "ぐぉ"));
	    	put("jy", Arrays.asList("じゃ", "じぃ", "じゅ", "じぇ", "じょ"));
	    	put("cy", Arrays.asList("ちゃ", "ちぃ", "ちゅ", "ちぇ", "ちょ"));
	    	put("tw", Arrays.asList("とぁ", "とぃ", "とぅ", "とぇ", "とぉ"));
	    	put("dw", Arrays.asList("どぁ", "どぃ", "どぅ", "どぇ", "どぉ"));
	    	put("hw", Arrays.asList("ふぁ", "ふぃ", "", "ふぇ", "ふぉ"));
	    	put("fy", Arrays.asList("ふゃ", "ふぃ", "ふゅ", "ふぇ", "ふょ"));
	    	//put("lk", Arrays.asList("ヵ", "", "", "ヶ", ""));
	    	put("lk", Arrays.asList("ゕ", "", "", "ゖ", ""));
	    	put("lt", Arrays.asList("", "", "っ", "", ""));
	    	put("ly", Arrays.asList("ゃ", "ぃ", "ゅ", "ぇ", "ょ"));
	    	put("lw", Arrays.asList("ゎ", "", "", "", ""));
	    	put("qw", Arrays.asList("くぁ", "くぃ", "くぅ", "くぇ", "くぉ"));
	    	put("sw", Arrays.asList("すぁ", "すぃ", "すぅ", "すぇ", "すぉ"));
	    	put("zw", Arrays.asList("ずぁ", "ずぃ", "ずぅ", "ずぇ", "ずぉ"));
	    	put("fw", Arrays.asList("ふぁ", "ふぃ", "ふぅ", "ふぇ", "ふぉ"));
	    	put("qy", Arrays.asList("くゃ", "くぃ", "くゅ", "くぇ", "くょ"));
			put("t'", Arrays.asList("", "てぃ", "とぅ", "", ""));
			put("d'", Arrays.asList("", "でぃ", "どぅ", "", ""));
    	}
    };


    private static final Map<String, List<String>> ROMAN_3 = new HashMap<String, List<String>>() {
	    {
	    	put("hwy", Arrays.asList("", "", "ふゅ", "", ""));
	    	put("xts", Arrays.asList("", "", "っ", "", ""));
	    	put("lts", Arrays.asList("", "", "っ", "", ""));
	    	put("t'y", Arrays.asList("", "", "てゅ", "", ""));
	    	put("d'y", Arrays.asList("", "", "でゅ", "", ""));
	    }
    };

	public static final List<String> BOIN = Arrays.asList("a","i","u","e","o");

	public static final Map<Character, Character> ZENKAKU = new HashMap<Character, Character>() {
	    {
	        put('!', '！');
	        put('\"', '”');
	        put('#', '＃');
	        put('$', '＄');
	        put('\\', '￥');
	        put('%', '％');
	        put('&', '＆');
	        put('\'', '’');
	        put('(', '（');
	        put(')', '）');
	        put('*', '＊');
	        put('+', '＋');
	        put(',', '、');
	        put('~', '～');
	        put('-', 'ー');
	        put('^', 'ー'); // 大事！
	        put('.', '。');
	        put('/', '／');
	        put('0', '０');
	        put('1', '１');
	        put('2', '２');
	        put('3', '３');
	        put('4', '４');
	        put('5', '５');
	        put('6', '６');
	        put('7', '７');
	        put('8', '８');
	        put('9', '９');
	        put(':', '：');
	        put(';', '；');
	        put('<', '＜');
	        put('=', '＝');
	        put('>', '＞');
	        put('?', '？');
	        put('@', '＠');
	        put('A', 'Ａ');
	        put('B', 'Ｂ');
	        put('C', 'Ｃ');
	        put('D', 'Ｄ');
	        put('E', 'Ｅ');
	        put('F', 'Ｆ');
	        put('G', 'Ｇ');
	        put('H', 'Ｈ');
	        put('I', 'Ｉ');
	        put('J', 'Ｊ');
	        put('K', 'Ｋ');
	        put('L', 'Ｌ');
	        put('M', 'Ｍ');
	        put('N', 'Ｎ');
	        put('O', 'Ｏ');
	        put('P', 'Ｐ');
	        put('Q', 'Ｑ');
	        put('R', 'Ｒ');
	        put('S', 'Ｓ');
	        put('T', 'Ｔ');
	        put('U', 'Ｕ');
	        put('V', 'Ｖ');
	        put('W', 'Ｗ');
	        put('X', 'Ｘ');
	        put('Y', 'Ｙ');
	        put('Z', 'Ｚ');
	        put('`', '‘');
	        put('[', '「');
	        put(']', '」');
	        put('a', 'ａ');
	        put('b', 'ｂ');
	        put('c', 'ｃ');
	        put('d', 'ｄ');
	        put('e', 'ｅ');
	        put('f', 'ｆ');
	        put('g', 'ｇ');
	        put('h', 'ｈ');
	        put('i', 'ｉ');
	        put('j', 'ｊ');
	        put('k', 'ｋ');
	        put('l', 'ｌ');
	        put('m', 'ｍ');
	        put('n', 'ｎ');
	        put('o', 'ｏ');
	        put('p', 'ｐ');
	        put('q', 'ｑ');
	        put('r', 'ｒ');
	        put('s', 'ｓ');
	        put('t', 'ｔ');
	        put('u', 'ｕ');
	        put('v', 'ｖ');
	        put('w', 'ｗ');
	        put('x', 'ｘ');
	        put('y', 'ｙ');
	        put('z', 'ｚ');
	    }
    };

    public static final Character[] NOUON = new Character[] {'R','E','Q','T','W'};

	public static final HashMap<String, String> G_DICTIONARY = new HashMap<String, String>() {

        {put("お初サンコン", "お初さんこん");}
        {put("お初さんコーン", "お初さんこーん");}
        {put("行った後マス", "一旦落ちます");}
        {put("行った後マース", "一旦落ちまーす");}
        {put("おメデット", "おめでっと");}
        {put("ありガット", "ありがっと");}
        {put("コンです", "こんです");}
        {put("年度", "粘土");}
        {put("創価", "そうか");}
        {put("襟トラ", "エリトラ");}
        {put("気を切", "木を切");}
        {put("クァンジャニ千葉", "クァンジャン市場");}
        {put("お初山陽", "お初さん用");}
        {put("言え見", "家見");}
        {put("資さん", "スケさん");}
        {put("家事だ", "火事だ");}
        {put("毛津った", "削った");}
        {put("コンコン", "こんこん");}
        {put("お顔カ", "おかおか");}
        {put("対価", "耐火");}
        {put("推奨", "水晶");}
        {put("失点の", "知ってんの");}
        {put("おｋｄシェ", "OKです");}
        {put("丘です", "おかです");}
        {put("際と", "サイト");}
        {put("カキクケコ", "かきくけこ");}
        {put("タチツテト", "たちつてと");}
        {put("ナニヌネノ", "なにぬねの");}
        {put("焼いゆえよ", "やいゆえよ");}
        {put("ワイ上を", "わいうえを");}
        {put("ガギグゲゴ", "がぎぐげご");}
        {put("ダジづで度", "だぢづでど");}
        {put("バビブベボ", "ばびぶべぼ");}
        {put("キャ急遽", "きゃきゅきょ");}
        {put("車種書", "しゃしゅしょ");}
        {put("茶躊躇", "ちゃちゅちょ");}
        {put("にゃニュにょ", "にゃにゅにょ");}
        {put("ヒャヒュヒョ", "ひゃひゅひょ");}
        {put("ミャミュミョ", "みゃみゅみょ");}
        {put("リャリュりょ", "りゃりゅりょ");}
        {put("ぎゃぎゅ魚", "ぎゃぎゅぎょ");}
        {put("ジャ樹所", "じゃじゅじょ");}
    };

    public static Map<String, List<String>> ROMAN(int i) {
    	switch(i) {
			case 0:
				return ROMAN_0;
    		case 1:
    			return ROMAN_1;
    		case 2:
    			return ROMAN_2;
    		case 3:
    			return ROMAN_3;
    		default:
    			return null;
    	}
    }
}

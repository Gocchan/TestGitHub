package com.gocchan.testgithub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJapanese {

	private static final List<String> BOIN = Arrays.asList("a","i","u","e","o");

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
    		put("v", Arrays.asList("ゔぁ", "ゔぃ", "ゔ", "ゔぇ", "ゔぉ"));
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
	    	put("xk", Arrays.asList("ヵ", "", "", "ヶ", ""));
	    	put("xt", Arrays.asList("", "", "っ", "", ""));
	    	put("xy", Arrays.asList("ゃ", "ぃ", "ゅ", "ぇ", "ょ"));
	    	put("xw", Arrays.asList("ゎ", "", "", "", ""));
	    	put("wh", Arrays.asList("うぁ", "うぃ", "う", "うぇ", "うぉ"));
	    	put("vy", Arrays.asList("ゔゃ", "ゔぃ", "ゔゅ", "ゔぇ", "ゔょ"));
	    	put("kw", Arrays.asList("くぁ", "くぃ", "くぅ", "くぇ", "くぉ"));
	    	put("gw", Arrays.asList("ぐぁ", "ぐぃ", "ぐぅ", "ぐぇ", "ぐぉ"));
	    	put("jy", Arrays.asList("じゃ", "じぃ", "じゅ", "じぇ", "じょ"));
	    	put("cy", Arrays.asList("ちゃ", "ちぃ", "ちゅ", "ちぇ", "ちょ"));
	    	put("tw", Arrays.asList("とぁ", "とぃ", "とぅ", "とぇ", "とぉ"));
	    	put("dw", Arrays.asList("どぁ", "どぃ", "どぅ", "どぇ", "どぉ"));
	    	put("hw", Arrays.asList("ふぁ", "ふぃ", "", "ふぇ", "ふぉ"));
	    	put("fy", Arrays.asList("ふゃ", "ふぃ", "ふゅ", "ふぇ", "ふょ"));
	    	put("lk", Arrays.asList("ヵ", "", "", "ヶ", ""));
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

    private static Map<String, List<String>> ROMAN(int i) {
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

    public static String toKana(String in) {

		String out = "";
		String now;
		String buf = "";
		int cnt = 0;

		for(int i = 0; i < in.length(); i++) {

			now = in.substring(i,i+1); // i文字目から1文字

			System.out.println("cnt:" + cnt + ", buf=" + buf + ", now=" + now);
			if(BOIN.contains(now)) {

				if(ROMAN(cnt).containsKey(buf)) {
					out += ROMAN(cnt).get(buf).get(BOIN.indexOf(now));
					cnt = 0;
					buf = "";
				}

			} else {

				if(cnt > 3) {
					out += buf.substring(0, 1); // 1文字目から1文字
					buf = buf.substring(1) + now; // 2文字目からとカレント文字
				} else {

					if(buf.equals("n")) {
						out += "ん";
						if(now.equals("n") || now.equals("'")) {
							buf = "";
							cnt = 0;
						} else {
							buf = now;
						}
					} else {
						buf += now;
						cnt++;
					}
				}
			}
		}

		return out + buf;

    }
}

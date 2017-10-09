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

    private static char toZenkaku(char c) {
        switch(c) {
	        case '!'   : return  '！' ;
	        case '\"'  : return  '”' ;
	        case '#'   : return  '＃' ;
	        case '$'   : return  '＄' ;
	        case '\\'  : return  '￥' ;
	        case '%'   : return  '％' ;
	        case '&'   : return  '＆' ;
	        case '\''  : return  '’' ;
	        case '('   : return  '（' ;
	        case ')'   : return  '）' ;
	        case '*'   : return  '＊' ;
	        case '+'   : return  '＋' ;
	        case ','   : return  '、' ;
	        case '~'   : return  '～' ;
	        case '-'   : return  'ー' ;
	        case '^'   : return  'ー' ;	// 大事！
	        case '.'   : return  '。' ;
	        case '/'   : return  '／' ;
	        case '0'   : return  '０' ;
	        case '1'   : return  '１' ;
	        case '2'   : return  '２' ;
	        case '3'   : return  '３' ;
	        case '4'   : return  '４' ;
	        case '5'   : return  '５' ;
	        case '6'   : return  '６' ;
	        case '7'   : return  '７' ;
	        case '8'   : return  '８' ;
	        case '9'   : return  '９' ;
	        case ':'   : return  '：' ;
	        case ';'   : return  '；' ;
	        case '<'   : return  '＜' ;
	        case '='   : return  '＝' ;
	        case '>'   : return  '＞' ;
	        case '?'   : return  '？' ;
	        case '@'   : return  '＠' ;
	        case 'A'   : return  'Ａ' ;
	        case 'B'   : return  'Ｂ' ;
	        case 'C'   : return  'Ｃ' ;
	        case 'D'   : return  'Ｄ' ;
	        case 'E'   : return  'Ｅ' ;
	        case 'F'   : return  'Ｆ' ;
	        case 'G'   : return  'Ｇ' ;
	        case 'H'   : return  'Ｈ' ;
	        case 'I'   : return  'Ｉ' ;
	        case 'J'   : return  'Ｊ' ;
	        case 'K'   : return  'Ｋ' ;
	        case 'L'   : return  'Ｌ' ;
	        case 'M'   : return  'Ｍ' ;
	        case 'N'   : return  'Ｎ' ;
	        case 'O'   : return  'Ｏ' ;
	        case 'P'   : return  'Ｐ' ;
	        case 'Q'   : return  'Ｑ' ;
	        case 'R'   : return  'Ｒ' ;
	        case 'S'   : return  'Ｓ' ;
	        case 'T'   : return  'Ｔ' ;
	        case 'U'   : return  'Ｕ' ;
	        case 'V'   : return  'Ｖ' ;
	        case 'W'   : return  'Ｗ' ;
	        case 'X'   : return  'Ｘ' ;
	        case 'Y'   : return  'Ｙ' ;
	        case 'Z'   : return  'Ｚ' ;
	        case '`'   : return  '‘' ;
	        case '['   : return  '「' ;
	        case ']'   : return  '」' ;
	        case 'a'   : return  'ａ' ;
	        case 'b'   : return  'ｂ' ;
	        case 'c'   : return  'ｃ' ;
	        case 'd'   : return  'ｄ' ;
	        case 'e'   : return  'ｅ' ;
	        case 'f'   : return  'ｆ' ;
	        case 'g'   : return  'ｇ' ;
	        case 'h'   : return  'ｈ' ;
	        case 'i'   : return  'ｉ' ;
	        case 'j'   : return  'ｊ' ;
	        case 'k'   : return  'ｋ' ;
	        case 'l'   : return  'ｌ' ;
	        case 'm'   : return  'ｍ' ;
	        case 'n'   : return  'ｎ' ;
	        case 'o'   : return  'ｏ' ;
	        case 'p'   : return  'ｐ' ;
	        case 'q'   : return  'ｑ' ;
	        case 'r'   : return  'ｒ' ;
	        case 's'   : return  'ｓ' ;
	        case 't'   : return  'ｔ' ;
	        case 'u'   : return  'ｕ' ;
	        case 'v'   : return  'ｖ' ;
	        case 'w'   : return  'ｗ' ;
	        case 'x'   : return  'ｘ' ;
	        case 'y'   : return  'ｙ' ;
	        case 'z'   : return  'ｚ' ;

	        default	: return c;
        }
    }

    public static String toKana(String in) {

		String out = "";
		String now;
		String buf = "";
		int cnt = 0;

		for(int i = 0; i < in.length(); i++) {

			now = in.substring(i,i+1); // i文字目から1文字

			if(java.lang.Character.isLowerCase(in.charAt(i))) {



				//System.out.println("cnt:" + cnt + ", buf=" + buf + ", now=" + now + ", out=" + out);
				if(BOIN.contains(now)) {

					// *** ここいら辺まとめないと・・・ ***

					// バッファー3文字越え対策
					// 検索はバッファーが3文字以下対象なのではみ出した分を先に送り出す
					if(cnt > 3) {

						int cutting = cnt - 3; // はみ出た分


						out += buf.substring(0, cutting + 1); // 1文字目から1文字
						buf = buf.substring(cutting); // 残す分（3文字）
						cnt = 3;
					}

					// 減らしていきながら検索すること！
					if(cnt >= 3) {
						if(ROMAN(3).containsKey(buf) && !ROMAN(3).get(buf).get(BOIN.indexOf(now)).isEmpty()) {

							out += ROMAN(3).get(buf).get(BOIN.indexOf(now));
							cnt = 0;
							buf = "";
							continue;

						} else {

							// 1文字減らす
							out += buf.substring(0, 1); // 1文字目から1文字
							buf = buf.substring(1); // 残す分（2文字）
						}
					}

					if(cnt >= 2) {
						// 小さい　っ　対応
						if(buf.substring(0,1).equals(buf.substring(1))) {
							out += "っ";
							cnt = 1;
							buf = buf.substring(1);

						} else if(ROMAN(2).containsKey(buf) && !ROMAN(2).get(buf).get(BOIN.indexOf(now)).isEmpty()) {

							out += ROMAN(2).get(buf).get(BOIN.indexOf(now));
							cnt = 0;
							buf = "";
							continue;

						} else {

							// 1文字減らす
							out += buf.substring(0, 1); // 1文字目から1文字
							buf = buf.substring(1); // 残す分（2文字）
						}
					}

					if(cnt >= 1) {
						if(ROMAN(1).containsKey(buf) && !ROMAN(1).get(buf).get(BOIN.indexOf(now)).isEmpty()) {

							out += ROMAN(1).get(buf).get(BOIN.indexOf(now));
							cnt = 0;
							buf = "";
							continue;

						} else {
							// 1文字減らす
							out += buf.substring(0, 1); // 1文字目から1文字
						}
					}
					out += ROMAN(0).get("").get(BOIN.indexOf(now));
					cnt = 0;
					buf = "";

				} else {

					if(buf.equals("n")) {
						if(!now.equals("y")) {
							out += "ん";
							if(now.equals("n")) {
								buf = "";
								cnt = 0;
							} else if(now.equals("'")) {
								buf = "";
								cnt = 0;
							} else {
								buf = now;
							}
						} else {
							// にゃ にゅ にょ対応
							buf += now;
							cnt++;
						}

					} else {
						buf += now;
						cnt++;
					}

				}
			} else {
				// 半角英字以外
				out += buf + now;
				cnt = 0;
				buf = "";


			}
		}

		if(buf.equals("n")) {
			buf = "ん";
		}

		out += buf;

    	String str = "";

    	for(int i=0; i < out.length(); i++) {

    		String s = out.substring(i, i + 1);
    		if(s.getBytes().length > 1) {

    			str += s;
    		} else {
    			str += toZenkaku(out.charAt(i));
    		}

    	}
		return str;

    }


}

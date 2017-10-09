package com.gocchan.testgithub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJapanese {

	private static final List<String> BOIN = Arrays.asList("a","i","u","e","o");

    private static final Map<String, List<String>> ROMAN_0 = new HashMap<String, List<String>>() {
    	{
    		put("", Arrays.asList("Ç†", "Ç¢", "Ç§", "Ç¶", "Ç®"));
    	}
    };

    private static final Map<String, List<String>> ROMAN_1 = new HashMap<String, List<String>>() {
    	{
    		put("k", Arrays.asList("Ç©", "Ç´", "Ç≠", "ÇØ", "Ç±"));
    		put("g", Arrays.asList("Ç™", "Ç¨", "ÇÆ", "Ç∞", "Ç≤"));
    		put("s", Arrays.asList("Ç≥", "Çµ", "Ç∑", "Çπ", "Çª"));
    		put("z", Arrays.asList("Ç¥", "Ç∂", "Ç∏", "Ç∫", "Çº"));
    		put("t", Arrays.asList("ÇΩ", "Çø", "Ç¬", "Çƒ", "Ç∆"));
    		put("d", Arrays.asList("Çæ", "Ç¿", "Ç√", "Ç≈", "Ç«"));
    		put("n", Arrays.asList("Ç»", "Ç…", "Ç ", "ÇÀ", "ÇÃ"));
    		put("h", Arrays.asList("ÇÕ", "Ç–", "Ç”", "Ç÷", "ÇŸ"));
    		put("b", Arrays.asList("ÇŒ", "Ç—", "Ç‘", "Ç◊", "Ç⁄"));
    		put("p", Arrays.asList("Çœ", "Ç“", "Ç’", "Çÿ", "Ç€"));
    		put("m", Arrays.asList("Ç‹", "Ç›", "Çﬁ", "Çﬂ", "Ç‡"));
    		put("y", Arrays.asList("Ç‚", "Ç¢", "Ç‰", "Ç¢Ç•", "ÇÊ"));
    		put("r", Arrays.asList("ÇÁ", "ÇË", "ÇÈ", "ÇÍ", "ÇÎ"));
    		put("w", Arrays.asList("ÇÌ", "Ç§Ç°", "Ç§", "Ç§Ç•", "Ç"));
    		put("j", Arrays.asList("Ç∂Ç·", "Ç∂", "Ç∂Ç„", "Ç∂Ç•", "Ç∂ÇÂ"));
    		put("f", Arrays.asList("Ç”Çü", "Ç”Ç°", "Ç”", "Ç”Ç•", "Ç”Çß"));
    		put("x", Arrays.asList("Çü", "Ç°", "Ç£", "Ç•", "Çß"));
    		put("v", Arrays.asList("ÉîÇü", "ÉîÇ°", "Éî", "ÉîÇ•", "ÉîÇß"));
    		put("q", Arrays.asList("Ç≠Çü", "Ç≠Ç°", "Ç≠", "Ç≠Ç•", "Ç≠Çß"));
    		put("l", Arrays.asList("Çü", "Ç°", "Ç£" , "Ç•" , "Çß"));
    		put("c", Arrays.asList("Ç©", "Çµ", "Ç≠", "Çπ", "Ç±"));
    	}
    };

    private static final Map<String, List<String>> ROMAN_2 = new HashMap<String, List<String>>() {
    	{
	    	put("wy", Arrays.asList("", "ÇÓ", "", "ÇÔ", ""));
	    	put("ky", Arrays.asList("Ç´Ç·", "Ç´Ç°", "Ç´Ç„", "Ç´Ç•", "Ç´ÇÂ"));
	    	put("gy", Arrays.asList("Ç¨Ç·", "Ç¨Ç°", "Ç¨Ç„", "Ç¨Ç•", "Ç¨ÇÂ"));
	    	put("sy", Arrays.asList("ÇµÇ·", "ÇµÇ°", "ÇµÇ„", "ÇµÇ•", "ÇµÇÂ"));
	    	put("sh", Arrays.asList("ÇµÇ·", "Çµ", "ÇµÇ„", "ÇµÇ•", "ÇµÇÂ"));
	    	put("zy", Arrays.asList("Ç∂Ç·", "Ç∂Ç°", "Ç∂Ç„", "Ç∂Ç•", "Ç∂ÇÂ"));
	    	put("ty", Arrays.asList("ÇøÇ·", "ÇøÇ°", "ÇøÇ„", "ÇøÇ•", "ÇøÇÂ"));
	    	put("ch", Arrays.asList("ÇøÇ·", "Çø", "ÇøÇ„", "ÇøÇ•", "ÇøÇÂ"));
	    	put("dy", Arrays.asList("Ç¿Ç·", "Ç¿Ç°", "Ç¿Ç„", "Ç¿Ç•", "Ç¿ÇÂ"));
	    	put("ny", Arrays.asList("Ç…Ç·", "Ç…Ç°", "Ç…Ç„", "Ç…Ç•", "Ç…ÇÂ"));
	    	put("hy", Arrays.asList("Ç–Ç·", "Ç–Ç°", "Ç–Ç„", "Ç–Ç•", "Ç–ÇÂ"));
	    	put("by", Arrays.asList("Ç—Ç·", "Ç—Ç°", "Ç—Ç„", "Ç—Ç•", "Ç—ÇÂ"));
	    	put("py", Arrays.asList("Ç“Ç·", "Ç“Ç°", "Ç“Ç„", "Ç“Ç•", "Ç“ÇÂ"));
	    	put("my", Arrays.asList("Ç›Ç·", "Ç›Ç°", "Ç›Ç„", "Ç›Ç•", "Ç›ÇÂ"));
	    	put("ry", Arrays.asList("ÇËÇ·", "ÇËÇ°", "ÇËÇ„", "ÇËÇ•", "ÇËÇÂ"));
	    	put("ts", Arrays.asList("Ç¬Çü", "Ç¬Ç°", "Ç¬", "Ç¬Ç•", "Ç¬Çß"));
	    	put("th", Arrays.asList("ÇƒÇ·", "ÇƒÇ°", "ÇƒÇ„", "ÇƒÇ•", "ÇƒÇÂ"));
	    	put("dh", Arrays.asList("Ç≈Ç·", "Ç≈Ç°", "Ç≈Ç„", "Ç≈Ç•", "Ç≈ÇÂ"));
	    	put("xk", Arrays.asList("Éï", "", "", "Éñ", ""));
	    	put("xt", Arrays.asList("", "", "Ç¡", "", ""));
	    	put("xy", Arrays.asList("Ç·", "Ç°", "Ç„", "Ç•", "ÇÂ"));
	    	put("xw", Arrays.asList("ÇÏ", "", "", "", ""));
	    	put("wh", Arrays.asList("Ç§Çü", "Ç§Ç°", "Ç§", "Ç§Ç•", "Ç§Çß"));
	    	put("vy", Arrays.asList("ÉîÇ·", "ÉîÇ°", "ÉîÇ„", "ÉîÇ•", "ÉîÇÂ"));
	    	put("kw", Arrays.asList("Ç≠Çü", "Ç≠Ç°", "Ç≠Ç£", "Ç≠Ç•", "Ç≠Çß"));
	    	put("gw", Arrays.asList("ÇÆÇü", "ÇÆÇ°", "ÇÆÇ£", "ÇÆÇ•", "ÇÆÇß"));
	    	put("jy", Arrays.asList("Ç∂Ç·", "Ç∂Ç°", "Ç∂Ç„", "Ç∂Ç•", "Ç∂ÇÂ"));
	    	put("cy", Arrays.asList("ÇøÇ·", "ÇøÇ°", "ÇøÇ„", "ÇøÇ•", "ÇøÇÂ"));
	    	put("tw", Arrays.asList("Ç∆Çü", "Ç∆Ç°", "Ç∆Ç£", "Ç∆Ç•", "Ç∆Çß"));
	    	put("dw", Arrays.asList("Ç«Çü", "Ç«Ç°", "Ç«Ç£", "Ç«Ç•", "Ç«Çß"));
	    	put("hw", Arrays.asList("Ç”Çü", "Ç”Ç°", "", "Ç”Ç•", "Ç”Çß"));
	    	put("fy", Arrays.asList("Ç”Ç·", "Ç”Ç°", "Ç”Ç„", "Ç”Ç•", "Ç”ÇÂ"));
	    	put("lk", Arrays.asList("Éï", "", "", "Éñ", ""));
	    	put("lt", Arrays.asList("", "", "Ç¡", "", ""));
	    	put("ly", Arrays.asList("Ç·", "Ç°", "Ç„", "Ç•", "ÇÂ"));
	    	put("lw", Arrays.asList("ÇÏ", "", "", "", ""));
	    	put("qw", Arrays.asList("Ç≠Çü", "Ç≠Ç°", "Ç≠Ç£", "Ç≠Ç•", "Ç≠Çß"));
	    	put("sw", Arrays.asList("Ç∑Çü", "Ç∑Ç°", "Ç∑Ç£", "Ç∑Ç•", "Ç∑Çß"));
	    	put("zw", Arrays.asList("Ç∏Çü", "Ç∏Ç°", "Ç∏Ç£", "Ç∏Ç•", "Ç∏Çß"));
	    	put("fw", Arrays.asList("Ç”Çü", "Ç”Ç°", "Ç”Ç£", "Ç”Ç•", "Ç”Çß"));
	    	put("qy", Arrays.asList("Ç≠Ç·", "Ç≠Ç°", "Ç≠Ç„", "Ç≠Ç•", "Ç≠ÇÂ"));
			put("t'", Arrays.asList("", "ÇƒÇ°", "Ç∆Ç£", "", ""));
			put("d'", Arrays.asList("", "Ç≈Ç°", "Ç«Ç£", "", ""));
    	}
    };

    private static final Map<String, List<String>> ROMAN_3 = new HashMap<String, List<String>>() {
	    {
	    	put("hwy", Arrays.asList("", "", "Ç”Ç„", "", ""));
	    	put("xts", Arrays.asList("", "", "Ç¡", "", ""));
	    	put("lts", Arrays.asList("", "", "Ç¡", "", ""));
	    	put("t'y", Arrays.asList("", "", "ÇƒÇ„", "", ""));
	    	put("d'y", Arrays.asList("", "", "Ç≈Ç„", "", ""));


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
	        case '!' : return 'ÅI';
	        case '\"': return 'Åh';
	        case '#' : return 'Åî';
	        case '$' : return 'Åê';
	        case '\\': return 'Åè';
	        case '%' : return 'Åì';
	        case '&' : return 'Åï';
	        case '\'': return 'Åf';
	        case '(' : return 'Åi';
	        case ')' : return 'Åj';
	        case '*' : return 'Åñ';
	        case '+' : return 'Å{';
	        case ',' : return 'ÅA';
	        case '~' : return 'Å`';
	        case '-' : return 'Å[';
	        case '^' : return 'Å['; // ëÂéñÅI
	        case '.' : return 'ÅB';
	        case '/' : return 'Å^';
	        case '0' : return 'ÇO';
	        case '1' : return 'ÇP';
	        case '2' : return 'ÇQ';
	        case '3' : return 'ÇR';
	        case '4' : return 'ÇS';
	        case '5' : return 'ÇT';
	        case '6' : return 'ÇU';
	        case '7' : return 'ÇV';
	        case '8' : return 'ÇW';
	        case '9' : return 'ÇX';
	        case ':' : return 'ÅF';
	        case ';' : return 'ÅG';
	        case '<' : return 'ÅÉ';
	        case '=' : return 'ÅÅ';
	        case '>' : return 'ÅÑ';
	        case '?' : return 'ÅH';
	        case '@' : return 'Åó';
	        case 'A' : return 'Ç`';
	        case 'B' : return 'Ça';
	        case 'C' : return 'Çb';
	        case 'D' : return 'Çc';
	        case 'E' : return 'Çd';
	        case 'F' : return 'Çe';
	        case 'G' : return 'Çf';
	        case 'H' : return 'Çg';
	        case 'I' : return 'Çh';
	        case 'J' : return 'Çi';
	        case 'K' : return 'Çj';
	        case 'L' : return 'Çk';
	        case 'M' : return 'Çl';
	        case 'N' : return 'Çm';
	        case 'O' : return 'Çn';
	        case 'P' : return 'Ço';
	        case 'Q' : return 'Çp';
	        case 'R' : return 'Çq';
	        case 'S' : return 'Çr';
	        case 'T' : return 'Çs';
	        case 'U' : return 'Çt';
	        case 'V' : return 'Çu';
	        case 'W' : return 'Çv';
	        case 'X' : return 'Çw';
	        case 'Y' : return 'Çx';
	        case 'Z' : return 'Çy';
	        case '`' : return 'Åe';
	        case '[' : return 'Åu';
	        case ']' : return 'Åv';
	        case 'a' : return 'ÇÅ';
	        case 'b' : return 'ÇÇ';
	        case 'c' : return 'ÇÉ';
	        case 'd' : return 'ÇÑ';
	        case 'e' : return 'ÇÖ';
	        case 'f' : return 'ÇÜ';
	        case 'g' : return 'Çá';
	        case 'h' : return 'Çà';
	        case 'i' : return 'Çâ';
	        case 'j' : return 'Çä';
	        case 'k' : return 'Çã';
	        case 'l' : return 'Çå';
	        case 'm' : return 'Çç';
	        case 'n' : return 'Çé';
	        case 'o' : return 'Çè';
	        case 'p' : return 'Çê';
	        case 'q' : return 'Çë';
	        case 'r' : return 'Çí';
	        case 's' : return 'Çì';
	        case 't' : return 'Çî';
	        case 'u' : return 'Çï';
	        case 'v' : return 'Çñ';
	        case 'w' : return 'Çó';
	        case 'x' : return 'Çò';
	        case 'y' : return 'Çô';
	        case 'z' : return 'Çö';
	        default	: return c;
        }
    }

    public static String toKana(String in) {

		String out = "";
		String now;
		String buf = "";
		int cnt = 0;

		for(int i = 0; i < in.length(); i++) {

			now = in.substring(i,i+1); // iï∂éöñ⁄Ç©ÇÁ1ï∂éö

			if(java.lang.Character.isLowerCase(in.charAt(i))) {

				//System.out.println("cnt:" + cnt + ", buf=" + buf + ", now=" + now + ", out=" + out);
				if(BOIN.contains(now)) {

					// *** Ç±Ç±Ç¢ÇÁï”Ç‹Ç∆ÇﬂÇ»Ç¢Ç∆ÅEÅEÅE ***

					// ÉoÉbÉtÉ@Å[3ï∂éöâzÇ¶ëŒçÙ
					// åüçıÇÕÉoÉbÉtÉ@Å[Ç™3ï∂éöà»â∫ëŒè€Ç»ÇÃÇ≈ÇÕÇ›èoÇµÇΩï™ÇêÊÇ…ëóÇËèoÇ∑
					if(cnt > 3) {

						int cutting = cnt - 3; // ÇÕÇ›èoÇΩï™
						out += buf.substring(0, cutting); // 1ï∂éöñ⁄Ç©ÇÁ1ï∂éö
						buf = buf.substring(cutting); // écÇ∑ï™Åi3ï∂éöÅj
						cnt = 3;
					}

					// å∏ÇÁÇµÇƒÇ¢Ç´Ç»Ç™ÇÁåüçıÇ∑ÇÈÇ±Ç∆ÅI
					if(cnt >= 3) {
						// è¨Ç≥Ç¢Å@Ç¡Å@ëŒâû2


						// ÉLÅ[ÇÃ1ï∂éöñ⁄Ç∆2ï∂éöñ⁄Ç™ìØÇ∂Ç≈ÇªÇÍÇÁÇ∆3ï∂éöñ⁄Ç™àŸÇ»ÇÈèÍçá
						if(buf.substring(0,1).equals(buf.substring(1,2))
								&& !buf.substring(0,1).equals(buf.substring(2,3))) {

							// ç≈å„Ç™ïÍâπÇ»ÇÃÇ≈Ç±ÇÃéûì_Ç≈"Ç¡"ämíË
							// ÇŒÇ©ÇæÇ”ÇüÇ™ÇÕÇ∂Ç·Ç©ÇüÇ‹Ç»ÇœÇüÇÁÇ≥ÇΩÉîÇüÇÌÇüÇ‚Ç¥

							out += "Ç¡";
							cnt = 2;
							buf = buf.substring(1);

						} else if(ROMAN(3).containsKey(buf) && !ROMAN(3).get(buf).get(BOIN.indexOf(now)).isEmpty()) {

							out += ROMAN(3).get(buf).get(BOIN.indexOf(now));
							cnt = 0;
							buf = "";
							continue;

						} else {

							// 1ï∂éöå∏ÇÁÇ∑
							out += buf.substring(0, 1); // 1ï∂éöñ⁄Ç©ÇÁ1ï∂éö
							buf = buf.substring(1); // écÇ∑ï™Åi2ï∂éöÅj
						}
					}

					if(cnt >= 2) {
						// è¨Ç≥Ç¢Å@Ç¡Å@ëŒâûÇP
						if(buf.substring(0,1).equals(buf.substring(1))) {
							// ç≈å„Ç™ïÍâπÇ»ÇÃÇ≈Ç±ÇÃéûì_Ç≈"Ç¡"ämíË
							// ÇŒÇ©ÇæÇ”ÇüÇ™ÇÕÇ∂Ç·Ç©ÇüÇ‹Ç»ÇœÇüÇÁÇ≥ÇΩÉîÇüÇÌÇüÇ‚Ç¥

							out += "Ç¡";
							cnt = 1;
							buf = buf.substring(1);


						} else if(ROMAN(2).containsKey(buf) && !ROMAN(2).get(buf).get(BOIN.indexOf(now)).isEmpty()) {

							out += ROMAN(2).get(buf).get(BOIN.indexOf(now));
							cnt = 0;
							buf = "";
							continue;

						} else {

							// 1ï∂éöå∏ÇÁÇ∑
							out += buf.substring(0, 1); // 1ï∂éöñ⁄Ç©ÇÁ1ï∂éö
							buf = buf.substring(1); // écÇ∑ï™Åi2ï∂éöÅj
						}
					}

					if(cnt >= 1) {
						if(ROMAN(1).containsKey(buf) && !ROMAN(1).get(buf).get(BOIN.indexOf(now)).isEmpty()) {

							out += ROMAN(1).get(buf).get(BOIN.indexOf(now));
							cnt = 0;
							buf = "";
							continue;

						} else {
							// 1ï∂éöå∏ÇÁÇ∑
							out += buf.substring(0, 1); // 1ï∂éöñ⁄Ç©ÇÁ1ï∂éö
						}
					}

					out += ROMAN(0).get("").get(BOIN.indexOf(now));
					cnt = 0;
					buf = "";

				} else {

					if(buf.equals("ny")) {

						// Ç…Ç· Ç…Ç„ Ç…ÇÂëŒâû2
						out += buf;
						buf = now;
						cnt = 1;

					} else if(buf.equals("n")) {

						if(now.equals("y")) {

							// Ç…Ç· Ç…Ç„ Ç…ÇÂëŒâû1
							buf += now;
							cnt++;

						} else {

							out += "ÇÒ";
							if(now.equals("n")) {
								buf = "";
								cnt = 0;
							} else if(now.equals("'")) {
								buf = "";
								cnt = 0;
							} else {
								buf = now;
							}

						}

					} else {
						buf += now;
						cnt++;
					}

				}
			} else {

				// écÇË ÇÒ ëŒçÙ2
				if(buf.equals("n")) {
					buf = "ÇÒ";
				}


				// îºäpâpéöà»äO
				out += buf + now;
				cnt = 0;
				buf = "";


			}
		}

		// écÇË ÇÒ ëŒçÙÇP
		if(buf.equals("n")) {
			buf = "ÇÒ";
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
		return TestGoogleAPI.convert(str) + " (" + in + ")";

    }

}

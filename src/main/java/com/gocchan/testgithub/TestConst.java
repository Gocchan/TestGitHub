package com.gocchan.testgithub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestConst {


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

    		// Å´ ÇÃÇŸÇ§Ç™Google API Ç…Çƒ "ÉGÉîÉ@ÉìÉQÉäÉIÉì"Ç∆ê≥ÇµÇ≠ïœä∑Ç≥ÇÍÇÈÇΩÇﬂÅB

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

	public static final List<String> BOIN = Arrays.asList("a","i","u","e","o");

	public static final Map<Character, Character> ZENKAKU = new HashMap<Character, Character>() {
	    {
	        put('!', 'ÅI');
	        put('\"', 'Åh');
	        put('#', 'Åî');
	        put('$', 'Åê');
	        put('\\', 'Åè');
	        put('%', 'Åì');
	        put('&', 'Åï');
	        put('\'', 'Åf');
	        put('(', 'Åi');
	        put(')', 'Åj');
	        put('*', 'Åñ');
	        put('+', 'Å{');
	        put(',', 'ÅA');

	        put('-', 'Å[');
	        put('^', 'Å['); // ëÂéñÅI
	        put('.', 'ÅB');
	        put('/', 'Å^');
	        put('0', 'ÇO');
	        put('1', 'ÇP');
	        put('2', 'ÇQ');
	        put('3', 'ÇR');
	        put('4', 'ÇS');
	        put('5', 'ÇT');
	        put('6', 'ÇU');
	        put('7', 'ÇV');
	        put('8', 'ÇW');
	        put('9', 'ÇX');
	        put(':', 'ÅF');
	        put(';', 'ÅG');
	        put('<', 'ÅÉ');
	        put('=', 'ÅÅ');
	        put('>', 'ÅÑ');
	        put('?', 'ÅH');
	        put('@', 'Åó');
	        put('A', 'Ç`');
	        put('B', 'Ça');
	        put('C', 'Çb');
	        put('D', 'Çc');
	        put('E', 'Çd');
	        put('F', 'Çe');
	        put('G', 'Çf');
	        put('H', 'Çg');
	        put('I', 'Çh');
	        put('J', 'Çi');
	        put('K', 'Çj');
	        put('L', 'Çk');
	        put('M', 'Çl');
	        put('N', 'Çm');
	        put('O', 'Çn');
	        put('P', 'Ço');
	        put('Q', 'Çp');
	        put('R', 'Çq');
	        put('S', 'Çr');
	        put('T', 'Çs');
	        put('U', 'Çt');
	        put('V', 'Çu');
	        put('W', 'Çv');
	        put('X', 'Çw');
	        put('Y', 'Çx');
	        put('Z', 'Çy');
	        put('`', 'Åe');
	        put('[', 'Åu');
	        put(']', 'Åv');
	        put('a', 'ÇÅ');
	        put('b', 'ÇÇ');
	        put('c', 'ÇÉ');
	        put('d', 'ÇÑ');
	        put('e', 'ÇÖ');
	        put('f', 'ÇÜ');
	        put('g', 'Çá');
	        put('h', 'Çà');
	        put('i', 'Çâ');
	        put('j', 'Çä');
	        put('k', 'Çã');
	        put('l', 'Çå');
	        put('m', 'Çç');
	        put('n', 'Çé');
	        put('o', 'Çè');
	        put('p', 'Çê');
	        put('q', 'Çë');
	        put('r', 'Çí');
	        put('s', 'Çì');
	        put('t', 'Çî');
	        put('u', 'Çï');
	        put('v', 'Çñ');
	        put('w', 'Çó');
	        put('x', 'Çò');
	        put('y', 'Çô');
	        put('z', 'Çö');
	    }
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

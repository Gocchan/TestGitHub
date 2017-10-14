package com.gocchan.testgithub;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestJapanese {

	final private TestGithub hGithub;
	final private TestGoogleAPI hGoogle;

	public TestJapanese(final TestGithub hGithub){

		this.hGithub = hGithub;
		this.hGoogle = hGithub.getGoogleHandler();
	}

    public String toKana(String in) {

    	// "atsushi"sann "AG\OTO"ttehitoha douitujinnbutudesuka?

    	// 英語を伏字に
    	leaveGoogle clsLeave = new leaveGoogle();
    	clsLeave = encodeLeave(in);

		String now;
		//System.out.println("List:" + clsLeave.englishes.toString());
    	editer edt = new editer();

    	edt.cnt = 0;
    	edt.buf = "";
    	edt.out = "";



		for(int i = 0; i < clsLeave.japanese.length(); i++) {

			now = clsLeave.japanese.substring(i,i+1); // i文字目から1文字
			char c = clsLeave.japanese.charAt(i);

			if(c == '\'' || java.lang.Character.isLowerCase(c)) {

				//System.out.println("cnt:" + edt.cnt + ", buf=" + edt.buf + ", now=" + now + ", out=" + edt.out);
				if(TestConst.BOIN.contains(now)) {

					// バッファー3文字越え対策
					// 検索はバッファーが3文字以下対象なのではみ出した分を先に送り出す
					if(edt.cnt > 3) {
						edt = pushBuffer(edt);
					}
					// 減らしていきながら検索すること！
					edt = serchROMAN(edt, now);

				} else {

					if(edt.buf.equals("ny")) {
						// ny?
						edt.out += edt.buf;
						edt.buf = now;
						edt.cnt = 1;

					} else if(edt.buf.equals("n")) {
						// ny, nn, n', n?
						edt = editNX(edt, now);

					} else {
						edt.buf += now;
						edt.cnt++;
					}
				}
			} else {
				// 半角英小文字以外

				// 残り ん 対策2
				if(edt.buf.equals("n")) {
					edt.buf = "ん";
				}
				edt.out += edt.buf + now;
				edt.cnt = 0;
				edt.buf = "";
			}
		}

		// 残り ん 対策１
		if(edt.buf.equals("n")) {
			edt.buf = "ん";
		}

		edt.out += edt.buf;

		//System.out.println("*" + edt.out + "*");

		// 伏字にした英語を戻す
		clsLeave.japanese = edt.out;
		edt.out = decodeLeave(clsLeave);


		// 半角を全角に
    	//System.out.println("記号変換前：" + edt.out);
    	String str = toZenkaku(edt.out);


    	//a,"atsushi"sann "AG\OTO"ttehitoha douitujinnbutudesuka?
    	//System.out.println("渡す前：" + str);
    	// とりま５文字未満の時はひらがなのまま出力（変な漢字のとき、後ろの分がないと意味を予測できないため）
    	if(str.length() < 5) {
    		return str + " (" + in + ")";
    	} else {
    		return hGoogle.convert(str) + " (" + in + ")";
    	}
    }

    private String toZenkaku (String str) {

    	String wrk = "";
    	for(int i=0; i < str.length(); i++) {

    		String s = str.substring(i, i + 1);
    		if(s.getBytes().length > 1) {

    			wrk += s;

    		} else {
    			char c = str.charAt(i);
    			if(TestConst.ZENKAKU.containsKey(c)) {
    				wrk += TestConst.ZENKAKU.get(c);
    			} else {
    				wrk += c;
    			}
    		}
    	}
		return wrk;
    }

    private String getRomaji (int keylen, String key, String boin) {

    	if(TestConst.ROMAN(keylen).containsKey(key)) {
    		return TestConst.ROMAN(keylen).get(key).get(TestConst.BOIN.indexOf(boin));
    	}
    	return "";
    }
    //
    private boolean isXtu (int cnt, String buf) {

    	// 小さい "っ" 対策
    	switch(cnt) {
			case 3:
				if(buf.charAt(0) == buf.charAt(1)
						&& buf.charAt(0) != buf.charAt(2)) {
					return true;
				} else {
					return false;
				}

    		case 2:
    			if(buf.charAt(0) == buf.charAt(1)) {
					return true;
				} else {
					return false;
				}

    		default:
    			return false;
    	}
    }

    private editer pushBuffer(editer edt) {

		int cutting = edt.cnt - 3; // はみ出た分
		edt.out += edt.buf.substring(0, cutting); // 1文字目からはみ出た分まで
		edt.buf = edt.buf.substring(cutting); // 残す分（3文字）
		edt.cnt = 3;

		return edt;
    }

    private editer editNX(editer edt, String now) {
		if(now.equals("y")) {
			// にゃ にゅ にょ対応1
			//edt.buf += now;
			edt.buf = "ny";
			edt.cnt++;
		} else {

			edt.out += "ん";
			if(now.equals("n")) {
				edt.buf = "";
				edt.cnt = 0;
			} else if(now.equals("'")) {
				edt.buf = "";
				edt.cnt = 0;
			} else {
				edt.buf = now;
			}
		}
		return edt;
    }

    private editer serchROMAN(editer edt, String now) {

    	for(int i = 3; i > 0; i--) {

			if(edt.cnt == i) {
				// 小さい　っ　対応
				if((edt.cnt == 3 || edt.cnt == 2) && isXtu(edt.cnt, edt.buf)) {
					edt.out += "っ";
					edt.cnt = edt.cnt-1;
					edt.buf = edt.buf.substring(1);

				} else {



					String romaji = getRomaji(edt.cnt, edt.buf, now);
					if(!romaji.isEmpty()) {
						edt.out += romaji;
						edt.cnt = 0;
						edt.buf = "";
						return edt;

					} else {

						// 1文字減らす
						edt.out += edt.buf.substring(0, 1); // 1文字目から1文字
						if(i != 1) {
							edt.buf = edt.buf.substring(1); // 残す分
						}
						edt.cnt = edt.cnt - 1;
					}
				}
			}
    	}
		edt.out += getRomaji(edt.cnt, edt.buf, now);
		edt.buf = "";
		return edt;
    }
    private String decodeLeave(leaveGoogle leave) {

    	String regex = "★";
    	Pattern p = Pattern.compile(regex);
    	//Matcher m = p.matcher(leave.japanese);

    	String wrk = "";
    	int cnt = 0;
    	for(String substr : p.split(leave.japanese)) {
    		wrk += substr;
    		if(cnt < leave.englishes.size()) {
    			wrk += leave.englishes.get(cnt);
    			cnt++;
    		}
    	}

    	return wrk;
    }

    private leaveGoogle encodeLeave(String in) {

    	List<String> english = new ArrayList<String>();
    	leaveGoogle leave = new leaveGoogle();

    	// https://qiita.com/sta/items/848e7a8c4699a59c604f
    	// " は要らない
    	//
    	//String regex = "\"([a-zA-Z0-9 !\"#$%&'()*+,-./:;<=>?@\\[\\\\\\\\\\]^_`{|}~]+)\"";
    	String regex = "\"([a-zA-Z0-9 !#$%&'()*+,-./:;<=>?@\\[\\\\\\\\\\]^_`{|}~]+)\"";

    	//  "atsushi"sann "AG\OTO"ttehitoha douitujinnbutudesuka?
    	Pattern p = Pattern.compile(regex);
    	Matcher m = p.matcher(in);

    	String wrk = "";
    	int loc = 0;


    	while (m.find()){


    		if(m.start() > loc) {
    			wrk += in.substring(loc, m.start());
    		}
    		wrk += "★";
    		loc = m.end();

    		english.add(in.substring(m.start()+1, m.end()-1));
    	}


    	if(in.length() > loc) {
    		wrk += in.substring(loc);
    	}


		//System.out.println(wrk);

    	leave.englishes = english;
    	leave.japanese = wrk;


		return leave;
    }

    private static class editer {

    	private int cnt;
    	private String buf;
    	private String out;
    }

    private static class leaveGoogle {
    	private String japanese;
    	private List<String> englishes;
    }
}

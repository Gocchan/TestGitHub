package com.gocchan.testgithub;

import static com.gocchan.testgithub.TestConst.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGinput {

	final private TestJapanese hJapanese;
	final private TestGoogleAPI hGoogle;


	public TestGinput(final TestGithub hGithub){

		this.hJapanese = hGithub.getJapaneseHandler();
		this.hGoogle = hGithub.getGoogleHandler();
	}


	public void getInput() {

		String str = "";
	    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    Scanner stdIn = new Scanner(System.in);
    	str += stdIn.nextLine();

	   // try{
	    	//str = br.readLine();
	    	if(str.equals("exit") || str.equals("quit")) {
	    		System.out.println("### Ended ###");

	    		stdIn.close();
	    	} else {
	    		//System.out.println("input: '" + str + "'");

	    		System.out.println("input: '" + changeLine(str) + "'");
	    		getInput();
	    	}

	  //  }catch(IOException e){
	    //	System.out.println("### Error ###:" + e.getMessage());
	    //}

	}

	// コマンドチェック
	private String changeLine(String str) {

		if(str.isEmpty()) return "";

		if(str.charAt(0) == '/') {
			return "コマンド:" + str;

		} else if(!isOneByteChar(str)) {
			return "全角入り:" + str;

		} else if(isURL(str) || isEmail(str)) {
			return "URL:" + str;
		}

		//return hJapanese.convert(str);
		return convert(str);

	}

	private String convert(String in) {

		String out = "";

    	// 英語を伏字に
    	leaveGoogle clsLeave = new leaveGoogle();
    	//clsLeave = encodeLeave(in);
    	clsLeave = encodeLeave2(in);

    	out = hJapanese.convert(clsLeave.japanese);

    	if(isNihongo(out)) {
    		out = toZenkaku(out);

    		if(out.length() >= 5) {
    			out = hGoogle.convert(out);
    		}

    	} else {
    		out = "korean*" + out;

    	}

   		//out = toZenkaku(out);
   		clsLeave.japanese = out;

   		out = decodeLeave2(clsLeave);	// 伏字にした英語を戻す

    	//a,"atsushi"sann "AG\OTO"ttehitoha douitujinnbutudesuka?


		return out + " (" + in + ")";
	}

	// 1バイト文字のみかどうか
	public boolean isOneByteChar(String str) {

		if(str == null || str.length() == 0){
			return true;
		}

		int len = str.length();
		byte[] bytes = str.getBytes();

		if(len != bytes.length){
			return false;
		}

		return true;
	}

	// URLかどうか
	private boolean isURL(String str) {

		// http://www.sejuku.net/blog/13215#URL
		// https://qiita.com/konweb/items/97cccb28973aefe4b0c6

		// 正規表現のパターンを作成
        //Pattern p = Pattern.compile("^https?://[a-z\\.:/\\+\\-\\#\\?\\=\\&\\;\\%\\~]+$");
        Pattern p = Pattern.compile("^(https?|ftp)(:\\/\\/[-_.!~*\\'()a-zA-Z0-9;\\/?:\\@&=+\\$,%#]+)$");
        Matcher m = p.matcher(str);

		return m.find();
	}

	// メールアドレスかどうか
	private boolean isEmail(String str) {

		// http://www.sejuku.net/blog/13215#URL
		// https://qiita.com/konweb/items/97cccb28973aefe4b0c6

		// 正規表現のパターンを作成
		//Pattern p = Pattern.compile(
        //       "^(([0-9a-zA-Z!#\\$%&'\\*\\+\\-/=\\?\\^_`\\{\\}\\|~]+(\\.[0-9a-zA-Z!#\\$%&'\\*\\+\\-/=\\?\\^_`\\{\\}\\|~]+)*)|(\"[^\"]*\"))"
        //               + "@[0-9a-zA-Z!#\\$%&'\\*\\+\\-/=\\?\\^_`\\{\\}\\|~]+"
        //               + "(\\.[0-9a-zA-Z!#\\$%&'\\*\\+\\-/=\\?\\^_`\\{\\}\\|~]+)*$");

        Pattern p = Pattern.compile("^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$");
        Matcher m = p.matcher(str);

		return m.find();
	}

    private leaveGoogle encodeLeave2(String in) {

    	List<String> english = new ArrayList<String>();
    	leaveGoogle leave = new leaveGoogle();

    	String wrk = "";
    	String naka = "";
    	boolean flgNaka = false;

    	for(int i=0; i < in.length(); i++) {

    		final char c = in.charAt(i);
    		if(c == '#') {
				flgNaka = !flgNaka;
				if(flgNaka) {
					wrk += "〓";
				} else {
					english.add(naka);
					naka = "";
				}
    		} else {
				if(flgNaka) {
					naka += c;
				} else {
					wrk += c;
				}
    		}
    	}

    	leave.englishes = english;
    	leave.japanese = wrk;

		return leave;
    }

    private String decodeLeave2(leaveGoogle leave) {

    	int cnt = 0;
    	String wrk = "";

    	for(int i=0; i < leave.japanese.length(); i++) {
    		final char c = leave.japanese.charAt(i);
    		if(c == '〓') {
    			wrk += leave.englishes.get(cnt);
    			cnt++;
    		} else {
    			wrk += c;
    		}
    	}
    	return wrk;
    }

    private boolean isNihongo(String str) {

    	int hiragana = 0;
    	int alphabet = 0;

    	for(int i=0; i < str.length(); i++) {

    		char c = str.charAt(i);

    		// http://yasu0120.blog130.fc2.com/blog-entry-10.html
    		//int cc = (int)c;
    		//if(cc >= Integer.decode("0x3041") && cc <= Integer.decode("0x3096")) {
    		if(c >= '\u3041' && c <= '\u3096') {
    			// あ～ゖ
    			hiragana++;

    		} else if((c >= '\u0061' && c <= '\u0076') || (c >= '\u0078' && c <= '\u007A'
    				|| Arrays.asList(NOUON).contains(c))) {

    			// a～v or x～z or 濃音
    			// wは対象外とする
    			alphabet++;
    		}
    	}

    	if(hiragana < 5 && alphabet != 0) {
    		System.out.println("韓国語表示で！alphabet:" + alphabet + ", hiragana:" + hiragana);
    		return false;
    	} else if(hiragana < alphabet) {
    		System.out.println("韓国語表示で！alphabet:" + alphabet + ", hiragana:" + hiragana);
    		return false;
    	} else {
    		System.out.println("日本語です！alphabet:" + alphabet + ", hiragana:" + hiragana);
    		return true;
    	}
    }

    private String toZenkaku (String str) {
    	System.out.println("<>" + str);
    	String wrk = "";
    	for(int i=0; i < str.length(); i++) {

    		String s = str.substring(i, i + 1);




    		if(s.getBytes().length > 1) {
    			System.out.println("B#" + s);
    			wrk += s;

    		} else {
    			System.out.println("S#" + s);
    			char c = str.charAt(i);



    			if(ZENKAKU.containsKey(c)) {
    				wrk += ZENKAKU.get(c);
    			} else {
    				wrk += c;
    			}
    		}
    	}
		return wrk;
    }

    private static class leaveGoogle {
    	private String japanese;
    	private List<String> englishes;
    }



}

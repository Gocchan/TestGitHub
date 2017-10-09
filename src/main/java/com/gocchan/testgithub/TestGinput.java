package com.gocchan.testgithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGinput {

	public static void getInput() {

		String str = null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    try{
	    	str = br.readLine();
	    	if(str.equals("exit") || str.equals("quit")) {
	    		System.out.println("### Ended ###");
	    	} else {
	    		//System.out.println("input: '" + str + "'");

	    		System.out.println("input: '" + changeLine(str) + "'");
	    		getInput();
	    	}

	    }catch(IOException e){
	    	System.out.println("### Error ###:" + e.getMessage());
	    }

	}

	// コマンドチェック
	private static String changeLine(String str) {


		if(str.charAt(0) == '/') {
			return "コマンド:" + str;

		} else if(!isOneByteChar(str)) {
			return "全角入り:" + str;

		} else if(isURL(str) || isEmail(str)) {
			return "URL:" + str;
		}
		return TestJapanese.toKana(str);

	}

	// 1バイト文字のみかどうか
	public static boolean isOneByteChar(String str) {

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
	private static boolean isURL(String str) {

		// http://www.sejuku.net/blog/13215#URL
		// https://qiita.com/konweb/items/97cccb28973aefe4b0c6

		// 正規表現のパターンを作成
        //Pattern p = Pattern.compile("^https?://[a-z\\.:/\\+\\-\\#\\?\\=\\&\\;\\%\\~]+$");
        Pattern p = Pattern.compile("^(https?|ftp)(:\\/\\/[-_.!~*\\'()a-zA-Z0-9;\\/?:\\@&=+\\$,%#]+)$");
        Matcher m = p.matcher(str);

		return m.find();
	}

	// メールアドレスかどうか
	private static boolean isEmail(String str) {

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
}

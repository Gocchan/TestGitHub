package com.gocchan.testgithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
			return str;

		}
		return "(" + str + ")";

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
}

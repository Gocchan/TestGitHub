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
	    		System.out.println("input: '" + str + "'");
	    		getInput();
	    	}

	    }catch(IOException e){
	    	System.out.println("### Error ###:" + e.getMessage());
	    }

	}
}

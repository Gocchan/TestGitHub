package com.gocchan.testgithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestGithub {

	// NC10

	public static void main(String args[]) {

		//System.setProperty("file.encoding", "UTF-8");
		getInput();
	}

	private static void getInput() {


		String str = null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    try{
	    	str = br.readLine();
	    	if(str.equals("exit")) {
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



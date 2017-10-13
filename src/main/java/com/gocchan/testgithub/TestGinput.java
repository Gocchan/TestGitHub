package com.gocchan.testgithub;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestGinput {

	final private TestGithub hGithub;
	final private TestJapanese hJapanese;

	public TestGinput(final TestGithub hGithub){

		this.hGithub = hGithub;
		this.hJapanese = hGithub.getJapaneseHandler();
	}


	public void getInput() {

		String str = null;
	    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    Scanner stdIn = new Scanner(System.in);
	    str = stdIn.next();





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

	// �R�}���h�`�F�b�N
	private String changeLine(String str) {

		if(str.isEmpty()) return "";

		if(str.charAt(0) == '/') {
			return "�R�}���h:" + str;

		} else if(!isOneByteChar(str)) {
			return "�S�p����:" + str;

		} else if(isURL(str) || isEmail(str)) {
			return "URL:" + str;
		}


		return hJapanese.toKana(str);

	}

	// 1�o�C�g�����݂̂��ǂ���
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

	// URL���ǂ���
	private boolean isURL(String str) {

		// http://www.sejuku.net/blog/13215#URL
		// https://qiita.com/konweb/items/97cccb28973aefe4b0c6

		// ���K�\���̃p�^�[�����쐬
        //Pattern p = Pattern.compile("^https?://[a-z\\.:/\\+\\-\\#\\?\\=\\&\\;\\%\\~]+$");
        Pattern p = Pattern.compile("^(https?|ftp)(:\\/\\/[-_.!~*\\'()a-zA-Z0-9;\\/?:\\@&=+\\$,%#]+)$");
        Matcher m = p.matcher(str);

		return m.find();
	}

	// ���[���A�h���X���ǂ���
	private boolean isEmail(String str) {

		// http://www.sejuku.net/blog/13215#URL
		// https://qiita.com/konweb/items/97cccb28973aefe4b0c6

		// ���K�\���̃p�^�[�����쐬
		//Pattern p = Pattern.compile(
        //       "^(([0-9a-zA-Z!#\\$%&'\\*\\+\\-/=\\?\\^_`\\{\\}\\|~]+(\\.[0-9a-zA-Z!#\\$%&'\\*\\+\\-/=\\?\\^_`\\{\\}\\|~]+)*)|(\"[^\"]*\"))"
        //               + "@[0-9a-zA-Z!#\\$%&'\\*\\+\\-/=\\?\\^_`\\{\\}\\|~]+"
        //               + "(\\.[0-9a-zA-Z!#\\$%&'\\*\\+\\-/=\\?\\^_`\\{\\}\\|~]+)*$");

        Pattern p = Pattern.compile("^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$");
        Matcher m = p.matcher(str);

		return m.find();
	}
}

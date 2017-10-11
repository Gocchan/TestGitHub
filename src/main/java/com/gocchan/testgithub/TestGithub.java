package com.gocchan.testgithub;

public class TestGithub {

	private static TestGithub hGithub;
	private static TestGoogleAPI hGoogle;
	private static TestJapanese hJapanese;
	private static TestGinput hGinput;

	public static void main(String args[]) {

		// 順番大事！
		hGithub = new TestGithub();
		hGoogle = new TestGoogleAPI();
		hJapanese = new TestJapanese(hGithub);
		hGinput = new TestGinput(hGithub);


		//System.setProperty("file.encoding", "UTF-8");
		hGinput.getInput();
	}

	public TestGinput getGinputHandler() {
	    return hGinput;
	}
	public TestGoogleAPI getGoogleHandler() {
	    return hGoogle;
	}
	public TestJapanese getJapaneseHandler() {
	    return hJapanese;
	}
}



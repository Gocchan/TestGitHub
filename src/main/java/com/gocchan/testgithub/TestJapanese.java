package com.gocchan.testgithub;



public class TestJapanese {


	final private TestGithub hGithub;
	final private TestGoogleAPI hGoogle;

	public TestJapanese(final TestGithub hGithub){

		this.hGithub = hGithub;
		this.hGoogle = hGithub.getGoogleHandler();


	}

    public String toKana(String in) {

		String out = "";
		String now;
		String buf = "";
		int cnt = 0;

		for(int i = 0; i < in.length(); i++) {

			now = in.substring(i,i+1); // i文字目から1文字
			char c = in.charAt(i);
			if(c == '\'' || java.lang.Character.isLowerCase(c)) {

				//System.out.println("cnt:" + cnt + ", buf=" + buf + ", now=" + now + ", out=" + out);
				if(TestConst.BOIN.contains(now)) {

					// *** ここいら辺まとめないと・・・ ***

					// バッファー3文字越え対策
					// 検索はバッファーが3文字以下対象なのではみ出した分を先に送り出す
					if(cnt > 3) {

						int cutting = cnt - 3; // はみ出た分
						out += buf.substring(0, cutting); // 1文字目からはみ出た分まで
						buf = buf.substring(cutting); // 残す分（3文字）
						cnt = 3;
					}

					// 減らしていきながら検索すること！
					if(cnt == 3) {
						// 小さい　っ　対応2
						if(isXtu(cnt, buf)) {
							out += "っ";
							cnt = 2;
							buf = buf.substring(1);

						} else {

							String romaji = getRomaji(cnt, buf, now);
							if(!romaji.isEmpty()) {
								out += romaji;
								cnt = 0;
								buf = "";
								continue;

							} else {

								// 1文字減らす
								out += buf.substring(0, 1); // 1文字目から1文字
								buf = buf.substring(1); // 残す分（2文字）
								cnt = 2;
							}
						}
					}

					if(cnt >= 2) {
						// 小さい　っ　対応１
						if(isXtu(cnt, buf)) {
						//if(buf.substring(0,1).equals(buf.substring(1))) {
							// 最後が母音なのでこの時点で"っ"確定
							// ばかだふぁがはじゃかぁまなぱぁらさたヴぁわぁやざ

							out += "っ";
							cnt = 1;
							buf = buf.substring(1);

						} else {

							String romaji = getRomaji(cnt, buf, now);

							if(!romaji.isEmpty()) {
								out += romaji;
								cnt = 0;
								buf = "";
								continue;

							} else {

								// 1文字減らす
								out += buf.substring(0, 1); // 1文字目から1文字
								buf = buf.substring(1); // 残す分（2文字）
								cnt = 1;
							}
						}
					}

					if(cnt >= 1) {
						String romaji = getRomaji(cnt, buf, now);
						if(!romaji.isEmpty()) {
							out += romaji;
							cnt = 0;
							buf = "";
							continue;

						} else {
							// 1文字減らす
							out += buf.substring(0, 1); // 1文字目から1文字
							cnt = 0;
						}
					}

					out += getRomaji(cnt, buf, now);
					//cnt = 0;
					buf = "";

				} else {

					if(buf.equals("ny")) {

						// にゃ にゅ にょ対応2
						out += buf;
						buf = now;
						cnt = 1;

					} else if(buf.equals("n")) {

						if(now.equals("y")) {

							// にゃ にゅ にょ対応1
							buf += now;
							cnt++;

						} else {

							out += "ん";
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

				// 残り ん 対策2
				if(buf.equals("n")) {
					buf = "ん";
				}


				// 半角英字以外
				out += buf + now;
				cnt = 0;
				buf = "";


			}
		}

		// 残り ん 対策１
		if(buf.equals("n")) {
			buf = "ん";
		}

		out += buf;

    	String str = "";

    	for(int i=0; i < out.length(); i++) {

    		String s = out.substring(i, i + 1);
    		if(s.getBytes().length > 1) {
    			str += s;

    		} else {
    			char c = out.charAt(i);
    			if(TestConst.ZENKAKU.containsKey(c)) {
    				str += TestConst.ZENKAKU.get(c);
    			} else {
    				str += c;
    			}
    			//str += toZenkaku(out.charAt(i));
    		}

    	}
		return hGoogle.convert(str) + " (" + in + ")";

    }

    private String getRomaji (int keylen, String key, String boin) {

    	if(TestConst.ROMAN(keylen).containsKey(key)) {
    		return TestConst.ROMAN(keylen).get(key).get(TestConst.BOIN.indexOf(boin));
    	}
    	return "";
    }

    private boolean isXtu (int cnt, String buf) {

    	// 小さい "っ" 対策
    	switch(cnt) {
			case 3:
				if(buf.substring(0,1).equals(buf.substring(1,2))
						&& !buf.substring(0,1).equals(buf.substring(2,3))) {
					return true;
				} else {
					return false;
				}

    		case 2:
    			if(buf.substring(0,1).equals(buf.substring(1))) {
					return true;
				} else {
					return false;
				}

    		default:
    			return false;
    	}
    }
}

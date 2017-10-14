package com.gocchan.testgithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;

public class TestGoogleAPI {

	private static final String API_URL = "http://www.google.com/transliterate?langpair=ja-Hira|ja&text=";

    public String convert(String str) {

    	// 送信するかな文字が53字を超えるとエラー
    	if(str.length() > 53) {
    		return getGoogleKanaLong(str);
    	}
    	return getGoogleKana(str);
    }

    private String getGoogleKanaLong(String str) {

		int cnt = 0;
		int p = 0;

		String now = "";
		String buf = "";

		while(p < str.length()) {

			cnt++;

			if(p + 50 > str.length()) {
				now = getGoogleKana(str.substring(str.length() - 50));
				buf = sumGoogleString(buf, now);

				if(buf.isEmpty()) {
					buf = str;
					break;
				}
				p = str.length();

			} else {
    			if(cnt == 1) {
					buf = getGoogleKana(str.substring(p, p + 50));

				} else {

					now = getGoogleKana(str.substring(p, p + 50));
    				buf = sumGoogleString(buf, now);
    				if(buf.isEmpty()) {
    					buf = str;
    					break;
    				}
    			}
				p += 30; //30進める　（50-30＝20がのりしろ）
			}
		}
		return buf;
    }

    private String getGoogleKana(String str) {

    	String out = "";
		try {
    		String enc_hiragana = URLEncoder.encode(str,"UTF-8");

    		HttpURLConnection conn = null;

    		conn = (HttpURLConnection) new URL(API_URL + enc_hiragana + "&charset=UTF-8").openConnection();
    		conn.setRequestMethod("GET");
    		conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
    		conn.connect();

			if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){
				String json = "";
    			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

    			String inputLine;

    			while ((inputLine = reader.readLine()) != null) {
    				json += inputLine;
                }

    			//[["ここでは",["ここでは","個々では","ココでは","此 処では","ココデは"]],["きものを",["着物を","きものを","キモノを","被物を","木ものを"]],["ぬぐ",["脱ぐ","ぬぐ","ヌグ","拭","揩"]]]
    			//kokodehakimonowonugimasu.
     			out = edtJson(json);
    			//out = edtJson2(fromStr);

    			if(out.length() > 0){
    				// 空じゃなければ（エラー時＆文字数オーバー時は空となる）
    				return out.toString();

    			}
    		}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return out;
    }

    private String sumGoogleString(String buf, String now) {

    	// 末尾から 10 戻ったところから5文字をキーとする
		final int DIFF_START = 10;
		final int DIFF_LEN = 5;

		int len = buf.length();
		String key = buf.substring(len-DIFF_START, len-DIFF_LEN);


		if(findString(buf.substring(len-DIFF_START), key) == 1
				&& findString(now, key) == 1) {
			return buf.substring(0, len-DIFF_START) + now.substring(now.indexOf(key));
		}
		return "";
    }

    /*
    private String edtJson(String json) {
    	String str = "";
    	try {
	    	ObjectMapper mapper = new ObjectMapper();
	    	JsonNode root = mapper.readTree(json);
	    	for(JsonNode n : root) {
	    		str += n.get(1).get(0).asText();
	    	}

    	}catch (IOException ioe) {
	    	ioe.printStackTrace();
	    }
    	return str;
	}
	*/
    private String edtJson(String json) {

    	int p;
    	String str = "";
		while ((p = json.indexOf("\",[\"")) != -1){	// ",[" が見つからなくなるまで（漢字候補の先頭を表す文字列）

			json = json.substring(p + 4);
        	String wrk = json.substring(0, json.indexOf("\""));
        	wrk = wrk.replaceAll("（", " (");
        	wrk = wrk.replaceAll("）", ") ");

        	//str.append(wrk);
        	str += wrk;
        }
    	return str;
	}

    private int findString(String str, String key) {

    	int cnt = 0;
    	int p = 0;
    	while((p = str.indexOf(key)) != -1) {
    		cnt++;
    		str = str.substring(p + key.length());
    	}
    	return cnt;
    }
}

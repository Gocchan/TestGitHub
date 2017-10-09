package com.gocchan.testgithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class TestGoogleAPI {

	private static final String API_URL = "http://www.google.com/transliterate?langpair=ja-Hira|ja&text=";


    public static String convert(String str) {

    	String out = "";
		try {
    		String enc_hiragana = URLEncoder.encode(str,"utf-8");

    		HttpURLConnection conn = null;
    		conn = (HttpURLConnection) new URL(API_URL + enc_hiragana).openConnection();
    		//conn = (HttpURLConnection) new URL(API_URL + enc_hiragana + "&charset=UTF-8").openConnection();

    		conn.setRequestMethod("GET");
    		conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
    		conn.connect();

			if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){

    			StringBuffer responseJSON = new StringBuffer();

    			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

    			String inputLine;

    			while ((inputLine = reader.readLine()) != null) {
    				//responseJSON.append(inputLine.substring(0, inputLine.indexOf("\t")));
                    responseJSON.append(inputLine);

                }


    			int p;
    			String fromStr = responseJSON.toString();
    			//[["ここでは",["ここでは","個々では","ココでは","此 処では","ココデは"]],["きものを",["着物を","きものを","キモノを","被物を","木ものを"]],["ぬぐ",["脱ぐ","ぬぐ","ヌグ","拭","揩"]]]


    			while ((p = fromStr.indexOf("\",[\"")) != -1){

    	        	fromStr = fromStr.substring(p + 4);
    	        	String wrk = fromStr.substring(0, fromStr.indexOf("\""));
    	        	wrk = wrk.replaceAll("（", " (");
    	        	wrk = wrk.replaceAll("）", ") ");

    	        	//str.append(wrk);
    	        	out += wrk;
    	        }

    			//str.append(fromStr);
    			/*
    			for(Entry<String, String> e : G_DICTIONARY.entrySet()) {

    				str = str.replaceAll(e.getKey(), e.getValue());

    			}

    			if(str.length() > 0){
    				return str.toString();

    			}
    			*/
    			return out;
    		}


		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return str;








    }
}

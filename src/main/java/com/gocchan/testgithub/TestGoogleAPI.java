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

    	String test = "";
		long start;
		long end;



		/*

    	// map���x�v�� 772ms
		test = "";
		start = System.currentTimeMillis();
    	for(int i=1; i<=30000; i++) {
			if(TestConst.ZENKAKU.containsKey('[')) {
				test += TestConst.ZENKAKU.get('[');
			}
    	}
		end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms");

    	// �z�񑬓x�v��
		test = "";
		start = System.currentTimeMillis();
    	for(int i=1; i<=30000; i++) {
    		for(int idx=0; idx < TestConst.hairetuZENKAKU[0].length; idx++) {
				if(TestConst.hairetuZENKAKU[0][idx] == '[') {
					test += TestConst.hairetuZENKAKU[1][idx];
				}
    		}
    	}
		end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms");




		System.out.println("=========================================");

		*/

    	// ���M���邩�ȕ�����53���𒴂���ƃG���[
    	if(str.length() > 53) {

    		//���̏ꍇ�A��Ǔ_��󔒂łQ�ɕ�����Ȃ�������Ă݂�


    		//watashinoienihaittaratoumeininngenndakaraanatahananndemoshitemokizukarenaidemohenntainokimochidyatteitte
    		System.out.print("WIRNING !!! �������F" + str.length());


			//out += buf.substring(0, cutting); // 1�����ڂ���͂ݏo�����܂�
			//buf = buf.substring(cutting); // �c�����i3�����j


    		return (getGoogleKana(str.substring(0, 53)) + "��" + getGoogleKana(str.substring(53-20)));
    	}
    	return getGoogleKana(str);
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

    			//StringBuffer responseJSON = new StringBuffer();
				String json = "";

    			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

    			String inputLine;

    			while ((inputLine = reader.readLine()) != null) {
    				//responseJSON.append(inputLine.substring(0, inputLine.indexOf("\t")));
                    //responseJSON.append(inputLine);
    				json += inputLine;
                }

    			//String fromStr = responseJSON.toString();
    			//[["�����ł�",["�����ł�","�X�ł�","�R�R�ł�","�� ���ł�","�R�R�f��"]],["�����̂�",["������","�����̂�","�L���m��","�함��","�؂��̂�"]],["�ʂ�",["�E��","�ʂ�","�k�O","�@","��"]]]
    			//kokodehakimonowonugimasu.

    			//long start;
    			//long end;
     			//System.out.println(fromStr);

     			/*
     			start = System.currentTimeMillis();
    			System.out.println("Json Test 02:" + edtJson2(fromStr));
    			end = System.currentTimeMillis();
    			System.out.println((end - start)  + "ms");
				*/
     			//start = System.currentTimeMillis();
     			out = edtJson(json);
    			//out = edtJson2(fromStr);

    			//end = System.currentTimeMillis();
    			//System.out.println((end - start)  + "ms");
    			/*
     			start = System.currentTimeMillis();
    			System.out.println("Json Test 01:" + edtJson(fromStr));
    			end = System.currentTimeMillis();
    			System.out.println((end - start)  + "ms");
				*/


    			if(out.length() > 0){
    				// �󂶂�Ȃ���΁i�G���[�����������I�[�o�[���͋�ƂȂ�j
    				return out.toString();

    			}
    		}

		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N

			//System.out.println("***");
			e.printStackTrace();
		}
		return out;
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
		while ((p = json.indexOf("\",[\"")) != -1){	// ",[" ��������Ȃ��Ȃ�܂Łi�������̐擪��\��������j

			json = json.substring(p + 4);
        	String wrk = json.substring(0, json.indexOf("\""));
        	wrk = wrk.replaceAll("�i", " (");
        	wrk = wrk.replaceAll("�j", ") ");

        	//str.append(wrk);
        	str += wrk;
        }
    	return str;
	}
}

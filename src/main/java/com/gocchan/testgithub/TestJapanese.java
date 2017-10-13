package com.gocchan.testgithub;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestJapanese {

	final private TestGithub hGithub;
	final private TestGoogleAPI hGoogle;

	public TestJapanese(final TestGithub hGithub){

		this.hGithub = hGithub;
		this.hGoogle = hGithub.getGoogleHandler();
	}

    public String toKana(String in) {

    	// "atsushi"sann "AG\OTO"ttehitoha douitujinnbutudesuka?

    	// �p��𕚎���
    	leaveGoogle clsLeave = new leaveGoogle();
    	clsLeave = encodeLeave(in);

		String now;
		System.out.println("List:" + clsLeave.englishes.toString());
    	editer edt = new editer();

    	edt.cnt = 0;
    	edt.buf = "";
    	edt.out = "";

		for(int i = 0; i < clsLeave.japanese.length(); i++) {

			now = clsLeave.japanese.substring(i,i+1); // i�����ڂ���1����
			char c = clsLeave.japanese.charAt(i);
			if(c == '\'' || java.lang.Character.isLowerCase(c)) {

				//System.out.println("cnt:" + cnt + ", buf=" + buf + ", now=" + now + ", out=" + out);
				if(TestConst.BOIN.contains(now)) {

					// �o�b�t�@�[3�����z���΍�
					// �����̓o�b�t�@�[��3�����ȉ��ΏۂȂ̂ł͂ݏo���������ɑ���o��
					if(edt.cnt > 3) {
						edt = pushBuffer(edt);
					}
					// ���炵�Ă����Ȃ��猟�����邱�ƁI
					edt = serchROMAN(edt, now);

				} else {

					if(edt.buf.equals("ny")) {
						// ny?
						edt.out += edt.buf;
						edt.buf = now;
						edt.cnt = 1;

					} else if(edt.buf.equals("n")) {
						// ny, nn, n', n?
						edt = editNX(edt, now);

					} else {
						edt.buf += now;
						edt.cnt++;
					}
				}
			} else {
				// ���p�p�������ȊO

				// �c�� �� �΍�2
				if(edt.buf.equals("n")) {
					edt.buf = "��";
				}
				edt.out += edt.buf + now;
				edt.cnt = 0;
				edt.buf = "";
			}
		}

		// �c�� �� �΍�P
		if(edt.buf.equals("n")) {
			edt.buf = "��";
		}

		edt.out += edt.buf;


		// �����ɂ����p���߂�
		clsLeave.japanese = edt.out;
		edt.out = decodeLeave(clsLeave);



		// ���p��S�p��
    	System.out.println("�L���ϊ��O�F" + edt.out);
    	String str = toZenkaku(edt.out);


    	//a,"atsushi"sann "AG\OTO"ttehitoha douitujinnbutudesuka?
    	System.out.println("�n���O�F" + str);
    	// �Ƃ�܂T���������̎��͂Ђ炪�Ȃ̂܂܏o�́i�ςȊ����̂Ƃ��A���̕����Ȃ��ƈӖ���\���ł��Ȃ����߁j
    	if(str.length() < 5) {
    		return str + " (" + in + ")";
    	} else {
    		return hGoogle.convert(str) + " (" + in + ")";
    	}
    }

    private String toZenkaku (String str) {

    	String wrk = "";
    	for(int i=0; i < str.length(); i++) {

    		String s = str.substring(i, i + 1);
    		if(s.getBytes().length > 1) {

    			wrk += s;

    		} else {
    			char c = str.charAt(i);
    			if(TestConst.ZENKAKU.containsKey(c)) {
    				wrk += TestConst.ZENKAKU.get(c);
    			} else {
    				wrk += c;
    			}
    		}
    	}
		return wrk;
    }

    private String getRomaji (int keylen, String key, String boin) {

    	if(TestConst.ROMAN(keylen).containsKey(key)) {
    		return TestConst.ROMAN(keylen).get(key).get(TestConst.BOIN.indexOf(boin));
    	}
    	return "";
    }
    //
    private boolean isXtu (int cnt, String buf) {

    	// ������ "��" �΍�
    	switch(cnt) {
			case 3:
				if(buf.charAt(0) == buf.charAt(1)
						&& buf.charAt(0) != buf.charAt(2)) {
					return true;
				} else {
					return false;
				}

    		case 2:
    			if(buf.charAt(0) == buf.charAt(1)) {
					return true;
				} else {
					return false;
				}

    		default:
    			return false;
    	}
    }

    private editer pushBuffer(editer edt) {

		int cutting = edt.cnt - 3; // �͂ݏo����
		edt.out += edt.buf.substring(0, cutting); // 1�����ڂ���͂ݏo�����܂�
		edt.buf = edt.buf.substring(cutting); // �c�����i3�����j
		edt.cnt = 3;

		return edt;
    }

    private editer editNX(editer edt, String now) {
		if(now.equals("y")) {
			// �ɂ� �ɂ� �ɂ�Ή�1
			//edt.buf += now;
			edt.buf = "ny";
			edt.cnt++;
		} else {

			edt.out += "��";
			if(now.equals("n")) {
				edt.buf = "";
				edt.cnt = 0;
			} else if(now.equals("'")) {
				edt.buf = "";
				edt.cnt = 0;
			} else {
				edt.buf = now;
			}
		}
		return edt;
    }

    private editer serchROMAN(editer edt, String now) {

    	for(int i = 3; i > 0; i--) {

			if(edt.cnt == i) {
				// �������@���@�Ή�
				if((edt.cnt == 3 || edt.cnt == 2) && isXtu(edt.cnt, edt.buf)) {
					edt.out += "��";
					edt.cnt = edt.cnt-1;
					edt.buf = edt.buf.substring(1);

				} else {

					String romaji = getRomaji(edt.cnt, edt.buf, now);
					if(!romaji.isEmpty()) {
						edt.out += romaji;
						edt.cnt = 0;
						edt.buf = "";
						return edt;

					} else {

						// 1�������炷
						edt.out += edt.buf.substring(0, 1); // 1�����ڂ���1����
						if(i != 1) {
							edt.buf = edt.buf.substring(1); // �c����
						}
						edt.cnt = edt.cnt - 1;
					}
				}
			}
    	}
		edt.out += getRomaji(edt.cnt, edt.buf, now);
		edt.buf = "";
		return edt;
    }
    private String decodeLeave(leaveGoogle leave) {

    	String regex = "��";
    	Pattern p = Pattern.compile(regex);
    	//Matcher m = p.matcher(leave.japanese);

    	String wrk = "";
    	int cnt = 0;
    	for(String substr : p.split(leave.japanese)) {
    		wrk += substr;
    		if(cnt < leave.englishes.size()) {
    			wrk += leave.englishes.get(cnt);
    			cnt++;
    		}
    	}

    	return wrk;
    }

    private leaveGoogle encodeLeave(String in) {

    	List<String> english = new ArrayList<String>();
    	leaveGoogle leave = new leaveGoogle();

    	// https://qiita.com/sta/items/848e7a8c4699a59c604f
    	// " �͗v��Ȃ�
    	//
    	//String regex = "\"([a-zA-Z0-9 !\"#$%&'()*+,-./:;<=>?@\\[\\\\\\\\\\]^_`{|}~]+)\"";
    	String regex = "\"([a-zA-Z0-9 !#$%&'()*+,-./:;<=>?@\\[\\\\\\\\\\]^_`{|}~]+)\"";

    	//  "atsushi"sann "AG\OTO"ttehitoha douitujinnbutudesuka?
    	Pattern p = Pattern.compile(regex);
    	Matcher m = p.matcher(in);

    	String wrk = "";
    	int loc = 0;
    	while (m.find()){
    		if(m.start() > loc) {
    			wrk += in.substring(loc, m.start());
    		}
    		wrk += "��";
    		loc = m.end();

    		english.add(in.substring(m.start()+1, m.end()-1));
    	}
    	if(in.length() > loc) {
    		wrk += in.substring(loc);
    	}

    	leave.englishes = english;
    	leave.japanese = wrk;

		return leave;
    }

    private static class editer {

    	private int cnt;
    	private String buf;
    	private String out;
    }

    private static class leaveGoogle {
    	private String japanese;
    	private List<String> englishes;
    }
}

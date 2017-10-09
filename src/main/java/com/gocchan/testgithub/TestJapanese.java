package com.gocchan.testgithub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJapanese {

	private static final List<String> BOIN = Arrays.asList("a","i","u","e","o");

    private static final Map<String, List<String>> ROMAN_0 = new HashMap<String, List<String>>() {
    	{
    		put("", Arrays.asList("��", "��", "��", "��", "��"));
    	}
    };

    private static final Map<String, List<String>> ROMAN_1 = new HashMap<String, List<String>>() {
    	{
    		put("k", Arrays.asList("��", "��", "��", "��", "��"));
    		put("g", Arrays.asList("��", "��", "��", "��", "��"));
    		put("s", Arrays.asList("��", "��", "��", "��", "��"));
    		put("z", Arrays.asList("��", "��", "��", "��", "��"));
    		put("t", Arrays.asList("��", "��", "��", "��", "��"));
    		put("d", Arrays.asList("��", "��", "��", "��", "��"));
    		put("n", Arrays.asList("��", "��", "��", "��", "��"));
    		put("h", Arrays.asList("��", "��", "��", "��", "��"));
    		put("b", Arrays.asList("��", "��", "��", "��", "��"));
    		put("p", Arrays.asList("��", "��", "��", "��", "��"));
    		put("m", Arrays.asList("��", "��", "��", "��", "��"));
    		put("y", Arrays.asList("��", "��", "��", "����", "��"));
    		put("r", Arrays.asList("��", "��", "��", "��", "��"));
    		put("w", Arrays.asList("��", "����", "��", "����", "��"));
    		put("j", Arrays.asList("����", "��", "����", "����", "����"));
    		put("f", Arrays.asList("�ӂ�", "�ӂ�", "��", "�ӂ�", "�ӂ�"));
    		put("x", Arrays.asList("��", "��", "��", "��", "��"));
    		put("v", Arrays.asList("����", "����", "��", "����", "����"));
    		put("q", Arrays.asList("����", "����", "��", "����", "����"));
    		put("l", Arrays.asList("��", "��", "��" , "��" , "��"));
    		put("c", Arrays.asList("��", "��", "��", "��", "��"));
    	}
    };

    private static final Map<String, List<String>> ROMAN_2 = new HashMap<String, List<String>>() {
    	{
	    	put("wy", Arrays.asList("", "��", "", "��", ""));
	    	put("ky", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("gy", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("sy", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("sh", Arrays.asList("����", "��", "����", "����", "����"));
	    	put("zy", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("ty", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("ch", Arrays.asList("����", "��", "����", "����", "����"));
	    	put("dy", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("ny", Arrays.asList("�ɂ�", "�ɂ�", "�ɂ�", "�ɂ�", "�ɂ�"));
	    	put("hy", Arrays.asList("�Ђ�", "�Ђ�", "�Ђ�", "�Ђ�", "�Ђ�"));
	    	put("by", Arrays.asList("�т�", "�т�", "�т�", "�т�", "�т�"));
	    	put("py", Arrays.asList("�҂�", "�҂�", "�҂�", "�҂�", "�҂�"));
	    	put("my", Arrays.asList("�݂�", "�݂�", "�݂�", "�݂�", "�݂�"));
	    	put("ry", Arrays.asList("���", "�股", "���", "�肥", "���"));
	    	put("ts", Arrays.asList("��", "��", "��", "��", "��"));
	    	put("th", Arrays.asList("�Ă�", "�Ă�", "�Ă�", "�Ă�", "�Ă�"));
	    	put("dh", Arrays.asList("�ł�", "�ł�", "�ł�", "�ł�", "�ł�"));
	    	put("xk", Arrays.asList("��", "", "", "��", ""));
	    	put("xt", Arrays.asList("", "", "��", "", ""));
	    	put("xy", Arrays.asList("��", "��", "��", "��", "��"));
	    	put("xw", Arrays.asList("��", "", "", "", ""));
	    	put("wh", Arrays.asList("����", "����", "��", "����", "����"));
	    	put("vy", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("kw", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("gw", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("jy", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("cy", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("tw", Arrays.asList("�Ƃ�", "�Ƃ�", "�Ƃ�", "�Ƃ�", "�Ƃ�"));
	    	put("dw", Arrays.asList("�ǂ�", "�ǂ�", "�ǂ�", "�ǂ�", "�ǂ�"));
	    	put("hw", Arrays.asList("�ӂ�", "�ӂ�", "", "�ӂ�", "�ӂ�"));
	    	put("fy", Arrays.asList("�ӂ�", "�ӂ�", "�ӂ�", "�ӂ�", "�ӂ�"));
	    	put("lk", Arrays.asList("��", "", "", "��", ""));
	    	put("lt", Arrays.asList("", "", "��", "", ""));
	    	put("ly", Arrays.asList("��", "��", "��", "��", "��"));
	    	put("lw", Arrays.asList("��", "", "", "", ""));
	    	put("qw", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("sw", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("zw", Arrays.asList("����", "����", "����", "����", "����"));
	    	put("fw", Arrays.asList("�ӂ�", "�ӂ�", "�ӂ�", "�ӂ�", "�ӂ�"));
	    	put("qy", Arrays.asList("����", "����", "����", "����", "����"));
			put("t'", Arrays.asList("", "�Ă�", "�Ƃ�", "", ""));
			put("d'", Arrays.asList("", "�ł�", "�ǂ�", "", ""));
    	}
    };

    private static final Map<String, List<String>> ROMAN_3 = new HashMap<String, List<String>>() {
	    {
	    	put("hwy", Arrays.asList("", "", "�ӂ�", "", ""));
	    	put("xts", Arrays.asList("", "", "��", "", ""));
	    	put("lts", Arrays.asList("", "", "��", "", ""));
	    	put("t'y", Arrays.asList("", "", "�Ă�", "", ""));
	    	put("d'y", Arrays.asList("", "", "�ł�", "", ""));


	    }
    };

    private static Map<String, List<String>> ROMAN(int i) {
    	switch(i) {
			case 0:
				return ROMAN_0;
    		case 1:
    			return ROMAN_1;
    		case 2:
    			return ROMAN_2;
    		case 3:
    			return ROMAN_3;
    		default:
    			return null;
    	}
    }

    private static char toZenkaku(char c) {
        switch(c) {
	        case '!' : return '�I';
	        case '\"': return '�h';
	        case '#' : return '��';
	        case '$' : return '��';
	        case '\\': return '��';
	        case '%' : return '��';
	        case '&' : return '��';
	        case '\'': return '�f';
	        case '(' : return '�i';
	        case ')' : return '�j';
	        case '*' : return '��';
	        case '+' : return '�{';
	        case ',' : return '�A';
	        case '~' : return '�`';
	        case '-' : return '�[';
	        case '^' : return '�['; // �厖�I
	        case '.' : return '�B';
	        case '/' : return '�^';
	        case '0' : return '�O';
	        case '1' : return '�P';
	        case '2' : return '�Q';
	        case '3' : return '�R';
	        case '4' : return '�S';
	        case '5' : return '�T';
	        case '6' : return '�U';
	        case '7' : return '�V';
	        case '8' : return '�W';
	        case '9' : return '�X';
	        case ':' : return '�F';
	        case ';' : return '�G';
	        case '<' : return '��';
	        case '=' : return '��';
	        case '>' : return '��';
	        case '?' : return '�H';
	        case '@' : return '��';
	        case 'A' : return '�`';
	        case 'B' : return '�a';
	        case 'C' : return '�b';
	        case 'D' : return '�c';
	        case 'E' : return '�d';
	        case 'F' : return '�e';
	        case 'G' : return '�f';
	        case 'H' : return '�g';
	        case 'I' : return '�h';
	        case 'J' : return '�i';
	        case 'K' : return '�j';
	        case 'L' : return '�k';
	        case 'M' : return '�l';
	        case 'N' : return '�m';
	        case 'O' : return '�n';
	        case 'P' : return '�o';
	        case 'Q' : return '�p';
	        case 'R' : return '�q';
	        case 'S' : return '�r';
	        case 'T' : return '�s';
	        case 'U' : return '�t';
	        case 'V' : return '�u';
	        case 'W' : return '�v';
	        case 'X' : return '�w';
	        case 'Y' : return '�x';
	        case 'Z' : return '�y';
	        case '`' : return '�e';
	        case '[' : return '�u';
	        case ']' : return '�v';
	        case 'a' : return '��';
	        case 'b' : return '��';
	        case 'c' : return '��';
	        case 'd' : return '��';
	        case 'e' : return '��';
	        case 'f' : return '��';
	        case 'g' : return '��';
	        case 'h' : return '��';
	        case 'i' : return '��';
	        case 'j' : return '��';
	        case 'k' : return '��';
	        case 'l' : return '��';
	        case 'm' : return '��';
	        case 'n' : return '��';
	        case 'o' : return '��';
	        case 'p' : return '��';
	        case 'q' : return '��';
	        case 'r' : return '��';
	        case 's' : return '��';
	        case 't' : return '��';
	        case 'u' : return '��';
	        case 'v' : return '��';
	        case 'w' : return '��';
	        case 'x' : return '��';
	        case 'y' : return '��';
	        case 'z' : return '��';
	        default	: return c;
        }
    }

    public static String toKana(String in) {

		String out = "";
		String now;
		String buf = "";
		int cnt = 0;

		for(int i = 0; i < in.length(); i++) {

			now = in.substring(i,i+1); // i�����ڂ���1����

			if(java.lang.Character.isLowerCase(in.charAt(i))) {

				//System.out.println("cnt:" + cnt + ", buf=" + buf + ", now=" + now + ", out=" + out);
				if(BOIN.contains(now)) {

					// *** ��������ӂ܂Ƃ߂Ȃ��ƁE�E�E ***

					// �o�b�t�@�[3�����z���΍�
					// �����̓o�b�t�@�[��3�����ȉ��ΏۂȂ̂ł͂ݏo���������ɑ���o��
					if(cnt > 3) {

						int cutting = cnt - 3; // �͂ݏo����
						out += buf.substring(0, cutting); // 1�����ڂ���1����
						buf = buf.substring(cutting); // �c�����i3�����j
						cnt = 3;
					}

					// ���炵�Ă����Ȃ��猟�����邱�ƁI
					if(cnt >= 3) {
						// �������@���@�Ή�2


						// �L�[��1�����ڂ�2�����ڂ������ł�����3�����ڂ��قȂ�ꍇ
						if(buf.substring(0,1).equals(buf.substring(1,2))
								&& !buf.substring(0,1).equals(buf.substring(2,3))) {

							// �Ōオ�ꉹ�Ȃ̂ł��̎��_��"��"�m��
							// �΂����ӂ����͂��Ⴉ���܂Ȃς��炳�������킟�₴

							out += "��";
							cnt = 2;
							buf = buf.substring(1);

						} else if(ROMAN(3).containsKey(buf) && !ROMAN(3).get(buf).get(BOIN.indexOf(now)).isEmpty()) {

							out += ROMAN(3).get(buf).get(BOIN.indexOf(now));
							cnt = 0;
							buf = "";
							continue;

						} else {

							// 1�������炷
							out += buf.substring(0, 1); // 1�����ڂ���1����
							buf = buf.substring(1); // �c�����i2�����j
						}
					}

					if(cnt >= 2) {
						// �������@���@�Ή��P
						if(buf.substring(0,1).equals(buf.substring(1))) {
							// �Ōオ�ꉹ�Ȃ̂ł��̎��_��"��"�m��
							// �΂����ӂ����͂��Ⴉ���܂Ȃς��炳�������킟�₴

							out += "��";
							cnt = 1;
							buf = buf.substring(1);


						} else if(ROMAN(2).containsKey(buf) && !ROMAN(2).get(buf).get(BOIN.indexOf(now)).isEmpty()) {

							out += ROMAN(2).get(buf).get(BOIN.indexOf(now));
							cnt = 0;
							buf = "";
							continue;

						} else {

							// 1�������炷
							out += buf.substring(0, 1); // 1�����ڂ���1����
							buf = buf.substring(1); // �c�����i2�����j
						}
					}

					if(cnt >= 1) {
						if(ROMAN(1).containsKey(buf) && !ROMAN(1).get(buf).get(BOIN.indexOf(now)).isEmpty()) {

							out += ROMAN(1).get(buf).get(BOIN.indexOf(now));
							cnt = 0;
							buf = "";
							continue;

						} else {
							// 1�������炷
							out += buf.substring(0, 1); // 1�����ڂ���1����
						}
					}

					out += ROMAN(0).get("").get(BOIN.indexOf(now));
					cnt = 0;
					buf = "";

				} else {

					if(buf.equals("ny")) {

						// �ɂ� �ɂ� �ɂ�Ή�2
						out += buf;
						buf = now;
						cnt = 1;

					} else if(buf.equals("n")) {

						if(now.equals("y")) {

							// �ɂ� �ɂ� �ɂ�Ή�1
							buf += now;
							cnt++;

						} else {

							out += "��";
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

				// �c�� �� �΍�2
				if(buf.equals("n")) {
					buf = "��";
				}


				// ���p�p���ȊO
				out += buf + now;
				cnt = 0;
				buf = "";


			}
		}

		// �c�� �� �΍�P
		if(buf.equals("n")) {
			buf = "��";
		}

		out += buf;

    	String str = "";

    	for(int i=0; i < out.length(); i++) {

    		String s = out.substring(i, i + 1);
    		if(s.getBytes().length > 1) {

    			str += s;
    		} else {
    			str += toZenkaku(out.charAt(i));
    		}

    	}
		return TestGoogleAPI.convert(str) + " (" + in + ")";

    }

}

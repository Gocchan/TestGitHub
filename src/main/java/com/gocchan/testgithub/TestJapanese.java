package com.gocchan.testgithub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestJapanese {
    private static final Map<String, List<String>> romap = new HashMap<String, List<String>>(){

    	{put("k", Arrays.asList("か, き, く, け, こ".split(",")));}
    	{put("engineer", Arrays.asList("AA,BB,CC".split(",")));}




    };

    public static void toKana() {


    	System.out.println(romap.get("k").get(2));




    }

}

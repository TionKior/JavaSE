package com.ssx01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {

        Map<String,String> map=new HashMap<String,String>();

        map.put("001","史晟贤");
        map.put("002","史晟");
        map.put("003","史");

        map.put("003","史晟贤");

        System.out.println(map);
    }
}

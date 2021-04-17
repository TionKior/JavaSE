package com.ssx02MapJiHeBianLi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("001", "史晟贤");
        map.put("002", "史晟");
        map.put("003", "史");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }


    }
}

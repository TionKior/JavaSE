package com.ssx01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03HuoQuGongNeng {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("001", "史晟贤");
        map.put("002", "史晟");
        map.put("003", "史");

//        map.get(); 根据键获取值
//        System.out.println(map.get("001"));
//        System.out.println(map.get("004"));

//        map.keySet(); Ctrl+Alt+V生成左边
//        获取所有键的集合   Set是一个集合,遍历需要增强for
//        Set<String> keySet = map.keySet();
//        for (String key : keySet) {
//            System.out.println(key);
//        }
//        map.values(); Ctrl+Alt+V生成左边
//        获取所有值的集合   Collection是一个集合,遍历需要增强for
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        System.out.println(map);

    }
}

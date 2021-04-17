package com.ssx01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02JiBenGongNeng {
    public static void main(String[] args) {

        Map<String,String> map=new HashMap<String,String>();
//        map.put();添加元素
        map.put("001","史晟贤");
        map.put("002","史晟");
        map.put("003","史");
//        map.remove();删除元素
//        System.out.println(map.remove("001"));
//        System.out.println(map.remove("004"));

//        map.clear();  移除所以有键值对元素
//        map.clear();

//        map.containsKet();判断集合是否包含指定的键
//        System.out.println(map.containsKey("001"));
//        System.out.println(map.containsKey("004"));
//
//        System.out.println(map);

//        map.containsValue();判断集合中是否包含指定的值
//        System.out.println(map.containsValue("史晟贤"));
//        System.out.println(map.containsValue("晟贤"));

//        map.isEmpty();判断集合是否为空
//        System.out.println(map.isEmpty());
//        map.clear();
//        System.out.println(map.isEmpty());

//        map.size();返回集合键值对的个数
        System.out.println(map.size());

        System.out.println(map);


    }
}

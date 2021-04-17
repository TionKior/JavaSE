package com.ssx05JiHeQianTao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
//        创建ArrayList集合
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

//        创建HashMap集合,添加键值对元素
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");
//        把HashMap作为元素添加到ArrayList集合
        array.add(hm1);
        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
//        把HashMap作为元素添加到ArrayList集合
        array.add(hm2);
        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
//        把HashMap作为元素添加到ArrayList集合
        array.add(hm3);
//      集合嵌套遍历
        for (HashMap<String, String> hm : array) {
//            获取键集合
            Set<String> keySet = hm.keySet();
            for (String key : keySet) {
//                通过键集合获取值
                String value = hm.get(key);
                System.out.println(key + "," + value);
            }
        }
    }
}

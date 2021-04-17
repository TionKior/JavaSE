package com.ssx02MapJiHeBianLi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();
        //添加元素
        map.put("001", "史晟贤");
        map.put("002", "史晟");
        map.put("003", "史");

        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历键值对对象的集合,得到每一个键值对对象
        for (Map.Entry<String, String> me : entrySet) {
            //获取到键和值,输出
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }


    }
}

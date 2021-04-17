package com.ssx04Properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01ZuoWeiMapLeiShiYong {
    public static void main(String[] args) {
        //创建集合对象(没有泛型)
        Properties prop = new Properties();

        //存储元素
        prop.put("001", "史晟贤");
        prop.put("002", "史晟");
        prop.put("003", "史");

        //遍历集合 Set<Object>是Object类型
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }

    }
}

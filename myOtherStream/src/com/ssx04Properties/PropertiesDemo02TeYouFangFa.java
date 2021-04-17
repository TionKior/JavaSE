package com.ssx04Properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02TeYouFangFa {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();
        //Object setProperty(String key, String value); 设置集合键和值,都是String类型,底层调用Hashtable方法put
        prop.setProperty("001", "史晟贤");
        prop.setProperty("002", "史晟");
        prop.setProperty("003", "史");

        //String getProperty(String key); 使用此属性列表中指定的键搜索属性
//        System.out.println(prop.getProperty("001"));//史晟贤
//        System.out.println(prop.getProperty("0011"));//null
//        System.out.println(prop);

        //Set<String> stringPropertyNames(); 从该属性列表中返回一个不可修改的键集,其中键及其对应的值是字符串

        //遍历集合
        Set<String> names = prop.stringPropertyNames();
        for (String key : names) {
            String value = prop.getProperty(key);
            System.out.println(key + "," + value);
        }


    }
}

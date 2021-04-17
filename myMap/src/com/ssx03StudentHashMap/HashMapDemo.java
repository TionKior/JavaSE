package com.ssx03StudentHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
//        创建HashMap对象
        HashMap<String, Student> hm = new HashMap<String, Student>();

//        创建学生对象
        Student s1 = new Student("史晟贤", 18);
        Student s2 = new Student("史晟", 19);
        Student s3 = new Student("史", 20);

//        把学生添加到集合
        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);

//        遍历集合(方式1:键找值)
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
        System.out.println("---------");

//        方式2:键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }


    }
}

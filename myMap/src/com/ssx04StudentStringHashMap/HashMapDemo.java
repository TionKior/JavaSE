package com.ssx04StudentStringHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
//        创建HashMap对象
        HashMap<Student, String> hm = new HashMap<Student, String>();

//        创建学生对象
        Student s1 = new Student("史晟贤", 18);
        Student s2 = new Student("史晟", 19);
        Student s3 = new Student("史", 20);
        Student s4 = new Student("史", 20);

//        把学生添加到集合
        hm.put(s1, "临汾");
        hm.put(s2, "北京");
        hm.put(s3, "西安");
        hm.put(s4, "武汉");

//        遍历集合,键找值
        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
        System.out.println("------------------");
//        方式2:键值对对象找键和值
        Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
        for (Map.Entry<Student, String> me : entrySet) {
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName() + "," + key.getAge() + "," + value);

        }


    }
}

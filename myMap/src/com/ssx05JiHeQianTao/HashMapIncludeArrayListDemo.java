package com.ssx05JiHeQianTao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
//        创建HashMap集合
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
//        创建ArrayList集合并添加元素（sgyy 三国演义）
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        hm.put("三国演义", sgyy);
//        创建ArrayList集合并添加元素（xyj 西游记）
        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("唐僧");
        xyj.add("孙悟空");
        hm.put("西游记", xyj);
//        创建ArrayList集合并添加元素（shz 水浒传）
        ArrayList<String> shz = new ArrayList<String>();
        shz.add("武松");
        shz.add("鲁智深");
        hm.put("水浒传", shz);
//    遍历HashMap集合
//        得到键的集合
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
//            key是键:三国演义,西游记,水浒传
            System.out.println(key);
//            通过键得到值 hm.get();
            ArrayList<String> value = hm.get(key);
//            再遍历一层ArrayList
            for (String s : value) {
                System.out.println("\t" + s);
            }
        }
    }
}

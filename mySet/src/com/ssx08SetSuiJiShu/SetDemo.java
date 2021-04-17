package com.ssx08SetSuiJiShu;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        创建Set集合对象
//        HashSet无序
//        Set<Integer> set=new HashSet<Integer>();
//        TreeSet有序
        Set<Integer> set=new TreeSet<Integer>();
//      创建随机数对象
        Random r = new Random();
//      判断集合是不是小于10
        while(set.size()<10){
//            生成一个随机数,添加到集合
            int number = r.nextInt(20) + 1;
            set.add(number);
        }
//        遍历集合
        for (Integer i :set) {
            System.out.println(i);
        }


    }
}

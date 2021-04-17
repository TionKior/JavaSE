package com.ssx01;
//Set集合
//不包含重复值
//没有带索引的方法,不能使用普通for循环遍历
//对集合迭代顺序不做任何保证
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("hello");
        set.add("world");
        set.add("java");

        set.add("world");
        for (String s :set) {
            System.out.println(s);
        }


    }
}

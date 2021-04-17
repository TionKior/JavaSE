package com.ssx06KeBianCanShu;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo02 {
    public static void main(String[] args) {
//      public static <T> List<T> asList (T...a) 返回由指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");
//
//        list.add("javaee");//不允许添加
//        list.remove("world");//不允许删除
        list.set(1, "javaee");//允许修改
//
//        添加和删除会修改集合的大小,修改不改变集合的大小
        System.out.println(list);


//      public static <E> List<E> of (E... elements),返回包含任意数量元素的不可变列表
//        List<String> list = List.of("hello", "world", "java","world");
//
//        list.add("javaee");//不允许添加
//        list.remove("java");//不允许删除
//        list.set(1,"javaee");//不允许修改
//
//        System.out.println(list);

//        public static <E> Set<E> of (E... elements),返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("hello", "world", "java","world");
        Set<String> set = Set.of("hello", "world", "java");

//        set.add("javaee");//不允许添加
//        set.remove("world");//不允许删除

        System.out.println(set);
    }
}

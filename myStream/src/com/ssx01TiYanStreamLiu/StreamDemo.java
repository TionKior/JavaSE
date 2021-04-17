package com.ssx01TiYanStreamLiu;

import java.util.ArrayList;

//需求:按照下面的要求完成集合的创建和遍历
//创建一个集合,存储多个字符串元素
//把集合中所有以"张"开头的元素存储到一个新的集合
//把"张"开头的集合中的长度为3的元素存储到个新的集合
//遍历上一步得到的集合
public class StreamDemo {
    public static void main(String[] args) {
        //创建一个集合,存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //把集合中所有以"张"开头的元素存储到一个新的集合
        ArrayList<String> zhangList = new ArrayList<String>();

        for (String s : list) {
            //startsWith判断是否以张开头
            if (s.startsWith("张")) {
                zhangList.add(s);
            }
        }

//        System.out.println(zhangList);

        //把"张"开头的集合中的长度为3的元素存储到个新的集合
        ArrayList<String> threeList = new ArrayList<String>();

        for (String s : zhangList) {
            if (s.length() == 3) {
                threeList.add(s);
            }
        }

        //遍历上一步得到的集合
        for (String s : threeList) {
            System.out.println(s);
        }
        System.out.println("---------------");

        //Stream流来改进
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        //方法引用
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

    }
}

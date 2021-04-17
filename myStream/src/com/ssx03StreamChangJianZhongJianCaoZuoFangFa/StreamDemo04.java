package com.ssx03StreamChangJianZhongJianCaoZuoFangFa;

import java.util.ArrayList;
import java.util.Comparator;

//Stream<T> sorted():返回由此流的元素组成的流,根据自然顺序排序
//Stream<T> sorted(Comparator comparator):返回由该流的元素组成的流，根据提供的Comparator进行排序
public class StreamDemo04 {
    public static void main(String[] args) {
        //创建一个集合,存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        //需求1.按照字母顺序把数据在控制台输出
        //Stream<T> sorted():返回由此流的元素组成的流,根据自然顺序排序
        //list.stream().sorted().forEach(System.out::println);

        //需求2:按照字符串长度把数据在控制台输出
        //Stream<T> sorted(Comparator comparator):返回由该流的元素组成的流，根据提供的Comparator进行排序
        //Comparator比较器也可以通过Lambda表达式定义
        //list.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);

        list.stream().sorted((s1, s2) -> {
            int num = s1.length() - s2.length();
            int num2 = num == 0 ? s1.compareTo(s2) : num;
            return num2;
        }).forEach(System.out::println);
    }
}

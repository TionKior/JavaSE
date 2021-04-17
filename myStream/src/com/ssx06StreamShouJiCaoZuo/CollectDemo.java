package com.ssx06StreamShouJiCaoZuo;
//R collect(Collector collector)
//但是这个收集方法的参数是一个Collector接口

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//工具类Collectors提供了具体的收集方式
//public static <T> Collector toList():把元素收集到List集合中
//public static <T> Collector toSet():把元素收集到Set集合中
//public static Collector toMap(Function keyMapper,Function valueMapper):把元素收集到Map集合中
public class CollectDemo {
    public static void main(String[] args) {
        //创建List集合对象
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");

        //需求1:得到名字为三个字的流
        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);

        //需求2:把使用Stream流操作完毕的数据收集到List集合中并遍历
        //public static <T> Collector toList():把元素收集到List集合中
        List<String> names = listStream.collect(Collectors.toList());
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("--------");

        //创建Set集合对象
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(35);

        //需求3:得到年龄大于25的流
        Stream<Integer> setStream = set.stream().filter(age -> age > 25);

        //需求4:把使用Stream流操作完毕的数据收集到Set集合中并遍历
        Set<Integer> ages = setStream.collect(Collectors.toSet());
        for (Integer age : ages) {
            System.out.println(age);
        }

        System.out.println("--------");

        //定义一个字符串数组,每一个字符串由姓名数据和年龄数据组合而成
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};

        //需求5:得到字符串中年龄数据大于28的流
        //需要先把他转化成int类型的参数才能判断是否大于28
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);

        //需求6:把使用Stream流操作完毕的数据收集到Map集合中并遍历,字符串中的姓名作键,年龄作值
        //public static Collector toMap(Function keyMapper,Function valueMapper):把元素收集到Map集合中
        Map<String, Integer> map = arrayStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            Integer values = map.get(key);
            System.out.println(key + "," + values);
        }

    }
}

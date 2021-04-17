package com.ssx02StreamLiuDeShengChengFangShi;

import java.util.*;
import java.util.stream.Stream;

//Stream流的常见生成方式
//Collection体系的集合可以使用默认方法stream()生成流
//default Stream<E> stream()
//Map体系的集合间接的生成流
//数组可以通过Stream接口的静态方法of(T... values)生成流
public class StreamDemo {
    public static void main(String[] args) {

        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<String>();
        Stream<String> setStream = set.stream();

        //Map体系的集合间接的生成流
        Map<String, Integer> map = new HashMap<String, Integer>();
        //键
        //使用Map集合中的keySet()方法,因为keySet方法得到的是Set集合,Set集合可以调用Stream方法
        Stream<String> keyStream = map.keySet().stream();
        //值
        //使用Map集合中的values()方法,因为values方法得到的是Collection集合,Collection集合可以调用Stream方法
        Stream<Integer> valuesStream = map.values().stream();
        //键值对对象
        //使用Map集合中的entrySet得到键值对对象方法,因为entrySet方法得到的是Set集合,Set集合可以调用Stream方法
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        //数组可以通过Stream接口的静态方法of(T... values)生成流
        String[] strArray = {"hello", "world", "java"};
        Stream<String> strArrayStream = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("hello", "world", "java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);
    }
}

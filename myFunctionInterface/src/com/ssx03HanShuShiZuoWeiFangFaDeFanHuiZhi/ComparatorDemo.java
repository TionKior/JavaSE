package com.ssx03HanShuShiZuoWeiFangFaDeFanHuiZhi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//需求
//定义一个类(ComparatorDemo), 在类中提供两个方法
//一个方法是: Comparator <String> getComparator()方法返回值Comparator是-个函数式接口
//一个方法是主方法中,在主方法中调用getComparator方法
public class ComparatorDemo {
    public static void main(String[] args) {
        //构造使用场景

        //定义集合,存储字符串元素
        ArrayList<String> array = new ArrayList<String>();
        array.add("cccc");
        array.add("aa");
        array.add("b");
        array.add("ddd");
        System.out.println("排序前" + array);

        //排序,用集合工具类中的Collections,自然排序
        Collections.sort(array);
        System.out.println("排序后" + array);

        //在主方法中调用getComparator方法
        //sort(List,Comparator比较器实现类对象,而getComparator返回的就是实现类对象)
        Collections.sort(array, getComparator());
        System.out.println("比较器排序后" + array);

    }

    //对字符串排序,按照字符串长度排序
    private static Comparator<String> getComparator() {
        //匿名内部类方式实现
//        Comparator<String> comp = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };
//        return comp;
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//        };

        //Lambda表达式
//        return (String s1, String s2) -> {
//            return s1.length() - s2.length();
//        };
        //Lambda表达式省略
        return (s1, s2) -> s1.length() - s2.length();
    }
}

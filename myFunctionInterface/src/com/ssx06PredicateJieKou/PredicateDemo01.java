package com.ssx06PredicateJieKou;

import java.util.function.Predicate;

//boolean test(T t):对给定的参数进行判断(判断逻辑由Lambda表达式实现)，返回一个布尔值
//default Predicate<T> negate():返回一个逻辑的否定，对应逻辑非
//Predicate<T> 接口通常用于判断参数是否满足指定的条件
public class PredicateDemo01 {
    public static void main(String[] args) {
        //Lambda表达式
//        boolean b1 = checkSting("hello", (String s) -> {
//            return s.length() > 8;
//        });
        //Lambda表达式省略
        boolean b1 = checkSting("hello", s -> s.length() > 8);
        System.out.println(b1);

        boolean b2 = checkSting("helloworld", s -> s.length() > 8);
        System.out.println(b2);

    }

    //判断给定的字符串是否满足要求
    private static boolean checkSting(String s, Predicate<String> pre) {
        //具体的判断逻辑由Lambda表达式实现
//        return pre.test(s);
//        return !pre.test(s);
        return pre.negate().test(s);
    }
}

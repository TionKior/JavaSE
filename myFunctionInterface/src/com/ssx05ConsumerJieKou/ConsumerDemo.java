package com.ssx05ConsumerJieKou;

import java.util.function.Consumer;

//Consumer<T>:包含两个方法
//void accept(Tt):对给定的参数执行此操作
//default Consumer<T> andThen(Consumer after):返回一个组合的Consumer,依次执行此操作，然后执行after操作
//Consumer<T>接口也被称为消费型接口，它消费的数据的数据类型由泛型指定
public class ConsumerDemo {
    public static void main(String[] args) {
        //Lambda表达式
//        operatorString("史晟贤",(String s)->{
//            System.out.println(s);
//        });
        //Lambda表达式省略
//        operatorString("史晟贤", s -> System.out.println(s));
        //方法引用
        operatorString("史晟贤", System.out::println);

//        operatorString("史晟贤", s -> {
//            //字符串反转再转成字符串
//            System.out.println(new StringBuffer(s).reverse().toString());
//        });
        operatorString("史晟贤", s -> System.out.println(new StringBuffer(s).reverse().toString()));
        System.out.println("----------");

        //对字符串进行两次消费
        operatorString("史晟贤", s -> System.out.println(s), s -> System.out.println(new StringBuffer(s).reverse().toString()));
    }

    //定义一个方法,用不同的方式消费同一个字符串数据两次
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(name);
//        con2.accept(name);
        //default Consumer<T> andThen(Consumer after):返回一个组合的Consumer,依次执行此操作，然后执行after操作
        con1.andThen(con2).accept(name);
    }


    //定义一个方法,消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con) {
        con.accept(name);
    }
}

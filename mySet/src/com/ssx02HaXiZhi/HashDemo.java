package com.ssx02HaXiZhi;

public class HashDemo {
    public static void main(String[] args) {

        Student s1=new Student("史晟贤",18);
        //同一个对象多次调用hashCode()方法返回的哈希值相同
        System.out.println(s1.hashCode());//1239731077
        System.out.println(s1.hashCode());//1239731077

        System.out.println("----------");

        Student s2=new Student("史晟贤",18);
        //默认情况下不同对象的哈希值是不相同的
        //通过方法重写可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode());//557041912

        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818

        System.out.println("world".hashCode());//113318802

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}

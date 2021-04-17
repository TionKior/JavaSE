package com.ssx03FanSheHuoQuGouZaoFangFaBingShiYong;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
练习2:通过反射实现如下操作
    Students = new Student("林青霞");
    System.out.println(s);
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.ssx02.Student");

        //private Student(String name)
        //Constructor<T> getDeclaredConstructor (Class<?>... parameterTypes)
        Constructor<?> con = c.getDeclaredConstructor(String.class);   //获取私有带参构造方法

        //暴力反射,不能通过私有构造方法创建对象,但是通过反射里面可以
        //public void setAccessible (boolean flag):值为true取消访问检查
        con.setAccessible(true);
        //创建对象     Students = new Student("林青霞");
        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }
}

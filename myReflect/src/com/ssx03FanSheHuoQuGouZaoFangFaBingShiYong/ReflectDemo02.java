package com.ssx03FanSheHuoQuGouZaoFangFaBingShiYong;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
练习1:通过反射实现如下操作
    Students = new Student("林青霞*,30,"西安");
    System.out.println(s);
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.ssx02.Student");

        //public Student(String name, int age, String address) 带参构造方法
        //Constructor<T> getConstructor (Class<?>... parameterTypes)
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class); //获取带参构造方法
        //基本数据类型特可以通过.class得到对应的Class类型

        Object obj = con.newInstance("林青霞", 18, "西安");
        //System.out.println(obj);

    }
}

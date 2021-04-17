package com.ssx04FanSheHuoQuChengYuanBianLiangBingShiYong;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    练习:通过反射实现如下操作
        Student s = new Student();
        s.name = "林青霞";
        s.age= 30;
        s.address=“西安;
        System.out.println(s);
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取Class对象
        Class<?> c = Class.forName("com.ssx02.Student");

        //Student s = new Student(); 通过无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

        //s.name = "林青霞";
        //Field nameField = c.getField("name"); getField只能拿到公共的成员变量
        Field nameField = c.getDeclaredField("name");
        //暴力反射
        nameField.setAccessible(true);
        nameField.set(obj, "林青霞");
        System.out.println(obj);

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 30);
        System.out.println(obj);

        Field addressField = c.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(obj, "西安");
        System.out.println(obj);
    }
}

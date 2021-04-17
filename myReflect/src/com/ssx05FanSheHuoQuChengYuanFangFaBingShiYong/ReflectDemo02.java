package com.ssx05FanSheHuoQuChengYuanFangFaBingShiYong;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
        Students = new Student();
        s.method1();
        s.method2("林青霞");
        String ss = s.method3("林青霞,30);
        System.out println(ss);
        s.function();
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class类对象
        Class<?> c = Class.forName("com.ssx02.Student");

        //Students = new Student();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //s.method1();
        //public void method1()
        Method m1 = c.getMethod("method1");
        m1.invoke(obj);

        //s.method2("林青霞");
        //public void method2(String s)
        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj, "林青霞");   //因为这里是带参成员方法,obj后面带参数

        //String ss = s.method3("林青霞,30);
        //public void method3(String s, int i)
        //System.out println(ss);
        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj, "林青霞", 30);//Ctrl+ALT+V 生成返回值
        System.out.println(o);

        //s.function();
        //private void function()
        Method m4 = c.getDeclaredMethod("function"); //私有无参无返回值成员方法
        //暴力反射
        m4.setAccessible(true);
        m4.invoke(obj);

    }
}

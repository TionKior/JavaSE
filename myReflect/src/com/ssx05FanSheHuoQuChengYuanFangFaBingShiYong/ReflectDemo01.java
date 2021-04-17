package com.ssx05FanSheHuoQuChengYuanFangFaBingShiYong;

import com.ssx02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
Method[ getMethods():返回所有公共成员方法对象的数组,包括继承的
MethodD getDeclaredMethods():返回所有成员方法对象的数组，不包括继承的
Method getMethod(String name, Class<?>... parameterTypes):返回单个公共成员方法对象
Method getDeclaredMethod(String name, Class<?> .. parameterTypes):返回单个成员方法对象
Method类中用于调用成员方法的方法
Object invoke(Object obj, Object... args):调用obj对象的成员方法，参数是args,返回值是Object型
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.ssx02.Student");

        //Method[] getMethods():返回所有公共成员方法对象的数组,包括继承的
        //Method[] methods = c.getMethods();

        //Method[] getDeclaredMethods():返回所有成员方法对象的数组,不包括继承的
        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("--------");
        //Method getMethod(String name, Class<?>... parameterTypes):返回单个公共成员方法对象
        Method m = c.getMethod("method1");   //public void method1()无参成员方法

        //Method getDeclaredMethod(String name, Class<?> .. parameterTypes):返回单个成员方法对象
        Method method = c.getDeclaredMethod("function"); //private void function()

//        Student s = new Student();
//        s.method1();

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

//        obj.m(); obj和m都是对象,不能直接调用


        //Method类中用于调用成员方法的方法
        //Object invoke(Object obj, Object... args):调用obj对象的成员方法，参数是args,返回值是Object型
        //Object 返回值类型
        //obj  调用方法的对象
        //args 方法需要的参数
        m.invoke(obj);//调用了obj对象的m的invoke方法
    }
}

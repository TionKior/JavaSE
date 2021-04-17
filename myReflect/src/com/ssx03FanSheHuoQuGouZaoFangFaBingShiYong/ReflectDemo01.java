package com.ssx03FanSheHuoQuGouZaoFangFaBingShiYong;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取构造方法并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.ssx02.Student");

        //Constructor<?>[] getConstructors ()返回所有公共构造方法对象的数组
        //Constructor<?>[] cons = c.getConstructors();

        //Constructor<?>[] getDeclaredConstructors () 返回所有构造方法对象的数组
        Constructor<?>[] cons = c.getDeclaredConstructors();

        for (Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println("----------");
        //Constructor<T> getConstructor (Class<?>... parameterTypes) 返回单个公共构造方法对象
        Constructor<?> con = c.getConstructor();  //获取无参构造方法

        //Constructor<T> getDeclaredConstructor (Class<?>... parameterTypes) 返回单个构造方法对象
        Constructor<?> con2 = c.getDeclaredConstructor();

        //Constructor提供了一个类的单个构造函数的信息和访问权限


        //T newInstance (Object... initrargs) 根据指定的构造方法创建对象
        Object obj = con.newInstance();

        System.out.println(obj);


        //参数:你要获取的构造方法的参数的个数和数据类型对应的字节码文件对象

    }
}

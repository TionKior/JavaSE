package com.ssx04FanSheHuoQuChengYuanBianLiangBingShiYong;

import com.ssx02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.ssx02.Student");

        //Field[] getFields() 返回所有公共成员变量对象的数组
        //Field[] fields = c.getFields();

        //Field[] getDeclaredFields() 返回所有成员变量对象的数组
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("--------");

        //Field getField(String name) 返回单个公共成员变量对象
        Field addressField = c.getField("address");

//        Student s = new Student();
//        s.address = "西安";
//        System.out.println(s);

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        //obj.addressField = "西安";   两个都是对象,不能直接赋值


        //Field getDeclaredField(String name) 返回单个成员变量对象
        Field nameField = c.getDeclaredField("name"); //name用private修饰

        //Field提供有关类或接口的单个字段的信息和动态访问

        //Field类中用于给成员变量赋值的方法
        //void set(Object obj, Object value)给obj对象的成员变量赋值为value
        addressField.set(obj, "西安"); //给obj的成员变量addressField赋值为西安

        System.out.println(obj);
    }
}

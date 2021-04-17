package com.ssx01;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName : ReflectTest
 * @Description : 反射类
 * @Author : 史晟贤
 * @Date : 2021/3/5 17:13
 * @Version V1.0
 */
@Pro(className = "com.ssx01.Demo1", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        /*
            前提:不能改变该类的任何代码,可以创建任意类的对象,可以执行任意方法
         */

        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取上边的注解对象
        //其实就是在内存中去生成了一个该注解接口的子类实现对象
        /*
        //内存中创建了一个类,实现了Pro接口,重写了接口中的方法
        //使用注解配的属性的值就是返回值
        public class ProImpl implements Pro{
            public String className(){
                return "com.ssx01.Demo1";
            }
            public String methodName(){
                return "show";
            }
        }
         */
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3.调用注解对象中定义的抽象方法,获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);

        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取对象方法
        Method method = cls.getDeclaredMethod(methodName);
        //6.执行方法
        method.invoke(obj);


    }
}

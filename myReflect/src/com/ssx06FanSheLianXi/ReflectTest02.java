package com.ssx06FanSheLianXi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//练习2:
//       通过配置文件运行类中的方法
public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Student s = new Student();
//        s.study();
//        Teacher t = new Teacher();
//        t.teach();

        /*
            class.txt 中配置使用的类和类中的方法
            className=xxx(带包的全路径)
            methodName=xxx
         */

        //加载数据
        //文件中的键值对数据加载到了集合中
        Properties prop = new Properties();
        FileReader fr = new FileReader("myReflect\\class.txt");
        prop.load(fr);
        fr.close();

        /*
            className=com.ssx06FanSheLianXi.Student
            methodName=study
         */
        //根据两个键得到了对应的值
        String className = prop.getProperty("className"); //com.ssx06FanSheLianXi.Student
        String methodName = prop.getProperty("methodName"); //study

        //通过反射使用
        Class<?> c = Class.forName(className);//com.ssx06FanSheLianXi.Student
        //无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method m = c.getMethod(methodName);//study
        //invoke调用成员方法,无参无返回值
        m.invoke(obj);

    }
}

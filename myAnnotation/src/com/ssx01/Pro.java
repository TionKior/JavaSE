package com.ssx01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 描述需要执行的类名和方法名
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Pro {

    String className();

    String methodName();

}

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

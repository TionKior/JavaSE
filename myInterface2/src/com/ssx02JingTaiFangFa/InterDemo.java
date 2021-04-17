package com.ssx02JingTaiFangFa;

//1:定义一个接口Inter,里面有三个方法:一个是抽象方法，-一个是默认方法，一个是静态方法
//      void show();
//      default void method(){ }
//      public. static void test(){ }
//2:定义接口的一个实现类:
//      InterImpl
//3:定义测试类:
//      InterDemo
//在主方法中,按照多态的方式创建对象并使用
public class InterDemo {
    public static void main(String[] args) {
        //按照多态的方式创建对象并使用
        Inter i = new InterImpl();

        i.show();
        i.method();//Inter中的默认方法
        //i.test();   接口中的静态方法只能被接口名调用,不能被实现类对象调用

        Inter.test();//Inter中的静态方法
        //InterImpl.test();

        Flyable.test();//Flyable中的静态方法
    }
}

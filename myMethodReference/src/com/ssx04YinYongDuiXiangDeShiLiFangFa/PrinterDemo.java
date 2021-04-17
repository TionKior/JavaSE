package com.ssx04YinYongDuiXiangDeShiLiFangFa;

import java.util.Locale;

//练习
//定义一个类(PrintString), 里面定义一个方法
//      public void printUpper(Strings):把字符串参数变成大写的数据，然后在控制台输出
//定义一个接口(Printer), 面定义-个抽象方法
//      void printUpperCase(Strings)
//定义一个测试类(PrinterDemo), 在测试类中提供两个方法
//一个方法是: usePrinter(Printer p)
//一个方法是主方法,在主方法中调用usePrinter方法
public class PrinterDemo {
    public static void main(String[] args) {
        //在主方法中调用usePrinter方法
        //Lambda表达式(自己的实现方案)
//        usePrinter((String s) -> {
        //String result = s.toUpperCase();
        //System.out.println(result);
//            System.out.println(s.toUpperCase());
//        });
        //Lambda表达式省略
        usePrinter(s -> System.out.println(s.toUpperCase()));

        //引用对象的实例方法
        //因为是引用对象的实例方法,所以要先创建一个对象,然后使用对象中的方法
        PrintString ps = new PrintString();
        usePrinter(ps::printUpper);

        //Lambda表达式被对象的实例方法替代的时候,它的形式参数全部传递给该方法作为参数
    }

    private static void usePrinter(Printer p) {
        p.printUpperCase("HelloWorld");
    }
}

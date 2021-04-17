package com.ssx05YinYongLeiDeShiLiFangFa;

//练习
//定义一个接口(MyString), 里面定义一个抽象方法:
//String mySubString(Strings,int x.int y);
//定义一个测试类(MyStringDemo),在测试类中提供两个方法
//一个方法是: useMyString(MyString my)
//一个方法是主方法,在主方法中调用useMySting方法
public class MyStringDemo {
    public static void main(String[] args) {
        //在主方法中调用useMySting方法
        //Lambda表达式
//        useMyString((String s, int x, int y) -> {
//            return s.substring(x, y);
//        });
        //Lambda表达式省略
        useMyString((s, x, y) -> s.substring(x, y));

        //引用类中的实例方法
        useMyString(String::substring);

        //Lambda表达式被类的实例方法替代的时候
        //第一个参数作为调用者
        //后面的参数全部传递给该方法作为参数
    }

    private static void useMyString(MyString my) {
        String s = my.mySubString("HelloWorld", 2, 5);//llo
        System.out.println(s);
    }
}

package com.ssx03YinYongLeiFangFa;

//练习:
//定义一个接口(Converter), 里面定义一个抽象方法
//      int convert(String s);
//定义一个测试类(ConverterDemo), 在测试类中提供两个方法
//一个方法是: useConverter(Converter c)
//一个方法是主方法,在主方法中调用useConverter方法
public class ConverterDemo {
    public static void main(String[] args) {
        //在主方法中调用useConverter方法
        //Lambda表达式
        useConverter((String s) -> {
            //抽象方法是int类型的,需要有返回值
            return Integer.parseInt(s);
        });

        //只有一条语句,return省略了
        useConverter(s -> Integer.parseInt(s));

        //引用类方法
        //s传递给了parseInt
        useConverter(Integer::parseInt);

        //Lambda表达式被类方法替代的时候,它的形式参数全部传递给静态方法作为参数
    }

    private static void useConverter(Converter c) {
        int number = c.convert("666");
        System.out.println(number);
    }
}

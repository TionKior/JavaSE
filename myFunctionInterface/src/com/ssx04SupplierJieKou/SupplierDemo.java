package com.ssx04SupplierJieKou;

import java.util.function.Supplier;

//Supplier接口
//Supplier<T>:包含个无参的方法
//T get0: 获得结果
//该方法不需要参数，它会按照某种实现逻辑(由Lambda表达式实现返回个数据
//SupplierT>接口也被称为生产型接口,
// 如果我们指定了接口的泛型是什么类型,那么接口中的get方法就会生产什么类型的数据供我们使用
public class SupplierDemo {
    public static void main(String[] args) {
//        String s = getString(() -> {
//            return "史晟贤";
//        });

        //Lambda表达式省略
        String s = getString(() -> "史晟贤");
        System.out.println(s);

        Integer i = getInteger(() -> 123);
        System.out.println(i);
    }

    //定义一个方法,返回一个整数数据
    private static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }

    //定义一个方法,返回一个字符串数据
    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}

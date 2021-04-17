package com.ZhuangChaiXiang;

public class IntegerDemo {
    public static void main(String[] args) {
        //装箱,把基本数据类型转化为对应的包装类类型
        Integer i = 100;
        Integer ii=100;

        //拆箱,把包装类类型转化为应的基本数据类型

        ii= ii.intValue()+200;//还有一个自动装箱
        ii=+200;

        System.out.println(ii);

        Integer iii=null;
        if(iii!=null) {
            iii = +300;
        }
    }
}

package com.ssx01BiaoZhunShuRuShuChuLiu;

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {

        //public static final printStream out:标准输出流
        PrintStream ps = System.out;

        //方便打印各种数据值
        ps.println("hello");
        ps.println(100);

        //System.out的本质是一个字节输出流
        System.out.println("hello");
        System.out.println(100);

    }
}

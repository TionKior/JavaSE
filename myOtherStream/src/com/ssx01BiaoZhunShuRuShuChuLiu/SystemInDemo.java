package com.ssx01BiaoZhunShuRuShuChuLiu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {

        //public static final InputStream in:标准输入流
        //InputStream is = System.in;//Ctrl+Alt+V自动生成左边
        //读取数据
//        int by;
//        while ((by = is.read()) != -1) {
//            System.out.print((char) by);
//        }

        //用转换流把字节流转换为字符流
//        InputStreamReader isr = new InputStreamReader(is);
        //使用字符缓冲输入流实现一次读取一行数据
//        BufferedReader br=new BufferedReader(isr);
        //使用字符缓冲输入流实现一次读取一行数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个字符串:");
        String line = br.readLine();
        System.out.println("你输入的字符串是:" + line);

        System.out.println("请输入一个整数");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是:" + i);

        //自己实现键盘录入数据太麻烦,Java有一个类供使用
        Scanner sc = new Scanner(System.in);
    }
}

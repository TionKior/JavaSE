package com.ssx01;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        //File(String pathname),通过将给定的路径名字字符串转换为抽象路径名来创建File对象
        File f1=new File("D:\\JavaDemo\\java.txt");//把java.txt封装成了一个对象
        System.out.println(f1);//File类重写了toString方法

        //File(String parent, String child),从父路径名字符串和子路径名字符串创建新的File实例
        File f2=new File("D:\\JavaDemo","java.txt");
        System.out.println(f2);

        //File(File parent, String child),从父抽象路径名和子路径名字符串创建新的File实例
        File f3=new File("D:\\JavaDemo");
        File f4=new File(f3,"java.txt");
        System.out.println(f4);
    }
}

package com.ssx01;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) throws IOException {
//        File f1 = new File("D:\\JavaDemo\\java.txt");
        //在当前模块目录下创建java.txt文件
        File f1 = new File("myFile\\java.txt");
        System.out.println(f1.createNewFile());
        //在当前模块目录下删除java.txt文件
        System.out.println(f1.delete());

        System.out.println("-------------");

        //在当前模块目录下创建JavaDemo目录
        File f2 = new File("myFile\\JavaDemo");
//        System.out.println(f2.mkdir());
        //在当前模块目录下删除JavaDemo目录
//        System.out.println(f2.delete());

        //在当前模块下创建一个目录JavaDemo,然后在目录下创建一个文件java.txt
        File f3 = new File("myFile\\JavaDemo");
        System.out.println(f3.mkdir());
        File f4 = new File("myFile\\JavaDemo\\java.txt");
        System.out.println(f4.createNewFile());

        //删除当前模块下的目录JavaDemo
        System.out.println(f4.delete());
        System.out.println(f3.delete());

    }
}

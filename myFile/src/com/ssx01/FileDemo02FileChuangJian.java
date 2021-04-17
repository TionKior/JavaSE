package com.ssx01;

import java.io.File;
import java.io.IOException;

public class FileDemo02FileChuangJian {
    public static void main(String[] args) throws IOException {
        //createNewFile     在D:\\JavaDemo目录下创建一个文件java.txt
        File f1 = new File("D:\\JavaDemo\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("----------------");

        //mkdir     在D:\\JavaDemo目录下创建一个目录JavaSE
        File f2 = new File("D:\\JavaDemo\\JavaSE");
        System.out.println(f2.mkdir());
        System.out.println("----------------");

        //mkdirs    在D:\\JavaDemo目录下创建一个多级文件JavaWEB\\HTML
        File f3 = new File("D:\\JavaDemo\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());
        System.out.println("----------------");

        //在D:\\JavaDemo目录下创建一个文件javase.txt
        File f4 = new File("D:\\JavaDemo\\javase.txt");
//        System.out.println(f4.mkdir()); 创建一个名为javase.txt的文件夹
        System.out.println(f4.createNewFile());

    }
}

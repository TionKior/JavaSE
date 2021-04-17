package com.ssx01;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        //先在模块下创建一个java.txt文件
        File f = new File("myFile\\java.txt");
//        System.out.println(f.createNewFile());
        //f.isDirectory(); 测试此抽象路径名表示的File是否为目录
        //f.isFile(); 测试此抽象路径名表示的File是否为文件
        //f.exists(); 测试此抽象路径名表示的File是否存在
        System.out.println(f.isDirectory());//false
        System.out.println(f.isFile());//true
        System.out.println(f.exists());//true

        //f.getAbsolutePath(); 返回此抽象路径的绝对路径名字符串
        //f.getPath(); 返回抽象路径名转换为路径名字符串
        //f.getName(); 返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("------------------");

        //f2.list(); 返回此抽象路径名表示的目录中的文件和目录名的名称字符串数组
        //f2.listFiles(); 返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File f2 = new File("D:\\JavaDemo");
        //f2.list();
        String[] strArray = f2.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("------------------");

        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
//            System.out.println(file.getName());
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }


    }
}

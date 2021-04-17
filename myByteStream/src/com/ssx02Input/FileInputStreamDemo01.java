package com.ssx02Input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("myByteStream\\fos.txt");
        /*
        //调用字节输入流读数据方法
        //fis.read(); 从该输入流读取一个字节的数据
        int by = fis.read();
        System.out.println(by);//读取字节数据
        System.out.println((char)by);//转换成a

        by = fis.read();
        System.out.println(by);//读取字节数据
        System.out.println((char)by);//转换成b

        //再多读取两次
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);
        */
        //循环读取数据
        /*
        int by = fis.read();
        while (by != -1) {
            System.out.print((char) by);
            by = fis.read();
        }
        */

        /*
        循环读取数据
            fis.read(); 读数据
            by = fis.read(); 把读取到的数据赋值给by
            by != -1; 判断读取到的数据是否是-1
        */
        int by;
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }

        //释放资源
        fis.close();


    }
}

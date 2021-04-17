package com.ssx01Output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        /*
            做了三件事情,
            调用系统功能创建了文件
            创建了字节输出流对象
            让字节输出流对象指向创建好的文件
        */

        //fos.write();指定字节写入此文件输出流
        fos.write(97);
        fos.write(57);
        fos.write(55);

        //最后都要释放资源
        //fos.close(); 关闭此文件输出流并释放与此流相关联的任何系统资源
        fos.close();
    }
}

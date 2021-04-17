package com.ssx01Output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建对象FileOutputStream(String name); 创建文件输入流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        //有文件了就会把路径封装一个File对象
        //new File(name)
        //FileOutputStream fos = new FileOutputStream(new File("myByteStream\\fos.txt"));
        //创建对象2
//        File file = new File("myByteStream\\fos.txt");
//        FileOutputStream fos2 = new FileOutputStream(file);
//        FileOutputStream fos3 = new FileOutputStream(new File("myByteStream\\fos.txt"));

        //fos.write(); 将指定字符写入此文件输出流
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);


        //byte[] bys = {97, 98, 99, 100, 101};
        //fos.write(byte[] b); 将 b.length字节从指定的字节数组写入此文件输出流
        //byte[] getBytes (); 返回字符串对应的字符数组
        //byte[] bys = "abcde".getBytes();
        //fos.write(bys);

        //fos.write(byte[], int off, int len) 将len字节从指定的字节数组开始,从偏移量off开始写入此文件输入流
        byte[] bys = "abcde".getBytes();
        //fos.write(bys,0,bys.length);
        //从索引1开始,连续写三个
        fos.write(bys,1,3);

        //释放资源
        fos.close();
    }
}

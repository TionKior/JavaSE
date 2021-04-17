package com.ssx01;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //一个汉字存储,
        //  如果是GBK编码,占用2个字节
        //  如果是UTF-8编码,占用3个字节

        FileInputStream fis=new FileInputStream("myCharStream\\a.txt");
//
        int by;
        while ((by=fis.read())!=-1){
           System.out.print((char)by);
        }
//
        fis.close();

        System.out.println();
//        String s = "abc";//[97,98,99]
        String s = "中国";  //[-28, -72, -83, -27, -101, -67]
//        byte[] bys = s.getBytes();
//        byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));

    }
}
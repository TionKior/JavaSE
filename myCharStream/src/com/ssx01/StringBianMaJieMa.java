package com.ssx01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//编码解码
public class StringBianMaJieMa {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //定义一个字符串
        String s = "中国";

        //byte[] getBytes(); 使用平台默认字符集把String编码为一系列字节,结果存储在字节数组中
//        byte[] bys = s.getBytes();//[-28, -72, -83, -27, -101, -67]

        //byte[] getBytes(String charsetName); 使用指定字符集把String编码为一系列字节,结果存储在字节数组中
        byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
//        byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));
        //String(byte[] bytes); 使用平台的默认字符集解码指定的字符数组来构造新的 String
//        String ss = new String(bys);

        //String(byte[] bytes, String charsetName); 使用指定的字符集解码指定的字符数组来构造新的 String
        String ss = new String(bys,"UTF-8");
        System.out.println(ss);//中国
        String sss = new String(bys,"GBK");
        System.out.println(sss);//涓浗


    }
}

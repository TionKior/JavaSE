package com.ssx02ZiFuLiu;

import java.io.*;

//字符流
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        //OutputStreamWriter(OutputStream out) 创建一个使用默认字符编码的OutputStreamWriter。
//        FileOutputStream fos=new FileOutputStream("myCharStream\\osw.txt");
//        OutputStreamWriter osw=new OutputStreamWriter(fos);
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"));

        //OutputStreamWriter(OutputStream out, String charsetName) 创建一个使用命名字符集的OutputStreamWriter。
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"), "GBK");

        osw.write("中国");

        osw.close();

        //InputStreamReader(InputStream in) 创建一个使用默认字符集的InputStreamReader。
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"));
        //InputStreamReader(InputStream in, String charsetName) 创建一个使用命名字符集的InputStreamReader。
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"), "UTF-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\osw.txt"), "GBK");

        //一次读取一个字符数据
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }

        isr.close();
    }
}

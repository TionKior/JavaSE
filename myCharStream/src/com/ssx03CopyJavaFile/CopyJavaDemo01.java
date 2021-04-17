package com.ssx03CopyJavaFile;

import java.io.*;

public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myCharStream\\ConversionStreamDemo.java"));

        //根据目的地创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\Copy.java"));

        //读写数据,复制文件
        //1.一次读写一个字符数据
        int ch;
        while ((ch = isr.read()) != -1) {
            osw.write(ch);
        }
        //2.一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }

        //释放资源
        isr.close();
        osw.close();
    }
}

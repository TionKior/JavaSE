package com.ssx02ZiFuLiu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myCharStream\\osw.txt"));

        //void write (int c); 写一个字符
//        osw.write(97);
        //void flush(); 刷新流
//        osw.flush();

        //void write (char[] cbuf); 写入一个字符数组
//        char[] chs = {'a', 'b', 'c', 'd', 'e'};
//        osw.write(chs);
        //void write (char[] cbuf, int off, int len); 写入字符数组的一部分
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
//        osw.write(chs, 0, chs.length);
//        osw.write(chs, 1, 3);
        //void write (String str); 写一个字符串
//        osw.write("abcde");
        //void write (String str, int off, int len); 写入字符串的一部分
        osw.write("abcde", 0, "abcde".length());
        osw.write("abcde", 1, 3);

        osw.close();
    }
}

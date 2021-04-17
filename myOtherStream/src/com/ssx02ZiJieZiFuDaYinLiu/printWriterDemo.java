package com.ssx02ZiJieZiFuDaYinLiu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


//字符打印流
public class printWriterDemo {
    public static void main(String[] args) throws IOException {
        //PrintWriter (String fileName) 用指定文件名创建一个新的printWriter,而不需要自动执行刷新
//        PrintWriter pw = new PrintWriter("myOtherStream\\pw.txt");

//        pw.write("hello");
//        pw.write("\r\n");
//        pw.flush();
//        pw.write("world");
//        pw.write("\r\n");
//        pw.flush();

        //特有方法
//        pw.println("hello");
//        /*
//        pw.write("hello");
////        pw.write("\r\n");
//         */
//        pw.flush();
//        pw.println("world");
//        pw.flush();

        //PrintWriter (Writer out, boolean autoFlush) 创建一个新的printWriter
        //out 字符输出流
        //outFlush 一个布尔值,如果为真,则println , print , 或format方法刷新输出缓冲区
        PrintWriter pw = new PrintWriter(new FileWriter("myOtherStream\\pw.txt"), true);

        pw.println("hello");
        /*
        pw.write("hello");
        pw.write("\r\n");
        pw.flush();
         */
        pw.println("world");

        pw.close();
    }
}

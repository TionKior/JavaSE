package com.ssx04ZiFuHuanChongLiu;

import java.io.*;

public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //BufferedWriter(Writer out) 输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));
        //BufferedReader(Reader in) 输入流
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\bw.txt"));
        //写入数据
        bw.write("hello\r\n");
        bw.write("world\r\n");

        bw.close();

        //一次读取一个字符数据
        int ch;
        while ((ch = br.read()) != -1) {
            System.out.print((char) ch);
        }
        //一次读取一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }
        br.close();
    }
}

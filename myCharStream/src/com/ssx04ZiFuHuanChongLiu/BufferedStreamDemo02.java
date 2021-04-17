package com.ssx04ZiFuHuanChongLiu;

import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        /*
        //创建字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\bw.txt"));

        //写数据
        for (int i = 0; i < 10; i++) {
            bw.write("hello" + i);
            //bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();

         */
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\bw.txt"));

//        第一次读取数据
//        String line = br.readLine();
//        System.out.println(line);
//        第二次读取数据
//        line=br.readLine();
//        System.out.println(line);

        //循环读取数据
        String line;
        while ((line=br.readLine())!=null){
            //读一行，读到\n就换行，加上ln可以读完一行就换行
            System.out.println(line);
        }

        //释放资源
        br.close();
    }
}

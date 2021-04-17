package com.ssx02ZiJieZiFuDaYinLiu;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {

        /*
        //数据源
        BufferedReader br=new BufferedReader(new FileReader("myOtherStream\\PrintStreamDemo.java"));
        //目的地
        BufferedWriter bw=new BufferedWriter(new FileWriter("myOtherStream\\Copy.java"));
        //读写数据,复制文件
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        br.close();
         */
        //根据数据源创建字符输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myOtherStream\\PrintStreamDemo.java"));
        //根据目的地创建字符输出流对象
        PrintWriter pw = new PrintWriter(new FileWriter("myOtherStream\\Copy.java"), true);

        //读写数据,复制文件
        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }
        //释放资源
        pw.close();
        br.close();
    }


}

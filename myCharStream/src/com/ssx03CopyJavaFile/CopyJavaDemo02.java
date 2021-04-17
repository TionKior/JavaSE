package com.ssx03CopyJavaFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        FileReader fr = new FileReader("myCharStream\\ConversionStreamDemo.java");
        //根据目的地创建字符输出流对象
        FileWriter fw = new FileWriter("myCharStream\\Copy.java");
        //读写数据,复制文件
        //1.一次读写一个字符数据
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        //2.一次读写一个字符数组
        char chs[] = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }

        //释放资源
        fr.close();
        fw.close();

    }
}

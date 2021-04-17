package com.ssx05JiHeYuWenJian;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        //创建ArrayList集合
        ArrayList<String> array = new ArrayList<String>();

        //往集合中存储字符串元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //创建字符串缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("myCharStream\\array.txt"));

        //遍历集合,得到每一个字符串数据
        for (String s : array) {
            //调用字符缓冲输出流方法写数据
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    }
}

package com.ssx02ZiJieZiFuDaYinLiu;

import java.io.IOException;
import java.io.PrintStream;
//字节打印流
public class printStreamDemo {
    public static void main(String[] args) throws IOException {

        //创建对象
        PrintStream ps = new PrintStream("myOtherStream\\ps.txt");

        //写数据
        //字节输出流有的方法
//        ps.write(97);//a

        //使用特有方法写数据
        ps.print(97);//97
        ps.println();//换行
        ps.print(98);//98
//        ps.println(97);
//        ps.println(98);

        //释放资源
        ps.close();
    }
}

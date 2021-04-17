package com.ssx01Output;

import java.io.FileOutputStream;
import java.io.IOException;

//字节流写入数据加入异常处理
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {
//        try {
//            FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
//            fos.write("hello".getBytes());
//            fos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //加入finally来实现释放资源
        //在try中定义只能在try中使用, fos = null 初始化
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("myByteStream\\fos.txt");
            //不存在的路径会报错
            //fos = new FileOutputStream("Z:\\myByteStream\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //如果 fos == null就会空指针异常,需要加判断
            if(fos!=null) {
                try {
                    //此处的close有异常,要用try...catch...环绕
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

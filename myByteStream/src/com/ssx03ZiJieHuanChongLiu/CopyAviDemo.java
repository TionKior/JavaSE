package com.ssx03ZiJieHuanChongLiu;

import java.io.*;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

        //复制视频
        //method1();   1191毫秒
        //method2();   3毫秒
        //method3();   14毫秒
        //method4();   1毫秒

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时" + (endTime - startTime) + "毫秒");

    }

    //基本字节流一次读取一个字节
    public static void method1() throws IOException {
        //数据源:D:\\123\\ssx.avi
        //目的地:myByteStream\\ssx.avi
        FileInputStream fis = new FileInputStream("D:\\123\\ssx.avi");
        FileOutputStream fos = new FileOutputStream("myByteStream\\ssx.avi");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fos.close();
        fis.close();
    }

    //基本字节流一次读取一个字节数组
    public static void method2() throws IOException {
        //数据源:D:\\123\\ssx.avi
        //目的地:myByteStream\\ssx.avi
        FileInputStream fis = new FileInputStream("D:\\123\\ssx.avi");
        FileOutputStream fos = new FileOutputStream("myByteStream\\ssx.avi");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();
    }

    //字节缓冲流一次读取一个字节
    public static void method3() throws IOException {
        //数据源:D:\\123\\ssx.avi
        //目的地:myByteStream\\ssx.avi
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\123\\ssx.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\ssx.avi"));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        bos.close();
        bis.close();
    }

    //字节缓冲流一次读取一个字节数组
    public static void method4() throws IOException {
        //数据源:D:\\123\\ssx.avi
        //目的地:myByteStream\\ssx.avi
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\123\\ssx.avi"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myByteStream\\ssx.avi"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();
    }
}

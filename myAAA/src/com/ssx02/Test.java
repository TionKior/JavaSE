package com.ssx02;

import java.io.*;

public class Test {
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

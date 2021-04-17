package com.ssx01Output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //创建对象
//        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt");
        FileOutputStream fos = new FileOutputStream("myByteStream\\fos.txt", true);


        //写数据
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());//写10个hello
            fos.write("\r\n".getBytes());//换行,想要在记事本也换行,需要\r\n
        }

        //释放资源
        fos.close();
    }
}

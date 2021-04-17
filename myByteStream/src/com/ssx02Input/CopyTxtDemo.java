package com.ssx02Input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        //需要先读再写   Input读取数据  Output写入数据
        FileInputStream fis = new FileInputStream("D:\\123\\史晟贤.txt");
        FileOutputStream fos = new FileOutputStream("myByteStream\\史晟贤.txt");
        //读写数据
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}

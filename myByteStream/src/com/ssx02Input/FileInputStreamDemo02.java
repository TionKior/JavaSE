package com.ssx02Input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {

        //创建对象
        FileInputStream fis = new FileInputStream("myByteStream\\fos.txt");
        /*
        //调用字节输入流对象的读取方法
        //fis.read(byte[] b); 从该输入流读取最多 b.length个字节的数据到一个字节数组
        byte[] bys = new byte[12];
        int len = fis.read(bys);
        System.out.println(len);//len是实际读取数据的个数,包含\t\n
        //读取个数从0-len
        System.out.println(new String(bys, 0, len));
        //多读取了输出-1
        len = fis.read(bys);
        System.out.println(len);
        */
        //循环读取数据
        byte[] bys = new byte[1024];//1024机及其整数倍
        int len;
        //只要不是-1就是有数据
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        //释放资源
        fis.close();
    }
}

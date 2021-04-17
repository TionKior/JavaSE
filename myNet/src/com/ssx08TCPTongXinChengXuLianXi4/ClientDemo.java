package com.ssx08TCPTongXinChengXuLianXi4;

import java.io.*;
import java.net.Socket;

//客户端:数据来自于文本文件
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.10.105", 10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("myNet\\InetAddressDemo.java"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //读取数据写出去
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        //还需要关闭br,因为br指向的是文件
        br.close();
        s.close();
    }
}

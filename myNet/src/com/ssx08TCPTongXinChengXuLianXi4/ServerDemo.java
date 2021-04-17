package com.ssx08TCPTongXinChengXuLianXi4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务器,接收到的数据写入文本文件
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10000);
        //监听客户端连接,返回一个对应的Socket对象
        Socket s = ss.accept();
        //接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("myNet\\Copy.java"));
        //读写操作
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        //还需要关闭bw,因为bw指向的是文件
        bw.close();
        ss.close();
    }
}

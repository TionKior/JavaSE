package com.ssx09TCPTongXinChengXuLianXi5;

import java.io.*;
import java.net.Socket;

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
        while ((line = br.readLine()) != null) { //等待读取数据
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

//        System.out.println(22222);


        //自定义结束标记
//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        //public void shutdownOutput() 表示输出结束了
        s.shutdownOutput();

        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine(); //等待读取数据
        System.out.println("服务器的反馈:" + data);

        //释放资源
        //还需要关闭br,因为br指向的是文件
        br.close();
        s.close();
    }
}

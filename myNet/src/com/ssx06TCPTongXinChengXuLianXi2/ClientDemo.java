package com.ssx06TCPTongXinChengXuLianXi2;

import java.io.*;
import java.net.Socket;

//客户端:数据来自于键盘录入,直到输入的数据是886,发送数据结束
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.10.105", 10000);

        //数据来自于键盘录入,直到输入的数据是886,发送数据结束
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象 封装(s.getOutputStream()) 使它可以通过BufferedWriter写数据
        //字节输出流转化成字符流,在转化成字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            //获取输出流对象
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            //一次读一行,一次写一行
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //释放资源
        s.close();
    }
}

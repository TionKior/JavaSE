package com.ssx03UDPLianXi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//接收端,因为接收端不知道发送端什么时候停止发送,故采用死循环
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {

        //创建接收端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket(12345);
        while (true) {
            //创建一个数据包，用于接收数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //调用DatagramSocket对象的方法接收数据
            ds.receive(dp);
            //解析数据包,并把数据在控制台显示
            System.out.println("数据是:" + new String(dp.getData(), 0, dp.getLength()));
        }

        //关闭接收端,一直在接收数据,不需要关闭
        //ds.close();
    }
}

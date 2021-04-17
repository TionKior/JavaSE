package com.ssx06MaiPiao;

public class SellTicketDemo {
    public static void main(String[] args) {
        //创建SellTicket对象
        SellTicket st = new SellTicket();

        //创建三个Thread类对象,把SellTicket对象作为构造方法参数,并给出窗口名称
        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();

    }
}

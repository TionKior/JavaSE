package com.ssx01DuoXianChengShiXian;

//继承Thread类
public class MyThread extends Thread {
    //在MyThread中重写run()方法

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

package com.ssx01DuoXianChengShiXian;

//继承Thread类
public class MyThreadDemo {
    public static void main(String[] args) {
        //创建MyThread对象
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        //启动线程
//        my1.run();
//        my2.run();不是启动线程

        //启动线程
        //void start () 导致此线程开始执行,Java虚拟机调用此线程的run方法
        my1.start();
        my2.start();

    }
}

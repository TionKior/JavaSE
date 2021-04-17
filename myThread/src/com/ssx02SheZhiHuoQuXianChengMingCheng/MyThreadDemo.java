package com.ssx02SheZhiHuoQuXianChengMingCheng;

public class MyThreadDemo {
    public static void main(String[] args) {
        //无参创建对象
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//
//        //void setName(String name); 将此线程的名称更改为等于参数name
//        my1.setName("高铁");
//        my2.setName("飞机");

//        MyThread my1 = new MyThread("飞机");
//        MyThread my2 = new MyThread("高铁");
//
//        my1.start();
//        my2.start();

        //static Thread currentThread() 返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());

    }
}

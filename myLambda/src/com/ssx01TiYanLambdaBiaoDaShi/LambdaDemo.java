package com.ssx01TiYanLambdaBiaoDaShi;

//需求:启动一个线程,输出一句话,多线程程序启动了
public class LambdaDemo {
    public static void main(String[] args) {
        //实现类的方式实现需求
        //MyRunnable mr = new MyRunnable();
        //Thread t = new Thread(mr);
        //t.start();

        //匿名内部类方式改进
        //new Thread(new Runnable() {
        //    @Override
        //    public void run() {
        //        System.out.println("多线程程序启动了");
        //    }
        //}).start();

        //Lambda表达式的方式改进
        new Thread(() -> {
            System.out.println("多线程程序启动了");
        }).start();

    }
}

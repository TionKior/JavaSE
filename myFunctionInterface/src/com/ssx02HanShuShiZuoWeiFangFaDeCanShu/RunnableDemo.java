package com.ssx02HanShuShiZuoWeiFangFaDeCanShu;

//需求
//定义一个类(RunnableDemo), 在类中提供两个方法
//一个方法是: startThread(Runnable) 方法参数Runnable是一 个函数式接口
//一个方法是主方法,在主方法中调用startThread方法
public class RunnableDemo {
    public static void main(String[] args) {

        //在主方法中调用startThread方法

        //匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        });

        //Lambda表达式
        startThread(() -> System.out.println(Thread.currentThread().getName() + "线程启动了"));

    }

    private static void startThread(Runnable r) {
//        Thread t = new Thread(r);
//        t.start();
        new Thread(r).start();
    }
}

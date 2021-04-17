package com.ssx04XianChengKongZhi;

public class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            //static void sleep(long millis)使当前正在执行的线程停留 (暂停执行) 指定的毫秒数
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

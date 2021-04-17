package com.ssx11LockSuo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
    private int tickets = 100;
    //创建Lock锁对象
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                //Lock加锁
                lock.lock();
                if (tickets > 0) {
                    //因为里面可能会出现异常,要用try...finally...环绕(一定释放锁)
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                //Lock释放锁
                lock.unlock();
            }
        }
    }
}

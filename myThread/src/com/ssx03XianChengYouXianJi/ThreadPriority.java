package com.ssx03XianChengYouXianJi;

public class ThreadPriority extends Thread {
    public ThreadPriority() {
    }

    public ThreadPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}

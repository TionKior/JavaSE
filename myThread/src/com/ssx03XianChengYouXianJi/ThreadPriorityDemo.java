package com.ssx03XianChengYouXianJi;

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        ThreadPriority tp1 = new ThreadPriority("高铁");
        ThreadPriority tp2 = new ThreadPriority("飞机");
        ThreadPriority tp3 = new ThreadPriority("汽车");


        //public final void setPriority(int newPriority); 更改此线程的优先级
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);


        //public final int getPriority(); 返回此线程的优先级
//        System.out.println(tp1.getPriority());
//        System.out.println(tp2.getPriority());
//        System.out.println(tp3.getPriority());

        tp1.start();
        tp2.start();
        tp3.start();
    }
}

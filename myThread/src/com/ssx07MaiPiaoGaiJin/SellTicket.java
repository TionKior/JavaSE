package com.ssx07MaiPiaoGaiJin;

//定义一个类SellTicket实现Runnable接口,定义private int tickets = 100;
public class SellTicket implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        //相同的票出现了多次
//        while (true) {
//            //tickets = 100;
//            //t1,t2,t3
//            //假设t1线程抢到了CPU的执行权
//            if (tickets > 0) {
//                //通过sleep();方法模拟出票时间
//                try {
//                    Thread.sleep(100);
//                    //t1线程休息100毫秒
//                    //t2线程抢到了CPU执行权,t2线程开始执行,到这里t2线程休息100毫秒
//                    //t3线程抢到了CPU执行权,t3线程开始执行,到这里t3线程休息100毫秒
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //假设线程按照顺序醒过来
//                //t1抢到CPU执行权,在控制台输出,窗口1正在出售第100张票
//                //t2抢到CPU执行权,在控制台输出,窗口2正在出售第100张票
//                //t3抢到CPU执行权,在控制台输出,窗口3正在出售第100张票
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                tickets--;
//                //如果这三个线程还是按照顺序来,执行了3次--的操作,最终票就变成了97
//            }
//        }

        //卖的票出现负数
        while (true) {
            //tickets = 1;
            //t1,t2,t3
            //假设t1线程抢到了CPU的执行权
            if (tickets > 0) {
                //通过sleep();方法模拟出票时间
                try {
                    Thread.sleep(100);
                    //t1线程休息100毫秒
                    //t2线程抢到了CPU执行权,t2线程开始执行,到这里t2线程休息100毫秒
                    //t3线程抢到了CPU执行权,t3线程开始执行,到这里t3线程休息100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //假设线程按照顺序醒过来
                //t1抢到CPU执行权,在控制台输出,窗口1正在出售第1张票
                //t1还是抢到了CPU执行权,会做tickets--;
                //t2抢到CPU执行权,在控制台输出,窗口2正在出售第0张票
                //t2还是抢到了CPU执行权,会做tickets--;
                //t3抢到CPU执行权,在控制台输出,窗口3正在出售第-1张票
                //t3还是抢到了CPU执行权,会做tickets--;
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
                //如果这三个线程还是按照顺序来,执行了3次--的操作,最终票就变成了97
            }
        }
    }
}

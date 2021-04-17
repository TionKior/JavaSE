package com.ssx06MaiPiao;

//定义一个类SellTicket实现Runnable接口,定义private int tickets = 100;
public class SellTicket implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        //票大于0,买票,告知哪个窗口
        //卖了票后,总票数-1;
        //票没有了,也可能有人来问,用死循环让买票一直执行
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
        }
    }
}

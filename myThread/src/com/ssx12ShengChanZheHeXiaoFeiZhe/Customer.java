package com.ssx12ShengChanZheHeXiaoFeiZhe;

//消费者类
//实现Runnable接口,重写run()方法,调用获取牛奶的操作
public class Customer implements Runnable {
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true) {
            b.get();
        }
    }
}

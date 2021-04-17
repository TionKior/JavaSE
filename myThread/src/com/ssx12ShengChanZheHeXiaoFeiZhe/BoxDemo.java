package com.ssx12ShengChanZheHeXiaoFeiZhe;

//测试类
public class BoxDemo {
    public static void main(String[] args) {

        //创建奶箱对象,这是共享区域区域
        Box b = new Box();

        //创建生产者对象,把奶箱对象作为构造方法参数传递,因为在这个类中要调用存储牛奶的操作
        Producer p = new Producer(b);

        //创建消费者对象,把奶箱对象作为构造方法参数传递,因为在这个类中要调用获取牛奶的操作
        Customer c = new Customer(b);

        //创建2个线程对象,分别把生产者对象和消费者对象作为构造方法参数传递
        Thread t1 = new Thread(p, "生产者");
        Thread t2 = new Thread(c, "消费者");


        //启动线程
        t1.start();
        t2.start();

    }
}

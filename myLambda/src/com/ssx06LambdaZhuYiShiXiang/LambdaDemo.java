package com.ssx06LambdaZhuYiShiXiang;

public class LambdaDemo {
    public static void main(String[] args) {
//        useInter(()->{
//            System.out.println("好好学习,天天向上");
//        });
        //使用Lambda必须要有接口,并且要求接口中有且仅有一个抽象方法
        useInter(() -> System.out.println("好好学习,天天向上"));

        //必须有上下文环境,才能推导出Lambda对应接口
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }).start();
        //必须有上下文环境,才能推导出Lambda对应接口
        Runnable r = () -> System.out.println("Lambda表达式");
        new Thread(r).start();
        //根据构造方法的参数推断得知Lambda表达式对应接口
        new Thread(()-> System.out.println("Lambda表达式")).start();
    }

    private static void useInter(Inter i) {
        i.show();
    }
}

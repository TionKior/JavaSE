package com.ssx05jiaolian;
//篮球运动员
public class BaskAth extends Athletes{
    public BaskAth() {
    }

    public BaskAth(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃东西");
    }

    @Override
    public void study() {
        System.out.println("学篮球");
    }
}

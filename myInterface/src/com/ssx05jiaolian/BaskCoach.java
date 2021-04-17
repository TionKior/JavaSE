package com.ssx05jiaolian;
//篮球教练类
public class BaskCoach extends Coach{
    public BaskCoach() {
    }

    public BaskCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃东西");
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }


}

package com.ssx05jiaolian;
//抽象教练类
public abstract class Coach extends People{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();

}

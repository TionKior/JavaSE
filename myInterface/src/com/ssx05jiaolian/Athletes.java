package com.ssx05jiaolian;
//抽象运动员类
public abstract class Athletes extends People{
    public Athletes() {
    }

    public Athletes(String name, int age) {
        super(name, age);
    }
    public abstract void study();

}

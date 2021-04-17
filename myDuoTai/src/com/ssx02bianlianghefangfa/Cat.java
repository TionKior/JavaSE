package com.ssx02bianlianghefangfa;

public class Cat extends Animal{
    public  int age = 20;
    public  int weight = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("捉迷藏");
    }
}

package com.ssx03chengyuan;

public abstract class Animal {

    public Animal(){}

    public Animal(int age){
        this.age=age;
    }


    private int age = 20;
    private final String city="北京";

    public void show(){
        age=40;
        System.out.println(age);
        //city="上海";
        System.out.println(city);

    }
    public abstract void eat();

}

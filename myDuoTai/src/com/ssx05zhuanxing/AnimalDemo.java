package com.ssx05zhuanxing;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a =new Cat();
        a.eat();

        Cat c = (Cat)a;
        c.eat();
        c.playGame();

        a= new Dog();
        a.eat();


        /*
        此时是狗是a对象,不能强制类型转换
        Cat cc = (Cat)a;
        cc.eat();
        cc.playGame();
         */
    }
}

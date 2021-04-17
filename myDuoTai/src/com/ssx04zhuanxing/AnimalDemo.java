package com.ssx04zhuanxing;

public class AnimalDemo {
    public static void main(String[] args) {

        Animal a = new Cat();
        a.eat();

        Cat c = (Cat) a;
        c.eat();
        c.playGame();
    }
}

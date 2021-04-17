package com.ssx02chouxiangleifanhui;

public class AnimalDemo {
    public static void main(String[] args) {

        AnimalOperator ao=new AnimalOperator();
        Animal a=new Cat();
        ao.useAnimal(a);

        Animal a2 = ao.getAnimal();//new Cat();
        a2.eat();
    }

}

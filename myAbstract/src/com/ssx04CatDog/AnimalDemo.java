package com.ssx04CatDog;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        System.out.println("---------");

        a=new Cat("加菲猫",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Animal a1=new Dog("狗",5);
        System.out.println(a1.getName()+","+a1.getAge());
        a1.eat();
    }
}

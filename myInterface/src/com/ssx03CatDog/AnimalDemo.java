package com.ssx03CatDog;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j = new Cat();
        j.jump();

        Animal a=new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a=new Cat("加菲猫",5);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        Cat c = new Cat();
        c.setName("加菲猫");
        c.setAge(5);
        c.eat();
        c.jump();

        Dog d=new Dog("狗",10);
        System.out.println(d.getName()+","+d.getAge());
        d.jump();
        d.eat();
    }
}

package com.ssx06CatDog;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        a = new Cat("加菲猫", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a=new Dog();
        a.setName("狗");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        a = new Dog("狗", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

    }
}

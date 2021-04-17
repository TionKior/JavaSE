package com.ssx11DogCat;

public class Demo {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.setName("猫");
        c.setAge(10);
        System.out.println(c.getName()+","+c.getAge());
        c.zhualaoshu();
        Cat c1=new Cat("猫",11);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.zhualaoshu();

        Dog d=new Dog("狗",10);
        System.out.println(d.getName()+","+d.getAge());
        d.kanmen();
        Dog d1=new Dog();
        d1.setName("狗");
        d1.setAge(11);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.kanmen();
    }
}

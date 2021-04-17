package com.ssx01;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p=new Phone();

        System.out.println(p.brand);
        System.out.println(p.price);


        p.brand="荣耀";
        p.price=1369;
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.sendMessage();
    }
}

package com.ssx02jiekouchengyuan;

public class InterfaceDemo {
    public static void main(String[] args) {

        Inter i=new InterImpl();

        System.out.println(i.num);

        System.out.println(i.num2);

        System.out.println(Inter.num);
    }
}

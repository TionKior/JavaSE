package com.ssx02Integer;

public class IntegerDemo {
    public static void main(String[] args) {
        /*
        Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2=new Integer("100");
        Integer i2=new Integer("abc")；
        System.out.println(i2);
        */

        Integer i1=Integer.valueOf(100);
        System.out.println(i1);

        Integer i2=Integer.valueOf("123");
        System.out.println(i2);


    }
}

package com.ssx01;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("--------");

        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------");

        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));
        System.out.println("--------");

        System.out.println(Math.round(12.34F));
        System.out.println(Math.round(12.56F));
        System.out.println("--------");

        System.out.println(Math.max(66,88));
        System.out.println("--------");

        System.out.println(Math.min(66,88));
        System.out.println("--------");

        System.out.println(Math.pow(2.0,3.0));
        System.out.println("--------");

        System.out.println(Math.random());
        System.out.println(Math.random()*100);
        System.out.println((int)(Math.random()*100)+1);
        System.out.println("--------");
    }
}

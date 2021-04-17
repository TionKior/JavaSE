package com.ssx02;

public class Student {
    private String name="史晟贤";

    private static String university="传智大学";

    public void show1(){

    }
    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }
    public static void show3(){

        System.out.println(university);

        show3();
    }
    public static void show4(){

    }

}

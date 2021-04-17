package com.ssx01;

public class StaticDemo {
    public static void main(String[] args) {

        Student.university="传智大学";
        Student s1=new Student();
        s1.name="史晟贤";
        s1.age=30;
        //s1.university="传智大学";
        s1.show();

        Student s2=new Student();
        s2.name="史晟";
        s2.age=18;

        s2.show();
    }

}

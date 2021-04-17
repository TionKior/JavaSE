package com.ssx05gouzaofangfa;

public class StudentDemo {
    public static void main(String[] args) {
        //方法重载

        Student s1=new Student();//无参
        s1.show();

        Student s2=new Student("史晟贤");
        s2.show();

        Student s3=new Student(18);
        s3.show();

        Student s4=new Student("史晟贤",18);
        s4.show();
    }
}

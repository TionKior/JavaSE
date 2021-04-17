package com.ssx06;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("史晟贤");
        s1.setAge(18);
        s1.show();

        Student s2 = new Student("史晟贤", 18);
        s2.show();
    }
}

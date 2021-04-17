package com.ssx09TeacherStudent;

public class Student {
    private Student name;
    private int age;

    public Student() {
    }

    public Student(Student name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getName() {
        return name;
    }

    public void setName(Student name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void Study(){
        System.out.println("好好学习");
    }
}

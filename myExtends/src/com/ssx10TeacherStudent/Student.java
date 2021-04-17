package com.ssx10TeacherStudent;

public class Student extends Person{
    public Student(){}
    public Student(String name,int age){
        super(name,age);
    }
    public void Study(){
        System.out.println("好好学习");
    }
}

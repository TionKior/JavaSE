package com.ssx08ArrayListStudent;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        Student s1 = new Student("史晟贤", 18);
        Student s2 = new Student("史晟", 19);
        Student s3 = new Student("史", 20);

        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator<Student> it = array.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");
        for (Student s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }


    }
}
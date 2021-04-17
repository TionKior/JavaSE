package com.ssx09LinkedListStudent;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> linkedList = new LinkedList<Student>();
        Student s1 = new Student("史晟贤", 18);
        Student s2 = new Student("史晟", 19);
        Student s3 = new Student("史", 20);

        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);

        Iterator<Student> it = linkedList.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");
        for (int i = 0; i < linkedList.size(); i++) {
            Student s = linkedList.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("--------");
        for (Student s : linkedList) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}

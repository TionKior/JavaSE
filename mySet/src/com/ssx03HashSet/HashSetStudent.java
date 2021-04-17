package com.ssx03HashSet;

import java.util.HashSet;

public class HashSetStudent {
    public static void main(String[] args) {
        HashSet<Student> hs= new HashSet<Student>();

        Student s1=new Student("史晟贤",18);
        Student s2=new Student("史晟",19);
        Student s3=new Student("史",20);
        Student s4=new Student("史",20);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for (Student s :hs) {
            System.out.println(s.getName()+","+s.getAge());
        }


    }
}

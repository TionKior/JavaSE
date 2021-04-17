package com.ssx03XueShengJiHeLiBian;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//存储学生对象集合,遍历该集合
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();
        Student s1 = new Student("史晟贤",18);
        Student s2 = new Student("史晟",19);
        Student s3 = new Student("史",20);
        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}

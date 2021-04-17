package com.ssx06Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<Student>();

        Student s1=new Student("史晟贤",18);
        Student s2=new Student("史晟",19);
        Student s3=new Student("史",20);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        //迭代器  集合特有的方式
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("--------");
        //普通for 带有索引的遍历方式
        for(int i=0;i<list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("--------");
        //增强for 最方便的遍历方式
        for (Student s :list) {
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("--------");
    }
}

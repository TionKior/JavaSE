package com.ssx07ScoreBiJiaoQiPaiXu;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
//                int num = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getMath());
//                主要条件
                int num = s2.getSum() - s1.getSum();
//                次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3=num2==0?s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });
        Student s1 = new Student("史晟贤", 98, 100);
        Student s2 = new Student("史晟额", 95, 95);
        Student s3 = new Student("史个个", 100, 93);
        Student s4 = new Student("我个人", 100, 97);
        Student s5 = new Student("我份额", 98, 98);

        Student s6 = new Student("我动物", 97, 99);
        Student s7 = new Student("赵云", 97, 99);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getSum());
        }


    }
}

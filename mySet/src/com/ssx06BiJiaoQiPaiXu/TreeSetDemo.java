package com.ssx06BiJiaoQiPaiXu;

import java.util.Comparator;
import java.util.TreeSet;

//按照年龄从小到大排序,年龄相同时,按姓名字母顺序排序
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override                               //匿名内部类
            public int compare(Student s1, Student s2) {
                //s1就是this   s2就是s
                int num = s1.getAge() - s2.getAge();//0重复 1升序 -1降序
//              年龄重复则比较姓名
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaojun", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);

        Student s5 = new Student("shishengxian", 33);
        Student s6 = new Student("shishengxian", 33);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for (Student s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
}

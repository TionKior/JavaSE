package com.ssx09TeacherStudent;

public class Demo {
    public static void main(String[] args) {

        Teacher t1 = new Teacher();
        t1.setName("史晟贤");
        t1.setAge(18);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("鬼厉", 20);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();
    }
}

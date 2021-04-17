package com.ssx02equals;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("史晟贤");
        s1.setAge(18);


        Student s2=new Student();
        s2.setName("史晟贤");
        s2.setAge(18);

        //System.out.println(s1==s2); 比较的是地址值不是内容
        System.out.println(s1.equals(s2));

        /*
        * public boolean equals(Object obj) {
        * this ---s1
        * obj  --- s2
        * //还是地址值
        return (this == obj);
    }
        */
    }
}

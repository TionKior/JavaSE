package com.ssx05jiaolian;
//测试类
public class PersonDemo {
    public static void main(String[] args) {
        PingpangAth p = new PingpangAth();
        p.setName("史晟贤");
        p.setAge(18);
        System.out.println(p.getName()+","+p.getAge());
        p.eat();
        p.study();
        p.speakEng();
        System.out.println("-----------");
        PingpangAth pp=new PingpangAth("史晟贤",19);
        System.out.println(pp.getName()+","+pp.getAge());
        p.eat();
        p.study();
        p.speakEng();
        System.out.println("-----------");
        BaskAth ba=new BaskAth("史晟",18);
        System.out.println(ba.getName()+","+ba.getAge());
        ba.eat();
        ba.study();
        System.out.println("-----------");
        PingpangCoach p1=new PingpangCoach("史晟贤教练",20);
        System.out.println(p1.getName()+","+p1.getAge());
        p1.eat();
        p1.teach();
        p1.speakEng();
        System.out.println("-----------");
        BaskCoach ba1=new BaskCoach("史晟贤教练",21);
        ba1.eat();
        ba1.teach();

    }
}

package com.ssx05jiaolian;
//乒乓球运动员
public class PingpangAth extends Athletes implements speakEnglish {
    public PingpangAth() {
    }

    public PingpangAth(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("学乒乓球");
    }

    @Override
    public void speakEng() {
        System.out.println("乒乓球运动员说英语");
    }
}

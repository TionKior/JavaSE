package com.ssx05jiaolian;
//乒乓球教练
public class PingpangCoach extends Coach implements speakEnglish {
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void teach() {
        System.out.println("教乒乓球");
    }


    @Override
    public void speakEng() {
        System.out.println("乒乓球教练说英语");
    }
}

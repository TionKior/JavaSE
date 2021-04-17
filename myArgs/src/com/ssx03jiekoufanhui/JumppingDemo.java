package com.ssx03jiekoufanhui;

public class JumppingDemo {
    public static void main(String[] args) {

        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();
        jo.useJumpping(j);

        Jumpping j2 = jo.getJumpping(); //new Cat();
        j2.jump();

    }
}

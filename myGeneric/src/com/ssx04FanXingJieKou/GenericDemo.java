package com.ssx04FanXingJieKou;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new GenericImpl<String>();
        g1.show("史晟贤");

        Generic<Integer> g2 = new GenericImpl<>();
        g2.show(18);

        System.out.println("----------");

        Generic g = new GenericImpl();
        g.show("史晟贤");
        g.show(18);
        g.show(12.34);

    }
}

package com.ssx05NiMingNeiBuKaiFa;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();
        jo.method(j);
        Jumpping j2=new Dog();
        jo.method(j2);
        System.out.println("--------");

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫会跳高了");
            }
        });
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗会跳高了");
            }
        });
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("我会跳高了");
            }
        });
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("跳高");
            }
        });
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("跳高");
            }
        });
    }
}


package com.ssx04gouzaofangfa;

public class Zi extends Fu{

    public Zi() {
        //super();
        super(18);
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi(int age) {
        super();
        //super(18);
        System.out.println("Zi中带参构造方法被调用");
    }
}

package com.ssx04FanXingJieKou;

public class GenericImpl <T> implements Generic<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}

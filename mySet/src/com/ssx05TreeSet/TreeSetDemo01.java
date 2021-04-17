package com.ssx05TreeSet;

import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {

        TreeSet<Integer> ts=new TreeSet<Integer>();

        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        ts.add(30);

        for (int i :ts) {
            System.out.println(i);
        }

    }
}

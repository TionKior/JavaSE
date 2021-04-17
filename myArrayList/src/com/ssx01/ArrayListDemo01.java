package com.ssx01;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        //System.out.println(array.add("hello"));
        System.out.println(array);
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add(1,"javaee");
        System.out.println(array);
    }
}

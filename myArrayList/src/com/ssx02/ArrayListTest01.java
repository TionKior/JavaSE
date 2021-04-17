package com.ssx02;

import java.util.ArrayList;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("史晟贤");
        array.add("java");
        array.add("python");
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }

    }
}

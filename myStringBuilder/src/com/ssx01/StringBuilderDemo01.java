package com.ssx01;

import jdk.swing.interop.SwingInterOpUtils;

public class StringBuilderDemo01 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        System.out.println(str.length());

        StringBuilder str2=new StringBuilder("hello");
        System.out.println(str2);
        System.out.println(str2.length());

    }
}

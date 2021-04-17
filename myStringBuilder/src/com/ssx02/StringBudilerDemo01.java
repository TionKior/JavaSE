package com.ssx02;

public class StringBudilerDemo01 {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder();
        sb.append("ssx");
        String s1= sb.toString();


        String s="ssx";
        StringBuilder sb1=new StringBuilder(s);
        System.out.println(sb);
    }
}

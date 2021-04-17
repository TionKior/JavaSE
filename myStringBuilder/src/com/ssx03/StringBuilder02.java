package com.ssx03;

import java.util.Scanner;

public class StringBuilder02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String line = sc.nextLine();
        String s = reverse(line);
        System.out.println(s);
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}

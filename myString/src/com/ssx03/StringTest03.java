package com.ssx03;

import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        int bigcount = 0, smallcount = 0, numbercount = 0, qitacount = 0;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigcount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallcount++;
            } else if (ch >= '0' && ch <= '9') {
                numbercount++;
            } else {
                qitacount++;
            }
        }
        System.out.println("有大写字符" + bigcount + "个");
        System.out.println("有小写字符" + smallcount + "个");
        System.out.println("有数字" + numbercount + "个");
        System.out.println("有其他字符" + qitacount + "个");

    }
}

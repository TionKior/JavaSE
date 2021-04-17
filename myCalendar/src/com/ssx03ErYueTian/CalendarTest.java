package com.ssx03ErYueTian;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        //从键盘输入年份
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();

        //设置日历对象年月日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        //3月1日往前推一天,就是二月最后一天
        c.add(Calendar.DATE,-1);

        //获取这一天
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年二月份有"+date+"天");
    }
}

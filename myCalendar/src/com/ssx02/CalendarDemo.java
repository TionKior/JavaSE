package com.ssx02;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();//多态形式得到对象
        //System.out.println(c);

        //三年前的今天
//        c.add(Calendar.YEAR,-3);//减了三年
//
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;//月份是从0开始的
//        int date = c.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");

        //十年后的五天前
//        c.add(Calendar.YEAR,10);
//        c.add(Calendar.DATE,-5);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH)+1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year+"年"+month+"月"+date+"日");

        //set方法
        c.set(2021, 11, 11);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");
    }
}

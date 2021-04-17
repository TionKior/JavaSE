package com.ssx01;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //获取日历类对象
        Calendar c = Calendar.getInstance();//多态形式得到对象
        //System.out.println(c);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;//月份是从0开始的
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");

    }
}

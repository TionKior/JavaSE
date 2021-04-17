package com.ssx01;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        /*
        Date构造方法
        public Date()分配一个Date对象,初始化，以便它代表它被分配的时间,精确到毫秒
        public Date(Long date)分配一个Date对象,初始化从标准基准时间起指定的毫秒数
        */

        Date d1 = new Date();
        System.out.println(d1);//重写了toString方法
        long date = 1000 * 60 * 60;
        Date d2 = new Date(date);
        System.out.println(d2);
    }
}

package com.ssx02RiQiGongJuLei;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d= new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);

        System.out.println("----------");

        String s = "2021-1-18 11:11:11";
        Date dd = DateUtils.StringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}

package com.ssx01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormat {
    public static void main(String[] args) throws ParseException {
        //格式化,从Date到String
        Date d = new Date();
        //SimpleDateFormat sdf=new SimpleDateFormat();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("----------");

        //解析,从String到Date
        String ss ="2021-1-18 8:44:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);
    }
}

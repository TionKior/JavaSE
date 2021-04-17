package com.ssx02RiQiGongJuLei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){};

    //日期转化成指定格式字符串             format是要输入的日期格式
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }

    //字符串解析为指定格式的日期
    public static Date StringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }
}

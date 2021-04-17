package com.ssx02YiChangChuLi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo03 {
    public static void main(String[] args) {
        method();
        method2();
    }

    //编译时异常
    public static void method2(){
        String s = "2048-08-09";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
    }
    //运行时异常
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//非受检异常,运行时异常
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}

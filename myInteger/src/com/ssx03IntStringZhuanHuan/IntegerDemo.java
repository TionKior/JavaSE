package com.ssx03IntStringZhuanHuan;

public class IntegerDemo {
    public static void main(String[] args) {
        //int --- String
        int num = 100;
        //方法1
        String s1 = "" + num;
        System.out.println(s1);
        //方法2
        String s2 = String.valueOf(num);
        System.out.println(s2);
        System.out.println("-----");
        //String --- int
        String s = "100";
        //方法1
        //String --- Integer --- int
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);
        //方式2
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}

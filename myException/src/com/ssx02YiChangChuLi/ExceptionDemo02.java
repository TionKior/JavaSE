package com.ssx02YiChangChuLi;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException("xxx");
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println("你访问的数组索引处不存在");
            //e.printStackTrace();
            //返回出现异常的原因 getMessage
            //System.out.println(e.getMessage());
            //Index 3 out of bounds for length 3

            //toString返回此可抛出的简短描述
            //System.out.println(e.toString());
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

            //printStackTrace 错误信息输出在控制台
            e.printStackTrace();
        }
    }

}

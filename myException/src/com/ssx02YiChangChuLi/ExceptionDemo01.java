package com.ssx02YiChangChuLi;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println("你访问的数组索引处不存在");
            e.printStackTrace();
        }
    }
}

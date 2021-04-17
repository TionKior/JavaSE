package com.ssx01;

public class ArrDemo {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55};
        bianli(a);
    }

    public static void bianli(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }
}
package com.ssx01;

public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        fanzhuan(arr);
        printarr(arr);
    }

    public static void printarr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.println("]");
    }
    public static void fanzhuan(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}

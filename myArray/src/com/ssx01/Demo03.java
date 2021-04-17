package com.ssx01;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = find(arr, n);
        System.out.println("这个数在数组第" + index + "个位置");
    }
    public static int find(int[] arr, int n) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i;
                break;
            }
        }
        return index;
    }
}

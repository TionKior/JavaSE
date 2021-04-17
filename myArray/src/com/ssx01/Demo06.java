package com.ssx01;

import java.util.Scanner;

public class Demo06 {
    public static void main(String[] args) {
        int[] a = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个评委打分");
            a[i] = sc.nextInt();
        }
        int max = max(a);
        int min = min(a);
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        int avg = (sum - max - min) / 4;
        System.out.println("平均分是" + avg);
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        return min;
    }
}

package com.ssx01;

public class Demo02 {
    public static void main(String[] args) {
        int[] a={4,65,4165,156,1,56,156,156};
        System.out.println(Max(a));
    }
    public static int Max(int[]arr){
        int max=arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }

        return max;
    }
}

package com.ssx01;

public class DiGuiDemo {
    public static void main(String[] args) {
        //不死身兔
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[19]);
        //递归
        System.out.println(f(20));
    }

    //定义一个方法f(n),表示第n个月的兔子对数
    //第n-1个月兔子对数就是f(n-1)
    //StackOverflowError 当堆栈溢出发生时抛出一个应用程序递归太深
    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}

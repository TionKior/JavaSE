package com.ssx02Arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] arr={1,321,65,16,51,56,465,456,1};

        System.out.println("排序前"+ Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("排序后"+Arrays.toString(arr));

    }
}

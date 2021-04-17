package com.ssx03Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        


        for (int i :arr) {
            System.out.println(i);
        }


    }
}

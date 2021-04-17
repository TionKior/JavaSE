package com.ssx01;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        int[] a=new int[10];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i< a.length;i++){
             a[i]= sc.nextInt();
        }
        sort(a,a.length);
        for (int j : a) {
            System.out.print(j + " , ");
        }
    }
    public static void sort(int[] arr,int n){
        for(int  i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }
    }
}

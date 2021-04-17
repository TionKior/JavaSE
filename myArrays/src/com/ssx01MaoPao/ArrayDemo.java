package com.ssx01MaoPao;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr={10,50,2,1,0,600,12356,2,80,600,600,123,13,21,32,132,123,132};
        System.out.println("排序前"+arrayToString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("排序后"+arrayToString(arr));
    }


    //arrToString 是StringBuilder添加字符然后转化成String返回
    public static String arrayToString(int[] arr) {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}


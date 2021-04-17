package com.ssx03;

public class StringBuilder01 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        String s=add(arr);
        System.out.println(s);
    }
    public static String add(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}

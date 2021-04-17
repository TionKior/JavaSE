package com.ssx03HashSet;

import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs=new HashSet<String>();
        
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");
        for (String s :hs) {
            System.out.println(s);
        }
    }
}

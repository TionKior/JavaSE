package com.ssx01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
       List集合特点
       有序:存储和取出元素顺序一致
       可重复:存储的元素可以重复
*/
public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }


    }
}

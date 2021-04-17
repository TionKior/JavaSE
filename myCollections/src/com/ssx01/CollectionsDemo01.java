package com.ssx01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
//        创建集合对象List
        List<Integer> list=new ArrayList<Integer>();
//        添加元素
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

//        Collections.sort(list);排序
//        Collections.sort(list);

//        Collections.reverse(list);反转
//        Collections.reverse(list);

//        Collections.shuffle(list);随机排序
        Collections.shuffle(list);

        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);


    }
}

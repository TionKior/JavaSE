package com.ssx03BingFaXiuGaiYiChang;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//并发修改异常
public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            if (s.equals("world")){
//                list.add("javaee");
//            }
//            使用了add 回导致 modCount++
//            实际修改次数和预计修改次数不相等
//        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}

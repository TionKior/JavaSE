package com.ssx07ArrayANDLinkList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //ArrayList迭代器
        Iterator<String> ait = array.iterator();
        while (ait.hasNext()) {
            String s = ait.next();
            System.out.println(s);
        }
        System.out.println("--------");
        //普通for循环
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("--------");
        //增强for循环
        for (String s : array) {
            System.out.println(s);
        }
        System.out.println("--------");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //LinkedList迭代器
        Iterator<String> lit = linkedList.iterator();
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("--------");
        //普通for循环
        for (int i = 0; i < linkedList.size(); i++) {
            String s = linkedList.get(i);
            System.out.println(s);
        }
        System.out.println("--------");
        //增强for循环
        for (String s : linkedList) {
            System.out.println(s);
        }


    }
}

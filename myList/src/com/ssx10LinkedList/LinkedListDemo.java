package com.ssx10LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");


        //开头添加指定元素 addFirst
//        linkedList.addFirst("javase");
//        //末尾添加指定元素 addLast
//        linkedList.addLast("javaee");


//        System.out.println(linkedList.getFirst());
//        System.out.println(linkedList.getLast());

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}

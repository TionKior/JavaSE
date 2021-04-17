package com.ssx01JiHeFangFa;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

//        System.out.println(c.add("hello"));
//        System.out.println(c.add("world"));
//        System.out.println(c.add("world"));
        c.add("hello");
        c.add("world");
        c.add("world");
//        System.out.println(c);

//         remove
//        System.out.println(c.remove("world"));
//        System.out.println(c.remove("javaee"));
//        System.out.println(c);

//        c.clear();
//        System.out.println(c.contains("world"));
//        System.out.println(c.contains("javaee"));
//        c.clear();
//        System.out.println(c.isEmpty());

        System.out.println(c.size());
        System.out.println(c);


    }
}

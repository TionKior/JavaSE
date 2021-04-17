package com.ssx02JiHeBianLiDieDaiQi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//集合遍历Iterator迭代器
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");

//        c.iterator(),返回集合中元素的迭代器,通过集合iterator()方法得到
//        通过iterator(); 返回 Iterator 具体的实现类
        Iterator<String> it = c.iterator();
        System.out.println(c);
//        next();  返回集合中下一个元素
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
//        NoSuchElementException  访问元素不存在
//        System.out.println(it.next());
//        boolean hasNext(); 如果迭代器有更多的元素,返回true

        //只要下一个有元素,始终为true 输出所有的元素
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

    }
}

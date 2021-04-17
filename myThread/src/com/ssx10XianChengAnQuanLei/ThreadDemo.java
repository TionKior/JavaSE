package com.ssx10XianChengAnQuanLei;

import java.util.*;

public class ThreadDemo {
    public static void main(String[] args) {
        //StringBuffer 线程安全类
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        //Vector 线程安全类
        Vector<String> v = new Vector<String>();
        ArrayList<String> array = new ArrayList<String>();

        //Hashtable 线程安全类
        Hashtable<String, String> ht = new Hashtable<String, String>();
        HashMap<String, String> hm = new HashMap<String, String>();

        //static <T> List<T> synchronizedList​(List<T> list) 返回由指定列表支持的同步（线程安全）列表。
        //调用这个方法后变成了线程安全的集合类
        Collections.synchronizedList(new ArrayList<String>());

        //static <K,V> Map<K,V> synchronizedMap​(Map<K,V> m) 返回由指定地图支持的同步（线程安全）映射。
        //调用这个方法后变成了线程安全的集合类
        Collections.synchronizedMap(new HashMap<String, String>());

        //static <T> Set<T> synchronizedSet​(Set<T> s) 返回由指定集合支持的同步（线程安全）集。
        //调用这个方法后变成了线程安全的集合类
        Collections.synchronizedSet(new HashSet<String>());

    }
}

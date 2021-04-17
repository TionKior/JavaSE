package com.ssx01;

import java.util.ArrayList;
import java.util.List;

//List对比Collection特有方法
public class ListDemo02TeYouFangFa {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

//     添加      list.add(1,"javaee");
//     删除      System.out.println(list.remove(1));
//     修改      System.out.println(list.set(1,"javaee"));
//     获得      System.out.println(list.get(1));

//        System.out.println(list);

        //遍历集合
        for(int i = 0 ;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}

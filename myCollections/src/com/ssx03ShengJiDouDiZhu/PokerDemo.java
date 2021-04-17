package com.ssx03ShengJiDouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerDemo {
    public static void main(String[] args) {
        //创建HashMap集合,键是编号,值是牌
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        //创建ArrayList集合,存储编号
        ArrayList<Integer> array = new ArrayList<Integer>();

        //创建花色数组和点数数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //从0开始往HashMap里面存储编号,并存储对应的牌,同时往ArrayList里面存储编号
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);
        //测试存储牌数
        //System.out.println(array.size());54

        //洗牌,洗的是编号,用Collections.shuffle()方法实现
        Collections.shuffle(array);

        //发牌(发的也是编号,为了保证编号是排序的,创建TreeSet集合接收)
        TreeSet<Integer> ssx1Set = new TreeSet<Integer>();
        TreeSet<Integer> ssx2Set = new TreeSet<Integer>();
        TreeSet<Integer> ssx3Set = new TreeSet<Integer>();
        //底牌
        TreeSet<Integer> dpSet = new TreeSet<Integer>();

        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);//x拿到的是ArrayList集合中的索引
            if (i >= array.size() - 3) {
                dpSet.add(x);
            } else if (i % 3 == 0) {
                ssx1Set.add(x);
            } else if (i % 3 == 1) {
                ssx2Set.add(x);
            } else if (i % 3 == 2) {
                ssx3Set.add(x);
            }
        }

        //调用方法看牌
        lookPoker("player1", ssx1Set, hm);
        lookPoker("player2", ssx2Set, hm);
        lookPoker("player3", ssx3Set, hm);
        lookPoker("底牌", dpSet, hm);
    }

    //定义方法看牌(遍历TreeSet集合,获取编号,到HashMap集合找对应的牌)
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是:");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}

package com.ssx02MoNiDouDiZhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
//        创建一个排盒,就是创建一个集合对象,用ArrayList集合实现
        ArrayList<String> array = new ArrayList<String>();
//        往牌盒装牌
        /*
            ♦2,♦3,♦4...♦K,♦A
            ♣2,...
            ♥2,...
            ♠2,...
            小王,大王
         */
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //定义点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        //拼接花色点数
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");
        /*
        测试牌盒中的牌
        System.out.println(array);
        System.out.println(array.size());54
        */

        //洗牌,把牌打散,从Collections的shuffle()方法实现
        Collections.shuffle(array);
        //System.out.println(array);

        //发牌,遍历集合,给三个玩家发牌
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        //斗地主需要底牌
        ArrayList<String> dpArray = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            //得到牌
            String poker = array.get(i);
            //首先需要取得底牌
            if (i >= array.size() - 3) {
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else if (i % 3 == 2) {
                player3.add(poker);
            }
        }

        //看牌,三个玩家分别遍历自己的牌,因为是三个,用方法实现
        lookPoker("player1", player1);
        lookPoker("player2", player2);
        lookPoker("player3", player3);
        lookPoker("底牌", dpArray);
    }

    //看牌的方法
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.print(name + "的牌是:");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}

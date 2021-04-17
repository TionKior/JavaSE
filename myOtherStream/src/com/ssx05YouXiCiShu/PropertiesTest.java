package com.ssx05YouXiCiShu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        //使用这个创建文件,每一次加载都会使count=0;
        //创建文件(破解)
        //createGameTxt();

        //从文件中读取数据到Properties集合,用load()方法实现
        Properties prop = new Properties();
        FileReader fr = new FileReader("myOtherStream\\game.txt");
        prop.load(fr);
        fr.close();

        //通过Properties集合获取到玩游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        //判断是否到三次了
        if (number >= 3) {
            //如果到了,给出提示,游戏试玩已结束,想玩请充值
            System.out.println("游戏试玩已结束,想玩请充值");
        } else {
            //玩游戏
            GuessNumber.start();

            //次数+1,重写写回文件,用Properties的store()方法实现
            number++;
            prop.setProperty("count", String.valueOf(number));
            FileWriter fw = new FileWriter("myOtherStream\\game.txt");
            prop.store(fw, null);
            fw.close();
        }
    }

    private static void createGameTxt() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("count", "0");
        FileWriter fw = new FileWriter("myOtherStream\\game.txt");
        prop.store(fw, null);
        fw.close();
    }
}

package com.ssx05YouXiCiShu;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        //猜数字游戏,要有猜的数字,用随机数生成,范围1到100
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        while (true) {
            //使用程序实现猜数字,每次都要输入猜测的数字值,用键盘录入实现
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字:");
            int guessNumber = sc.nextInt();

            //比较输入的数字和系统山城的随机数,需要使用分支语句,使用if...else...if...格式,根据不同情况猜测结果显示
            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}

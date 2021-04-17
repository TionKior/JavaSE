package com.ssx05ConsumerJieKou;

import java.util.function.Consumer;

//练习
//String[] strArray= {"林青霞,30", "张曼玉,35", "王祖贤,33"};
//字符串数组中有多条信息， 请按照格式:“姓名: XX年龄: XX"的格式将信息打印出来
//要求:
//把打印姓名的动作作为第一个Consumer接口的Lambda实例
//把打印年龄的动作作为第二个Consumer接口的Lambda实例
//将两个Consumer接口按照顺序组合到一起使用
public class ConsumerTest {
    public static void main(String[] args) {

        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33"};
        //Lambda表达式
        printInfo(strArray, (String str) -> {
            //用split进行分割.姓名拿到的是0索引的位置
            String name = str.split(",")[0];
            System.out.print("姓名:" + name);
            //注意左下角的, 代表是第二个Lambda表达式实现Consumer第二个参数
        }, (String str) -> {
            //用split进行分割.年龄拿到的是1索引的位置
            //因为拿到的是字符串数据,还需要转化成int类型数据
            int age = Integer.parseInt(str.split(",")[1]);
            System.out.println(",年龄:" + age);
        });

        System.out.println("---------------");

        //Lambda表达式省略
        printInfo(strArray, str -> System.out.print("姓名:" + str.split(",")[0]),
                str -> System.out.println(",年龄:" + Integer.parseInt(str.split(",")[1])));

    }

    private static void printInfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
        for (String str : strArray) {
            con1.andThen(con2).accept(str);
        }
    }
}

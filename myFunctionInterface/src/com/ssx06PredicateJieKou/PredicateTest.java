package com.ssx06PredicateJieKou;

import java.util.ArrayList;
import java.util.function.Predicate;

//String[] strArray= {"林青霞,30", "柳岩,34", "张曼玉,35","貂蝉,31", "王祖贤,33"};
//字符串数组中有多条信息,请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中, 并遍历ArrayList集合
//同时满足如下要求:姓名长大于2;年龄大于33
//分析
//有两个判断条件所以需要使用两个Predicate接口,对条件进行判断
//必须同时满足两个条件所以可以使用and方法连接两个判断条件
public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
        //因为要的是姓名长度大于2,所以要.length,而年龄大于33是int类型,要用Integer.parseInt包装成int类型
        //返回的是一个集合,用集合接收
        ArrayList<String> array = myFilter(strArray, s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 33);

        for (String str : array) {
            System.out.println(str);
        }

    }

    //返回值是一个集合
    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
        //定义一个集合
        ArrayList<String> array = new ArrayList<String>();

        //遍历数组
        for (String str : strArray) {
            //如果返回的是true,就添加到集合
            if (pre1.and(pre2).test(str)) {
                array.add(str);
            }
        }
        return array;
    }

}

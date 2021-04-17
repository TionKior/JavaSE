package com.ssx06StudentTxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayList {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("myCharStream\\students.txt"));
        //创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line = br.readLine()) != null) {
            //把读取到的字符串用split()进行分割,得到一个字符串数组
            String[] strArray = line.split(",");
            //创建学生对象
            Student s = new Student();
            //把字符串数组中的每一个元素取出来对应的赋值给学生对象的成员变量值
            //001,史晟贤,18,山西
            s.setSid(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));//年龄是int类型的,上面的是String类型数组,需要调用方法
            s.setAddress(strArray[3]);

            //把学生对象添加到集合
            array.add(s);
        }

        //释放资源
        br.close();

        //遍历集合
        for (Student s : array) {
            System.out.println(s.getSid() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
        }

    }
}

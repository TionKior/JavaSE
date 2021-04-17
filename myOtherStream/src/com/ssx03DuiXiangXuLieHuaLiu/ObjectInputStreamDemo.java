package com.ssx03DuiXiangXuLieHuaLiu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //创建对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherStream\\oos.txt"));

        //Object readObject (); 对象反序列化,从ObjectInputStream读取一个对象
        Object obj = ois.readObject();
        //把Object转成Student类型
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());

        //释放资源
        ois.close();
    }
}

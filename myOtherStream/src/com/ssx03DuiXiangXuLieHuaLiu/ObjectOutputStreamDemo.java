package com.ssx03DuiXiangXuLieHuaLiu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//NotSerializableException:抛出一个实例需要一个Serializable接口
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        //创建对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myOtherStream\\oos.txt"));

        //创建对象
        Student s = new Student("史晟贤", 18);
        //void writeObject (Object obj); 序列化对象方法,将指定的对象写入ObjectOutputStream
        oos.writeObject(s);

        //释放资源
        oos.close();

    }
}

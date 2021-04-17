package com.ssx03DuiXiangXuLieHuaLiu;

import java.io.*;
//修改了学生类后:InvalidClassException:
// com.ssx03DuiXiangXuLieHuaLiu.Student; local class incompatible:
// stream classdesc
// serialVersionUID = -5326650499242893456, 序列化ID
// local class serialVersionUID = 4189078310635552306
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //write();
        read();
    }

    //反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myOtherStream\\oos.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }

    //序列化
    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myOtherStream\\oos.txt"));
        Student s = new Student("史晟贤", 18);
        oos.writeObject(s);
        oos.close();
    }
}

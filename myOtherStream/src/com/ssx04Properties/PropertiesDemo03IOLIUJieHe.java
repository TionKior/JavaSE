package com.ssx04Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo03IOLIUJieHe {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        mystore();
        //把文件中的数据加载到集合
        myLoad();

    }
    //把文件中的数据加载到集合
    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        //void Load(Reader reader);
        FileReader fr = new FileReader("myOtherStream\\fw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }
    //把集合中的数据保存到文件
    private static void mystore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("001", "史晟贤");
        prop.setProperty("002", "史晟");
        prop.setProperty("003", "史");

        //void store(Writer writer, String comments);
        FileWriter fw = new FileWriter("myOtherStream\\fw.txt");
        prop.store(fw, null);

        fw.close();
    }
}

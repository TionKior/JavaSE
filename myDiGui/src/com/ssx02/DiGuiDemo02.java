package com.ssx02;
//递归遍历目录

import java.io.File;

public class DiGuiDemo02 {
    public static void main(String[] args) {
        //根据给定路径创建一个File对象
        File srcFile = new File("D:\\下载");

        //调用方法
        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File srcFile) {
        //获取给定的File目录下所有的文件或目录的File数组
        File[] fileArray = srcFile.listFiles();
        //遍历File数组,得到每一个File对象
        if (fileArray != null) {
            for (File file : fileArray) {
                //判断该File对象是否是目录
                if (file.isDirectory()) {
                    //是目录,递归调用
                    getAllFilePath(file);
                } else {
                    //不是目录,获取绝对路径
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}

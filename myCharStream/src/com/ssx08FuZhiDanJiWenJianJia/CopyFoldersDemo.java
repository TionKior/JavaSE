package com.ssx08FuZhiDanJiWenJianJia;

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        //数据源
        File srcFile = new File("D:\\JavaDemo");
        //目的地
        File destFile = new File("C:\\");
        //写方法实现文件夹复制,参数就是File对象和目的地File对象
        copyFolder(srcFile, destFile);

    }

    //复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        //判断是否是目录(下方是目录的情况)
        if (srcFile.isDirectory()) {
            //目的地创建和数据源File名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);//C:\\ssx
            //如果文件夹不存在就创建它
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            //获取数据源File下所有文件或者目录的File数组
            File[] fileArray = srcFile.listFiles();

            //遍历该File数组,得到每一个File对象
            //可能是文件也可能是文件夹
            for (File file : fileArray) {
                //把该File作为数据源File对象,递归调用复制文件夹的方法
                copyFolder(file, newFolder);
            }
        } else {
            //下方是文件的情况,直接复制,用字节流
            //destFile是父目录路径,srcFile.getName是子文件名
            File newFile = new File(destFile, srcFile.getName());//目的地
            copyFile(srcFile, newFile);
        }
    }

    //字节缓冲流复制文件
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();
    }
}

package com.ssx08FuZhiDanJiWenJianJia;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //创建数据源目录File对象,D:\\ssx
        File srcFolder = new File("D:\\ssx");

        //获取数据源目录名称
        String srcFolderName = srcFolder.getName();

        //创建目的地File对象,模块下
        File destFolder = new File("myCharStream", srcFolderName);

        //判断目的地目录对应的File是否存在,如果不在就创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }
        //获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();

        //遍历File数组,得到每一个File对象,就是数据源文件

        for (File srcFile : listFiles) {
            //D:\\ssx\\1.jpg
            //获取数据源文件File对象的名称(1.jpg)
            String srcFileName = srcFile.getName();

            //创建目的地文件File对象
            File destFile = new File(destFolder, srcFileName);

            //复制文件
            copyFile(srcFile, destFile);
        }

        //复制文件
    }

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

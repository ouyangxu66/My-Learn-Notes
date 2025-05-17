package com.learn.a_file;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        File file01 = new File("1.txt");
        System.out.println(file01.getAbsolutePath());//获取绝对路径

        File file02 = new File("C:\\Users\\xu\\Desktop\\javaresource","1.jpg");
        System.out.println(file02.getName());//获取文件或文件夹名称,定位到最后一个文件或文件夹

        File file03 = new File("io\\1.txt");
        System.out.println(file03.getPath());//获取封装路径,new File对象时是啥路径就获取啥路径

        File file4 = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        System.out.println(file4.length());//获取文件的字节数
    }
}

package com.learn.a_file;

import java.io.File;
import java.io.IOException;

public class Demo04File {
    public static void main(String[] args) throws IOException {
        //file01();
        //file2();
        //file03();
        file04();
    }

    private static void file04() {
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\haha");
        String[] files = file.list();//String[] list() -> 遍历指定的文件夹,返回的是String数组
        for (String s : files) {
            System.out.println(s);
        }
        System.out.println("=================================");
        File[] files1 = file.listFiles();//File[] listFiles() ->遍历指定的文件夹,返回的是File数组 -> 推荐使用
        for (File f : files1) {
            System.out.println(f);
        }

    }

    private static void file03() {
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        System.out.println(file.isFile());//true
        System.out.println(file.isDirectory());//false
        System.out.println(file.exists());//true
    }

    private static void file2() throws IOException {
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        System.out.println(file.createNewFile());//创建文件

        File file1 = new File("C:\\Users\\xu\\Desktop\\javaresource\\haha\\hehe\\xixi");
        System.out.println(file1.mkdirs());//创建单级或多级文件夹
    }

    private static void file01() {
//      File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource\\haha");
        System.out.println(file.delete());//false

    }
}

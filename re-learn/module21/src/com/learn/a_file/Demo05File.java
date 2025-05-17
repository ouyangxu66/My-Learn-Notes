package com.learn.a_file;

import java.io.File;

public class Demo05File {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\xu\\Desktop\\javaresource");
        method(file);
    }

    private static void method(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            String name = f.getName();
            if (f.isFile()) {
                if (name.endsWith(".jpg")||name.endsWith(".jpeg")) {
                    System.out.println(name);
                }
            }else {
                method(f);//如果是文件夹,则递归调用method方法,直到遍历每一个文件
            }
        }
    }
}

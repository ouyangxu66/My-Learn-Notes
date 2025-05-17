package com.learn.a_file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        file01();
        file02();
    }

    private static void file02() {
        String path = "C:\\Users\\user\\Desktop\\";
        System.out.println(path);
        String path1="C:"+File.separator+"Desktop"+File.separator+"Demo01File.java";
        System.out.println(path1);
    }

    private static void file01() {
        //路径分隔符pathSeparate->;
        String pathSeparator = File.pathSeparator;
        //路径分隔符Separate->\
        String separator = File.separator;
        System.out.println(pathSeparator);
        System.out.println(separator);
    }
}

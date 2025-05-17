package com.learn.a_file;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        File file01 = new File("C:\\Users\\xu\\Desktop\\javaresource","1.jgp");
        File file02 = new File("C:\\Users\\xu\\Desktop\\javaresource\\1.jgp");
        System.out.println(file02);
        System.out.println(file01);
    }
}

package com.learn.f_commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Demo02FileUtils {
    public static void main(String[] args) throws IOException {
        FileUtils.copyDirectoryToDirectory(new File("C:\\Users\\xu\\Desktop\\javaresource\\haha")
                ,new File("C:\\Users\\xu\\Desktop\\javaresource\\hehe"));
        FileUtils.writeStringToFile(new File("module22\\commons.txt"),"我是超级大帅逼");
        String s=FileUtils.readFileToString(new File("module22\\commons.txt"));
        System.out.println(s);
    }
}

package com.learn.f_commons_io;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class Demo01IOUtils {
    public static void main(String[] args) throws IOException {
        IOUtils.copy(new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\6.jpg")
                ,new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\ldr.jpg" ));
        FileWriter fw = new FileWriter("C:\\Users\\xu\\Desktop\\javaresource\\1.txt");
        fw.write("你好世界");
        IOUtils.closeQuietly(fw);
    }
}

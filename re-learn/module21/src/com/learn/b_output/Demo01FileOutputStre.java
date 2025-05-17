package com.learn.b_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;
import java.io.IOException;

public class Demo01FileOutputStre {
    public static void main(String[] args) throws IOException {
        method01();
        method02();
    }

    private static void method02() throws IOException {
        FileOutputStream stream = new FileOutputStream("module21\\1.txt",true);
        stream.write("床前明月光\n".getBytes());
        stream.write("疑似地上霜\n".getBytes());
        stream.write("举头望明月\n".getBytes());
        stream.write("低头思故乡\n".getBytes());
        stream.close();
    }

    private static void method01() throws IOException {
        FileOutputStream stream = new FileOutputStream("module21\\1.txt");
        stream.write(97);//一次写入一个字节
        byte[] bytes={97,98,99,100,101};
        stream.write(bytes);//一次写入一个数组
        stream.write(bytes,2,2);//一次写入数组一部分
        stream.close();
    }
}

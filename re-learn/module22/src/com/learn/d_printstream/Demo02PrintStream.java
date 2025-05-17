package com.learn.d_printstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("module22\\log.txt",true));
        //改变流向
        System.setOut(ps);
        ps.println("这条错误的发送时间时五月十二号下午四点");
        ps.println("发生在Main.java文件中");
        ps.println("错误的原因是反序列化异常");
        ps.close();
    }
}

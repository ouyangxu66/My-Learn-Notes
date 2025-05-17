package com.learn.b_reversestream;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo01InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("module22\\1.txt"),"utf-8");
        int c= isr.read();
        System.out.println((char)c);
        isr.close();
    }
}

package com.learn.b_reversestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Demo02OutputStreamReader {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("module22\\1.txt"),"utf-8");
        osw.write("你好世界");
        osw.close();
    }
}

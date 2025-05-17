package com.learn.a_buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo02BufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("module22\\1.txt",true));
        bw.write("计算机");
        bw.newLine();
        bw.write("神武");
        bw.newLine();
        bw.write("急急急");
        bw.close();
    }
}

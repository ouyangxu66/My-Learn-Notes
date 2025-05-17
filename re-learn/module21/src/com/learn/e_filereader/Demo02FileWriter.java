package com.learn.e_filereader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("module21\\2.txt");
        fileWriter.write("唧唧复唧唧\r\n");
        fileWriter.write("木兰当户织\r\n");
        fileWriter.flush();
        fileWriter.write("我是大帅逼\r\n");
        fileWriter.close();
    }
}

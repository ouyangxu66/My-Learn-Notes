package com.learn.f_ioexception;

import java.io.FileWriter;

public class Demo02Exception {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("module21\\4.txt");){
            fw.write("世界大团结");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.learn.f_new;

import java.io.FileWriter;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) throws IOException {
        method01();
        method02();
    }
    //java 8之后
    private static void method02() throws IOException {
        FileWriter fw = new FileWriter("module24\\1.txt");
        try (fw){
            fw.write("hello");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    //java8之前
    public static void method01() {
        try(FileWriter fw = new FileWriter("module24\\1.txt")) {
            fw.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

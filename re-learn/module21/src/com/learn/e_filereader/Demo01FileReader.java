package com.learn.e_filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        //method05();
        method06();

    }

    private static void method06() throws IOException {
        FileReader fileReader = new FileReader("module21\\1.txt");
        int len;
        while ((len=fileReader.read())!=-1){
            System.out.println((char)len);
        }
        fileReader.close();
    }

    private static void method05() throws IOException {
        FileReader fileReader = new FileReader("module21\\1.txt");
        int len1=fileReader.read();
        System.out.println((char) len1);
        fileReader.close();
    }

}

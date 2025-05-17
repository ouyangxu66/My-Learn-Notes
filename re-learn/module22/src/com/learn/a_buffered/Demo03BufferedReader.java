package com.learn.a_buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("module22\\1.txt"));
//       String a=br.readLine();
//       String b=br.readLine();
//       System.out.println(a);
//       System.out.println(b);
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}

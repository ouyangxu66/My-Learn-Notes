package com.learn.d_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("module22\\printstream.txt");
        ps.println("Hello World");
        ps.print("You");
        ps.println("Me");
        ps.close();
    }
}

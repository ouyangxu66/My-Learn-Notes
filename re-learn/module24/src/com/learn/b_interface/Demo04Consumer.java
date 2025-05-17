package com.learn.b_interface;

import java.util.function.Consumer;

public class Demo04Consumer {
    public static void main(String[] args) {
        method(s-> System.out.println(s.length()),"hello");
    }

    private static void method(Consumer<String> c,String s) {
        c.accept(s);
    }
}

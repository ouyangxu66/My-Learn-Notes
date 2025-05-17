package com.learn.b_interface;

import java.util.function.Function;

public class Demo03Function {
    public static void main(String[] args) {
        method(integer->integer+"",1002);
    }

    private static void method(Function<Integer, String> f,Integer i) {
        String s = f.apply(i);
        System.out.println("s=" + (s+1));
    }
}

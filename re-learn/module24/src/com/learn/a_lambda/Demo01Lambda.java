package com.learn.a_lambda;

public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello, World!");
        }).start();
    }
}

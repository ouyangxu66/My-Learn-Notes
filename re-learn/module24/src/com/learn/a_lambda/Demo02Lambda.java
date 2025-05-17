package com.learn.a_lambda;

public class Demo02Lambda {
    public static void main(String[] args) {
        method01(new USB() {
            @Override
            public void start() {
                System.out.println("start");
            }
        });
        System.out.println("=================================");
        method01(()-> System.out.println("start"));
    }
    private static void method01(USB usb) {
        usb.start();
    }
}

package com.Arrays;

public class d {
    public static void main(String[] args) {
        for (String string : args) {
            if("version".equals(args)){
                System.out.println("v 1.0");
            }
        }
        /*
         * 命令行参数类型是String[]数组；

        命令行参数由JVM接收用户输入并传给main方法；

        如何解析命令行参数需要由程序自己实现。
         */
    }
}

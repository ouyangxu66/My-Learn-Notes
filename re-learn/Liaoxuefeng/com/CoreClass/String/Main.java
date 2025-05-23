package com.CoreClass.String;

// String
public class Main {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "HELLO".toLowerCase();
        //比较字符串内容是否相同,使用equals而不是==
        System.out.println(s1==s2);
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写比较
        //char[]和String类型可以互相转换
        //Java的String和char在内存中总是以Unicode编码表示。
        char[] cs = "Hello".toCharArray(); // String -> char[]
        String s = new String(cs); // char[] -> String

    }
}

package com.learn.d_regex;

public class Demo02Regex {
    public static void main(String[] args) {
        //method01();
        //metho02();
        metho03();
    }

    private static void metho03() {
        boolean re="abcabcabc".matches("(abc)*");
        System.out.println(re);
    }


    //字符类
    private static void method01() {
        boolean re = "had".matches("[h][aeiou][d]");
        boolean re1 = "oyx".matches("[^a-f][xy][xyz]");
        System.out.println(re1);
        System.out.println(re);
    }
    //逻辑运算类
    private static void metho02() {
        boolean re = "oyx".matches("[a-z]&&[^aeiou][a][d]");// && 与
        boolean re1 = "oyx".matches("[^a-f][xy][x]|[^a-f][xy][y]");// | 或
        System.out.println(re);
    }
}

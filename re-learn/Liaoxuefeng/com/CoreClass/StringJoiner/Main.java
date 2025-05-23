package com.CoreClass.StringJoiner;

import java.util.StringJoiner;
public class Main {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Grace"};
        //使用分隔符拼接数组,使用StringJoiner,指定分隔符和头尾
        //在new对象的时候初始化分隔符和头尾
        var sj = new StringJoiner(", ", "Hello ", "!");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
        //如果不指定头尾使用String.join()方法更方便
        var s=String.join(", ", names);
        System.out.println(s);
    }
}


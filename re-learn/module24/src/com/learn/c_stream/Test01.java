package com.learn.c_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("123");
        list1.add("223");
        list1.add("3345");
        list1.add("41");
        list1.add("52");
        list1.add("62");
        list1.add("73");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("11");
        list2.add("22");
        list2.add("32");
        list2.add("44");
        list2.add("55");
        list2.add("66");
        list2.add("77");
        //将list集合转变为Stream流对象
        Stream<String> team1 = list1.stream();
        Stream<String> team2 = list2.stream();
        //对Stream流对象进行操作
        Stream<String> listA = team1.filter(s -> s.length() == 3).limit(3);
        Stream<String> listB = team2.filter(s -> s.startsWith("2")).skip(2);
        //合并
        Stream<String> team3 = Stream.concat(listA, listB);
        team3.forEach(s->System.out.println(s));
    }
}

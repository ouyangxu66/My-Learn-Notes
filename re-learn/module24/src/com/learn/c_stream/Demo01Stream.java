package com.learn.c_stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo01Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张伟");
        list.add("刘晓伟");
        list.add("刘大伟");
        list.add("吴迪");


     ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                list1.add(s);
            }
        }

      for (String s : list1) {
            System.out.println(s);
        }
        System.out.println("============Stream===========");
        Stream<String> stream = list.stream();//把对象变成流
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.startsWith("张");
            }
        }).filter(new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.length()==3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });
        System.out.println("==========Lambda==========");
        list.stream()
                .filter(t->t.startsWith("张"))
                .filter(t -> t.length()==3)
                .forEach(s->System.out.println(s));

    }
}

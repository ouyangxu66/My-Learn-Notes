package com.learn.c_stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo02Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Stream<String> stream = list.stream();
        System.out.println(stream);

        Stream<String> stream1=Stream.of("a","b","c","d");
        System.out.println(stream1);

    }
}

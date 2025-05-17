package com.learn.d_method;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo01Method {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a", "b", "c", "d", "e", "f", "g", "h");
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        stream.forEach(s-> System.out.println(s));
        stream.forEach(System.out::println);
    }
}

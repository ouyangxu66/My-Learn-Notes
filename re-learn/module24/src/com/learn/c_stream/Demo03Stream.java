package com.learn.c_stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo03Stream {
    public static void main(String[] args) {
        //method01();
        //filter();
        //limit();
        //skip();
        //concat();
        //collect();
        //distinct();
        map();
    }

    private static void map() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.map(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return integer+"";
            }
        }).forEach(s->System.out.println(s+1));
    }

    private static void distinct() {
//        Stream<String> stream=Stream.of("卧槽","你这个","害死人","真的","真的");
//        stream.distinct().forEach(s->System.out.println(s));
        Stream<Person> stream
                = Stream.of(new Person("张三",23),new Person("李四",13),new Person("张三",23));
        stream.distinct().forEach(System.out::println);
    }

    private static void collect() {
        Stream<String> stream=Stream.of("卧槽","你这个","害死人","真的");
        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }

    private static void concat() {
        Stream<String> stream=Stream.of("卧槽","你这个","害死人","真的");
        Stream<String> stream1=Stream.of("卧槽1","你这2个","害死3人","真4的");
        Stream.concat(stream,stream1).forEach(System.out::println);

    }

    private static void skip() {
        Stream<String> stream=Stream.of("卧槽","你这个","害死人","真的");
        stream.skip(2).forEach(s->System.out.println(s));
    }

    private static void limit() {
        Stream<String> stream=Stream.of("卧槽","你这个","害死人","真的");
        stream.limit(3).forEach(s->System.out.println(s));
    }

    private static void filter() {
        Stream<String> stream=Stream.of("卧槽","你这个","害死人","真的");
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()==3;
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("===================");
        stream.filter(s -> s.length()==3).forEach(s-> System.out.println(s));
    }

    private static void method01() {
        Stream<String> stream=Stream.of("卧槽","你这个","害死人");
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        long count=stream.count();
        System.out.println(count);
        System.out.println("===========================");
        stream.forEach(s->System.out.println(s));
    }
}

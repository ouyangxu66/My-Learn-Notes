package com.learn.d_method;

import java.util.function.Function;

public class Demo02Method {
    public static void main(String[] args) {
        method(new Function<Integer, int[]>() {
            @Override
            public int[] apply(Integer integer) {
                return new int[integer];
            }

        },10);

        method((integer)->new int[integer],10);

        method(int[]::new,10);
    }
    public static void method(Function<Integer, int[]> f,Integer len) {
        int[] arr = new int[len];
        System.out.println(arr.length);
    }
}

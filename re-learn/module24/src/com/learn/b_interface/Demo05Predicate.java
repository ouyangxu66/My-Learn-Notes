package com.learn.b_interface;

import java.util.function.Predicate;

public class Demo05Predicate {
    public static void main(String[] args) {
        method(p-> p.length()==2,"dasfadfasf");
    }

    private static void method(Predicate<String> p,String s) {
        boolean b=p.test(s);
        System.out.println(b);
    }
}

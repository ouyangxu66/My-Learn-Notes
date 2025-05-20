package com.learn.f_annotation;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        Class<BookShelf> bookShelfClass = BookShelf.class;
        //判断是否有book注解
        boolean b = bookShelfClass.isAnnotationPresent(Book.class);
        System.out.println(b);
        if (b){
            //获取book注解
            Book book = bookShelfClass.getAnnotation(Book.class);
            System.out.println(book.name());
            System.out.println(Arrays.toString(book.authors()));
            System.out.println(book.price());
            System.out.println(book.quantity());
        }
    }
}

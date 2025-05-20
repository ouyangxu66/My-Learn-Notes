package com.learn.e_annotation;

public @interface Book {
    //书名
    String name();
    //作者
    String[] authors();
    //价格
    int price();
    //库存
    int quantity() default 100;

}

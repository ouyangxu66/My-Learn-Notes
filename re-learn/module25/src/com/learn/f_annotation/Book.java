package com.learn.f_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
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

package com.learn.c_reflect;

import java.lang.reflect.Constructor;

public class Demo05Constructor {
    public static void main(String[] args) throws Exception {
        Class<Person> aClass = Person.class;
        Constructor<Person> dc = aClass.getDeclaredConstructor(String.class);
        //解除私有权限,暴力反射
        dc.setAccessible(true);
        Person person = dc.newInstance("woc");
        System.out.println("person = " + person);
    }
}

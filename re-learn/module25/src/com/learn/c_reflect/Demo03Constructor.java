package com.learn.c_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo03Constructor {
    public static void main(String[] args) throws Exception {
        Class<Person> aClass  = Person.class;
        //获取所有public构造器
        Constructor<Person> constructor = aClass.getConstructor();
        System.out.println("constructor = " + constructor);

        Person person = constructor.newInstance();
        System.out.println("person = " + person);
    }
}

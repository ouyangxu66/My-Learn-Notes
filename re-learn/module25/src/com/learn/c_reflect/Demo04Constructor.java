package com.learn.c_reflect;

import java.lang.reflect.Constructor;

public class Demo04Constructor {
    public static void main(String[] args) throws Exception {
        Class<Person> aClass = Person.class;

        Constructor<Person> constructor = aClass.getConstructor(String.class, Integer.class);
        System.out.println("constructor = " + constructor);

        //下面好比是->Person alice = new Person("Alice", 25);
        Person person = constructor.newInstance("Alice", 25);

        //好比是直接输出Person对象，默认调用的是toString()
        System.out.println("person = " + person);


    }
}

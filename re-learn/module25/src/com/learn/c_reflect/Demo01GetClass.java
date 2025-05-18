package com.learn.c_reflect;

import org.junit.Test;

import static java.lang.Class.forName;

public class Demo01GetClass {
    public static void main(String[] args) {

    }
    @Test
    public void testGetClass() throws Exception {
        Person person = new Person("Alice", 25);
        Class<? extends Person> class1 = person.getClass();
        System.out.println("class1 = " + class1);

        System.out.println("==============================");
        Class<? extends Person> class2 = Person.class;
        System.out.println("class2 = " + class2);

        System.out.println("==============================");
        Class<?> class3=Class.forName("com.learn.c_reflect.Person");
        System.out.println("class3 = " + class3);
    }
}

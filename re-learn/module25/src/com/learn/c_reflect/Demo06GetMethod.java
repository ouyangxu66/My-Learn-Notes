package com.learn.c_reflect;

import java.lang.reflect.Method;

public class Demo06GetMethod {
    public static void main(String[] args) throws Exception {
        //method01();
        //method02();
        //method03();
        method04();
    }

    private static void method04() throws Exception {
        Class<Person> aClass = Person.class;
        Person person = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("eat");
        method.setAccessible(true);
        method.invoke(person);
    }

    private static void method03() throws NoSuchMethodException {
        Class<Person> aClass = Person.class;
        //获取所有的方法,包括私有方法
        Method[] methods =aClass.getDeclaredMethods() ;
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        //调用指定的私有方法
        System.out.println("===========================");
        Method dm=aClass.getDeclaredMethod("eat");
        System.out.println("dm = " + dm);
    }

    private static void method02() throws Exception {
        Class<Person> aClass = Person.class;
        Method setName = aClass.getMethod("setName", String.class);
        Person person = aClass.newInstance();
        //相当于调用person.setName()
        setName.invoke(person,"杀杀杀");
        //调用person.toString
        System.out.println("person = " + person);
    }

    private static void method01() {
        Class<Person> aClass = Person.class;
        //获取所有的公共方法
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
    }
}

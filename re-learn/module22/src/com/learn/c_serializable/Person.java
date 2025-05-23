package com.learn.c_serializable;

import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID = 2L;
    private String name;
    private transient int  age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

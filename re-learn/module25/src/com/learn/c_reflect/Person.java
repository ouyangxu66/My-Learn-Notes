package com.learn.c_reflect;

public class Person {
    private String name;
    private Integer age;

    private void eat(){
        System.out.println("eat");
    }
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}
    private Person (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

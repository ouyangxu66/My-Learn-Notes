package com.learn.g_lombok;

public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10);
        person.setName("ggbond");
        System.out.println(person.getAge()+" "+person.getName());

        Person person1 = new Person("ggbond", 10);
        System.out.println(person1.getAge()+" "+person1.getName());
    }
}

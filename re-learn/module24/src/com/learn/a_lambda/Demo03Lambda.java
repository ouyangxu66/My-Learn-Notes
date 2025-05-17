package com.learn.a_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Lambda {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("zhangsan",23));
        people.add(new Person("lisi",24));
        people.add(new Person("wangwu",13));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println("========下面为Lambda简化形式==========");
        Collections.sort(people,(o1, o2)->o1.getAge()-o2.getAge());
        System.out.println(people.toString());
    }
}

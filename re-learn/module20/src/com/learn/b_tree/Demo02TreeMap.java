package com.learn.b_tree;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo02TreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("a","hhhh");
        treeMap.put("h","qqqq");
        treeMap.put("o","wqqq");
        treeMap.put("c","wrrqq");
        treeMap.put("k","lklqq");
        treeMap.put("b","qqqq");
        System.out.println(treeMap);

        TreeMap<Person, String> treeMap1 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        treeMap1.put(new Person("鱼鱼", 18), "hhhh");
        treeMap1.put(new Person("狗", 13), "hhhh");
        treeMap1.put(new Person("鸡鸡", 43), "hhhh");
        treeMap1.put(new Person("猪猪", 99), "hhhh");
        System.out.println(treeMap1);
    }
}

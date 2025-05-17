package com.learn.b_tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo01TreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("A");
        treeSet1.add("C");
        treeSet1.add("N");
        treeSet1.add("B");
        treeSet1.add("D");
        System.out.println(treeSet1);//有序,默认按照ASCII码表排序

        TreeSet<Person> treeSet2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });//可以重写comparetor比较器,确定比较关系
        treeSet2.add(new Person("喝水", 18));
        treeSet2.add(new Person("乌鸦", 22));
        treeSet2.add(new Person("荷塘", 12));
        treeSet2.add(new Person("月色", 82));
        System.out.println(treeSet2);
    }
}

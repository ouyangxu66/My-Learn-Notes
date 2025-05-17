package com.learn.a_map;

import java.util.HashMap;

public class Demo03HashMap {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("喜羊羊",23),"中国");
        map.put(new Person("三上",33),"日本");
        map.put(new Person("皮特",33),"美国");
        System.out.println(map);
    }
}

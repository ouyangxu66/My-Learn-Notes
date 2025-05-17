package com.learn.d_propeties;

import java.util.Properties;
import java.util.Set;

public class Demo01Propeties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        // object setProperty(string key, String value) -> 存键值对
        properties.setProperty("22","22");
        properties.setProperty("11","44");
        properties.setProperty("33","55");
        properties.setProperty("44","66");
        System.out.println(properties);
    // String getProperty(String key) ->根据key获取value的
        System.out.println(properties.getProperty("22"));
    // Set<String>stringPropertyNames->获取所有的key,保存到set集合中，相当于keySet方法
        Set<String>set= properties.stringPropertyNames();
        for (String s : set) {
            System.out.println(s);
        }
    }
}

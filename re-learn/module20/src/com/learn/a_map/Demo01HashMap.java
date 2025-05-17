package com.learn.a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("疯狂", "鸡");
        map.put("无敌", "狗");
        map.put("超级", "羊");
        map.put("究极","马");
        map.put("无敌", "猪");
/*
Set集合中保存的都是"结婚证"->Map.Entry
我们需要将“结婚证"从set集合中遍历出来
 */
        Set<Map.Entry<String, String>> set = map.entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "--" + value);
        }
    }
}

package com.learn.a_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo01LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("疯狂", "鸡");
        map.put("无敌", "狗");
        map.put("超级", "羊");
        map.put("究极","马");
        map.put("无敌", "猪");//key值一样value会被覆盖

        Set<String> keySet = map.keySet();//获取所有的key放入set
        for (String key : keySet) {
            System.out.println(key + ":" + map.get(key));
        }

    }
}

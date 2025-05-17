package com.learn.e_list_in_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02ListInMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("虎虎", 1);
        map1.put("省委", 2);
        map1.put("卡卡", 3);
        map1.put("飘飘", 4);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("丽丽",33);
        map2.put("飘飘",11);
        map2.put("勾勾",22);
        map2.put("侵权",44);
        ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
        arrayList.add(map1);
        arrayList.add(map2);
        System.out.println(arrayList);
        for (HashMap<String, Integer> map : arrayList) {
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}

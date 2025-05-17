package com.learn.e_list_in_list;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03MapInMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        map1.put("zhangsan", 1);
        map1.put("lisi", 2);
        map2.put("wuangwu",3);
        map2.put("zhaoliu",3);
        HashMap<String, HashMap<String, Integer>> mapHashMap = new HashMap<>();
        mapHashMap.put("11", map1);
        mapHashMap.put("22", map2);
        //使用HashMap的内部类entrySet,将HashMap中的键值对存储到Set集合
        Set<Map.Entry<String, HashMap<String, Integer>>> entrySet = mapHashMap.entrySet();
        //对Set集合中的元素进行遍历
        for (Map.Entry<String, HashMap<String, Integer>> entry : entrySet) {
            //new一个HashMap存储合并后HashMap的value值,即map1,map2
            HashMap<String, Integer> hashMap = entry.getValue();
            //这里换一种遍历方法,使用HashMap的keySet方法,将hashMap中的key值存储
            Set<String> set = hashMap.keySet();
            //最后再遍历key和value
            for (String s : set) {
                System.out.println(s+":"+hashMap.get(s));
            }

        }

    }
}

package com.learn.e_list_in_list;

import java.util.ArrayList;

public class Demo01LisnInList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("花花");
        list1.add("草草");
        list1.add("树");
        list1.add("地皮");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("鸡");
        list2.add("狗");
        list2.add("猪");
        list2.add("羊");

        //list中的元素是两个ArrayList<String>,所以合并数组的泛型就是ArrayList<String>
        ArrayList<ArrayList<String>> list3 = new ArrayList<>();
        list3.add(list1);
        list3.add(list2);
        System.out.println(list3);

        //先遍历每一个ArrayList再遍历ArrayList中的每一个元素
        for (ArrayList<String> arrayList : list3) {
            for (String string : arrayList) {
                System.out.println(string);
            }
        }
    }
}

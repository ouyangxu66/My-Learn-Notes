package com.Arrays;

import java.util.Arrays;

public class aforArray {
    public static void main(String[] args) {
        /*
            通过for循环就可以遍历数组。因为数组的每个元素都可以通过索引来访问，因此，使用标准的for循环可以完成一个数组的遍历
            第二种方式是使用for each循环，直接迭代数组的每个元素,在for (int n : ns)循环中，变量n直接拿到ns数组的元素，而不是索引
            Java标准库提供了Arrays.toString()，可以快速打印数组内容
         */
        int[] ns={1,32,32,43,5,78};
        System.out.println(ns);//直接打印数组,得到的是JVM中的引用地址

        for(int n:ns){
            System.out.println(n+",");
        }//使用for each直接打印数组元素

        System.out.println("--------------------------------------------------");

        for (int i = 0; i < ns.length; i++) {
            System.out.println(ns[i]);
        }//使用for循环打印数组元素

        System.out.println("--------------------------------------------------");

        System.out.println(Arrays.toString(ns));//调用Java标准库直接打印

        for (int i = ns.length-1; i >=0 ; i--) {
            System.out.println(ns[i]);
        }//倒序遍历数组打印数组内容

    }
}

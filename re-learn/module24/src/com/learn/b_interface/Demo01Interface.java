package com.learn.b_interface;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo01Interface {
    public static void main(String[] args) {
        method01(()->{
                int arr[]={23,34,5123,5634,2321,1};
                Arrays.sort(arr);
                return arr[arr.length-1];
        });
    }
    private static void method01(Supplier<Integer> supplier) {
        Integer max = supplier.get();//获取最大值
        System.out.println("max= "+max);
    }
}

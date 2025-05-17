package com.Arrays;

import java.util.Arrays;

public class cmultipleArray {
    public static void main(String[] args) {
        int[][] ns={
            {3,4,1},
            {32,3,45},
            {9,23,43}
        };
        //打印一个二维数组可以使用两层for循环
        for (int i = 0; i < ns.length; i++) {
            for (int j = 0; j < ns[i].length; j++) {
                System.out.print(ns[i][j]+",");
            }
            System.out.println();
        }
        //也可以使用Java标准库提供的Arrays.deepToString()
        System.out.println(Arrays.deepToString(ns));
        System.out.println();


        //统计所有学生的平均成绩
        int[][] scores = {
            { 82, 90, 91 }, // 学生甲的语数英成绩
            { 68, 72, 64 }, // 学生乙的语数英成绩
            { 95, 91, 89 }, // ...
            { 67, 52, 60 },
            { 79, 81, 85 },
    };
    // TODO:
    double sum=0;
    int person=0;
    double average = 0;
    for (int i = 0; i < scores.length; i++) {
        for (int j = 0; j < scores[i].length; j++) {
            sum+=scores[i][j];
            person++;
        }
    }
    average=sum/person;
    System.out.println(average);
    if (Math.abs(average - 77.733333) < 0.000001) {
        System.out.println("测试成功");
    } else {
        System.out.println("测试失败");
    }

    /*
    二维数组就是数组的数组，三维数组就是二维数组的数组；

    多维数组的每个数组元素长度都不要求相同；

    打印多维数组可以使用Arrays.deepToString()；

    最常见的多维数组是二维数组，访问二维数组的一个元素使用array[row][col]
     */
    }

}

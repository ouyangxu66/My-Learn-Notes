package com.Arrays;

import java.util.Arrays;

public class bsortArray {
    public static void main(String[] args) {
        int[] ns={23,4,21,6,78,90,54};
        //打印排序前
        System.out.println(Arrays.toString(ns));
        //从小到大进行冒泡排序
        for (int i = 0; i <=ns.length-1; i++) {
            for (int j = 0; j < ns.length-1-i; j++) {
                if(ns[j]>ns[j+1]){
                    int tmp=ns[j];
                    //取一个中间的容器,来存交换的值
                    ns[j]=ns[j+1];
                    ns[j+1]=tmp;
                }
            }
        }
        //打印排序后
        System.out.println(Arrays.toString(ns));

        //实际上，Java的标准库已经内置了排序功能，我们只需要调用JDK提供的Arrays.sort()就可以排序
        Arrays.sort(ns);
        //基本数据类型进行排序后,ns指向的数组内容发生改变
        System.out.println(Arrays.toString(ns));

        //字符串类型排序后,ns1的内容不发生变化,指向的位置发生变化
        String[] ns1={"add","cake","debuff","but"};
        Arrays.sort(ns1);
        System.out.println(Arrays.toString(ns1));

        int[] ns2 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        // TODO:
        //使用两次循环,外层循次数环与数组个数相等
        for(int i=0;i<=ns2.length-1;i++)
        {
            //注意数组索引不能越界
            for(int j=0;j<ns2.length-1-i;j++){
                if(ns2[j]<ns2[j+1]){//降序用小于,升序用大于
                    int tmp=ns2[j];
                    ns2[j]=ns2[j+1];
                    ns2[j+1]=tmp;
                }
            }
        }
        // 排序后:
        System.out.println(Arrays.toString(ns2));
        if (Arrays.toString(ns2).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }

        // 降序排序
        int[] ns3 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns3));
        // TODO:
        for (int i=0;i<ns3.length;i++) {
            ns3[i] = -ns3[i];
        }
        Arrays.sort(ns3);
        for (int i=0;i<ns3.length;i++) {
            ns3[i] = -ns3[i];
        }
        // 排序后:
        System.out.println(Arrays.toString(ns3));
        if (Arrays.toString(ns3).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}

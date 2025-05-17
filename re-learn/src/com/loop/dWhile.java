package com.loop;

public class dWhile {
    public static void main(String[] args) {
        //计算m到n的值
        int sum = 0;
        int m = 20;
        int n = 100;
        // 使用while计算M+...+N:
        while (m<=n) {
            sum+=m;
            m++;
        }
        System.out.println(sum);
        /*
        while循环先判断循环条件是否满足，再执行循环语句；

        while循环可能一次都不执行；

        编写循环时要注意循环条件，并避免死循环。
         */

        /*
        do while先执行循环，再判断条件；

        do while循环会至少执行一次。
         */
        int sum1 = 0;
        int m1 = 20;
        int n1 = 100;
        // 使用do while计算M+...+N:
        do {
            sum1+=m1;
            m1++;
        } while (m1<=n1);
        System.out.println(sum1);
    }
}

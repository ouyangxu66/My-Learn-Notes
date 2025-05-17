package com.loop;

public class efor {
    public static void main(String[] args) {
    /*
    for循环通过计数器可以实现复杂循环；

    for each循环可以直接遍历数组的每个元素；

    最佳实践：计数器变量定义在for循环内部，循环体内部不修改计数器；
     */
        //给定一个数组，请用for循环倒序输出每一个元素：
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=ns.length-1; i>=0; i--) {
            System.out.println(ns[i]);
        }
        System.out.println();
        //利用for each循环对数组每个元素求和：
        int[] ns1 = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int n:ns1) {
            sum+=n;
            // TODO
        }
        System.out.println(sum); // 55
        System.out.println();

        //圆周率π可以使用公式计算,请利用for循环计算π：
        double pi=0;
        for(double i=1;i<100000;i++){
            if(i%2==0){
                pi-=1.0/(2*i-1);
            }else {
                pi+=1.0/(2*i-1);
            }
        }
        System.out.println(pi*4);

        /*
        break语句可以跳出当前循环；

        break语句通常配合if，在满足条件时提前结束整个循环；

        break语句总是跳出最近的一层循环；

        continue语句可以提前结束本次循环；

        continue语句通常配合if，在满足条件时提前结束本次循环。继续下一次循环
         */
    }
}

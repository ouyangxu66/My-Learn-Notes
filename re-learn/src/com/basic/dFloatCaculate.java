package com.basic;
public class dFloatCaculate {
	public static void main(String[] args) {
		/*
		浮点数运算和整数运算相比，只能进行加减乘除这些数值计算，不能做位运算和移位运算。
		在计算机中，浮点数虽然表示的范围大，但是，浮点数有个非常重要的特点，就是浮点数常常无法精确表示。
		 */
		//因为浮点数常常无法精确表示，因此，浮点数运算会产生误差
		Double x=1.0/10;
		Double y=1-9.0/10;
		//两个数运算结果不一致
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		//一元二次方程求根公式
		double a = 1.0;
		double b = 3.0;
		double c = -4.0;
		// 求平方根可用 Math.sqrt():
		// System.out.println(Math.sqrt(2)); ==> 1.414
		// TODO:
		double r1 = 0;
		double r2 = 0;
		r1=(Math.sqrt(b*b-4*a*c)-b)/2*a;
		r2=(-Math.sqrt(b*b-4*a*c)-b)/2*a;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");

		/*
		小结
浮点数常常无法精确表示，并且浮点数的运算结果可能有误差；

比较两个浮点数通常比较它们的差的绝对值是否小于一个特定值；

整型和浮点型运算时，整型会自动提升为浮点型；

可以将浮点型强制转为整型，但超出范围后将始终返回整型的最大值。
		 */
	}
}

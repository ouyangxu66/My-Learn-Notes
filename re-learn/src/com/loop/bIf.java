package com.loop;

import java.util.Scanner;

public class bIf {
	public static void main(String[] args) {
		/*
		在Java中，判断值类型的变量是否相等，可以使用 == 运算符。
		但是，判断引用类型的变量是否相等，== 表示“引用是否相等”，或者说，是否指向同一个对象。
		 */
		//要判断引用类型的变量内容是否相等，必须使用equals()方法
		String s1 = "hello";
		String s2 = "HELLO".toLowerCase();
		System.out.println(s1);
		System.out.println(s2);
		if (s1.equals(s2)) {
			System.out.println("s1 equals s2");
		} else {
			System.out.println("s1 not equals s2");
		}
		//执行语句s1.equals(s2)时，如果变量s1为null，会报NullPointerException
		//要避免NullPointerException错误，可以利用短路运算符&&
		String s3 = null;
		if (s3 != null && s3.equals("hello")) {
			System.out.println("hello");
		}

		/*
		浮点数在计算机中常常无法精确表示，并且计算可能出现误差，因此，判断浮点数相等用==判断不靠谱
		正确的方法是利用差值小于某个临界值来判断
		 */
		double x = 1 - 9.0 / 10;
		if (Math.abs(x - 0.1) < 0.00001) {
			System.out.println("x is 0.1");
		} else {
			System.out.println("x is NOT 0.1");
		}

		//计算体重的BMI值
		double weight,height;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter weight in kg: ");
		weight = sc.nextDouble();
		System.out.print("Enter height in m: ");
		height = sc.nextDouble();
		double BMI = weight / (height * height);
		if (BMI<18.5){
			System.out.println("过轻");
		}else if(BMI>18.5 && BMI<25){
			System.out.println("正常");
		}else if(BMI>25 && BMI<28){
			System.out.println("过重");
		}else if(BMI>28 && BMI<32){
			System.out.println("肥胖");
		}else{
			System.out.println("非常肥胖");
		}
	}
}

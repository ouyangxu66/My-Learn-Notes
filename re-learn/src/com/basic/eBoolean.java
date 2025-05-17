package com.basic;

public class eBoolean {
	public static void main(String[] args) {
		/*
		对于布尔类型boolean，永远只有true和false两个值。
		布尔运算是一种关系运算，包括以下几类：
		比较运算符：>，>=，<，<=，==，!=
		与运算 &&
		或运算 ||
		非运算 !
		 */

		int age = 7;
		// primary student的定义: 6~12岁
		//布尔运算的一个重要特点是短路运算。如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果
		boolean isPrimaryStudent =age>6&&age<12?true:false;
		System.out.println(isPrimaryStudent ? "Yes" : "No");

		//Java还提供一个三元运算符b ? x : y，它根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果

	}
}

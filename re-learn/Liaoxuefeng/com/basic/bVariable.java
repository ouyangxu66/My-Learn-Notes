package com.basic;

public class bVariable {
	public static void main(String[] args) {
		/*四类八种基本数据类型:
		整数类型：byte，short，int，long(对应1,2,4,8个字节)
		浮点数类型：float，double(对应4,8个字节)
		字符类型：char(两个字节)
		布尔类型：boolean
		 */

		//整型
		int a = 10;
		int i = 2147483647;
		int i2 = -2147483648;//int的最大值和最小值
		int i3 = 2_000_000_000; // 加下划线更容易识别
		int i4 = 0xff0000; // 十六进制表示的16711680
		int i5 = 0b1000000000; // 二进制表示的512
		long n1 = 9000000000000000000L; // long型的结尾需要加L
		long n2 = 900; // 没有加L，此处900为int，但int类型可以赋值给long
		//int i6 = 900L; 错误：不能把long型赋值给int

		//浮点型
		float f1 = 3.14f;
		float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
		//float f3 = 1.0;  错误：不带f结尾的是double类型，不能赋值给float
		double d = 1.79e308;
		double d2 = -1.79e308;
		double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
		/*
		对于float类型，需要加上f后缀。
		浮点数可表示的范围非常大，float类型可最大表示3.4x10^38，而double类型可最大表示1.79x10^308。
		 */

		//布尔类型boolean只有true和false两个值，布尔类型总是关系运算的计算结果：
		boolean b1 = true;
		boolean b2 = false;
		boolean isGreater = 5 > 3; // 计算结果为true
		int age = 12;
		boolean isAdult = age >= 18; // 计算结果为false

		//字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符：
		char a1 = 'A';
		char zh = '中';
		System.out.println(a1);
		System.out.println(zh);
		System.out.println();
		//注意char类型使用单引号'，且仅有一个字符，要和双引号"的字符串类型区分开。

		/*
		除了以上几种数据类型,其他的都为引用数据类型
		 */
		//最常用的为String字符串类型
		String s="集集堡";
		System.out.println(s);
		System.out.println();


		/*
		定义变量的时候，如果加上final修饰符，这个变量就变成了常量
		为了和变量区别开来,通常将常量名全部大写
		 */
		final double PI = 3.14; // PI是一个常量
		double r = 5.0;
		double area = PI * r * r;
		System.out.println(area);
		System.out.println();

		/*
		var关键字:有时候类型名字太长,可以省略变量类型,使用var关键字替代
		 */
		//StringBuilder sb = new StringBuilder();
		var sb = new StringBuilder();//可以使用var关键字,编译器会根据赋值语句自动推断出变量sb的类型是StringBuilder

		/*
		变量的作用范围:
		在Java中，多行语句用{ ... }括起来。很多控制语句，例如条件判断和循环，都以{ ... }作为它们自身的范围，
		只要正确地嵌套这些{ ... }，编译器就能识别出语句块的开始和结束。而在语句块中定义的变量，它有一个作用域，
		就是从定义处开始，到语句块结束。超出了作用域引用这些变量，编译器会报错
		 */

		/*
		小结
		Java提供了两种变量类型：基本类型和引用类型

		基本类型包括整型，浮点型，布尔型，字符型。

		变量可重新赋值，等号是赋值语句，不是数学意义的等号。

		常量在初始化后不可重新赋值，使用常量便于理解程序意图。
		 */
	}

}

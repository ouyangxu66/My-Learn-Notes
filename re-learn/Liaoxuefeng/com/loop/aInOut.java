package com.loop;

import java.util.Scanner;

public class aInOut {
	public static void main(String[] args) {
	/*
	输出:在前面的代码中，我们总是使用System.out.println()来向屏幕输出一些内容。
		如果输出后不想换行,可以使用print()
	 */
		//格式化输出:如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能
		//格式化输出使用System.out.printf()，通过使用占位符%?，printf()可以把后面的参数格式化成指定格式
		double d = 3.1415926;
		System.out.printf("%.2f\n", d); // 显示两位小数3.14
		System.out.printf("%.4f\n", d); // 显示4位小数3.1416

	/*
	首先，我们通过import语句导入java.util.Scanner，import是导入某个类的语句，必须放到Java源代码的开头

	然后，创建Scanner对象并传入System.in。System.out代表标准输出流，而System.in代表标准输入流。
	直接使用System.in读取用户输入虽然是可以的，但需要更复杂的代码，而通过Scanner就可以简化后续的代码。

	有了Scanner对象后，要读取用户输入的字符串，使用scanner.nextLine()，要读取用户输入的整数，使用scanner.nextInt()。
	Scanner会自动转换数据类型，因此不必手动转换。
	 */
//		Scanner scanner = new Scanner(System.in); // 创建Scanner对象
//		System.out.print("Input your name: "); // 打印提示
//		String name = scanner.nextLine(); // 读取一行输入并获取字符串
//		System.out.print("Input your age: "); // 打印提示
//		int age = scanner.nextInt(); // 读取一行输入并获取整数
//		System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
//		System.out.println();

		//请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
		Scanner scanner1=new Scanner(System.in);
		System.out.print("Input your last score: ");
		int lastGoal = scanner1.nextInt();
		System.out.print("Input your new score: ");
		int newScore = scanner1.nextInt();
		double a=(newScore-lastGoal)/(double) lastGoal*100;
		//输入的两次成绩都是int整型,要保留两位小数位就得进行浮点数运算,即将在运算过程中加入类型强制转换
		System.out.printf("your percentage increase :%.2f%%",a);
	}
}

package com.basic;

public class cIntCaculate {
	public static void main(String[] args) {
		/*
		Java的整数运算遵循四则运算规则，可以使用任意嵌套的小括号。四则运算规则和初等数学一致。
		 */
		//移位运算:可以对整数进行移位运算。对整数7左移1位将得到整数14，左移两位将得到整数28
		int n = 7;       // 00000000 00000000 00000000 00000111 = 7
		int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
		int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
		//如果对一个负数进行右移，最高位的1不动，结果仍然是一个负数
		int n1 = -536870912;
		int a1 = n1 >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
		int b1 = n1 >> 2;  // 11111000 00000000 00000000 00000000 = -134217728

		/*
		类型自动提升与强制转换
		 */
		//在运算过程中，如果参与运算的两个数类型不一致，那么计算结果为较大类型的整型。例如，short和int计算，结果总是int，原因是short首先自动被转型为int：
		short s = 1234;
		int i = 123456;
		int x = s + i; // s自动转型为int
		//short y = s + i;  编译错误!
		//也可以将结果强制转型，即将大范围的整数转型为小范围的整数。强制转型使用(类型)，例如，将int强制转型为short
		int i1 = 12345;
		short s1 = (short) i1; // 12345
		//要注意，超出范围的强制转型会得到错误的结果，原因是转型时，int的两个高位字节直接被扔掉，仅保留了低位的两个字节,因此强制转型的结果很可能是错的

		/*
		计算前100个数之和
		 */
		int q=100,sum=0;
		sum=(q+1)*q/2;
		System.out.println(sum);

		/*
		小结
		整数运算的结果永远是精确的；

		运算结果会自动提升；

		可以强制转型，但超出范围的强制转型会得到错误的结果；

		应该选择合适范围的整型（int或long），没有必要为了节省内存而使用byte和short进行整数运算。
		 */
	}
}

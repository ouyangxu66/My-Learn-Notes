package com.basic;

public class fString {
	public static void main(String[] args) {
		/*
		在Java中，字符和字符串是两个不同的类型。
		 */

		//字符类型:字符类型char是基本数据类型，它是character的缩写。一个char保存一个Unicode字符
		//因为Java在内存中总是使用Unicode表示字符，所以，一个英文字符和一个中文字符都用一个char类型表示，它们都占用两个字节。
		// 要显示一个字符的Unicode编码，只需将char类型直接赋值给int类型即可：
		char c1 = 'A';
		char c2 = '中';
		int n1 = 'A'; // 字母“A”的Unicodde编码是65
		int n2 = '中'; // 汉字“中”的Unicode编码是20013
		System.out.println(n1);
		System.out.println(n2);
		System.out.println();

		//字符串类型
		//和char类型不同，字符串类型String是引用类型，我们用双引号"..."表示字符串。一个字符串可以存储0个到任意个字符
		String s = ""; // 空字符串，包含0个字符
		String s1 = "A"; // 包含一个字符
		String s2 = "ABC"; // 包含3个字符
		String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格

		//Java的编译器对字符串做了特殊照顾，可以使用+连接任意字符串和其他数据类型
		//如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接
		int age = 25;
		String s4 = "age is " + age;
		System.out.println(s4); // age is 25

		//多行字符串:字符串可以用"""..."""表示多行字符串（Text Blocks)
		String s5 = """ 
           SELECT * FROM
             users
           WHERE id > 100
           ORDER BY name DESC""";
		System.out.println(s5);
		System.out.println();

		//字符串不可变指的是字符串内容不可变,至于变量可指向的内容不一样
		String s6= "hello";
		String t = s6;
		s6 = "world";
		System.out.println(t); // t是"hello"还是"world"?
		System.out.println();

		// 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
		int a = 72;
		int b = 105;
		int c = 65281;
		// FIXME:
		String q =""+(char)a+(char)b+(char)c;//先将int类型强制转换为char类型,即将每个整数转换为对应的Unicode字符,然后再进行字符串连接
		System.out.println(q);

		/*
		Java的字符类型char是基本类型，字符串类型String是引用类型；

		基本类型的变量是“持有”某个数值，引用类型的变量是“指向”某个对象；

		引用类型的变量可以是空值null；

		要区分空值null和空字符串""。
		 */
	}
}

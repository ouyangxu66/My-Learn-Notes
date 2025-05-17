package com.basic;

public class gArray {
	public static void main(String[] args) {
		/*
		Java的数组有几个特点：
		数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；

		数组是引用类型,并且数组一旦创建后，大小就不可改变。

		要访问数组中的某一个元素，需要使用索引。数组索引从0开始，例如，5个元素的数组，索引范围是0~4。

		使用 数组变量.length 来获取数组的长度

		可以修改数组中的某一个元素，使用赋值语句，例如，ns[1] = 79;
		 */
		// 5位同学的成绩:
		int[] ns = new int[5];
		ns[0] = 68;
		ns[1] = 79;
		ns[2] = 91;
		ns[3] = 85;
		ns[4] = 62;
		//也可以简写为
		int[] ns1={68,79,91,85,62};//这样系统会自动推算数组的大小

		String[] names = {"ABC", "XYZ", "zoo"};
		String s = names[1];
		names[1] = "cat";
		System.out.println(s); // s是"XYZ"还是"cat"?

		/*
		数组是同一数据类型的集合，数组一旦创建后，大小就不可变；

		可以通过索引访问数组元素，但索引超出范围将报错；

		数组元素可以是值类型（如int）或引用类型（如String），但数组本身是引用类型；
		 */
	}
}

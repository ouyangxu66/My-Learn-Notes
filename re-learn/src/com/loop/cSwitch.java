package com.loop;

import java.util.Scanner;

public class cSwitch {
	public static void main(String[] args) {
		/*
		switch语句根据switch (表达式)计算的结果，跳转到匹配的case结果，然后继续执行后续语句，直到遇到break结束执行。
		如果没有匹配到任何case,则执行default
		case具有穿透性,在任何时候都不要忘记写break
		 */
		//如果有几个case语句执行的是同一组语句块，可以这么写
		//使用switch语句时，只要保证有break，case的顺序不影响程序逻辑
		int option = 3;
		switch (option) {
			case 4:
				System.out.println("Selected 1");
				break;
			case 3:
			case 2:
				System.out.println("Selected 2, 3");
				break;
			default:
				System.out.println("Selected other");
				break;
		}

		//使用switch实现一个简单的石头、剪子、布游戏。
		String str1,str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("玩家一请猜拳:");
		str1 = sc.nextLine();
		System.out.print("玩家二请猜拳:");
		str2 = sc.nextLine();
		if (str1.equals("石头")){
			switch (str2) {
				case "石头":
					System.out.println("平局");
					break;
				case "剪子":
					System.out.println("玩家一获胜");
					break;
				case "布":
					System.out.println("玩家二获胜");
					break;
			}
		}else if(str1.equals("剪子")){
			switch (str2) {
				case "剪子":
					System.out.println("平局");
					break;
				case "布":
					System.out.println("玩家一获胜");
					break;
				case "石头":
					System.out.println("玩家二获胜");
					break;
			}
		}else if(str1.equals("布")){
			switch (str2) {
				case "布":
					System.out.println("平局");
					break;
				case "石头":
					System.out.println("玩家一获胜");
					break;
				case "剪子":
					System.out.println("玩家二获胜");
					break;
			}
		}
	}
}

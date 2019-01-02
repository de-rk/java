package com.github.test;

import java.util.Scanner;

public class Test1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("输入半径");
		new Radius(scanner.nextDouble()).Radius();*/
		System.out.println("输入创建数量");
		int a=scanner.nextInt();
		for (int i=1;i<=a;i++) {
			Player.getPlayer("name"+i+" ", i, " team"+1);
			System.out.println();
		}
		System.out.println("只能创建"+a+"个球员");
	}

}

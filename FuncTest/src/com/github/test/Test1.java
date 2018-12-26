package com.github.test;

import java.util.Scanner;

public class Test1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("输入半径");
		new Radius(scanner.nextDouble()).Radius();*/
		for (int i=1;i<12;i++)
			new Player("name"+i, i, "team"+i);
		System.out.println("只能创建11个球员");
	}

}

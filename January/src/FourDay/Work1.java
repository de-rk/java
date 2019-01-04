package FourDay;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		//控制台输入
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入两个数");
		
		//此处有一个自动拆箱的操作
		int a=Integer.parseInt(scanner.next());
		int b=Integer.parseInt(scanner.next());
		System.out.println(a+b);
		
		//输入字符串比较其中的某个字符
		System.out.println("输入一个字符串");
		System.out.println(new SumE().sumE(scanner.next()));
		
	}
}

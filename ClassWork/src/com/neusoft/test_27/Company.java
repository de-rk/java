package com.neusoft.test_27;

import java.util.Scanner;

public class Company {
	public static void print(ColaEmployee a,int b) {
		a.getSalary(b);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入需要查询的员工月份工资");
		int b=scanner.nextInt();
		ColaEmployee h=new HourlyEmployee("jerry", 10,161);
		ColaEmployee s=new SalesEmployee("anna",10,20000);
		ColaEmployee ms=new SalariedEmployee("tonm",10,4000);
		print(h,b);
		print(s,b);
		print(ms,b);
	}
}

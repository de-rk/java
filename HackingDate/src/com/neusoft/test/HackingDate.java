package com.neusoft.test;
import java.time.*;
import java.util.Scanner;
public class HackingDate {
public static void main(String[] args) {
//LocalDate currentDate = LocalDate.now();
//System.out.println(LocalDate.now());
//System.out.println((int)('a'-'A'));
	//第一题  已知a，b均是整数，互换值
	/*int a=2;int b=3;
	int c;
	c=a;a=b;b=c;
	System.out.println("a="+a+"b="+b);*/
	//第二题   给定0～1000的整数，求各位的和，列如345结果为3+4+5=12
	//可以先模后除，也可以先除后模
	/*
	System.out.print("请输入0～1000内的整数");
	int a=scanner.nextInt();
	System.out.print(a+"的结果是"+a/100+"+"+a/10%10+"+"+a%10+"="+((a/100)+(a/10%10)+(a%10)));*/
	Scanner scanner=new Scanner(System.in);
//	第三题 华氏温度和摄氏温度互相转换，从华氏度变成摄氏度你只要减去32，乘以5再除以9就行了，
//	将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。[选做题]
	/*System.out.print("请输入今天温度：");
	double a=scanner.nextDouble();
	System.out.println("转换为华氏温度为："+(((a*9)/5)+32));
	System.out.print("请再次输入摄氏温度：");
	double b=scanner.nextDouble();
	System.out.println("转换为华氏温度为："+((b-32)*5)/9);*/
//	第四题  给定一个任意的大写字母A~Z，转换为小写字母。 （知识点：变量和运算符） [选做题]
	/*System.out.print("请输入一个大写字母：");
	char a=scanner.next().charAt(0);//                     .charAt(0);用来接收char类型的数据
	System.out.print("转换为小写为："+(char)(a+32));*/	
	}
}
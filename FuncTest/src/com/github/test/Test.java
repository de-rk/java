package com.github.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Laptop("red",5800).print();//调用同包的类方法
		//Scanner scanner=new Scanner(System.in);
		Student stu1=new Student(001,43.5,"Anna");
		Student stu2=new Student(002,23.56,"Jerry");
		Student stu3=new Student(003,78.2,"Mary");
		Student[] stu= {stu1,stu2,stu3};
		//以上解决传输数据的问题，将不同类型的数据保存在新的实例当中，并赋给数组。使用的时候使用 『.属性名』
		Student sum1;
		//下面就是冒泡排序的内容
		for (int i=0;i<stu.length;i++) 
			for (int j=0;j<stu.length-1;j++)
				if (stu[j].sum<stu[j+1].sum) {
					sum1=stu[j];
					stu[j]=stu[j+1];
					stu[j+1]=sum1;
				}
		for (int i=0;i<stu.length;i++)
			System.out.println(stu[i].id+" "+stu[i].sum+" "+stu[i].name);	
	}
}

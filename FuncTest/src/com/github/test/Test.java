package com.github.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Laptop("red",5800).print();//����ͬ�����෽��
		//Scanner scanner=new Scanner(System.in);
		Student stu1=new Student(001,43.5,"Anna");
		Student stu2=new Student(002,23.56,"Jerry");
		Student stu3=new Student(003,78.2,"Mary");
		Student[] stu= {stu1,stu2,stu3};
		//���Ͻ���������ݵ����⣬����ͬ���͵����ݱ������µ�ʵ�����У����������顣ʹ�õ�ʱ��ʹ�� ��.��������
		Student sum1;
		//�������ð�����������
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

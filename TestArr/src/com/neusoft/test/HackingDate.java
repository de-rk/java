package com.neusoft.test;
import java.time.*;
import java.util.Scanner;
public class HackingDate {
public static void main(String[] args) {
//LocalDate currentDate = LocalDate.now();
//System.out.println(LocalDate.now());
//System.out.println((int)('a'-'A'));
	//��һ��  ��֪a��b��������������ֵ
	/*int a=2;int b=3;
	int c;
	c=a;a=b;b=c;
	System.out.println("a="+a+"b="+b);*/
	//�ڶ���   ����0��1000�����������λ�ĺͣ�����345���Ϊ3+4+5=12
	//������ģ�����Ҳ�����ȳ���ģ
	/*
	System.out.print("������0��1000�ڵ�����");
	int a=scanner.nextInt();
	System.out.print(a+"�Ľ����"+a/100+"+"+a/10%10+"+"+a%10+"="+((a/100)+(a/10%10)+(a%10)));*/
	Scanner scanner=new Scanner(System.in);
//	������ �����¶Ⱥ������¶Ȼ���ת�����ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9�����ˣ�
//	�����϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�[ѡ����]
	/*System.out.print("����������¶ȣ�");
	double a=scanner.nextDouble();
	System.out.println("ת��Ϊ�����¶�Ϊ��"+(((a*9)/5)+32));
	System.out.print("���ٴ����������¶ȣ�");
	double b=scanner.nextDouble();
	System.out.println("ת��Ϊ�����¶�Ϊ��"+((b-32)*5)/9);*/
//	������  ����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ�� ��֪ʶ�㣺������������� [ѡ����]
	/*System.out.print("������һ����д��ĸ��");
	char a=scanner.next().charAt(0);//                     .charAt(0);��������char���͵�����
	System.out.print("ת��ΪСдΪ��"+(char)(a+32));*/	
	}
}
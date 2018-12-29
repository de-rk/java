package com.neusoft.test_25;

//���ԣ�������ëɫ������
//
//��Ϊ����ʾ����������
public class Cat {
	String name;
	String color;
	int age;
	public Cat(String name, String color,int age) {
		this.name=name;
		this.color=color;
		this.age=age;
		System.out.println(name+color);
	}
	public void showName() {
		System.out.println("My name is "+name);
	} 
	public void call() {
		System.out.println("It`s so sweet");
	}
}
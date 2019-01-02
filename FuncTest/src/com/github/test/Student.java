package com.github.test;


public class Student {
	private int age;
	
	public int getAge() {
		return age;
	}
	public int setAge(int age) {
		if (age>35||age<18) {
			return this.age;
		}
		else {
			this.age=age;
			return age;
			}
		}
	//构造器，将每个学生数据初始化
	int id;
	double sum;
	String name;
	public Student(int id,double sum,String name) {
		this.id=id;
		this.sum=sum;
		this.name=name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}

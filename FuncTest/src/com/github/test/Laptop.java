package com.github.test;

public class Laptop {
	int cpu;
	String color;
	public Laptop() {}//�޲ι��췽��
	public Laptop(String color,int cpu) {
		this.color=color;
		this.cpu=cpu;
	}
	public void print(String color,int cpu) {
		System.out.println("��ɫ"+color+" \ncpu"+cpu);
	}
	public void print() {
		System.out.println("��ɫ"+color+" \ncpu"+cpu);
	}
}

package com.github.test;

public class Laptop {
	int cpu;
	String color;
	public Laptop() {}//无参构造方法
	public Laptop(String color,int cpu) {
		this.color=color;
		this.cpu=cpu;
	}
	public void print(String color,int cpu) {
		System.out.println("颜色"+color+" \ncpu"+cpu);
	}
	public void print() {
		System.out.println("颜色"+color+" \ncpu"+cpu);
	}
}

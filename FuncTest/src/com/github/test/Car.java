package com.github.test;

public class Car extends Vehicle{
	int loader;
	public Car(int loader,String brand,String color) {
		super( brand, color);
		this.loader=loader;
	}
	public void run(int speed) {
		System.out.println("����"+loader+"����"+speed+"������ٶ���ʻ1");
	}
	public static void main(String[] args) {
		new Car(2,"honda","red").run(20);
	}
}

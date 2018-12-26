package com.github.test;

public class Vehicle {
	private final String brand;
	private String color;
	private double speed;
	
	//访问器方法sourse->generate Getters and Stetters
	//也就是创建get变量名和set变量名的方法
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public Vehicle(String a,String b) {
		brand=a;
		color=b;
		speed=0;
	}
	public String run(double c) {
		return "以"+c+"公里的速度行驶";
	}
}

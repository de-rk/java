package com.github.test;

public class Vehicle {
	private final String brand;
	private String color;
	private double speed;
	
	//����������sourse->generate Getters and Stetters
	//Ҳ���Ǵ���get��������set�������ķ���
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
		return "��"+c+"������ٶ���ʻ";
	}
}

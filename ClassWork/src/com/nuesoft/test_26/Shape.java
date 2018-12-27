package com.nuesoft.test_26;

public class Shape {
	double area;
	double per;
	String color;
	public Shape() {}
	public Shape(String color) {
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public double getArea() {
		return area;
	}
	public double getPer() {
		return per;
	}
	public void showAll() {
		System.out.println("面积"+area+"周长"+per);
	}
}

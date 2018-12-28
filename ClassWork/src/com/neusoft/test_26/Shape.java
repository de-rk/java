package com.neusoft.test_26;

public abstract class Shape {
	static double area;
	static double per;
	private String color;
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
	public abstract double getArea();
	public abstract double getPer(double height,double width);
	public abstract void showAll(double height,double width);
}

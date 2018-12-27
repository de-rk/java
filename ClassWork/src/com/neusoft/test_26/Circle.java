package com.neusoft.test_26;

final class Circle extends Shape{
	double radius;
	public double getArea(){
		return area;
	}
	public double getPer() {
		return per;
	}
	public void showAll() {
		System.out.println("面积"+area+"周长"+per);
	}
	public static void main(String[] args) {
		new Circle().showAll();
		new Rectangle(20,30,"red").showAll();
	}
}

package com.github.test;

public class Radius {
	double radius;
	double PI=3.14;
	public Radius(double radius) {
		this.radius=radius;
	}
	public void Radius () {
		if (radius>=0)
			System.out.println("园的周长等于"+radius*PI*2+"面积等于"+PI*radius*radius);
		else 
			System.out.println("请确认您的输入");
	}
}

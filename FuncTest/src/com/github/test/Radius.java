package com.github.test;

public class Radius {
	double radius;
	double PI=3.14;
	public Radius(double radius) {
		this.radius=radius;
	}
	public void Radius () {
		if (radius>=0)
			System.out.println("԰���ܳ�����"+radius*PI*2+"�������"+PI*radius*radius);
		else 
			System.out.println("��ȷ����������");
	}
}

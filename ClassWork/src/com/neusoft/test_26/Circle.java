package com.neusoft.test_26;

import java.util.Scanner;

final class Circle extends Shape{
	double radius;
	final double PI=3.14;
	@Override
	public double getArea(double radius){
		return area=PI*radius*radius;
	}
	@Override
	public double getPer(double height,double width) {
		return per=height*width;
	}
	@Override//��д�����ǵü� override
	public void showAll(double height,double width) {
		System.out.println("���"+getArea(height,width)+"�ܳ�"+getPer(height,width));
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		new Circle().showAll(scanner.nextDouble(),scanner.nextDouble());
		//new Rectangle(20,30,"red").showAll();
	}
}

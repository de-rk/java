package com.neusoft.test_26;

public class Rectangle extends Shape{
	double height;
	double width;
	public Rectangle() {}
	public Rectangle(double height,double width,String color) {
		super("red");
		this.height=height;
		this.width=width;
	}
	@Override
	public double getArea(double height,double width){
		area=height*width;
		return area;
	}
	@Override
	public double getPer(double height,double width) {
		per=2*(height+width);
		return per;
	}
	@Override//��д�����ǵü� override
	public void showAll() {
		System.out.println("���"+area+"�ܳ�"+per);
	}
}

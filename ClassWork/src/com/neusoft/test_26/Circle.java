package com.neusoft.test_26;

public class Circle extends Shape{
    private double radius;
    final double PI=3.14;
    public Circle(){}
    public Circle(double radius,String color){
        super(color);
        this.radius=radius;
    }
    public double getPer(){
        return 2*PI*radius;
    }
    public void showAll(){
        System.out.println(color+"色圆的面积："+getArea()+"周长："+getPer());
    }
    public double getArea(){
        return PI*radius*radius;
    }
}

package com.neusoft.test_26;

public class Rectangle extends Shape{
    private double height;
    private double width;
    public Rectangle(){}
    public Rectangle(double height,double width,String color){
        super(color);
        this.height=height;
        this.width=width;
    }
    @Override
    public double getPer(){
        return (height+width)*2;
    }
    @Override
    public void showAll(){
        System.out.println(super.color+"色的矩形面积："+getArea()+"周长:"+getPer());
    }
    @Override
    public double getArea(){
        return height*width;
    }
}

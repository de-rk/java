package com.neusoft.test_26;

public abstract class Shape {
    private double area;
    private double per;
    String color;
    public Shape(){}
    public Shape(String color){
        this.color=color;
    }
    public abstract double getPer() ;
    public abstract void showAll();
    public abstract double getArea();
}

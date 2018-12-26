package com.github.test;

public class Point {
	int x,y;
	public Point() {
		
	}
	public Point(int x0,int y0) {
		x=x0;
		y=y0;
		System.out.println(x+" "+y);
	}
	public void movePoint(int dx,int dy) {
		x=dx;
		y=dy;
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		Point p1=new Point(1,1);
		Point p2=new Point();
		p1.movePoint(2, 7);
		p2.movePoint(5, 9);
		//new Point(4,7);
		//new Point().movePoint(7,9);
	}
}

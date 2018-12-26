package com.github.test;

public class One extends Two{//class one extends of two
	public One(){
		System.out.println("loading one class");
	}
	public static void main(String[] args) {
		new One();
	}
}

package com.neusoft.test_27;

public class Chinese {
	String name;
	static String country;
	String age;
	static {//just class 
		System.out.println("static");
	}
	static void string() {
		System.out.println("string");
	}
	public static void main(String[] args) {
		string();
	}
}

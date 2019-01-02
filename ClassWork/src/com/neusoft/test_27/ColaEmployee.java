package com.neusoft.test_27;

public class ColaEmployee {
	private String name;
	private int month;
	 ColaEmployee(String name,int month) {
		this.month = month;
		this.name=name;
	}
	public int getMonth() {
		return month;
	}
	public String getName() {
		return name;
	}
	public void getSalary(int month) {
		System.out.println(" ¼Ó 100");
	}
}

package com.neusoft.test_27;

public class SalariedEmployee extends ColaEmployee{
	private int monSal;
	public SalariedEmployee(String name ,int month,int monSal) {
		super(name,month);
		this.monSal=monSal;
	}
	public void getSalary(int month) {
		if (month==super.getMonth())
			System.out.println(super.getName()+"  "+(monSal+100));
		else
			System.out.println(super.getName()+"  "+monSal);
	}
}

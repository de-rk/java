package com.neusoft.test_27;

public class SalariedEmployee extends ColaEmployee{
	int monSal;
	public SalariedEmployee(int monSal) {
		this.monSal=monSal;
	}
	public double getSalary(int month) {
		if (month==super.month)
			return monSal+100;
		else
			return monSal;
	}
}

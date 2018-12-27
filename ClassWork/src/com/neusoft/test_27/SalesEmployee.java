package com.neusoft.test_27;

public class SalesEmployee extends ColaEmployee{
	int yuexiao;
	double ticheng;
	public SalesEmployee(int yuexiao,double ticheng) {
		this.yuexiao=yuexiao;
		this.ticheng=ticheng;
	}
	public double getSalary(int month) {
		if (month==super.month)
			return yuexiao*ticheng+100;
		else
			return yuexiao*ticheng;
	}
}

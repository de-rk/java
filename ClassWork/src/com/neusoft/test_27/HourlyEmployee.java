package com.neusoft.test_27;

public class HourlyEmployee extends ColaEmployee{
	int hourSal;
	int monWorkTime;
	public HourlyEmployee(int hourSal,int monWorkTime) {
		this.hourSal=hourSal;
		this.monWorkTime=monWorkTime;
	}
	public double getSalary(int month) {
		if (monWorkTime-160>0)
			if (month==super.month)
				return (monWorkTime-160)*hourSal*1.5+monWorkTime*hourSal+100;
			else
				return (monWorkTime-160)*hourSal*1.5+monWorkTime*hourSal;
		else 
			if (month==super.month)
				return monWorkTime*hourSal+100;
			else
				return monWorkTime*hourSal;
	}
}

package com.neusoft.test_27;

public class HourlyEmployee extends ColaEmployee{
	private int hourSal=15;
	private int monWorkTime;
	public HourlyEmployee(String name,int month,int monWorkTime) {
		super(name,month);
		this.monWorkTime=monWorkTime;
	}
	public void getSalary(int month) {
		if (super.getMonth()==month) {
			if (monWorkTime>160)
				System.out.println(super.getName()+"  "+((monWorkTime-160)*hourSal*1.5+160*hourSal+100));
			else
				System.out.println(super.getName()+"  "+(monWorkTime*hourSal+100));
		}
		else {
			if (monWorkTime>160)
				System.out.println(super.getName()+"  "+((monWorkTime-160)*hourSal*1.5+160*hourSal));
			else
				System.out.println(super.getName()+"  "+ monWorkTime*hourSal);
		}
	}
}

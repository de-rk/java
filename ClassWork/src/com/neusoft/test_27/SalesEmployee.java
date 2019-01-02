package com.neusoft.test_27;

public class SalesEmployee extends ColaEmployee{
	int yuexiao;
	double ticheng=0.14;
	public SalesEmployee(String name,int month,int yuexiao) {
		super(name,month);
		this.yuexiao=yuexiao;
	}
	public void getSalary(int month) {
		if (month==super.getMonth())
			System.out.println(super.getName()+"  "+(yuexiao*ticheng+100));
		else
			System.out.println(super.getName()+"  "+(yuexiao*ticheng));;
	}
}

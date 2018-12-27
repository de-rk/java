package com.neusoft.test_27;

public class Company {
	public void print(ColaEmployee a) {
		System.out.println("benyuegongzi:"+a.getSalary(10));
	}
	public static void main(String[] args) {
		ColaEmployee h=new HourlyEmployee(18, 160);
		ColaEmployee s=new SalesEmployee(20000,0.15);
		ColaEmployee ms=new SalariedEmployee(4000);
		new Company().print(h);
		new Company().print(s);
		new Company().print(ms);
	}
}

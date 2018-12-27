package com.nuesoft.test_27;

public class Parker extends Vehicle{
	public void fee(Vehicle fee,int a) {
		System.out.println(fee.fare(a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parker a=new Parker();
		Vehicle c=new Car();
		Vehicle t=new Truck();
		Vehicle b=new Bus();
		a.fee(c,10);
		a.fee(b,4);
		a.fee(t,6);
	}

}

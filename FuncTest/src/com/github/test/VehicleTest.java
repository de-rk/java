package com.github.test;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle a=new Vehicle("benz", "红");
		System.out.println(a.getColor()+"色的"+a.getBrand()+"汽车正"+a.run(100));
	}

}

package com.neusoft.test_27;

public class Sub extends Super{
	@Override
	public void getNum() {
		System.out.println("right getNum");
	}
	//name same return not same
	/*public int getNum() {   //same methods 
		return 1;
	}*/
	//return same ,but parameter not same
	public void getNum(int a) {}//different methods
	//return not same and parameter not same
	public int getNum(double a){//different methods
		return 3;
	}
	
}

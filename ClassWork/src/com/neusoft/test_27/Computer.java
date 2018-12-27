package com.neusoft.test_27;

public class Computer extends Student{
	double make;
	double write;
	double qizhong;
	double qimo;
	public Computer(int make,int write,int qizhong,int qimo) {
		this.make=make*0.4;
		this.write=write*0.2;
		this.qizhong=qizhong*0.20;
		this.qimo=qimo*0.20;
	}
}

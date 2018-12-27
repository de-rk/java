package com.neusoft.test_27;

public class Literature extends Student{
	double speak;
	double works;
	double qizhong;
	double qimo;
	public Literature(int speak,int works,int qizhong,int qimo) {
		this.speak=speak*0.35;
		this.works=works*0.35;
		this.qizhong=qizhong*0.15;
		this.qimo=qimo*0.15;
	}
}

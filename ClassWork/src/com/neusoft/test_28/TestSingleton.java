package com.neusoft.test_28;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Singleton.getA());
		System.out.println(Singleton.getA());
		//只能通过Singleton的全局访问点来获取
		//唯一的一个实例
		//这就是单例模式
	}

}

package com.neusoft.test_28;

public class Singleton {
	private static Singleton a=new Singleton();
	//首先类加载初始化时实例化变量
	private Singleton() {}
	public static Singleton getA() {
		return a;
		//通过访问全局访问点来获取唯一的实例
		//这就是单例模式
	}
}

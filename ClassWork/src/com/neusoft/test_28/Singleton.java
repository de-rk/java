package com.neusoft.test_28;

public class Singleton {
	private static Singleton a=new Singleton();
	//��������س�ʼ��ʱʵ��������
	private Singleton() {}
	public static Singleton getA() {
		return a;
		//ͨ������ȫ�ַ��ʵ�����ȡΨһ��ʵ��
		//����ǵ���ģʽ
	}
}

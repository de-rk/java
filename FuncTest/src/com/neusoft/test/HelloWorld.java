package com.neusoft.test;

public class HelloWorld {
	//args ������ �β�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Hello\n World\r!!!");
		System.out.println((int)0X0061);
		System.out.println((int)0141);
		System.out.println((int)0X61);*/
		int i=1;
		boolean b= i!=1 && (i++)==2;//�������Կ�
		System.out.println(b);
		System.out.println(i);
		
		b=i!=1&(i++)==2;//&��&&�����߼�������������ж�����ͬʱ����Ϊ�棬����Ϊ�٣�����&&����һ����������֮�󣬺������������ִ���ˣ���&���Ǽ���ִ�У�ֱ�������������ִ����Ϊֹ��
		System.out.println(b);
		System.out.println(i);//Ӧ����2
		
		b=i==2||(i++)==2;
		System.out.println(b);
		System.out.println(i);
		
		
		b=i==2|(i++)==3;
		System.out.println(b);
		System.out.println(i);
	}

}

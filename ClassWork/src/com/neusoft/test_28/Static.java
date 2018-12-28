package com.neusoft.test_28;

class Static {
	static String name="jerry";
	int a=199;
	public static void print() {
		System.out.println(new Static().a);
		//3 three new Static 4 end .a
		System.out.println(name);//5 over
	}
	public static void main(String[] args) {
		print();//2 two
	}
	{//3 loading
		System.out.println("chuntianlilaibaihuakai");
	}
	static {//1 first
		System.out.println("hahahha");
	}

}

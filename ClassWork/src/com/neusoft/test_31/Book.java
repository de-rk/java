package com.neusoft.test_31;
//最后的需求说明
public class Book {
	private String bookName;
	private double price;
	private int num;
	private double totalPrice;
	public Book(String bookName,double price,int num) {
		this.bookName=bookName;
		this.num=num;
		this.price=price;
	}
	public void show() {
		totalPrice=num*price;	
		if (num>=0&&num<11) 
			System.out.println("总价："+totalPrice);
		else if (num>10&&num<20) 
			System.out.println("总价："+totalPrice*0.9);
		else if (num>=20) 
			System.out.println("总价："+totalPrice*0.8);
		else
			System.out.println("书籍数量不能小于零");
	}
}

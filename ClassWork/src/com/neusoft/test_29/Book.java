package com.neusoft.test_29;

public class Book{
    //第五题
    private String bookName;
    private int num;//数量
    private double price;//单价
    public Book(String bookName,int num,double price){
        this.bookName=bookName;
        this.num=num;
        this.price=price;
    }
    public Book(String bookName,int num){
        this.bookName=bookName;
        this.num=num;
    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;    
    }
    public void setPrice(double price) {
		this.price = price;
	}
    public double getPrice() {
	return price;
    }
    public void showAll(){
        System.out.println("书名："+bookName+" 数量："+num+" 单价："+price);
    }
}
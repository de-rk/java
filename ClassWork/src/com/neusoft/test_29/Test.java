package com.neusoft.test_29;

public class Test{
    //第五题
    public static void main(String[] args){
    Book b=new Book("Open World",10,28.3);
    Book b1=new Book("大世界",10);
    b1.setPrice(29.4);
    b.showAll();
    b1.showAll();
    }
}
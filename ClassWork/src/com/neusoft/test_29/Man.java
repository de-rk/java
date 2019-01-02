package com.neusoft.test_29;
public class Man{
    public static void main(String[] args){
    	//第三题
        Account a=new Account(1,100);
        a.save(12);
        a.withdrawal(1);
        System.out.println(a.select());
    }
}

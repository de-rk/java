package com.neusoft.test_29;

public class Account{
    //第三题
    private int id;
    private double balance;
    public Account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    //存款
    public void save(int save){
        balance+=save;    
    }
    //取款
    public void withdrawal(int withdrawal){
        balance-=withdrawal;    
    }
    //余额查询
    public double select(){
        return balance; 
    }
}
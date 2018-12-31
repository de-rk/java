package com.neusoft.test_29;
//第六题
public class Worker extends People{
    private int workerId;
    public Worker(String name,int age,String sex,int workerId){
        super(name,age,sex);
        this.workerId=workerId;
    }
    @Override
    public void out(){
        System.out.println("工人做公交车出行");    
    }
}
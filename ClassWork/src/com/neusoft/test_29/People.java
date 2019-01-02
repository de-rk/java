package com.neusoft.test_29;
//第六题
public abstract class People{
    private String name;
    private int age;
    private String sex;
    public People(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    public abstract void out();
}
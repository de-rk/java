package com.neusoft.test_29;
//第六题
public class Boss extends People{
    private String carId;
    public Boss(String name,int age,String sex,String carId){
        super(name,age,sex);
        this.carId=carId;
    }
    @Override
    public void out(){
        System.out.println("老板开车出行");
    }
}
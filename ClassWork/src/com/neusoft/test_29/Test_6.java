package com.neusoft.test_29;
//第六题
public class Test_6{
    public static void main(String[] args){
        People a=new Students("John",18,"男",001);
        People b=new Worker("Mack",36,"男",007);
        People c=new Boss("King",37,"男","RK1999");
        People[] people= {a,b,c};
       people[0].out();
       people[1].out();
       people[2].out();
    }
}
package com.neusoft.test_29;

public class Clock{
	//第四题
    public int shi;
    public int fen;
    public int miao;
    public Clock(int shi,int fen ,int miao){
        this.shi=shi;
        this.fen=fen;
        this.miao=miao;
    }
    public void show(){
        System.out.println("Colck "+shi+":"+fen+":"+miao);
    }
}
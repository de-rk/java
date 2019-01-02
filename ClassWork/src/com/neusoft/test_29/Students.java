package com.neusoft.test_29;
//第六题
public class Students extends People{
    private int studentId;
    public Students(String name,int age,String sex,int studentId){
        super(name,age,sex);
        this.studentId=studentId;
    }
    @Override
    public void out(){
        System.out.println("学生骑自行车出行");
    }
}

package com.neusoft.test_29;

public class Student {
	//第二题
    private String name;
	private int age;
	private int score;
	private String classNum;//班号例如“class05”
	public Student(String name, int age, int score, String classNum) {
	        this.name=name;
                this.age=age;
                this.score=score;
                this.classNum=classNum;
	}
        public int getAge(){
            return age;        
        }
        public int getScore(){
            return score;        
        }
        public String getClassNum(){
            return classNum;        
        }
	
	
}

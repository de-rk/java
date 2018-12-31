package com.neusoft.test_29;

public class Run {
	public static void main(String[] args) {
		//第二题
		Student a=new Student("Tom", 18, 100, "class05");  
		Student a1=new Student("Jerry", 22, 70, "class04"); 
		Student a2=new Student("Owen", 25, 90, "class05"); 
		Student a3=new Student("Jim", 30,80 , "class05");
		Student a4=new Student("Steve", 28, 66, "class06");
		Student a5=new Student("Kevin", 24, 100, "class04");
		Student[] b= {a,a1,a2,a3,a4,a5};
//		1） 计算所有学生的平均年龄
//		2） 计算各个班级的平均分
                int sum=0;
                int[] count=new int[3];
                int[] scores=new int[3];
                String si="class04";
                String wu="class05";
                String liu="class06";
                for (int i=0;i<b.length;i++){
                    if (b[i].getClassNum()==si) {
                        scores[0]+=b[i].getScore();
                        count[0]++;
                        }
                    if (b[i].getClassNum()==wu) {
                        scores[1]+=b[i].getScore();
                        count[1]++;
                        }
                    if (b[i].getClassNum()==liu) {
                        scores[2]+=b[i].getScore();
                        count[2]++;
                        }
                    sum+=b[i].getAge();    
                }
                System.out.println(sum/b.length);
                for (int i=0;i<scores.length;i++)
	           System.out.println(b[i].getClassNum()+"班平均分="+scores[i]/count[i]);  
	}
}

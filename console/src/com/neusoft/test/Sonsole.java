package com.neusoft.test;
import java.util.Random;
import java.util.Scanner;
public class Sonsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
/*		outer: for(int i=0;i<10;i++) {
			System.out.println("Outer loop");
			
			inner: while(true) {
				Scanner sc=new Scanner(System.in);
				String s=sc.next();
				System.out.println("inner loop"+s);
				if (s.equals("hello"))
					break inner;
				if (s.equals("kitty"))
					break outer;
			}
		}*/
		/*for (int i=1;i<50;i++) {
			if (i%2==0)
				continue;//continue除以二为0退出“本次循环”，break直接退出循环
			System.out.print(i+" ");//输出50以内的奇数
		}*/
		//第一题 企业发放的奖金根据利润提成，利润小于等于10万，提成10%；
		//		利润高于10万小于等于20万，高于10万的可提成7.5%；
		//		高于20，低于和等于40万时，高于20万的部分5%的提成；
		//		高于40万，低于等于60万时，高于40万的部分3%的提成；
		//		高于60万，低于等于100万，好于60万的部分1.5%的提成；
		//							高于100万，1%的提成。
		/*int yj=scanner.nextInt();
		if (yj<=100000)
			System.out.println("提成10%="+yj*0.1);
		else if (yj<=200000)
			System.out.println("提成7.5%="+yj*0.075);
		else if (yj<=400000)
			System.out.println("提成5%="+yj*0.05);
		else if (yj<=600000)
			System.out.println("提成3%="+yj*0.03);
		else if (yj<=1000000)
			System.out.println("提成1.5%="+yj*0.015);
		else 
			System.out.println("提成1%="+yj*0.01);*///不科学的算法
//		第二题   给定一个成绩a，使用switch结构求出a的等级。
//		A：90-100，B：80-89，C：70-79，D：60-69，E：0~59
//		（知识点：条件语句switch）[必做题]
		/*int cj=scanner.nextInt();
		int a=cj/10;
		switch (a) {
		case 10:
		case 9:
			System.out.println("90-100");
			break;
		case 8:
			System.out.println("80-89");
			break;
		case 7:
			System.out.println("70-79");
			break;
		case 6:
			System.out.println("60-69");
			break;
		default:
			System.out.println("0~59");
			break;
			}*/
//		第三题 假设某员工今年的年薪是30000元，年薪的年增长率6%。
//		编写一个Java应用程序计算该员工10年后的年薪，并统计未来10年（从今年算起）总收入。
//		（知识点：循环语句for）[选做题]
		/*double sr=30000;
		double sum = 0;
		for (int i=1;i<=10;i++) {
			System.out.println("第"+i+"年收入："+sr);
			sum=sum+sr;
			System.out.println(i+"年总收入："+sum);
			sr=sr*1.06;//第一年算第二年的收入，第九年算第十年的收入
		}*/
//		第四题 猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个，第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
//		以后每天早上都吃了前一天剩下的一半零一个。
//		到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。（知识点：循环语句 while）[选做题]
		/*int x=0;
		int sum=1;
		while (x<10) {
			System.out.println("第"+(10-x)+"天剩余"+sum+"个桃子");
			sum=(sum+1)*2;
			x++;
		}*///结果1534个桃子
//		第五题    输入一个数字，判断是一个奇数还是偶数（知识点：条件语句） [必做题]
		/*int a=scanner.nextInt();
		if (a%2==0)
			System.out.println(a+"为偶数");
		else 
			System.out.println(a+"为奇数");*/
//		第六题 编写程序， 判断一个变量x的值，如果是1，输出x=1，
//		如果是5，输出x=5，如果是 10，输出x=10，
//		除了以上几个值，都输出x=none。（知识点：条件语句） [必做题]
		/*int x=new Random().nextInt(11);
		System.out.println(x);
		switch (x) {
		case 1:
			System.out.println("x=1");
			break;
		case 5:
			System.out.println("x=5");
			break;
		case 10:
			System.out.println("x=10");
			break;
		default:
			System.out.println("x=none");
			break;
		}*/
//		第七题 判断一个数字是否能被5和6同时整除（打印能被5和6整除），
//		或只能被5整除（打印能被5整除），或只能被6整除，（打印能被6整除），
//		不能被5或6整除，（打印不能被5或6整除）（知识点：条件语句） [必做题]
		/*int x=scanner.nextInt();
		if (x%5==0&&x%6==0)
			System.out.println("能被5和6整除");
		else if (x%5==0&&x%6!=0)
			System.out.println("能被5整除");
		else if (x%5!=0&&x%6==0)
			System.out.println("能被6整除");
		else
			System.out.println("不能被5或6整除");*/
//	 第八题 输入一个年份，判断这个年份是否是闰年（知识点：条件、循环语句） [必做题]
		/*int n=scanner.nextInt();
		if (n%4==0) {
			if (n%400!=0&&n%100==0)
			//大多数能被4整除的数都是闰年。但是能被100整除而不能被400整除的例外
			System.out.println("不是闰年");
			else 
				System.out.println("是闰年");
			}*/
//		第九题  输入一个0～100的分数，如果不是0～100之间，打印分数无效，根据分数等级打印A,B,C,D,E
//		（知识点：条件语句if elseif） [必做题]
		/*int a=scanner.nextInt();
		if (a>100)
			System.out.println("分数无效");
		else if (a>=90&&a<=100)
			System.out.println("等级为：A");
		else if (a>=80)
			System.out.println("等级为：B");
		else if (a>=70)
			System.out.println("等级为：C");
		else if (a>=60)
			System.out.println("等级为：D");
		else if (a<60&&a>=0)
			System.out.println("等级为：E");
		else
			System.out.println("分数无效");*/
//		第十题 输入三个整数x,y,z，请把这三个数由小到大输出（知识点：条件语句） [必做题]
		int x,y,z;
		System.out.println("请输入三个数");
		System.out.print("x：");
		x=scanner.nextInt();
		System.out.print("y：");
		y=scanner.nextInt();
		System.out.print("z：");
		z=scanner.nextInt();
		if (x>y&&x>z&&y>z)
			System.out.println(x+"\n"+y+"\n"+z);
		else if (x>y&&x>z&&y<z)
			System.out.println(x+"\n"+z+"\n"+y);
			
			
			
	}
}

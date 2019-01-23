package service;

import java.util.Scanner;

import console.Tuichu;
import dao.UserDao;

public class Zhu {

	//判断num是否为exit
	private static String num="";
	public static String getNum() {
		return num;
	}
	static Tuichu t=new Tuichu();
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("\t"+"图书管理");
		System.out.println("1.注册"+"\t"+"2.登入");
		System.out.println("输入exit退出系统");
		System.out.println("登入以后输入..返回上一级");
		t.start();
		num=scanner.next();
		
		
		//1.注册
		if (num.equals("1")) {
			int b=LoginC.signUp();
			new UserDao().isOK(b);
		}
		//2.登入
		else if (num.equals("2")) {
			LoginC.login();
		}else {
			if (!num.equals("exit")) {
				System.out.println("无效输入");
			}
		}
	}
	public static void e() {
		System.out.println("退出成功");
		System.exit(0);
	}
}

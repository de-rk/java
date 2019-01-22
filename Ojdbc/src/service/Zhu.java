package service;

import java.util.Scanner;

import dao.UserDao;
import dao.Userdb;

public class Zhu {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String num;
		
		System.out.println("\t"+"图书管理");
		System.out.println("1.注册"+"\t"+"2.登入");
		System.out.println("输入exit退出系统");
		System.out.println("输入..返回上一级");
		
		num=scanner.next();
		
		//1.注册
		if (num.equals("1")) {
			int b=LoginC.signUp();
			new UserDao().isOK(b);
		}
		//2.登入
		else if (num.equals("2")) {
			LoginC.login();
		}else if (num.equals("exit")){
			System.out.println("退出成功");
			System.exit(0);
		}else {
			System.out.println("无效输入");
		}
	}
}

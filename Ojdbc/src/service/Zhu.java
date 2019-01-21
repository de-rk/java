package service;

import java.util.Scanner;

import console.LoginC;
import console.User;
import dao.Dao;
import dao.Userdb;
import dao.UserDao;

public class Zhu {
		
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("\t"+"图书管理");
		Userdb user = new Userdb();
		System.out.println("1.注册"+"\t"+"2.登入");
		String c=scanner.next();
		
		if (c.equals("1")) {
			//1.注册
			LoginC.signUp();
		}
		else if (c.equals("2")) {
			//2.登入
			System.out.println("\t"+"图书管理系统--登入");
			
			System.out.print("userid:");
			user.setUserid(scanner.nextInt());
			System.out.print("password:");
			user.setPassword(scanner.next());
			
			//5.处理结果
			user=LoginC.login(user);
			
			//选项,输入错误会有空指针异常
			if (user!=null&&user.getIsDelete()!=1) {
				if (user.getPro()==1)
					User.adminC(user);
				else
					User.userC(user);
			}else if(user!=null&&user.getIsDelete()==1) {
				System.out.println("账户已被管理员删除");
			}
		}else {
			System.out.println("无效输入");
		}
	}
}

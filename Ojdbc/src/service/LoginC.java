package service;

import java.util.Scanner;
import dao.LoginDao;
import dao.Userdb;

public class LoginC{
	//登入
	public static void login() {
		System.out.println("\t"+"登入");
		System.out.print("userid:");
		
		Scanner scanner=new Scanner(System.in);
		Userdb user = new Userdb();
		
		user.setUserid(scanner.nextInt());
		System.out.print("password:");
		user.setPassword(scanner.next());
		
		//5.处理结果
		user=new LoginDao().login(user);
		//选项,输入错误会有空指针异常
		if (user==null) {
			login();
		}else if(user.getIsDelete()!=1) {
				if (user.getPro()==1)
					User.adminC(user);
				else
					User.userC(user);
		}else if(user.getIsDelete()==1) {
			System.out.println("账户已被管理员删除");
			Zhu.t.stop();
		}
	}
	
	//注册
	public static int signUp() {
		System.out.println("\t"+"注册用户");
		return new LoginDao().signUp();
	}
}

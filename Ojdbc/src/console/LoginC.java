package console;

import dao.LoginDao;
import dao.Userdb;

public class LoginC{
	//登入
	public static Userdb login(Userdb user) {
		return new LoginDao().login(user);
	}
	
	//注册
	public static void signUp() {
		System.out.println("\t"+"user sign up");
		new LoginDao().signUp();
	}
}

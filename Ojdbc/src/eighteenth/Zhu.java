package eighteenth;

import java.util.Scanner;

public class Zhu {
		
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("\t"+"图书管理");
		Userdb user = new Userdb();
		System.out.println("1.注册"+"\t"+"2.登入");
		String c=scanner.next();
		if (c.equals("1"))
			Caozuo.signUp();
		else if (c.equals("2")) {
			System.out.println("\t"+"图书管理系统--登入");
			System.out.print("userid:");
			user.setUserid(scanner.nextInt());
			System.out.print("password:");
			user.setPassword(scanner.next());
			
			//5.处理结果
			//获取登入后的用户对象
			user=Caozuo.login(user);
			
			//选项,输入错误会有空指针异常
			if (user!=null&&user.getIsDelete()!=1) {
				if (user.getPro()==1)
					User.admin(user);
				else
					User.user(user);
			}else {
				System.out.println("账户已被管理员删除");
			}
		}
		else
			System.out.println("无效输入");
			
	}
}

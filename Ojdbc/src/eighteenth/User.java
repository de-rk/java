package eighteenth;

import java.util.Scanner;

public class User {
	/**
	 * @param 普通用户
	 * 	查看图书，需改密码
	*/
	public static void user(Userdb user) {
		System.out.println("\t"+"你好"+user.getUname());
		System.out.println("1.查看图书"+"\t"+"2.修改密码");
		
		//收集操作指令
		Scanner scanner=new Scanner(System.in);
		String num=scanner.next();
		
		if (num.equals("1")) {
			//1.查看图书
			
		}else if (num.equals("2")) {
			//2.修改密码
			String sql="update userdb set password=? where userid=?";
			System.out.print("请输入密码:");
			num=scanner.next();
			
			Object[] oj={num,user.getUserid()};
			int b=Db.update(sql, oj);
			if (b!=0)
				System.out.println("修改成功");
			else
				System.out.println("修改失败");
		}else
			System.out.println("输入有误");
	}
	
	/**
	 * @param 管理员
	 * 	对用户删改查，对图书增删改查
	*/
	public static void admin(Userdb user) {
		System.out.println("\t"+"管理员登入");
		System.out.println("1.操作用户"+"\t"+"2.操作图书");
		Scanner scanner=new Scanner(System.in);
		String num=scanner.next();
		//1.用户删改查
		if (num.equals("1")) {
			
		}else if (num.equals("2")) {
			
		}else
			System.out.println("输入有误");
			
		//2.图书增删改查
	}
}

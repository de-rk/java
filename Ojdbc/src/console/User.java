package console;

import java.util.Scanner;
import dao.Userdb;
import dao.UserDao;

public class User {
	/**
	 * @param 普通用户
	 * 	查看图书，需改密码
	*/
	public static void userC(Userdb user) {
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
			int b=new UserDao().update(sql, oj);
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
	public static void adminC(Userdb user) {
		System.out.println("\t"+"管理员登入");
		System.out.println("1.操作用户"+"\t"+"2.操作图书");
		Scanner scanner=new Scanner(System.in);
		String num=scanner.next();
		//1.用户删改查
		if (num.equals("1")) {
			new UserDao().selectAllUser();
			
			//删改查
			System.out.println("\t"+"删改查");
			System.out.println("1.删除"+"\t"+"2.修改"+"\t"+"3查询");
			num=scanner.next();
			
			//1.删除
			if (num.equals("1")) {
				System.out.print("输入要删除的用户 userid:");
				num=scanner.next();
				new UserDao().deleteUser(num);
			}
			//2.修改
			else if (num.equals("2")) {
				System.out.print("输入要修改的用户 userid:");
				num=scanner.next();
				new UserDao().updateUser(num);
			}
			//3.查询
			else if (num.equals("3")) {
				System.out.print("输入要查询的用户 userid:");
				num=scanner.next();
				new UserDao().selectUser(num);
			}else
				System.out.println("输入有误");
		}else if (num.equals("2")) {
			new UserDao().selectAllBook();
			
			//增删改查
			System.out.println("\t"+"删改查");
			System.out.println("1.增加"+"\t"+"2.删除"+"\t"+"3.修改"+"\t"+"4.查询");
			num=scanner.next();
			
			//1.增加
			if (num.equals("1")) {
				System.out.print("输入要删除的书籍 id:");
				num=scanner.next();
				new UserDao().addBook();
			}
			//2.删除
			else if (num.equals("2")) {
				System.out.print("输入要修改的书籍 id:");
				num=scanner.next();
				new UserDao().deleteBook(num);
			}
			//3.修改
			else if (num.equals("3")) {
				System.out.print("输入要查询的书籍 id:");
				num=scanner.next();
				new UserDao().updateBook(num);
			}
			//4.查询
			else if (num.equals("4")) {
				System.out.print("输入要查询的书籍 id:");
				num=scanner.next();
				new UserDao().selectBook(num);
			}else
				System.out.println("输入有误");
		}else
			System.out.println("输入有误");
	}
}

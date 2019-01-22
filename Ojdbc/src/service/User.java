package service;

import java.util.Scanner;
import dao.Userdb;
import dao.UserDao;

public class User {
	/**
	 * @param 普通用户
	 * 	查看图书，需改密码
	*/
	private static String num;
	public static void userC(Userdb user) {
		System.out.println("\t"+"你好"+user.getUname());
		System.out.println("1.查看图书"+"\t"+"2.修改密码");
		
		//收集操作指令
		Scanner scanner=new Scanner(System.in);
		UserDao userDao=new UserDao();
		num=scanner.next();
		//1.查看图书
		if (num.equals("1")) {
			System.out.println("\t"+"现有图书");
			userDao.selectAllBook(user);
			
			System.out.println("输入bookid查询图书");
			System.out.print("bookid:");
			num=scanner.next();
			userDao.selectBook(num, user);
		}
		//2.修改密码
		else if (num.equals("2")) {
			System.out.print("请输入密码:");
			num=scanner.next();
			
			int b=userDao.updateUser(num, user);
			if (b!=0)
				System.out.println("修改成功");
			else
				System.out.println("修改失败");
		}else if(num.equals("..")) {
			LoginC.login();
		}else if(num.equals("exit")) {
			System.out.println("退出成功");
			System.exit(0);
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
		UserDao userDao=new UserDao();
		String num=scanner.next();
		//1.用户删改查
		if (num.equals("1")) {
			userDao.selectAllUser(user);
			
			//删改查
			System.out.println("\t"+"删改查");
			System.out.println("1.删除"+"\t"+"2.修改"+"\t"+"3查询");
			num=scanner.next();
			
			//1.删除用户
			if (num.equals("1")) {
				System.out.print("输入要删除的用户 userid:");
				num=scanner.next();
				int b=userDao.deleteUser(num);
				userDao.isOK(b);
			}
			//2.修改用户
			else if (num.equals("2")) {
				System.out.print("输入要修改的用户 userid:");
				num=scanner.next();
				int b=userDao.updateUser(num, user);
				userDao.isOK(b);
			}
			//3.查询用户
			else if (num.equals("3")) {
				System.out.print("输入要查询的用户 userid:");
				num=scanner.next();
				userDao.selectUser(num,user);
			}else if(num.equals("..")) {
				adminC(user);
			}else if(num.equals("exit")) {
				System.out.println("退出成功");
				System.exit(0);
			}else
				System.out.println("输入有误");
		}
		//图书部分
		else if (num.equals("2")) {
			userDao.selectAllBook(user);
			
			//增删改查
			System.out.println("\t"+"删改查");
			System.out.println("1.增加"+"\t"+"2.删除"+"\t"+"3.修改"+"\t"+"4.查询");
			num=scanner.next();
			
			//1.增加图书
			if (num.equals("1")) {
				System.out.print("输入要删除的书籍 id:");
				num=scanner.next();
				int b=userDao.addBook();
				userDao.isOK(b);
			}
			//2.删除图书
			else if (num.equals("2")) {
				System.out.print("输入要修改的书籍 id:");
				num=scanner.next();
				int b=userDao.deleteBook(num);
				userDao.isOK(b);
			}
			//3.修改图书
			else if (num.equals("3")) {
				System.out.print("输入要查询的书籍 id:");
				num=scanner.next();
				int b=userDao.updateBook(num);
				userDao.isOK(b);
			}
			//4.查询图书
			else if (num.equals("4")) {
				System.out.print("输入要查询的书籍 id:");
				num=scanner.next();
				userDao.selectBook(num,user);
			}else if(num.equals("..")) {
				adminC(user);
			}else if(num.equals("exit")) {
				System.out.println("退出成功");
				System.exit(0);
			}else
				System.out.println("输入有误");
		}else if(num.equals("..")) {
			LoginC.login();
		}else if(num.equals("exit")) {
			System.out.println("退出成功");
			System.exit(0);
		}else
			System.out.println("输入有误");
	}
}

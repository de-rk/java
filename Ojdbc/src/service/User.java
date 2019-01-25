package service;

import java.util.Scanner;
import dao.Userdb;
import dao.UserDao;

public class User {
	//收集操作指令
	Scanner scanner=new Scanner(System.in);
	private static String num="";
	public static String getNum() {
		return num;
	}
	
	/**
	 * @param 普通用户
	 * 	查看图书，需改密码
	*/
	public void userC(Userdb user) {
		System.out.println("\t"+"你好"+user.getUname());
		System.out.println("1.查看图书"+"\t"+"2.借阅图书"+"\t"+"3.归还图书"+"\t"+"4.修改密码");
		UserDao userDao=new UserDao();
		num=scanner.next();
		
		//1.查询图书
		if (num.equals("1")) {
			System.out.println("\t"+"现有图书");
			userDao.selectAllBook(user);
			
			System.out.println("输入bookid查询图书");
			System.out.print("bookid:");
			num=scanner.next();
			userDao.selectBook(num, user);
			userC(user);
		}
		//2.借阅图书
		else if (num.equals("2")) {
			System.out.println("\t"+"现有图书");
			userDao.selectAllBook(user);
			
			System.out.println("输入bookid借阅图书");
			System.out.print("bookid:");
			num=scanner.next();
			int b=userDao.borrowBook(num, user);
			userDao.isOK(b,isOKNum,user);
		}
		//3.归还图书
		else if (num.equals("3")) {
			System.out.println("\t"+"现有图书");
			userDao.selectAllBook(user);
			
			System.out.println("输入bookid归还图书");
			System.out.print("bookid:");
			num=scanner.next();
			int b=userDao.returnBook(num,user);
			userDao.isOK(b,isOKNum,user);
		}
		//4.修改密码
		else if (num.equals("4")) {
			System.out.print("请输入密码:");
			num=scanner.next();
			
			int b=userDao.updateUser(num, user);
			userDao.isOK(b,isOKNum,user);
		}else if(num.equals("..")) {
			LoginC.login();
		}else {
			if (!num.equals("exit")) {
				System.out.println("无效输入");
			}
		}
	}
	
	
	//收集操作指令
	private String isOKNum="";
	public void setIsOKNum(String isOKNum) {
		this.isOKNum=isOKNum;
	}
	/**
	 * @param 管理员
	 * 	对用户删改查，对图书增删改查
	*/
	public void adminC(Userdb user) {
		System.out.println("\t"+"管理员登入");
		System.out.println("1.操作用户"+"\t"+"2.操作图书");
		num=scanner.next();
		
		// 操作用户、操作图书
		if (num.equals("1")) {
			isOKNum=num;
			adminCUser(user);
			
		}else if (num.equals("2")) {
			isOKNum=num;
			adminCBook(user);
			
		}else if(num.equals("..")) {
			LoginC.login();
		}else {
			if (!num.equals("exit")) {
				System.out.println("无效输入");
				userC(user);
			}
		}
	}
	/**
	 * 操作用户
	*/
	public void adminCUser(Userdb user) {
		UserDao userDao=new UserDao();
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
			userDao.isOK(b,isOKNum,user);
		}
		//2.修改用户
		else if (num.equals("2")) {
			System.out.print("输入要修改的用户 userid:");
			num=scanner.next();
			int b=userDao.updateUser(num, user);
			userDao.isOK(b,isOKNum,user);
		}
		//3.查询用户
		else if (num.equals("3")) {
			System.out.print("输入要查询的用户 userid:");
			num=scanner.next();
			userDao.selectUser(num,user);
			adminCUser(user);
		}else if(num.equals("..")) {
			adminC(user);
		}else {
			if (!num.equals("exit")) {
				System.out.println("无效输入");
				adminCUser(user);
			}
		}
	}
	/**
	 * 操作图书
	*/
	public void adminCBook(Userdb user) {
		UserDao userDao=new UserDao();
		userDao.selectAllBook(user);
		
		//增删改查
		System.out.println("\t"+"删改查");
		System.out.println("1.增加"+"\t"+"2.删除"+"\t"+"3.修改"+"\t"+"4.查询");
		num=scanner.next();
		
		//1.增加图书
		if (num.equals("1")) {
			int b=userDao.addBook();
			userDao.isOK(b,isOKNum,user);
		}
		//2.删除图书
		else if (num.equals("2")) {
			System.out.print("输入要删除的书籍 id:");
			num=scanner.next();
			int b=userDao.deleteBook(num);
			userDao.isOK(b,isOKNum,user);
		}
		//3.修改图书
		else if (num.equals("3")) {
			System.out.print("输入要修改的书籍 id:");
			num=scanner.next();
			int b=userDao.updateBook(num);
			userDao.isOK(b,isOKNum,user);
		}
		//4.查询图书
		else if (num.equals("4")) {
			System.out.print("输入要查询的书籍 id:");
			num=scanner.next();
			userDao.selectBook(num,user);
			adminCBook(user);
		}else if(num.equals("..")) {
			adminC(user);
		}else {
			if (!num.equals("exit")) {
				System.out.println("无效输入");
				adminCBook(user);
			}
		}
	}
}

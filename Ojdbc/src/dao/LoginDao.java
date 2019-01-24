package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import service.Zhu;

public class LoginDao extends Dao{
	//userdb
	String[] col= {"userid","uname","password","brithday","pro","isDelete"};
	Scanner scanner=new Scanner(System.in);
	//注册
	public int signUp() {
		//准备用品
		Object[] oj=new Object[4];
		String sql="insert into userdb values(?,?,?,?,0,0)";
		String table="userdb";
		return add(table,col,oj,sql);
	}
		
	public Userdb login(Userdb user) {
		//准备用品
		Object[] oj= {user.getUserid(),user.getPassword()};
		String sql = "select * from userdb where userid=? and password=?";
		ResultSet rs=super.executeQ(sql, oj);
		
		try {
			if (rs.next()) {
				user.setUserid(rs.getInt("userid"));
				user.setUname(rs.getString("uname"));
				user.setPassword(rs.getString("password"));
				user.setBrithday(rs.getString("brithday"));
				user.setPro(rs.getInt("pro"));
				user.setIsDelete(rs.getInt("isDelete"));
			}else {
				System.out.println("输入错误");
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	/**
	 * 添加(图书、用户)
	*/
	@SuppressWarnings("resource")
	@Override
	public int add(String table,String[] col,Object[] oj,String sql) {
		//采集信息
		ResultSet rs;
		int n;
		n=table.equals("userdb")?3:4;
		rs=table.equals("userdb")
				?super.executeQ("select userid from userdb order by userid desc")
				:super.executeQ("select bookid from books order by bookid desc");
		for (int i=0;i<=n;i++) {
			if (i==0) {
				//查询userid并降序排列
				try {
					rs.next();
					System.out.print(col[i]+":");
					//最大的id加一就是注册时的id
					System.out.println(String.valueOf(rs.getInt(1)+1));
					oj[i]=rs.getInt(1)+1;
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.print(col[i]+":");
			oj[i]=scanner.next();
		}
		//执行语句
		return super.update(sql,oj);
	}
	
	/**
	 * 查询所有(图书、用户)
	*/
	@Override
	public void selectAll(String table,Userdb user,String[] col) {
		ResultSet rs=super.executeQ("select * from "+table+" order by "+col[0]+" desc");
		forP(rs,user,col);
	}
	
	/**
	 * 循环输出
	*/
	@Override
	public void forP(ResultSet rs,Userdb user,String[] col) {
		int n=0;
		int c=0;
		if (col.length==6)
			n=user.getPro()==0?5:6;
		else
			n=user.getPro()==0?7:8;
		try {
			while (rs.next()) {
				if (c==0) {
					for (int i=0;i<n;i++)
						System.out.print(col[i]+"\t");
					System.out.println();
				}
				c++;
				for (int j=0;j<n;j++) {
					//next之后for会再重新一遍
					System.out.print(rs.getObject(j+1)+"\t");
				}
				System.out.println();
			}
			if (c==0) {
				System.out.println("请检查输入");
				Zhu.e();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 循环输入
	*/
	@Override
	public Object[] forO(String[] col) {
		Object[] oj=new Object[col.length-1];
		for (int i=0;i<col.length-1;i++) {
			System.out.print(col[i+1]+":");
			oj[i]=scanner.nextLine();
		}
		return oj;
	}
}
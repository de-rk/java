package com.soft.baseDao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class TestDb {

	public static void main(String[] args) {
		Dbuser dbuser=new Dbuser();
		//连接定义好的数据库工具类
		Db db=new Db();
		String sql = "alter table dbuser add (password varcher(16))";
		String sql1 = "select * from dbuser";
		
//		dbuser.setHiredate("1888/1/1");
//		String a=dbuser.getHiredate();
//		Object[] oj = {3,"Mark",a};
		// 使用update方法，update ，insert ，delete
		db.update(sql1);
		
		// 查询
		ResultSet rs=db.executeQ(sql1);
		// 遍历得到的结果集
		try {
			System.out.println(rs.getFetchSize());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			while (rs.next()){
				System.out.println("userid:"+rs.getString(1));
				System.out.println("uname:"+rs.getString(2));
				System.out.println("hiredate:"+rs.getString(3));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//断开连接
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		db.close();
		
	}

}

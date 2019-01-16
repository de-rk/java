package com.soft.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	static Connection conn;
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@127.0.0.1:1521:demo";
		String driver="oracle.jdbc.driver.OracleDriver";
		String user="scott";
		String password="tiger";
		Scanner scanner=new Scanner(System.in);
		try {
			Class.forName(driver);
			//建立连接
			conn= DriverManager.getConnection(url, user, password);
			
			String sql="select * from emp where empno=?";
			
			//创建一个PreparedStatement对象
			PreparedStatement ps= conn.prepareStatement(sql);
			
			ps.setString(1,scanner.next());
			//返还对象集合
			ResultSet rs=ps.executeQuery();
			while (rs.next())
				for (int i=1;i<9;i++)
				System.out.println(rs.getString(i));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

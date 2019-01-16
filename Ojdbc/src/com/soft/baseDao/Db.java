package com.soft.dao;
/**
 * 数据库连接
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db {
	private ResultSet rs;
	private Connection conn;
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:demo";
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String user="scott";
	private String password="tiger";
	
	//连接
	public Db(){
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	//查询
	/**
	 * @param sql
	 * 	查询语句+where语句
	 * @param oj
	 * where语句里面的条件
	*/
	public ResultSet executeQ(String sql,Object[] oj) {
		try {
			
			//声明一个PreparedStatement对象ps接收查询的结果
			PreparedStatement ps=conn.prepareStatement(sql);
			
			// 如果oj数组长度大于0，那么就设置查询空缺的条件
			if (oj.length>0)
				for (int i=0;i<oj.length;i++) {
					//设置查询语句中的条件
					ps.setString(i+1,oj[i].toString());
					}
			
			// executeQuery执行查询语句将结果用集合对象rs保存
			rs=ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
	// 重载executeQ方法
	/**
	 * @param sql
	 * 查询语句
	*/
	public ResultSet executeQ(String sql) {
		return executeQ(sql,new Object[]{});
	}
	
	// 断开连接
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

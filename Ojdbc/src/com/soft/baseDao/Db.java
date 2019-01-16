package com.soft.baseDao;
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
	private PreparedStatement ps;
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:demo";
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String user="scott";
	private String password="tiger";
	
	//连接
	public Db(){
		try {
			//在一些應用中，無法事先知道使用者將載入什麼類別（例如載入JDBC驅動程式），
			//而必須讓使用者指定類別名稱以載入類別。你可以使用Class的靜態forName()方法實現動態加載類別
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void getConn() {
		try {
			//加载并注册驱动，使用getConnection方法建立连接
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
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
			 getConn();
			//声明一个PreparedStatement对象ps接收查询的结果
			ps=conn.prepareStatement(sql);
			
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
	
	// 修改
	/**
	 * update ,insert ,delete
	*/
	public int update(String sql,Object[] oj) {
		int a = 0;
		
		try {
			getConn();
			// 接收查询结果
			ps=conn.prepareStatement(sql);
			// 
			if(oj.length>0) {
				for (int i=0;i<oj.length;i++) {
					ps.setString(i+1, oj[i].toString());
				}
			}
			
			System.out.println(ps.execute());
			
			// executeQuery执行查询语句将结果用集合对象rs保存
			
			a=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;	
	}
	
	// 重载
	/**
	 * @param sql update
	 * @param 替换条件
	*/
	public int update(String sql) {
		return update(sql,new Object[] {});
	}
	
	// 断开连接
	public void close() {
		try {
//			if (!rs.isClosed())
//				rs.close();
//			if (!ps.isClosed())
//				ps.close();
			if (!conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

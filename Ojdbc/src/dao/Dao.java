package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Dao {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:demo";
//	private String url="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private String user="scott";
	private String password="tiger";
	
	public Dao(){
		//1.注册驱动
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void conn() {
		try {
			//2.建立连接
			conn=DriverManager.getConnection(url, user, password);
//			conn.setAutoCommit(true);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public ResultSet executeQ(String sql,Object[] oj) {
		conn();
		try {
			//3.创建语句
			ps=conn.prepareStatement(sql);
			if (oj.length>0)
				for (int i=0;i<oj.length;i++)
					ps.setObject(i+1, oj[i]);
			
			//4.执行语句
			rs=ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//5.处理结果(并没有处理完)
		return rs;
	}
	
	public ResultSet executeQ(String sql) {
		return executeQ(sql, new Object[] {});
	}
	
	public int update(String sql,Object[] oj) {
		conn();
		int sum = 0;
		try {
			//3.创建语句
			ps=conn.prepareStatement(sql);
			if (oj.length>0)
				for (int i=0;i<oj.length;i++)
					ps.setObject(i+1, oj[i]);
			
			//4.执行语句
			sum=ps.executeUpdate();
//			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
//				conn.rollback();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//5.处理结果(并没有处理完)
		return sum;
	}
	
	public int update(String sql) {
		return update(sql, new Object[] {});
	}
	
	public void close() {
		//6.释放资源
		try {
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//添加图书，添加用户
	public abstract int add(String table,String[] col,Object[] oj,String sql);
	//查询所有图书，查询所有用户
	public abstract void selectAll(String table,Userdb user,String[] col);
	//循环输入
	public abstract Object[] forO(String[] col);
	//循环输出
	public abstract void forP(ResultSet rs,Userdb user,String[] col);
}

package eighteenth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db {
	private static Connection conn;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
//	private String url="jdbc:oracle:thin:@127.0.0.1:1521:demo";
	private static String url="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static String user="scott";
	private static String password="tiger";
	
	public Db(){
//		//1.注册驱动
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	
	public static void conn() {
		try {
			//1.注册驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.建立连接
			conn=DriverManager.getConnection(url, user, password);
//			conn.setAutoCommit(true);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static ResultSet executeQ(String sql,Object[] oj) {
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
	
	public static ResultSet executeQ(String sql) {
		return executeQ(sql, new Object[] {});
	}
	
	public static int update(String sql,Object[] oj) {
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
//			try {
//				conn.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
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
	
	public static int update(String sql) {
		return update(sql, new Object[] {});
	}
	
	public static void close() {
		//6.释放资源
		try {
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

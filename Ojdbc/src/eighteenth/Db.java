package eighteenth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Db {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private String url="jdbc:oracle:thin:@locadhost:1521:demo";
	private String user="scott";
	private String password="tiger";
	
	public Db(){
		//1.注册驱动
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void conn() {
		
		
		//2.建立连接
		try {
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public ResultSet executeQ(String sql,Object[] oj) {
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
		int sum = 0;
		try {
			//3.创建语句
			ps=conn.prepareStatement(sql);
			if (oj.length>0)
				for (int i=0;i<oj.length;i++)
					ps.setObject(i+1, oj[i]);
			
			//4.执行语句
			sum=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
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
}

package seventeenth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dbhelp {
//	private String url="jdbc:oracle:thin:@127.0.0.1:1521:demo";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private String driver="oracle.jdbc.driver.OracleDriver";
	private String user="scott";
	private String password="tiger";
	
	//操作的连接对象
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	//创建构造器不要加返还值
	public Dbhelp() {
		try {
			//Class for name 注册驱动类(驱动程序是外部添加的)
			Class.forName(driver);
			//driver manager 加载驱动管理程序(连接到数据库的地址，登入用户，密码)
			conn=DriverManager.getConnection(url, user, password);
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeQ(String sql,Object[] oj) {
		//设置条件
		try {
			//放在try catch 里面免得麻烦
			ps=conn.prepareStatement(sql);//传sql语句
			
			for (int i=0;i<oj.length;i++)
				ps.setString(i+1, oj[i].toString());
			
			//执行ps中的预编译的sql
			rs=ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet executeQ(String sql) {
		return executeQ(sql,new Object[] {});
	}
	
	//update insert delete
	public int update(String sql,Object[] oj){
		int sum = 0;
		
		//传sql语句
		try {
			//预编译sql语句得到结果
			ps=conn.prepareStatement(sql);
			
			for (int i=0;i<oj.length;i++)
				ps.setString(i+1, oj[i].toString());
			
			//执行ps中的预编译的sql
			sum=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return sum;
	}
	
	//执行Execption 方法要加上throws 。执行try catch 不用
	public int update(String sql){
		return update(sql,new Object[] {});
	}
	
	public void close() {
		try {
//			if (!rs.isClosed())
//				rs.close();
//			if (!ps.isClosed())
//				ps.close();
			if (!conn.isClosed())
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package seventeenth;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.soft.baseDao.Dbuser;

public class Test {

	public static void main(String[] args) {
		String sql="alter table dbuser add (password varchar(16))";
		String sql3="alter table dbuser add (pro number(1))";
		String sql2="update dbuser set password='admin' where uname='Tom'";
		String sql1="select * from emp";
		Dbhelp dbhelp=new Dbhelp();
		
//		int s=dbhelp.update(sql2);
//		System.out.println(s);
//		Dbuser user1=new Loginer().login(new Dbuser());
		
		
		
		ResultSet rs=dbhelp.executeQ(sql1);
		
		
		try {
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		dbhelp.close();
	}

}

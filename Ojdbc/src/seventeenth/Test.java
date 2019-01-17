package seventeenth;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		String sql="insert into dbuser values(4,'join','2019/1/17')";
		String sql1="select userid from dbuser group by userid";
		Dbhelp dbhelp=new Dbhelp();
		
//		int s=dbhelp.Update(sql);
//		System.out.println(s);
		
		
		
		ResultSet rs=dbhelp.executeQ(sql1);
		
		
		try {
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

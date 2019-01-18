package eighteenth;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Lognin implements Caozuo{

	@Override
	public Userdb login(String userid,String password) {
		Db db=new Db();
		Userdb user2 = null;
		
		Object[] oj= {userid,password};
		String sql = "select * from userdb where userid=? and password=?";
		
		ResultSet rs=db.executeQ(sql, oj);
		
		try {
			if (rs.next()) {
					user2.setUserid(rs.getString("userid"));
					user2.setUname(rs.getString("uname"));
					user2.setPassword(rs.getString("password"));
					user2.setBrithday(rs.getString("brithday"));
					user2.setPro(rs.getString("pro"));
					user2.setIsDelete(rs.getString("isDelete"));
			}else
				return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user2;
	}
}

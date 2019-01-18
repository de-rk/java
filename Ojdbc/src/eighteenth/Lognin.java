package eighteenth;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Lognin implements Caozuo{

	@Override
	public Userdb login(Userdb user) {
		Db db=new Db();
		
		Object[] oj= {user.getUserid(),user.getPassword()};
		String sql = "select * from userdb where userid=? and password=?";
		
		ResultSet rs=db.executeQ(sql, oj);
		
		try {
			if (rs.next()) {
				System.out.println("login succeed");
				user.setUserid(rs.getInt("userid"));
				user.setUname(rs.getString("uname"));
				user.setPassword(rs.getString("password"));
				user.setBrithday(rs.getString("brithday"));
				user.setPro(rs.getInt("pro"));
				user.setIsDelete(rs.getInt("isDelete"));
			}else {
				new CreateJFrame().lose();
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}

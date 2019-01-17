package seventeenth;

import java.awt.peer.TrayIconPeer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.soft.baseDao.Dbuser;

public class Loginer implements Login{

	@Override
	public Dbuser login(Dbuser user) {
		//查询用户的语句
		String sql = "select * from dbuser where userid=? and password = ?";
		Dbuser dbuser=new Dbuser();
		Dbhelp dbhelp=new Dbhelp();
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("用户id：");
		user.setUserid(scanner.nextInt());
		System.out.println("密码：");
		user.setPassword(scanner.next());
		
		Object[] oj= {user.getUserid(),user.getPassword()};
		
		ResultSet rs=dbhelp.executeQ(sql,oj);
		
		try {
			if (rs.next()) {
				//登入成功就可以获取当前用户的全部数据
				user.setUserid(rs.getInt("userid"));
				System.out.println(user.getUserid());
			}else {
				System.out.println("输入有误");
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbuser;
	}

}

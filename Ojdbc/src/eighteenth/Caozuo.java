package eighteenth;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Caozuo {
	//登入
	public static Userdb login(Userdb user) {
		//准备用品
		Object[] oj= {user.getUserid(),user.getPassword()};
		String sql = "select * from userdb where userid=? and password=?";
		ResultSet rs=Db.executeQ(sql, oj);
		
		try {
			if (rs.next()) {
//				System.out.println("login succeed:");
				user.setUserid(rs.getInt("userid"));
				user.setUname(rs.getString("uname"));
				user.setPassword(rs.getString("password"));
				user.setBrithday(rs.getString("brithday"));
				user.setPro(rs.getInt("pro"));
				user.setIsDelete(rs.getInt("isDelete"));
			}else {
				System.out.println("登入失败");
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	//注册
	public static void signUp() {
		System.out.println("\t"+"user sign up");
		
		//准备用品
		Scanner scanner=new Scanner(System.in);
		String[] col= {"userid","uname","password","brithday","pro","isDelete"};
		Object[] oj=new Object[4];
		
		//为pro and isdelete添加默认的值
		String sql="insert into userdb values(?,?,?,?,0,0)";
		//采集信息
		for (int i=0;i<=3;i++) {
			if (i==0) {
				//查询userid并降序排列
				ResultSet rs=Db.executeQ("select userid from userdb order by userid desc");
				try {
					rs.next();
					System.out.print(col[i]+":");
					System.out.println(String.valueOf(rs.getInt(1)+1));
					oj[i]=rs.getInt(1)+1;
					continue;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.print(col[i]+":");
			oj[i]=scanner.next();
		}
		
		//执行语句
		System.out.println(Db.update(sql,oj));
	}
}

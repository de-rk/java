package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginDao extends Dao{
	//注册
	public void signUp() {
		//准备用品
		String[] col= {"userid","uname","password","brithday","pro","isDelete"};
		Object[] oj=new Object[4];
		String sql="insert into userdb values(?,?,?,?,0,0)";
		String table="userdb";
		add(table,col,oj,sql);
	}
	
	@Override
	public void add(String table,String[] col,Object[] oj,String sql) {
		//采集信息
		int num=table.equals("userdb")?3:4;
		Scanner scanner=new Scanner(System.in);
		for (int i=0;i<=num;i++) {
			if (i==0) {
				//查询userid并降序排列
				ResultSet rs=super.executeQ("select userid from userdb order by userid desc");
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
		System.out.println(super.update(sql,oj));
	}
		
	public Userdb login(Userdb user) {
		//准备用品
		Object[] oj= {user.getUserid(),user.getPassword()};
		String sql = "select * from userdb where userid=? and password=?";
		ResultSet rs=super.executeQ(sql, oj);
		
		try {
			if (rs.next()) {
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

	@Override
	public void selectAll(String table) {
		ResultSet rs=super.executeQ("select * from "+table);
		try {
			while (rs.next()) {
				for (int j=1;j<7;j++) {
					System.out.print(rs.getObject(j)+"\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
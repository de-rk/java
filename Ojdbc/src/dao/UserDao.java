package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDao extends LoginDao{
	//books
	private String[] col= {"bookid","bname","writer","type","price","isBorrow","borrower","isDelete"};
	Scanner scanner=new Scanner(System.in);
	
	//用户试图
	public void selectAllUser(Userdb user) {
		selectAll("userdb",user,super.col);
	}
	
	//图书视图
	public void selectAllBook(Userdb user) {
		selectAll("books",user,this.col);
	}
	
	//删除user
	public int deleteUser(String num) {
		return super.update("update userdb set isDelete=1 where userid="+num);
	}
	//删除图书
	public int deleteBook(String num) {
		return super.update("update books set isDelete=1 where userid="+num);
	}

	//增加图书
	public int addBook() {
		//准备用品
		Object[] oj=new Object[5];
		String sql="insert into books values(?,?,?,?,?,0,'',0)";
		String table="books";
		return add(table,this.col,oj,sql);
	}
	
	//修改图书
	public int updateBook(String num) {
		Object[] oj=forO(this.col);
			return super.update("update books set bname='"+oj[0]+"',writer='"+oj[1]+"',type='"
								+oj[2]+"',price="+oj[3]+",isBorrow="+oj[4]+",borrower="+oj[5]+",isDelete="+oj[6]
								+" where bookid="+num);
	}
	
	//修改用户
	public int updateUser(String num,Userdb user) {
		if (user.getPro()==0)
			return super.update("update userdb set password="+num+" where userid="+user.getUserid());
		else {
			Object[] oj=forO(super.col);
			return super.update("update userdb set uname='"+oj[0]+"',password='"+oj[1]+"',brithday='"
						+oj[2]+"',pro="+oj[3]+",isDelete="+oj[4]+" where userid="+num);
		}
	}

	//查询图书
	public void selectBook(String num,Userdb user) {
		ResultSet rs=super.executeQ("select * from books where bookid="+num);
		super.forP(rs, user,this.col);
	}
	//查询用户
	public void selectUser(String num,Userdb user) {
		ResultSet rs=super.executeQ("select * from userdb where userid="+num);
		super.forP(rs, user,super.col);
	}
	
	//借阅图书
	public int borrowBook(String num,Userdb user) {
		ResultSet rs=super.executeQ("select isborrow from books where bookid="+num);
		try {
			if (rs.next()) {
				if (rs.getInt(1)==0)
					return super.update("update books set isborrow=1,borrower='"
							+user.getUname()+"' where bookid="+num);
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//return 0 就是失败
		return 0;
	}
	//归还图书
	public int returnBook(String num,Userdb user) {
		ResultSet rs=super.executeQ("select borrower from books where bookid="+num);
		try {
			return rs.next()
					?(user.getUname().equals(rs.getObject(1))
							?super.update("update books set isborrow=0,borrower='' where bookid="+num)
							:0)
					:0;
//			if (rs.next())
//				if (user.getUname().equals(rs.getObject(1)))
//					return super.update("update books set isborrow=0,borrower='' where bookid="+num);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	//判断执行成功没有
	public void isOK(int b) {
		if (b!=0) {
			System.out.println("成功");
			System.exit(0);
		}
		else {
			System.out.println("失败");
			System.exit(0);
		}
	}
}

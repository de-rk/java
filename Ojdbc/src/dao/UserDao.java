package dao;

public class UserDao extends LoginDao{
	public void selectAllUser() {
		System.out.println("userid"+"\t"+"uname"+"\t"+"password"+"\t"
				+"brithday"+"\t"+"pro"+"\t"+"isDelete");
		selectAll("userdb");
	}
	
	public void selectAllBook() {
		System.out.println("bookid"+"\t"+"bname"+"\t"+"writer"+"\t"
				+"type"+"\t"+"price"+"\t"+"isDelete");
		selectAll("books");
	}
	
	//删除user
	public void deleteUser(String num) {
		super.update("update userdb set isDelete=1 where userid="+num);
	}
	//删除图书
	public void deleteBook(String num) {
		super.update("update books set isDelete=1 where userid="+num);
	}

	//增加图书
	public void addBook() {
		//准备用品
		String[] col= {"bookid","bname","writer","type","price","isDelete"};
		Object[] oj=new Object[5];
		String sql="insert into books values(?,?,?,?,?,0)";
		String table="books";
		add(table,col,oj,sql);
	}
	
	//修改图书
	public void updateBook(String num) {
		super.update("update userdb set isDelete="+scanner.next()+" where userid="+num);
	}
	//修改用户
	public void updateUser(String num) {
		super.update("update userdb set isDelete=1 where userid="+num);
	}
	
	//查询图书
	public void selectBook(String num) {
		super.update("update userdb set isDelete=1 where userid="+num);
	}
	//查询用户
	public void selectUser(String num) {
		super.update("update userdb set isDelete=1 where userid="+num);
	}
}

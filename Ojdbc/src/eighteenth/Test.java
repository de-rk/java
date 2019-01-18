package eighteenth;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Userdb user = new Userdb();
		user.setUserid(scanner.nextInt());
		user.setPassword(scanner.next());
		
		//5.处理结果
		//获取登入后的用户对象
		user=new Lognin().login(user);
		

	}

}

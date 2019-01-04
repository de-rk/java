package FourDay;

import java.util.Scanner;
/**
 * 文档注释，可以显示在类和方法上;
 * @param 判断邮箱地址是否合法
 * 
 * 5.1 提示：邮箱地址不合法的因素：
 * 
 *5.1.1邮箱地址中不包含@或.
 *
 *5.1.2邮箱地址中含有多了@或.
 *
 *5.1.3邮箱地址中.出现在@的前面
 *
 *5.1.4用户名里有其他字符
 * */
public class MailTest {
	/*解析一个邮箱地址是否合法*/
	public static void main(String[] args) {
		System.out.println("请输入邮箱地址");
		
		//接收
		Scanner scanner=new Scanner(System.in);
		String mail=scanner.next();
		
		//不合法因素
		//假设合法
		/*String[] a;
		a=mail.split("@");
		System.out.println(a[0]);*/
		
		//判断其中含不含有@和。
		if (pan(mail)==true)
			System.out.println(mail);
		
				
	}
	static boolean pan(String mail) {
		//判断邮箱中不包含@或.
		char[] b;
		int[] sum=new int[2];
		b=mail.toCharArray();
		for(int i=0;i<b.length;i++) {
			if (b[i]=='@')
				sum[0]++;
			else if(b[i]=='.')
				sum[1]++;
			}
		if (sum[0]>0&&sum[1]>0) {
			return true;
		}else
			return false;
		
	}
}

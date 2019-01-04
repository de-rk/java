package ThreeDay;

import java.util.Scanner;

public class Exception3 {
	//课后练习1ArithmeticException 和NumberFormatException
	public static void main(String[] args) {
		new Exception3().ar();
	}
	void ar(){
		Scanner scanner = new Scanner(System.in);
		//try 语句块处理异常
		try {
				int a=Integer.parseInt(scanner.next());
				int b=Integer.parseInt(scanner.next());
				int c=a/b;
				System.out.println(c);
			}catch (ArithmeticException e) {
				e.printStackTrace();
			}catch (NumberFormatException e) {
				e.printStackTrace();
			}finally {
				System.out.println("总是被执行");
			}
			//System.out.println("总是被执行");
			
	}

}

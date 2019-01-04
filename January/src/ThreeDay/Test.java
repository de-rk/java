package ThreeDay;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		run();
	}
	public static void run() {
		try{
			Scanner scanner=new Scanner(System.in);
			byte b=scanner.nextByte();
			System.out.println(b);
		}catch(Exception e){
			e=new ByteSizeException("输入的数字不是byte类型");
			e.printStackTrace();
		}
	}
}

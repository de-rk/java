package TwoDay;

import java.util.Scanner;

public class Gardener implements Furit{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		new Gardener().panduan(scanner.next());
	}

	@Override
	public void panduan(String name) {
		// TODO Auto-generated method stub
		if (name.equals("Apple"))
			new Apple();
		else if(name.equals("Banana"))
			new Banana();
		else if (name.equals("Grape"))
			new Grape();
		else 
			System.out.println("错误");
	}
}

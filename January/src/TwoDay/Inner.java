package TwoDay;

public class Inner {
	public static void main(String[] args) {
		new Inner().run();
	}
	public void run() {
		new Inner1();
		//调用构造器,不能在static修饰的方法中调用内部类
		new Apple();
		//外部类就可以
		new Inner();
		//本类也可以
	}
	class Inner1{
		Inner1(){
			System.out.println("created a Inner class");
		}
		public void point() {
			System.out.println("created a Inner class");
		}
	}
}

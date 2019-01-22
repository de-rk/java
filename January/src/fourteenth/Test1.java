package fourteenth;

public class Test1 {

	public static void main(String[] args) {
		SocketTest st=new SocketTest();
		Thread s1=new Thread(st);
		Thread s2=new Thread(st);
		s1.start();
		s2.start();
	}

}

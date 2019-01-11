package Eleven;

public class Test {

	@SuppressWarnings({ "deprecation", "static-access" })
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadTest tt=new ThreadTest();
		RunImTest ri=new RunImTest();
		
		Thread t=new Thread(ri) ;
		tt.start();
		
		while (1000>0) {
			tt.sleep(1000);
			tt.run();
		}
		
	}

}

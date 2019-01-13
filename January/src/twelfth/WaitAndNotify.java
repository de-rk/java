package twelfth;

public class WaitAndNotify {

	public static void main(String[] args) throws InterruptedException {
		TestForWait tf=new TestForWait();
		tf.start();
		
		for (int i=0;i<20;i++)
			System.out.println("main at "+i);

	}

}

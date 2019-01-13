package twelfth;

public class TestForWait extends Thread{
	@Override
	public void run() {
		for (int i=0;i<20;i++)
			System.out.println("Test at"+i);
	}
}

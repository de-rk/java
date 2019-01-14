package fourteenth;
/**
 * TicketTh
*/
public class Ticket {
	private static int sum=50;
//	private String name;
	public static int getSum() {
		return sum;
	}
		
	public void sal() {
			while (sum>0) {
				synchronized (this) {
				try {
					sum--;
					System.out.println(Thread.currentThread().getName()+"售票一张，剩余"+sum);
					Thread.sleep(200);
					//sleep() 让其他线程进来。后面语句没有机会继续执行完。进行了其他线程
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}	
		}	
		
	}
}

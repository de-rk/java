package fourteenth;
/**
 * Test for Ticket
*/
public class Test {
	public static void main(String[] args) throws InterruptedException {
		Ticket ti= new Ticket();
		TicketTh t=new TicketTh(ti);
		TicketTh t1=new TicketTh(ti);
		Thread th1=new Thread(t1,"售票员一");//(runnable,name) name use is not know;
		Thread th2=new Thread(t,"售票员二");
//		Thread th3=new Thread();
		th1.start();
//		th1.sleep(1000);
		th2.start();
//		th2.sleep(500);
		
	}
}

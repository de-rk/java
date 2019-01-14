package fourteenth;


/**
 * Ticket
*/
public class TicketTh implements Runnable{

	private Ticket t;
	public TicketTh(Ticket t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		/*
		 * 如果票数大于0，那么就卖票
		 * 买完票打印剩余票数
		*/
		t.sal();
		}
}

package console;

import service.User;
import service.Zhu;

public class Tuichu extends Thread{
//	String a="";
//	String b1="";
//	String b2="";
	String a1="";
	String a2="";
	String b1="";
	String b2="";
	int q=0;
	int q1=q;
	int c=80;
	public void run() {
		while (true) {
			try {
				Thread.sleep(500);
				if (Zhu.getNum().equals("exit")||User.getNum().equals("exit")) {
					System.out.println("退出成功");
					System.exit(0);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
			//Zhu里面输入的指令
			//判断User里面输入的指令
			/*a1=Zhu.getNum();
			a2=User.getNum();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (a1.equals("exit")||a2.equals("exit")) {
				Zhu.e();
			}else if (!a1.equals(b1)){
				c=60;
				b1=a1;
			}else if (!a2.equals(b2)) {
				c=60;
				b2=a2;
			}else {
				c--;
				if (c==0)
					Zhu.e();
			}
		}*/
		
		
		
		/*//Zhu里面输入的指令
		a=Zhu.getNum();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (b1.equals(a)) {
		c--;
			if (c==0)
				Zhu.e();
		}else {
			b1=a;
			c=80;
			if (a.equals("exit"))
				Zhu.e();
		}
		//判断User里面输入的指令
		a=User.getNum();
		if (!b2.equals(a)) {
			c=80;
			b2=a;
			if (a.equals("exit"))
				Zhu.e();
		}*/
	}
}

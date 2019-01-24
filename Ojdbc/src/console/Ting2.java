package console;

import service.User;
import service.Zhu;

public class Ting2 extends Thread{
	String a1="";
	String a2="";
	String b1="";
	String b2="";
	int c=60;
	public void run() {
		while (true) {

			//Zhu里面输入的指令
			//判断User里面输入的指令
			a1=Zhu.getNum();
			a2=User.getNum();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (a1.equals("exit")||a2.equals("exit")) {
				Zhu.e();
				if (!a1.equals(b1)){
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
			}

			
		/*	if (!b2.equals(a)) {
				c=60;
				if (a!=null) {
					b2=a;
					if (a.equals("exit"))
						Zhu.e();
				}
			}else {
				c--;
				if (c==0)
					Zhu.e();
			}*/			
		}
	}
}

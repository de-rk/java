package console;

import service.User;
import service.Zhu;

public class Ting2 extends Thread{
	String a="";
	String b1="";
	String b2="";
	int c=60;
	public void run() {
		while (true) {

			//Zhu里面输入的指令
			a=Zhu.getNum();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (!b1.equals(a)) {
				c=60;
				if (a!=null) {
					b1=a;
					if (a.equals("exit"))
						Zhu.e();
				}
			}else {
				c--;
				if (c==0)
					Zhu.e();
			}

			//判断User里面输入的指令
			a=User.getNum();
			if (!b2.equals(a)) {
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
			}			
		}
	}
}

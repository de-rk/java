package Eleven;
/**
 * 多线程需要在调用的类线程中
 * @param 实现
 * Runnable接口
 * @param 或者
 * 继承Thread类
 * @code 并且 
 * 重写 run()
*/
public class TestRunnable {

	public static void main(String[] args) throws InterruptedException {
		RunnabledDemo rd=new RunnabledDemo();
		Thread t=new Thread(rd);
		t.start();//start 方法可以多线程
		
//		rd.run();//run 方法不能多线程
//		t.setPriority(t.MAX_PRIORITY);
//		System.out.println(t.MIN_PRIORITY);
//		t.yield();//让其他线程执行
		
		t.wait();//进入等待状态
		label:for (int i=0;i<20;i++) {
			System.out.println("main:"+i);
			if (i==10)
				break label; 
		}
		t.notify();
		
		
//		System.out.println(t.isAlive());//多线程到这之前的线程可能还活着
	}

}

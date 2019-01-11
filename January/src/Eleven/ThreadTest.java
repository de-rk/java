package Eleven;

import java.util.Date;
/**
 * 多线程需要在调用的类线程中
 * @param 实现
 * Runnable接口
 * @param 或者
 * 继承Thread类
 * @code 并且 
 * 重写 run()
*/
public class ThreadTest extends Thread{

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		//System.out.println("线程已经运行");
		Date a=new Date();
		System.out.println(a.toLocaleString());
	}
}

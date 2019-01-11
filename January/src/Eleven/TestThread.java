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
public class TestThread {

	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();//start() 会出现同时运行的情况（多线程）。具体的看控制台
//		td.run();//run() ThreadDome 全运行
		
		for (int i=0;i<20;i++) {
			System.out.println("main:"+i);
		}
	}
}

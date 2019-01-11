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
public class RunnabledDemo implements Runnable{
	@Override
	public void run() {
		for (int i=0;i<20;i++) {
			System.out.println("Runnable:"+i);
		}
	}
}

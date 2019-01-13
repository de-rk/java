package thirteenth;

public class Timer {
	private static int sum = 0;

	public synchronized void add(String name) {
		// 受受到synchronized保护的程序代码块和方法中，
		// 要访问的对象属性必须设定为private，
		// 因为如果不设定为private，
		// 那么就可以用不同的方式来访问它，这样就达不到保护的效果了
		synchronized (this) {
			sum++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("Errer");
			}
			System.out.println(name + "你是第" + sum + "的使用timer的线程");
		}
	}
}

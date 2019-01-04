package ThreeDay;

public class Bijiao2 {
	public static void main(String[] args) {
		run();
	}
	public static void run() {
		try {
			new Bijiao().pao();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}

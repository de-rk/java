package thirteenth;

/**
 * Sushu1
 */
public class Sushu1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            boolean a = false;// 2%2的情况. 因为j<i, a依旧为false
            for (int j = 2; j < i; j++)
                if (i % j == 0) {
                    a = true;
                }
            if (a == false) {
                System.out.println(i);
            }
        }
    }
}
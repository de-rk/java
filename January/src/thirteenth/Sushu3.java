package thirteenth;

/**
 * Sushu3
 */
public class Sushu3 extends Thread {

    @Override // 子类继承父类中的方法重写
    public void run() {
        int i=2001;
        while (i <= 3000) {
            boolean a = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    a = true;// 赋值
            }
            if (a == false)// 对比
                System.out.println(i);
            i++;
        }
    }

    // 同一类中，相同方法名不同参数、不同返还值的方法，就是重载
    public void run(int max) {
       
    }
}
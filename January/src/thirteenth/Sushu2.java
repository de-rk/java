package thirteenth;

/**
 * Sushu2
 */
public class Sushu2 extends Thread {

    @Override
    public void run() {

        int i = 1001;
        while (i <= 2000) {
            boolean t = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {// j是除数，不是输出j
                    t = true;
                }
            }
            if (t == false) {
                System.out.println(i);
            }
            i++;
        }
        /*while (i < 2000) {
            boolean t = false;
            for (int j = 2; j < i; j++) {// 当i>2的时候就需要判断i是否为质数
                if (i % j == 0)// 如果算i不能被循环里的数整除，然后输出，那么会有很多能被整除的数被忽略
                    t = true;// 质数不应能被里面的任何一个数整除，如果可以那么记录下来，如果没有那么就是它
                // 如果求第一个加上break;
            }
            if (t == false)
                System.out.println(i);
            i++;
        }*/
    } 
}
package thirteenth;
/**
 * Test
 */
public class Test extends Thread{
    public static void main(String[] args) throws Exception{
        Sushu1 s1=new Sushu1();
        Sushu2 s2=new Sushu2();
        Sushu3 s3=new Sushu3();
        s1.start();
        s2.start();
        s3.start();
    }
    
}
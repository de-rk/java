package ThreeDay;

public class Exception1 {
	public static void main(String[] args) {
		exceptions(100, 2);
	}
	static void exceptions(int a,int b){
		try {
		int c=a/b;
		Exception[] arror=null;
		System.out.println(arror[0]);
		int[] array=new int [3];
		int i=0;
		while (i<4) {
			System.out.println(array[i]);
			i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("捕获数组越界异常");
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		}catch (ArithmeticException e) {
			System.out.println("算数异常");
		} finally {
			System.out.println("最终处理");
		}
	}
}
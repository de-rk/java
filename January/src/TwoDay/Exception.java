package TwoDay;
//异常处理（Exception）
public class Exception {
	public static void main(String[] args) {
		Exception exception=new Exception();
		exception.arrayException();
		exception.nullPointerException();
		exception.arithmeticException(100, 0);
	}
	void arithmeticException(int a,int b) {
		try {
			int c=a/b;
			System.out.println(c);
		}catch (ArithmeticException e) {
			System.out.println("算数异常");
		}
		System.out.println("捕获异常，程序继续执行");
	}
	void nullPointerException() {
		Exception[] a=null;
		try {
		System.out.println(a[0]);
		} catch (NullPointerException e){
			System.out.println("空指针异常");
		}
		System.out.println("捕获异常，程序继续运行");
	}
	void arrayException(){
		int i=0;
		String [] arr= {
				"Hello World","Hello Kitty","Hello Dingdang"
		};
		try {//可能够发生异常的语句
			while (i<5) {
				System.out.println(arr[i]);
				i++;
			}
			}
			//参数异常对象的声明，如果出现ArrayIndexOutOfBoundsException异常就终止try里面的语句执行语句块
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("数组越界异常");
				//catch内的语句是对异常的处理
				}
			System.out.println("捕获异常，程序继续运行");
			//catch不能单独存在必须配合try,可以有多个catch
	}
}

package ThreeDay;

public class Exception2 {
	public static void main(String[] args) throws Exception {
		Exception2 thro=new Exception2();
		thro.pao1(100, 0);
		//抛出异常1
		thro.pao2();
		//抛出异常2
		thro.pao3();
		//抛出异常3
	}
	//方法中加入throws抛出异常，但是不处理
	void pao1(int a,int b) throws Exception{
		int c=a/b;
	}
	void pao2() throws Exception{
		Exception2[] e=null;
		System.out.println(e[0]);
	}
	void pao3() throws Exception{
		int [] d= {1,2,3};
		int w=0;
		while (w<4) {
			System.out.println(d[w]);
			w++;
		}
	}
}

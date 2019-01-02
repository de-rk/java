package demo;

public class HelloWorld {
	//args 参数名 形参
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Hello\n World\r!!!");
		System.out.println((int)0X0061);
		System.out.println((int)0141);
		System.out.println((int)0X61);*/
		int i=1;
		boolean b= i!=1 && (i++)==2;//等下试试看
		System.out.println(b);
		System.out.println(i);
		
		b=i!=1&(i++)==2;//&和&&都是逻辑运算符，都是判断两边同时真则为真，否则为假；但是&&当第一个条件不成之后，后面的条件都不执行了，而&则还是继续执行，直到整个条件语句执行完为止。
		System.out.println(b);
		System.out.println(i);//应该是2
		
		b=i==2||(i++)==2;
		System.out.println(b);
		System.out.println(i);
		
		
		b=i==2|(i++)==3;
		System.out.println(b);
		System.out.println(i);
	}

}

package ThreeDay;

public class Bijiao {
	void pao() throws NullPointerException{
		String a=null;
		String b="adsa";
		boolean c=a.equals(b);
		//这个地方注意，用空的String比较会提示异常，用有内容的比较空的不会有问题
		System.out.println(c);
	}
}

package FourDay;

public class Bijiao {
	public static void main(String[] args) {
		String a="123456";
		//String类型通过构造器转换为包装类Wrapper
		int b=new Integer(a);//通过构造器转换
		String e=String.valueOf(b);//string类型.value(a) 转换a为指定的包装类型
		if (e.equals("123456"))
			System.out.println(e);
		
		//通过包装类型.parseXxx()转换为基础数据类型
		Integer c=Integer.parseInt(a);
		c=(int)c;
		System.out.println("int类型不能直接转换成String？还需要包装。。"+c);
		
		//包装类通过toString转换为字符串String
		a=c.toString();
		System.out.println(a.hashCode()+"  "+c.hashCode()+"   "+b);
		
		//包装类通过xxxValue() 转换为基础数据类型
		int d=c.intValue();
		System.out.println(d);
		
		//基础数据类型通过构造器转换为包装类型Wrapper
		System.out.println(new Integer(d));
	}
}

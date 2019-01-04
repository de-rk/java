package FourDay;

public class SumE {
	public static int sumE(String args) {
		int sum=0;
		//将字符串转换为char类型的数组
		char[] a=args.toCharArray();
		
		//比较其中的每一个字符。。应该还有别的方法我想想
		for (int i=0;i<a.length;i++) {
			if (a[i]=='e')
				sum++;
		}
		return sum;
	} 
}

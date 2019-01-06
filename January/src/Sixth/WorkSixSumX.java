package Sixth;

import java.util.Scanner;

/**计算字符串中某一指定数组的个数
 * 用空格隔开
 * */
public class WorkSixSumX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("指定字符个数为："+SumX(scanner.nextLine()));
	}
	public static int SumX(String args) {
		int sum=0;
		String[] b=args.split(" ");
		//将字符串转换为char类型的数组
		char[] a=b[0].toCharArray();
		
		//比较其中的每一个字符。。应该还有别的方法我想想
		for (int i=0;i<a.length;i++) {
			if (a[i]==b[1].charAt(b[1].length()-1))//charAt()里面使用索引
				sum++;
		}
		return sum;
	}

}

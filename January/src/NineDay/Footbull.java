package NineDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * 世界杯
*/
public class Footbull {
	public static void main(String[] args) {
		Map<String,ArrayList> map=new HashMap();
		int[] cup=new int[20];
		int[] year=new int[20];
		String[] city=new String[20];
		String[] champion=new String[20];
		int sum=0;
		for (int i=0;;i++) {
			//cup[i]=i+1;
			if (i==3||i==4)
				continue;
			else {
				year[sum]=1930+i*4;
				if (sum==20)
					break;
				else
					sum++;
			}
		}
		System.out.println(Arrays.toString(cup));
		System.out.println(Arrays.toString(year));
		
		//读取用户输入信息
		System.out.println("输入年份或者冠军球队");
		Scanner scanner=new Scanner(System.in);
		scanner.next();//不带空格读取
		
		
	}

}

package NineDay;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FootbullMap {

	public static void main(String[] args) {
		String[] champion= {"乌拉圭","意大利","意大利","乌拉圭","西德","巴西","巴西","英格兰","巴西","西德","阿根廷","意大利","阿根廷","西德","巴西","法国","巴西","意大利","西班牙","德国"};
		int[] year=new int[20];
		int[] cup=new int[20];
		Map map=new HashMap();
		
		int sum=0;
		for (int i=0;;i++) {
			if (i<20)
				cup[i]=i+1;
			if (i==3||i==4)
				continue;
			else {
				if (sum==20)
					break;
				else
					year[sum]=1930+i*4;
					sum++;
			}
		}
		
		for (int i:cup)
			map.put(year[i-1], champion[i-1]);
		Set set= map.keySet();
		//读取用户输入信息
		System.out.println("输入年份或者冠军球队");
		Scanner scanner=new Scanner(System.in);
		String a=scanner.next();//不带空格读取
		
		//遍历
		Iterator iterator=set.iterator();
		while (iterator.hasNext()) {
			Object b= iterator.next();
			//通过key找值
			if (a.equals(b.toString()))
				System.out.println(map.get(iterator.next()));
			//通过值找key
			if (a.equals(map.get(b)))
			System.out.println(b);
		}
	}

}

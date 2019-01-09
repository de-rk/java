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
		ArrayList list=new ArrayList();
		int[] cup=new int[20];
		int[] year=new int[20];
		
		//手动录入数据难受哦
		String[] city= {"乌拉圭","意大利","法国","巴西","瑞士","瑞典","智利","英格兰","墨西哥","前西德","阿根廷","西班牙","墨西哥","意大利","美国","法国","韩日","德国","南非","巴西"};
		String[] champion= {"乌拉圭","意大利","意大利","乌拉圭","西德","巴西","巴西","英格兰","巴西","西德","阿根廷","意大利","阿根廷","西德","巴西","法国","巴西","意大利","西班牙","德国"};
		
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
		
		list.add(cup);
		list.add(year);
		list.add(city);
		list.add(champion);
			
	}

}

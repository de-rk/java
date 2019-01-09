package EightDay;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * 第三题
*/
public class HashSetTest {
	public static void main(String[] args) {		
		Set set=new HashSet();
		set.add(qiu("red"));
		set.add(qiu("blue"));
		
		Iterator iterator=set.iterator();
		while (iterator.hasNext()) {
			System.out.println("号码球");
			for (int i:(int [])iterator.next())
				System.out.println(i);
		}
	}
	
	public static int[] qiu(String color) {
		int[] red=new int[6];
		int[] blue = new int[1];
		
		int o=0;
		label: for (int i=0;;i++) {
			double a=Math.random();
			int b=(int)(a*100);
			
			//随机数红色号码球
			if (b<=33&&b>0) {
				red[o]=b;
				o++;
				if (o>=red.length) {
					break;
				}
			}
		}

		for (int i=0;;i++) {
			double a=Math.random();
			int b=(int)(a*100);
			//随机数蓝色号码球
			if (b<=16&&b>0) {
				blue[0]=b;
				break;
			}
		}
		if (color=="red")
			return red;
		else
			return blue;
	}

}

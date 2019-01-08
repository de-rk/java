package EightDay;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c=null;
		
		for (int i=0;;i++) {
			//随机数
			double a=Math.random();
			int b=(int)(a*100);
			
			if (b<=33)
				c[i]=b;
		
			b[i]=(int)a;
		}
		
		Set set=new HashSet();
		set.add(b);
		set.add(c);
		
		Iterator iterator=set.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

}

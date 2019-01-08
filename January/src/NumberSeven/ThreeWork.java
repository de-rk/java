package NumberSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/**
 * 课后练习第三题
*/
public class ThreeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object apple = "apple";
		Object grape = "grape";
		Object banana = "banana";
		Object pear = "pear";
		
		//列表储存四个元素
		List list= new ArrayList();
		Object[] o={apple,grape,banana,pear};
		Arrays.sort(o);//先给o排序
		for (int i=0;i<o.length;i++)
		list.add(o[i]);
		
		//最大最小值
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println();
		
		Iterator iterator=list.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

}

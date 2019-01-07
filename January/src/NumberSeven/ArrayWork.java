package NumberSeven;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		//假设顺序列表ArrayList中存储的元素是整型数字1~5
		for (int i=1;i<6;i++)
			list.add(i);
		
		//遍历每个元素，将每个元素顺序输出
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}

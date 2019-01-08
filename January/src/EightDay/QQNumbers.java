package EightDay;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 2、已知数组存放一批QQ号码，QQ号码最长为11位，最短为5位
 * String[] strs = {"12345",
 * 					"67891",
 * 					"12347809933",
 * 					"98765432102",
 * 					"67891",
 * 					"12347809933"}。
*/
public class QQNumbers {
	public static void main(String[] args) {
		String[] strs = {"12345",
				"67891",
				"12347809933",
				"98765432102",
				"67891",
				"12347809933"};
		LinkedList<String> list=new LinkedList<>();
		Set<String> set=new HashSet<>();
		/*for (String i:strs)//for each
			list.add(i);*/
		
		for (int i=0;i<strs.length;i++)//for
			set.add(strs[i]);
		
		Iterator<String> iterable= set.iterator();
		while (iterable.hasNext())
			list.add(iterable.next());
		//别再试着直接使用。iterator().hasNext()方法了
		//卡死两次了，相信我调用下面的代码连续多次按 Ctrl+F11
		//让你的机器爆炸
		/*while (set.iterator().hasNext()) {
			System.out.println(set.iterator().next());
			list.add(set.iterator().next());
		}*/
		
		Iterator iterable2=list.iterator();
		while (iterable2.hasNext())
			System.out.println(iterable2.next());
		
		for (String i:list)//for each
			System.out.println(i);
	}
}

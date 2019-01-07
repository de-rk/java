package NumberSeven;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * 接口不能被实例化，所以=后面不能new List();
 * 但是可以使用他的实现类
 * 例如：ArrayList /LinkedList /vector
 */
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		//ArrayList list=new ArrayList();
		//List list1=new Vector();
		
		//输入字符串，传给list。LinkedList最主要的功能方面增强是可以在List
		//的头部尾部添加，删除，取得元素
		System.out.println("请输入一组字符串");
		Scanner scanner=new Scanner(System.in);
		char[] a=scanner.next().toCharArray();
		
		//for 循环传值
		/*
		 * for(int i=0;i<list.size();i++) list.add(a[i]);
		 */
		
		//for each 循环传值
		for (int i=0;i<a.length;i++)
			list.add(a[i]);
		
		//遍历
		//迭代器
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("\n\n\n");
		
		//for循环
		for (int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		//其他方法
		list.getFirst();//最前面的元素
		list.getLast();//最后后面的元素
		list.get(2);//get(index) 的元素
		list.clear();//内容清空
		System.out.println(list);
	}
}

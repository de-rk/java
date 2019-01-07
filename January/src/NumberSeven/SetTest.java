package NumberSeven;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Collection的子类Set
 * 用来包含无需无重复的对象
 * @param 两个实现类
 * @param HashSet and TreeSet
*/
public class SetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//新建两个个Set接口的实现
		Set s=new HashSet();
		Set s1=new TreeSet();
		
		//输入字符串并转换为char类型的数组
		System.out.println("其输入一串字符");
		Scanner scanner=new Scanner(System.in);
		char[] a=scanner.next().toCharArray();
		
		//循环添加a中的元素到s，中间会涉及自动装箱
		for(int i=0;i<a.length;i++)
			s.add(a[i]);
		
		//输出无需无重复的元素
		Iterator iterator=s.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}

}

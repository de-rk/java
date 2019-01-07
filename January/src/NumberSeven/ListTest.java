package NumberSeven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 接口不能被实例化，所以=后面不能new List();
 * 但是可以使用他的实现类
 * 例如：ArrayList /LinkedList /vector
 */
public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//将ArrayList实现传给List
		List a=new ArrayList();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入一段字符串");
		
		/*
		 * 通过控制台输入String类型数据，在转换为Char类型数组
		 *将char类型数组的每个元素传给a。中间涉及自动装箱，自动拆箱
		*/
		char[] b=scanner.next().toCharArray();
		for (char i:b) {//for each 循环写法。b中的每个元素传给i，传给a.add()
			a.add(i);
		}
		
		//遍历
		//迭代器遍历
		Iterator iterator=a.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//for 循环
		for (int i = 0;i<a.size();i++)
			System.out.println(a.get(i));
	}

}

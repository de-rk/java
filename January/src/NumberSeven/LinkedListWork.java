package NumberSeven;

import java.util.LinkedList;
/**
 * 课后练习第一题
*/
public class LinkedListWork {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		put("",list);
		System.out.println(isEmpty(list));
		System.out.println(get(list,0));
	}
	
	//取出对象的方法
	public static Object get(LinkedList Object,int index) throws Exception{
			return	Object.get(index);
	}
	
	//判断是否为空的方法
	public static boolean isEmpty(LinkedList element) {
		if (element.isEmpty()) {
			System.out.println("true");
			return true;
			}
		else
			return false;
	} 
	//放入对象的方法
	public static void put(String a,LinkedList list) {
		char[] b=a.toCharArray();
		for (int i=0;i<b.length;i++)
			list.add(b[i]);
	}

}

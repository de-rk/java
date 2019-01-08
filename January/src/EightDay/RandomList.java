package EightDay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 10个1-100的随机数，并放到一个数组中，把数组中大于10的数放到list集合中
 * @param Math的Random()方法。 或者Random() random=new Random();
 * 
 * @param List
 * @param Iterator
 * hasNext()判断是否有下一个元素
*/
public class RandomList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1-100间的随机数，10以上的给集合
		double[] array=new double[10];
		List list=new ArrayList();
		for (int i=0;i<array.length;i++) {
			double a= Math.random();
			a=a*100;
			array[i]=a;
			if (a>=10) {
				System.out.println(a);
				list.add(a);
			}
		}
		//for each读取数组中的值
		for (double i:array)
			System.out.println(i);
		
		//迭代器读取集合中的值
		Iterator iterator=list.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		
		//ERRER下面直接使用迭代器的方法会无限输出一个值
		/*while (list.iterator().hasNext())
			System.out.println(list.iterator().next());*/
		
	}

}

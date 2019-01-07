package NumberSeven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ShuruSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入
		Scanner scanner=new Scanner(System.in);
		String a=scanner.nextLine();
		String[] b=a.split(" ");
		
		//集合
		ArrayList list=new ArrayList();
		for (int i=0;i<b.length;i++) {
			list.add(b[i]);
		}
		
		//冒泡
		Object d;
		  for (int i=0;i<list.size();i++) 
			  for (int j=0;j<i;j++) 
				  if (list.get(j).toString().toCharArray()[0]>list.get(j+1).toString().toCharArray()[0]){ 
					  d=list.get(j);
					  list.set(j,list.get(j+1));
					  list.set(j+1, d);
					  }
		 
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
	}
}

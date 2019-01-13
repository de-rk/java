package EightDay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * @param Iterator
 * @param
 * hasNext()判断是否有下一个元素
 * next()下一个元素
*/
public class MapTest {

	public static void main(String[] args) {
		Test apple=new Test(1,"Jerry");
		Test banana=new Test(2,"Tom");
		
		//给Map类型的a中put值。需要创建Key
		//添加泛型<E>
		//String变量创建会占用内存
		Map<StringBuilder,Test> a=new HashMap<>();
		a.put(new StringBuilder("Jerry1"), apple);//(key,Object Value)
		a.put(new StringBuilder("Tom1"), banana);
		
		//类型转换
		//转出来的内容别人又不知道是什么格式，类型
		//无法让两个值相等的StringBuilder相等，除了用equals()
		//new StringBuilder!=new StringBuilder
		StringBuilder c=new StringBuilder("Jerry1");
		Test b=a.get(c);
		System.out.println(b);
		
		//迭代器遍历key，key遍历元素内的值
		Iterator iterator= a.keySet().iterator();
		//取出的是Set类型如果是String类型就需要转换为StringBuilder
		/*Set<StringBuilder> d=a.keySet();
		Iterator iterator2=d.iterator();*/
		//<StringBuilder>为防止循环创建对象导致内存溢出，泛型设定为StringBuilder
		
		
		while (iterator.hasNext()) {
			//System.out.println(iterator.next());
			//上面的iterator.next()会读取一次下个元素
			b=a.get(iterator.next());//类型转换
			System.out.println(b.name+"     "+b.i);
		}
	}

}

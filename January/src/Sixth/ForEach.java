package Sixth;

/**练习for each
 * 
*/
public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {20,30,40,50,10};
		System.out.println("------for each--------");
		//下面是for each 语句
		for (int i:numbers) {
			System.out.println("coount is :" + i);
		}
		/*分析
		 * for each 语句目前知道可以用来遍历数组
		 * for 循环里面将数组numbers的和i对应的值，传给了i，
		 * 亦或者说变量，和原来i的循环变量不同，i就是保存每次循环中numbers的值
		 * 书中的描述
		 * 
		 * 从示例中可以发现，item不是循环变量，它保存了集合中的元素，
		 * for-each语句将集合中的元素一一取出来，并保存到item中，
		 * 这个过程中不需要使用循环变量，通过数组下标访问数组中的元素。
		 * 可见for-each语句在遍历集合的时候要简单方便得多。
		*/
	}

}

package Sixth;

import java.util.Arrays;
import java.util.Random;

/**第三题，10个0～100间的数
 * 排序后输出
*/
public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr=new int[10]; 
		/*
		 * Random random=new Random();
		 * for (inti=0;i<arr.length;i++) 
		 * { arr[i]=random.nextInt(100); }
		 */
		 
		for (int i=0;i<10;i++)
			arr[i]=(int)(Math.random()*100);
		//按题目的要求使用Math.random()生成随机数
		
		System.out.println(Arrays.toString(arr));//利用Arrays类转换为String类型
		
		Arrays.sort(arr);//利用Arrays类进行数组的排序
		System.out.println(Arrays.toString(arr));
	}

}

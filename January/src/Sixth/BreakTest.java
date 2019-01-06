package Sixth;

/**练习break+label
 * continue+label
*/
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		label1:for (int i=0;i<10;i++)
			for(int j=0;j<i;j++) {
				if (j>4)
					break label1;
				System.out.println("i:"+i+"j:"+j);
			}
		//分析break中止最近所在的循环；加上label跳出指定的循环
		label2:for (int j=0;j<6;j++)
			for (int i=0;i<6;i++) {
			if (i==j)
				continue label2;
			//System.out.println("i:"+i+"j:"+j);
			}
		/*continue 跳出本次循环;加上label跳出指定循环的本次循环
		*/
	}
}

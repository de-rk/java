package com.neusoft.test;
import java.util.Arrays;
import java.util.Scanner;;
public class TestArr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//讲一个字符数组的值拷贝到另一个字符数组中
		Scanner scanner=new Scanner(System.in);
		//String str=scanner.next();
		/*String str1[]=str.split(",");
		System.out.println(Arrays.toString(str1));
		//方法一
		String str2[]=Arrays.copyOf(str1,str1.length);
		//方法二
		String str2[];
		System.arraycopy(str1, 0, str2, 0, str1.length);
		//从str1的0位开始copy到str2的0位开始，copy长度str1的长度
		//方法三
		/*String str2[]= new String[str1.length];
		for (int i=0;i<str1.length;i++){
			str2[i]=str1[i];
		}*/
		//System.out.println(Arrays.toString(str2));
		
		//给定一个有9个整数（1,6,2,3,9,4,5,7,8）的数组，先排序，
		//然后输出排序后的数组的值。（知识点：Arrays.sort排序、冒泡排序） [必做题]
		//int arr[]= {1,6,2,3,9,4,5,7,8};
		//方法一Arrays.sort排序法
		//Arrays.sort(arr, 0,arr.length);
		//方法二冒泡排序法
		/*int o;
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]){
					o=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=o;
				}
				}
			}*/
		//System.out.println(Arrays.toString(arr));
		
		//、有2个多维数组分别是 2 3 4   和  1 5 2 8 
//        4 6 8         5 9 10 -3 
//        2 7 -5 -18
//		按照如下方式进行运算。生成一个2行4列的数组。
//		此数组的第1行1列是2*1+3*5+4*2第1行2列是2*5+3*9+4*7  第2行1列是4*1+6*5+8*2 依次类推。
//		（知识点：多维数组定义和创建、数组遍历、数组元素访问） [选作题]
		
		
//		输出一个double型二维数组（长度分别为5、4，值自己设定）的值。
//		（知识点：数组定义和创建、多维数组初始化、数组遍历） [必做题]
		/*double arr1[]= {1,2,3,3,4,5};
		double arr[][]= {{1,2},{1},{2},{3},{100,102}};
		String str;
		
		for (int j=0;j<5;j++) {
		for (int i=0;i<4;i++){
			str=scanner.next();
			arr[j][i]=str.split(",");
		}
		}
		
		for (int i=0;i<arr.length;i++) {
		System.out.println(Arrays.toString(arr[i]));
		}*/
		
//		在一个有8个整数（18，25，7，36，13，2，89，63）的数组中找出其中最大的数及其下标。
//		（知识点：数组遍历、数组元素访问） [必做题]
		/*int arr[]= {18,25,7,36,13,2,89,63};
		int max=0;
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i]>arr[i+1])
				max=arr[i];
		}
		int arr1[];int a=0;
		for (int i=0;i<arr.length;i++) {
			if (max==arr[i])
				a=i;
		}
		System.out.println(a);*///没做对
		
		
//		printBig(scanner.nextInt(),scanner.nextInt());
//		shu(10,scanner.next().charAt(0),2);
		
			
	}
	public static void shu(int x ,char y,int z) {
		if (y=='*')
			System.out.println(x*z);
		else if (y=='/')
			System.out.println(x/z);
		else if (y=='+')
			System.out.println(x+z);
		else if (y=='-')
			System.out.println(x-z);
	}
	public static void printBig(int x , int y){
			if (x>y)
				System.out.println(x);
			else if (x<y)
				System.out.println(y);
			else
				System.out.println("两个数相等");
		}
}

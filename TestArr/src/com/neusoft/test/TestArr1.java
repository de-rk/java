package com.neusoft.test;
import java.util.Arrays;
import java.util.Scanner;;
public class TestArr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ���ַ������ֵ��������һ���ַ�������
		Scanner scanner=new Scanner(System.in);
		//String str=scanner.next();
		/*String str1[]=str.split(",");
		System.out.println(Arrays.toString(str1));
		//����һ
		String str2[]=Arrays.copyOf(str1,str1.length);
		//������
		String str2[];
		System.arraycopy(str1, 0, str2, 0, str1.length);
		//��str1��0λ��ʼcopy��str2��0λ��ʼ��copy����str1�ĳ���
		//������
		/*String str2[]= new String[str1.length];
		for (int i=0;i<str1.length;i++){
			str2[i]=str1[i];
		}*/
		//System.out.println(Arrays.toString(str2));
		
		//����һ����9��������1,6,2,3,9,4,5,7,8�������飬������
		//Ȼ����������������ֵ����֪ʶ�㣺Arrays.sort����ð������ [������]
		//int arr[]= {1,6,2,3,9,4,5,7,8};
		//����һArrays.sort����
		//Arrays.sort(arr, 0,arr.length);
		//������ð������
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
		
		//����2����ά����ֱ��� 2 3 4   ��  1 5 2 8 
//        4 6 8         5 9 10 -3 
//        2 7 -5 -18
//		�������·�ʽ�������㡣����һ��2��4�е����顣
//		������ĵ�1��1����2*1+3*5+4*2��1��2����2*5+3*9+4*7  ��2��1����4*1+6*5+8*2 �������ơ�
//		��֪ʶ�㣺��ά���鶨��ʹ������������������Ԫ�ط��ʣ� [ѡ����]
		
		
//		���һ��double�Ͷ�ά���飨���ȷֱ�Ϊ5��4��ֵ�Լ��趨����ֵ��
//		��֪ʶ�㣺���鶨��ʹ�������ά�����ʼ������������� [������]
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
		
//		��һ����8��������18��25��7��36��13��2��89��63�����������ҳ����������������±ꡣ
//		��֪ʶ�㣺�������������Ԫ�ط��ʣ� [������]
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
		System.out.println(a);*///û����
		
		
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
				System.out.println("���������");
		}
}
package com.neusoft.test;
import java.util.Random;
import java.util.Scanner;
public class Sonsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
/*		outer: for(int i=0;i<10;i++) {
			System.out.println("Outer loop");
			
			inner: while(true) {
				Scanner sc=new Scanner(System.in);
				String s=sc.next();
				System.out.println("inner loop"+s);
				if (s.equals("hello"))
					break inner;
				if (s.equals("kitty"))
					break outer;
			}
		}*/
		/*for (int i=1;i<50;i++) {
			if (i%2==0)
				continue;//continue���Զ�Ϊ0�˳�������ѭ������breakֱ���˳�ѭ��
			System.out.print(i+" ");//���50���ڵ�����
		}*/
		//��һ�� ��ҵ���ŵĽ������������ɣ�����С�ڵ���10�����10%��
		//		�������10��С�ڵ���20�򣬸���10��Ŀ����7.5%��
		//		����20�����ں͵���40��ʱ������20��Ĳ���5%����ɣ�
		//		����40�򣬵��ڵ���60��ʱ������40��Ĳ���3%����ɣ�
		//		����60�򣬵��ڵ���100�򣬺���60��Ĳ���1.5%����ɣ�
		//							����100��1%����ɡ�
		/*int yj=scanner.nextInt();
		if (yj<=100000)
			System.out.println("���10%="+yj*0.1);
		else if (yj<=200000)
			System.out.println("���7.5%="+yj*0.075);
		else if (yj<=400000)
			System.out.println("���5%="+yj*0.05);
		else if (yj<=600000)
			System.out.println("���3%="+yj*0.03);
		else if (yj<=1000000)
			System.out.println("���1.5%="+yj*0.015);
		else 
			System.out.println("���1%="+yj*0.01);*///����ѧ���㷨
//		�ڶ���   ����һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���
//		A��90-100��B��80-89��C��70-79��D��60-69��E��0~59
//		��֪ʶ�㣺�������switch��[������]
		/*int cj=scanner.nextInt();
		int a=cj/10;
		switch (a) {
		case 10:
		case 9:
			System.out.println("90-100");
			break;
		case 8:
			System.out.println("80-89");
			break;
		case 7:
			System.out.println("70-79");
			break;
		case 6:
			System.out.println("60-69");
			break;
		default:
			System.out.println("0~59");
			break;
			}*/
//		������ ����ĳԱ���������н��30000Ԫ����н����������6%��
//		��дһ��JavaӦ�ó�������Ա��10������н����ͳ��δ��10�꣨�ӽ������������롣
//		��֪ʶ�㣺ѭ�����for��[ѡ����]
		/*double sr=30000;
		double sum = 0;
		for (int i=1;i<=10;i++) {
			System.out.println("��"+i+"�����룺"+sr);
			sum=sum+sr;
			System.out.println(i+"�������룺"+sum);
			sr=sr*1.06;//��һ����ڶ�������룬�ھ������ʮ�������
		}*/
//		������ ���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ�����ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
//		�Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
//		����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١���֪ʶ�㣺ѭ����� while��[ѡ����]
		/*int x=0;
		int sum=1;
		while (x<10) {
			System.out.println("��"+(10-x)+"��ʣ��"+sum+"������");
			sum=(sum+1)*2;
			x++;
		}*///���1534������
//		������    ����һ�����֣��ж���һ����������ż����֪ʶ�㣺������䣩 [������]
		/*int a=scanner.nextInt();
		if (a%2==0)
			System.out.println(a+"Ϊż��");
		else 
			System.out.println(a+"Ϊ����");*/
//		������ ��д���� �ж�һ������x��ֵ�������1�����x=1��
//		�����5�����x=5������� 10�����x=10��
//		�������ϼ���ֵ�������x=none����֪ʶ�㣺������䣩 [������]
		/*int x=new Random().nextInt(11);
		System.out.println(x);
		switch (x) {
		case 1:
			System.out.println("x=1");
			break;
		case 5:
			System.out.println("x=5");
			break;
		case 10:
			System.out.println("x=10");
			break;
		default:
			System.out.println("x=none");
			break;
		}*/
//		������ �ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6��������
//		��ֻ�ܱ�5��������ӡ�ܱ�5����������ֻ�ܱ�6����������ӡ�ܱ�6��������
//		���ܱ�5��6����������ӡ���ܱ�5��6��������֪ʶ�㣺������䣩 [������]
		/*int x=scanner.nextInt();
		if (x%5==0&&x%6==0)
			System.out.println("�ܱ�5��6����");
		else if (x%5==0&&x%6!=0)
			System.out.println("�ܱ�5����");
		else if (x%5!=0&&x%6==0)
			System.out.println("�ܱ�6����");
		else
			System.out.println("���ܱ�5��6����");*/
//	 �ڰ��� ����һ����ݣ��ж��������Ƿ������֪꣨ʶ�㣺������ѭ����䣩 [������]
		/*int n=scanner.nextInt();
		if (n%4==0) {
			if (n%400!=0&&n%100==0)
			//������ܱ�4���������������ꡣ�����ܱ�100���������ܱ�400����������
			System.out.println("��������");
			else 
				System.out.println("������");
			}*/
//		�ھ���  ����һ��0��100�ķ������������0��100֮�䣬��ӡ������Ч�����ݷ����ȼ���ӡA,B,C,D,E
//		��֪ʶ�㣺�������if elseif�� [������]
		/*int a=scanner.nextInt();
		if (a>100)
			System.out.println("������Ч");
		else if (a>=90&&a<=100)
			System.out.println("�ȼ�Ϊ��A");
		else if (a>=80)
			System.out.println("�ȼ�Ϊ��B");
		else if (a>=70)
			System.out.println("�ȼ�Ϊ��C");
		else if (a>=60)
			System.out.println("�ȼ�Ϊ��D");
		else if (a<60&&a>=0)
			System.out.println("�ȼ�Ϊ��E");
		else
			System.out.println("������Ч");*/
//		��ʮ�� ������������x,y,z���������������С���������֪ʶ�㣺������䣩 [������]
		int x,y,z;
		System.out.println("������������");
		System.out.print("x��");
		x=scanner.nextInt();
		System.out.print("y��");
		y=scanner.nextInt();
		System.out.print("z��");
		z=scanner.nextInt();
		if (x>y&&x>z&&y>z)
			System.out.println(x+"\n"+y+"\n"+z);
		else if (x>y&&x>z&&y<z)
			System.out.println(x+"\n"+z+"\n"+y);
			
			
			
	}
}

package com.github.test; 
import com.neusoft.test.*;

	public class Tree {
		public String name;
		public int length;
		public boolean leaf;
		public String print="��";
		
		public Tree() {//Ĭ�Ͽչ�����
			
		}
		
		public void Tree() {//�޷���ֵ
			
		}
		
		public Tree (String name,int age){//�в���������
				this.name=name;
				length=age;       
				}
		public String print() {
			return name+"��Ҷ"+length+"����\n";
		}

		public void print(String n,int l,boolean f) {
			if (f==true)
			System.out.println(n+"Ϊ��Ҷֲ��һ���������"+l+"��");
			else
				System.out.println("sadasfhas");
		}
		public String print(String name,int l) {
			this.name=name;//�޸�֮��ȫ�ֱ����ͱ���
			return name+"��Ҷ"+l+"����\n"+this.name;//this���ñ������ԣ�Ҳ����ȫ�ֱ�����
		}
		
		public static void main(String[] args) {
			Tree tree =new Tree("����",16);
			//tree.print("����",26,2>1);
			//tree.print("��Ҷ", 2, true);
			//System.out.println(tree.print);
			System.out.println(tree.print("����",13));
			//FuncTest test=new FuncTest();
			//test.shu('3','*','8');
			System.out.println(tree.print());
			System.out.println(new Tree("����",17).print());
		}
}
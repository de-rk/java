package tenth;

import java.io.File;
/**
 * 第一题读取文件名和目录
 * @param File
 * 	的list()方法
*/
public class WorkOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("e:/java1");
		System.out.println(f.list().length);
		for (int i=0;i<f.list().length;i++) {
			System.out.println(f.list()[i]);
			System.out.println(f.listFiles()[i]);
		}
	}

}

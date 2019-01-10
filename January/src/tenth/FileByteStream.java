package tenth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileByteStream {
	public static void main(String[] args) throws IOException {
		File f=new File("D:/java");
		File f1=new File(f,"Test.txt");
		System.out.println(f1.createNewFile());
		
		//读取字符流
		/*@SuppressWarnings("resource")
		FileInputStream in=new FileInputStream(f1);
		byte[] a=new byte[(int) f1.length()];
		in.read(a);
		String s=new String(a);
		System.out.println(s);*/
		
		f1.delete();
		f1.createNewFile();
		
		//输出字符流
		String b="10,20,30,40";
		FileOutputStream out=new FileOutputStream(f1);
		//为文件创建输出字符流
		out.write(b.getBytes());//将byte数组中的数据写出到文件中
		out.flush();//刷新并强制写出
		out.close();//关闭输出
		
		//再读取
		FileInputStream in=new FileInputStream(f1);
		//为文件创建输入字符流
		byte[] a=new byte[(int) f1.length()];
		in.read(a);//将文件中的数据读取到byte数组中
		in.close();//关闭读取
		String s=new String(a);//byte数组转换为String类型
		System.out.println(s);
	}
}

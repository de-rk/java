package tenth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileStringStream {

	public static void main(String[] args) throws IOException {
		File f=new File("D:/java");
		File f1=new File(f,"Test1.txt");
		System.out.println(f1.delete());
		System.out.println(f1.createNewFile());
		
		//FileInputStream in=new FileInputStream(f1);
		
		/*
		 * 	Reader是输入字符数据用的类，它所提供的方法和InputStream类一样，
		 *	差别在于InputStream类中用的是byte类型，
		 *	而Reader类中用的是char类型。
		*/
		
		String s= "12345";
		char[] b= {10,20,30,40,50};
		
		//写入字符数据流
		FileWriter out = new FileWriter(f1);
		PrintWriter point=new PrintWriter(f1);
//		out.write(b);
//		out.flush();
//		out.close();
//		point.write(s);
//		point.flush();
//		point.close();
		BufferedWriter bw=new BufferedWriter(out);
		bw.write(s);
		bw.flush();
		bw.close();
		
		
		//读取字符数据流
		FileReader r=new FileReader(f1);
//		char[] c=new char[(int)f1.length()];
//		System.out.println(r.read(c));
//		String s1=new String(c);
//		System.out.println(s1);
		
		System.out.println(r.ready());
		BufferedReader br=new BufferedReader(r);
		System.out.println(br.readLine());
		br.close();
	}

}

package tenth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WorkTwoCopyFile {

	public static void main(String[] args) throws IOException {
		//创建文件夹
		File f=new File("d:/io");
		System.out.println(f.mkdir());
		
		//创建文件
		File f1=new File("D:/io/copysrc.doc");
		File f2=new File("D:/io/copydes.doc");
		System.out.println(f1.createNewFile());
		System.out.println(f2.createNewFile());
		
		//创建字符串
		String str="你好世界";
				
		//传输数据给copysrc.doc
		FileWriter fw=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(str);
		bw.flush();
		bw.close();
		
		//将f1中的数据读出
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		
		//将读出的数据传给f2
		FileWriter fw2=new FileWriter(f2);
		BufferedWriter bw2=new BufferedWriter(fw2);
//		System.out.println(br.readLine());//只能读取一次这个地方读取了，下面就不能读取了
//		bw2.write(br.read());//使用这一句太麻烦后面需要String()构造器转换char数组
		bw2.write(br.readLine());
		bw2.flush();
		bw2.close();
		
		//将f2中的数据读出
		FileReader fr2=new FileReader(f2);
		BufferedReader br2=new BufferedReader(fr2);
		System.out.println(br2.readLine());
		br2.close();
	}

}

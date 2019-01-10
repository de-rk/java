package tenth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) throws IOException {
		File f=new File("D:/java");
		File f1=new File(f,"Test1.txt");
		System.out.println(f1.createNewFile());
		
		//FileInputStream in=new FileInputStream(f1);
		String s= "12345";
		
		//写入字符数据流
		FileWriter out = new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(out);
		bw.write(s);
		bw.flush();
		bw.close();
		
		//读取字符数据流
		FileReader r=new FileReader(f1);
		BufferedReader br=new BufferedReader(r);
		System.out.println(br.readLine());
		br.close();
	}

}

package NineDay;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*File f=new File("d:/dengrongkang/drk/");
		System.out.println(f.mkdirs());
		File f1=new File(f,"file");
		System.out.println(f1.mkdir());
		System.out.println(Arrays.toString(f.list()));
		System.out.println(f1.exists());
//		f1.delete();
//		f.delete();
		System.out.println(f1.exists());
		System.out.println(f.exists());
		System.out.println("d:/dengrongkang/".equals(f));*/
		
		//创建目录
		/*File f=new File("d:/drk");
		f.mkdir();
		//临时目录下创建临时文件
		System.out.println(f.createTempFile("drk", "txt"));
		if (f.exists())
			System.out.println("创建成功");
		else
			System.out.println("不存在");*/
		
		File d=new File("d:/dengrongkang");
		System.out.println(d.delete());
		System.out.println(d.exists());
		
		
	}

}

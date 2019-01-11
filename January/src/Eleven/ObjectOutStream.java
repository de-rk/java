package Eleven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;


public class ObjectOutStream{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f=new File("D:/text.txt");
		f.createNewFile();
		Obj b=new Obj(100,"world over");
		
		//先用文件输出流输出对象到Object输出流，再用Object输出流将对象输出到文件
//		OutputStream a = new FileOutputStream(f);
//		ObjectOutputStream fo=new ObjectOutputStream(a);
//		fo.writeObject(b);
		
		//先读取文件到输入流，再将输入流输出到Object输入流
//		InputStream d=new FileInputStream(f);
//		ObjectInputStream on=new ObjectInputStream(d);
		//读出对象通过Object来保存。转换成原来的类型后输出到控制台
//		Object c=on.readObject();
//		System.out.println(((Obj)c).a);
		List<Obj> a=new ArrayList<Obj>();
		a.add(b);
		
		OutputStream os=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(a);
		
		InputStream d=new FileInputStream(f);
		ObjectInputStream on=new ObjectInputStream(d);
		//读出对象通过Object来保存。转换成原来的类型后输出到控制台
		Object c=on.readObject();
		ArrayList c1=(ArrayList)c;
		Obj b1=(Obj)c1.get(c1.size()-1);//这个地方是下标
		System.out.println(b1.a+"  "+b1.b);
	}

}

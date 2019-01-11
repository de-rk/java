package Eleven;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;

/**Third 第三
 * 第十一章课后练习第三题
*/
public class ThirdWork {
	public static void main(String[] args) throws IOException {
		File f=new File("D:/test.txt");
		System.out.println(f.createNewFile());
	}

}

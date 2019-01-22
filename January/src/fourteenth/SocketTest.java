package fourteenth;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest implements Runnable{
	public void socket() throws UnknownHostException, IOException {
		Socket s=new Socket("10.25.202.69", 2333);
		//套接码连接
		OutputStream os=s.getOutputStream();
		//OutputStream是个抽象接口
		
		DataOutputStream dos=new DataOutputStream(os);
		Scanner str=new Scanner(System.in);
		dos.writeUTF(str.nextLine());
		dos.flush();//强制更新
		dos.close();//输出完了记得关闭
		s.close();//链接完了记得关闭
	}
	
	@Override
	public void run() {
			try {
				socket();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}

package fourteenth;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketHost {

	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(2333);
		
		while (true) {
			Socket s=ss.accept();
			//创建一个接收客户端数据的对象
			DataInputStream dis=new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			
			System.out.println("address "+s.getLocalAddress()+":"+s.getPort());
			dis.close();
			s.close();
		}
	}

}

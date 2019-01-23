package twentyThee;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Test {
	public static void main(String[] args) {
		try
	    {
	        TubeP sender = new TubeP();
	        TubeI receiver = new TubeI();
	        Thread senderThread = new Thread(sender);
	        Thread receiverThread = new Thread(receiver);
	        PipedOutputStream out = sender.getOutputStream(); // 写入
	        PipedInputStream in = receiver.getInputStream(); // 读出
	        out.connect(in);// 将输出发送到输入
	        senderThread.start();
	        receiverThread.start();
	    } 
	    catch (IOException e)
	    {
	        e.printStackTrace();
	    } 
	}
}

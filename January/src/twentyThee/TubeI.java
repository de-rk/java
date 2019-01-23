package twentyThee;

import java.io.IOException;
import java.io.PipedInputStream;

public class TubeI extends Thread{
	private PipedInputStream in = new PipedInputStream();
    
    public PipedInputStream getInputStream()
    {
        return in;
    }
    
    public void run()
    {
        String s = null;
        byte b0[] = new byte[1024];
        try
        {
            int length = in.read(b0);
            if (-1 != length)
            {
                s = new String(b0, 0 , length);
                System.out.println("收到了以下信息：" + s);             
            }
            in.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

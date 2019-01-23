package twentyThee;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;

public class TubeP extends Thread{

	 private PipedOutputStream out = new PipedOutputStream();
	    
	    public PipedOutputStream getOutputStream()
	    {
	        return out;
	    }
	    
	    
	    private String num;
	    public String getNum() {
			return num;
		}
		public void setNum(String num) {
			this.num = num;
		}


		public void run()
	    {
	        String str = getNum();
	        try
	        {
	            out.write(str.getBytes()); // 向管道流中写入数据（发送）
	            out.close();
	        } 
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }    
}

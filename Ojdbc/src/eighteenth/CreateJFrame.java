package eighteenth;

import java.awt.TextField;

import javax.swing.JFrame;

public class CreateJFrame extends JFrame{
	private JFrame j=new JFrame();
	
	public void create(int pro) {
		if (pro==0)
			j.setTitle("user");
		else 
			j.setTitle("admin");
		j.setBounds(100,100,500,300);
		j.setVisible(true);
	}
	
	public void lose() {
		TextField tf=new TextField("login lose");
		j.add(tf);
		j.setBounds(100, 100, 200, 100);
		j.setVisible(true);
	}
	
	public void close() {
		this.close();
	}
}

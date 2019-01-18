package eighteenth;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.tree.AbstractLayoutCache;

public class Zhu {
		
	public static void main(String[] args) {
		JFrame frame = new JFrame();
        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout(5,5));
        pane.setFont(new Font("Helvetica", Font.PLAIN, 14));
        pane.add("North", new JButton("North"));
        pane.add("South", new JButton("South"));
		pane.add("East",new JButton("East"));
		pane.add("West", new JButton("West"));
		pane.add("Center",new JButton("Center"));//将按钮添加到窗口中
        
        
        //构造函数，初始化对象值
      	//设置为边界布局，组件间横向、纵向间距均为5像素
//        setLayout(new BorderLayout(5,5));
//		setFont(new Font("Helvetica", Font.PLAIN, 14));
//			getContentPane().add("North", new JButton("North"));
//			getContentPane().add("South", new JButton("South"));
//			getContentPane().add("East",new JButton("East"));
//			getContentPane().add("West", new JButton("West"));
//			getContentPane().add("Center",new JButton("Center"));
        
        // slider to control horizontal rotation
        JSlider headingSlider = new JSlider(-180, 180, 0);
        pane.add(headingSlider, BorderLayout.SOUTH);

        // slider to control vertical rotation
        JSlider pitchSlider = new JSlider(SwingConstants.VERTICAL, -90, 90, 0);
        pane.add(pitchSlider, BorderLayout.EAST);
        
        //add user label
//        Label label=new Label("user");
//        pane.add(label);
//        
        //add password label
//        Label label2=new Label("password");
//        pane.add(label2);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

	}

}

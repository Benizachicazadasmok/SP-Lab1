package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;

public class Window {
	public static void main(String[] args) {  
		JFrame f=new JFrame();//creating instance of JFrame  
		          
		          
		f.setSize(400,500);//400 width and 500 height  
		f.getContentPane().setLayout(null);//using no layout managers  
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 366, 441);
		f.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JTextPane textPane = new JTextPane();
		panel.add(textPane);
		f.setVisible(true);//making the frame visible  
		}  
}

package threads;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class MyWindow {
public static void main(String[] args) {
	
	JFrame frame=new JFrame();
	frame.setSize(300, 400);
	frame.setLayout(new FlowLayout());
	
	
	JButton button = new JButton("Click Me!");
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Clicked !");
			JOptionPane.showMessageDialog(null, "Button is click");
			
		}
	});
	
	frame.add(button);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	
}
}

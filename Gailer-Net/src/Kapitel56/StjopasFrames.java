package Kapitel56;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;



public class StjopasFrames extends JFrame implements ActionListener{
	
	JLabel label1 = new JLabel("Dieses Label gibts immer");
	JButton bChange = new JButton("Erster Button");
	JButton bChange2;
	
	
	public StjopasFrames(String title) {
		super(title);
		
		
		setLayout(new FlowLayout());
		
		
//		label1 = new JLabel("Dieses Label bekommen alles Frames von Stjopa automatisch");
		add(label1);
		
//		bChange = new JButton("klick mich!");
		add(bChange);
		bChange.addActionListener(this);
//		bChange2 = new JButton("klick nochmal");
//		add(bChange2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void actionPerformed(ActionEvent evt) {
		getContentPane().setBackground(Color.BLUE);
		
	}
	
}

package Kapitel56;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class neuesProgramm extends JFrame implements ActionListener {

	JButton Button1 = new JButton("klick mich");
	JLabel Label1 = new JLabel("Titel des Labels");
	
	public neuesProgramm(String title) {
		super(title);
		
		setVisible(true);
		setBounds(200, 100, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(Button1);
		add(Label1);
		Button1.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent evt) {
		System.exit(0);
	}
	
	public static void main(String[] args) {
		neuesProgramm pr = new neuesProgramm("TitelSindToll");
	}
}

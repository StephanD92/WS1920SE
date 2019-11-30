package T06_20190514;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstJFrame extends JFrame{
	
	private JButton btnHello;
	private JButton btnClose;

	public MyFirstJFrame(String title) {
		super.setLocation(100, 100);
		super.setTitle(title);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(new FlowLayout(FlowLayout.CENTER));
		super.add(this.btnHello = new JButton ("Hello"));
		super.add(this.btnClose = new JButton ("Beende"));
		
		this.btnHello.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello World");
			}
			
		});
		
		this.btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				System.out.println("Programm beendet!!!");
				System.exit(0);   //führt dazu das alle Fenster beendet werden falls es mehrere gibt
				// kommentiert man es aus geht bei beeenden nur eins zu
			}
		});
		
		super.pack();
		super.setVisible(true);
	}

	public static void main(String[] args) {
		MyFirstJFrame nummer1 = new MyFirstJFrame("Mein Fenster");
		MyFirstJFrame nummer2 = new MyFirstJFrame("Mein Fenster2");
		new MyFirstJFrame("Mein Fenster3");

	}

}

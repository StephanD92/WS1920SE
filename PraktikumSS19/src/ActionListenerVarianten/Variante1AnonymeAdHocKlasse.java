package ActionListenerVarianten;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Variante1AnonymeAdHocKlasse {

	static JFrame mainWindow = new JFrame("Der Fenstertitel");
	static JButton button = new JButton("click me");
	static JTextField textfeld1 = new JTextField();
	static JTextField textfeld2 = new JTextField();
	static JButton button2 = new JButton("übergebe Text");
	static JLabel lable1 = new JLabel ("gibt Text ein");
	static JButton button3 = new JButton("Schließe Fenster");
	static JButton button4 = new JButton ("NachrichtAnMaik");
	
	public static void main(String[] args) {
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setLayout(new FlowLayout());
		mainWindow.setVisible(true);
		
		mainWindow.add(button);
		

		
		
//		mainWindow.setSize(1500, 600);
		mainWindow.setBounds(100, 400,550,300);
//		mainWindow.pack();
		
		mainWindow.add(lable1);
		mainWindow.add(textfeld1);
		mainWindow.add(button2);
		textfeld2.setColumns(20);
		textfeld2.setEditable(false);
		textfeld1.setColumns(20);
		mainWindow.add(textfeld2);
		mainWindow.add(button3);
		mainWindow.add(button4);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent a) {
				String message = "Unterfenster geöffnet";
				String message2 = "Was geht ab";
				JOptionPane.showConfirmDialog(mainWindow, message);
				JOptionPane.showMessageDialog(mainWindow, message);
				JOptionPane.showMessageDialog(mainWindow, message2);
			}
		});
		// actionListener in button2 der auch nur bei button2 ausgelöst
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				textfeld2.setText(textfeld1.getText());
			}
		});
		
		// actionlistener in textfeld was durch enterTaste ausgelöst wird
		textfeld1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent b) {
				textfeld2.setText(textfeld1.getText());
			}
		});
		
		// actionlistener auf button der bei klick des Buttons ausgelöst wird.
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
//				mainWindow.dispose();
				System.exit(0);	
			}
		});
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				String nachrichtFuerFabi = "FICKEN!!!!";
				JOptionPane.showMessageDialog(mainWindow, nachrichtFuerFabi);
			}
		});
	
		
		
	}

   
	
	
}

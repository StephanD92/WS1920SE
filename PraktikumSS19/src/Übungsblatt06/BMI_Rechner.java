package �bungsblatt06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BMI_Rechner {

	static JFrame mainWindow = new JFrame("BMI-Rechner");
	
	static JButton btnBerechne = new JButton("Berechne!");
	
	static JTextField fgroe�e = new JTextField();
	static JTextField fgewicht = new JTextField();
	static JTextField fbmi = new JTextField();
	
	static JLabel groe�e = new JLabel("Gr��e(cm oder meter)");
	static JLabel gewicht = new JLabel("Gewicht(kg)");
	static JLabel bmi = new JLabel("BMI: ");
	
	

	public static void main(String[] args) {

		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flow = new FlowLayout();
		mainWindow.getContentPane().setLayout(flow);
		
		fgewicht.setColumns(10);
		fgroe�e.setColumns(10);
		fbmi.setColumns(10);
		
		mainWindow.add(gewicht);
		mainWindow.add(fgewicht);
		
		mainWindow.add(groe�e);
		mainWindow.add(fgroe�e);
		
		mainWindow.add(bmi);
		mainWindow.add(fbmi);
		
		mainWindow.add(btnBerechne);
		
		mainWindow.pack();
		mainWindow.setVisible(true);
		
		btnBerechne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double gewicht;
				double groe�e;
				double ergebnis;
				
				gewicht = Double.parseDouble(fgewicht.getText().trim());
				groe�e = Double.parseDouble(fgroe�e.getText().trim());
				if(groe�e >=3.0) {
					groe�e = groe�e/100;
				}
				ergebnis = gewicht/(groe�e*groe�e);
				
				fbmi.setText(Double.toString(Math.round(ergebnis)));
				
			}
		});
	}

}

package ‹bungsblatt06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BMI_Rechner {

	static JFrame mainWindow = new JFrame("BMI-Rechner");
	
	static JButton btnBerechne = new JButton("Berechne!");
	
	static JTextField fgroeﬂe = new JTextField();
	static JTextField fgewicht = new JTextField();
	static JTextField fbmi = new JTextField();
	
	static JLabel groeﬂe = new JLabel("Grˆﬂe(cm oder meter)");
	static JLabel gewicht = new JLabel("Gewicht(kg)");
	static JLabel bmi = new JLabel("BMI: ");
	
	

	public static void main(String[] args) {

		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flow = new FlowLayout();
		mainWindow.getContentPane().setLayout(flow);
		
		fgewicht.setColumns(10);
		fgroeﬂe.setColumns(10);
		fbmi.setColumns(10);
		
		mainWindow.add(gewicht);
		mainWindow.add(fgewicht);
		
		mainWindow.add(groeﬂe);
		mainWindow.add(fgroeﬂe);
		
		mainWindow.add(bmi);
		mainWindow.add(fbmi);
		
		mainWindow.add(btnBerechne);
		
		mainWindow.pack();
		mainWindow.setVisible(true);
		
		btnBerechne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double gewicht;
				double groeﬂe;
				double ergebnis;
				
				gewicht = Double.parseDouble(fgewicht.getText().trim());
				groeﬂe = Double.parseDouble(fgroeﬂe.getText().trim());
				if(groeﬂe >=3.0) {
					groeﬂe = groeﬂe/100;
				}
				ergebnis = gewicht/(groeﬂe*groeﬂe);
				
				fbmi.setText(Double.toString(Math.round(ergebnis)));
				
			}
		});
	}

}

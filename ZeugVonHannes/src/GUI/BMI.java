package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BMI {
	private static JFrame frame = new JFrame("BMI-Rechner");
	private static JLabel gewLabel = new JLabel("Gewicht: ");
	private static TextField gewField = new TextField();
	private static JLabel grLabel = new JLabel("Groesse: ");
	private static TextField grField = new TextField();
	private static JLabel bmiLabel = new JLabel("BMI: ");
	private static TextField bmiField = new TextField();
	private static JButton calc = new JButton("Berechnen");
	
	
	
	
	
	public static void main(String[] args) {
		bmiField.setEditable(false);
		bmiField.setColumns(10);
		gewField.setColumns(3);
		grField.setColumns(3);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gewLabel);
		frame.add(gewField);
		frame.add(grLabel);
		frame.add(grField);
		frame.add(bmiLabel);
		frame.add(bmiField);
		frame.add(calc);
		calc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double bmi = 0;
				try{
					bmi = Double.parseDouble(gewField.getText()) / (Double.parseDouble(grField.getText()) * Double.parseDouble(grField.getText()));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(frame, "Falsche Eingabe", null, 0);
				}
				bmiField.setText("" + bmi);
			}
			
		});
		frame.pack();
		frame.setVisible(true);
		
	}

}

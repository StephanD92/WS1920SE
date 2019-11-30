package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import org.jdatepicker.JDatePicker;

public class SchlafenszeitRechner {

	private static JFrame frame = new JFrame("Schlafenszeit-Rechner");
	private static JLabel einschlafen = new JLabel("Einschlafen: ");
	private static TextField h1 = new TextField();
	private static JLabel trenn1 = new JLabel(":  ");
	private static TextField m1 = new TextField();
	private static JLabel aufwachen = new JLabel("    Aufwachen: ");
	private static TextField h2 = new TextField();
	private static JLabel trenn2 = new JLabel(":  ");
	private static TextField m2 = new TextField();
	private static JLabel diffLabel = new JLabel("    Differenz: ");
	private static TextField diffField = new TextField();
	private static JButton calc = new JButton("Berechnen");
	private static JDatePicker jdp = new JDatePicker();
	
	
	public static void main(String[] args) {
		frame.setLayout(new FlowLayout());
		diffField.setColumns(5);
		diffField.setEditable(false);
		frame.add(einschlafen);
		frame.add(h1);
		frame.add(trenn1);
		frame.add(m1);
		frame.add(aufwachen);
		frame.add(h2);
		frame.add(trenn2);
		frame.add(m2);
		frame.add(diffLabel);
		frame.add(diffField);
		frame.add(calc);
		frame.pack();
		frame.setVisible(true);
		calc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int hour1 = Integer.parseInt(h1.getText());
				int min1 = Integer.parseInt(m1.getText());
				int hour2 = Integer.parseInt(h2.getText());
				int min2 = Integer.parseInt(m2.getText());
				int diffh = 0;
				int diffm = 0;
				if (hour1 > hour2) {
					diffh = 24 - hour1 + hour2 - 1;
				} else {
					diffh = hour2 - hour1;
				}
				if (min1 > min2) {
					diffm = 60 - min1 + min2;
				} else {
					diffm = min2 - min1;
				}
				if(diffm < 10) {
					diffField.setText("" + diffh + ":0" + diffm);
				} else {
					diffField.setText("" + diffh + ":" + diffm);
				}
					
				
				
			}
			
		});
	}

}

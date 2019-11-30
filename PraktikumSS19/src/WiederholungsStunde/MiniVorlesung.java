package WiederholungsStunde;


import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MiniVorlesung extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniVorlesung frame = new MiniVorlesung();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MiniVorlesung() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblTextfeld = new JLabel("textfeld1");
		GridBagConstraints gbc_lblTextfeld = new GridBagConstraints();
		gbc_lblTextfeld.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextfeld.anchor = GridBagConstraints.EAST;
		gbc_lblTextfeld.gridx = 0;
		gbc_lblTextfeld.gridy = 0;
		contentPane.add(lblTextfeld, gbc_lblTextfeld);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblTextfeld_1 = new JLabel("textfeld2");
		GridBagConstraints gbc_lblTextfeld_1 = new GridBagConstraints();
		gbc_lblTextfeld_1.anchor = GridBagConstraints.EAST;
		gbc_lblTextfeld_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblTextfeld_1.gridx = 0;
		gbc_lblTextfeld_1.gridy = 1;
		contentPane.add(lblTextfeld_1, gbc_lblTextfeld_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("Erster Button");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 1;
		gbc_button.gridy = 2;
		contentPane.add(button, gbc_button);
		
		
		
		
		private class Button1Listener implements ActionListener{
			public void actionPerformed(Action Event e) {
				try {
					double zahl = Double.parseDouble(textField_1.getText())
					textField2.setText(""+zahl*2+"");
				{catch(NumberFOrmatException ex) {
				    JOptionPane.showMessageDialog(frame, "Fehler bei der Eingabe");
				}
			}
		
		// auswending lernen!!!!!
		// 
		JButton button_1 = new JButton("Zweiter Button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerforemd(ActionEvent e) {
//			textField_1.setText("");
			loescheTextFeld(textField_1);
			}

			private void loescheTextFeld(JTextField f) {
				f.setText("");
				
			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 3;
		contentPane.add(button_1, gbc_button_1);
	}

}

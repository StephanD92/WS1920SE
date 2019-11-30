package GUI2;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import mdlaf.MaterialLookAndFeel;

public class BMIdieDritte extends JFrame {
	private JTextField grField;
	private JTextField gewField;
	private JTextField bmiField;
	private JTextArea textArea;
	public BMIdieDritte() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{160, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblGroesse = new JLabel("Groesse");
		lblGroesse.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblGroesse = new GridBagConstraints();
		gbc_lblGroesse.anchor = GridBagConstraints.EAST;
		gbc_lblGroesse.insets = new Insets(0, 0, 5, 5);
		gbc_lblGroesse.gridx = 0;
		gbc_lblGroesse.gridy = 0;
		getContentPane().add(lblGroesse, gbc_lblGroesse);
		
		grField = new JTextField();
		GridBagConstraints gbc_grField = new GridBagConstraints();
		gbc_grField.insets = new Insets(0, 0, 5, 0);
		gbc_grField.fill = GridBagConstraints.HORIZONTAL;
		gbc_grField.gridx = 1;
		gbc_grField.gridy = 0;
		getContentPane().add(grField, gbc_grField);
		grField.setColumns(10);
		
		JLabel lblGewicht = new JLabel("Gewicht");
		GridBagConstraints gbc_lblGewicht = new GridBagConstraints();
		gbc_lblGewicht.anchor = GridBagConstraints.EAST;
		gbc_lblGewicht.insets = new Insets(0, 0, 5, 5);
		gbc_lblGewicht.gridx = 0;
		gbc_lblGewicht.gridy = 1;
		getContentPane().add(lblGewicht, gbc_lblGewicht);
		
		gewField = new JTextField();
		GridBagConstraints gbc_gewField = new GridBagConstraints();
		gbc_gewField.insets = new Insets(0, 0, 5, 0);
		gbc_gewField.fill = GridBagConstraints.HORIZONTAL;
		gbc_gewField.gridx = 1;
		gbc_gewField.gridy = 1;
		getContentPane().add(gewField, gbc_gewField);
		gewField.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI:");
		GridBagConstraints gbc_lblBmi = new GridBagConstraints();
		gbc_lblBmi.anchor = GridBagConstraints.EAST;
		gbc_lblBmi.insets = new Insets(0, 0, 5, 5);
		gbc_lblBmi.gridx = 0;
		gbc_lblBmi.gridy = 2;
		getContentPane().add(lblBmi, gbc_lblBmi);
		
		bmiField = new JTextField();
		GridBagConstraints gbc_bmiField = new GridBagConstraints();
		gbc_bmiField.insets = new Insets(0, 0, 5, 0);
		gbc_bmiField.fill = GridBagConstraints.HORIZONTAL;
		gbc_bmiField.gridx = 1;
		gbc_bmiField.gridy = 2;
		getContentPane().add(bmiField, gbc_bmiField);
		bmiField.setColumns(5);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 3;
		getContentPane().add(scrollPane, gbc_scrollPane);
		
		textArea = new JTextArea();
		textArea.setRows(8);
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.SOUTH;
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnSpeichern = new JButton("Speichern...");
		panel.add(btnSpeichern);
		btnSpeichern.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = textArea.getText();
				String[] zeilen = text.split("\n");
				JFileChooser fc = new JFileChooser();
				fc.showSaveDialog(null);
				File file = fc.getSelectedFile();
				FileWriter fw = null;
				try {
					fw = new FileWriter(file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, null, "Fehler!", 0);
				}
				BufferedWriter bw  = new BufferedWriter(fw);
				for(String s: zeilen) {
					try {
						bw.write(s);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						bw.newLine();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				try {
					bw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
			
		});
		
		JButton btnLoeschen = new JButton("L\u00F6schen");
		panel.add(btnLoeschen);
		btnLoeschen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				
			}
			
		});
		
		JButton btnBerechnen = new JButton("Berechnen");
		panel.add(btnBerechnen);
		btnBerechnen.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				double bmi = 0;
				double groesse = Double.parseDouble(grField.getText().replace(',', '.'));
				double gewicht = Double.parseDouble(gewField.getText().replace(',', '.'));
				if ( groesse > 3)
					groesse = groesse / 100;
				
				try{
					bmi = gewicht / (groesse * groesse);
					bmi = Math.round(bmi * 100.0) / 100.0;
				} catch (NumberFormatException e1) {
					
				}
				bmiField.setText("" + bmi);
				textArea.append("" + gewicht + " kg / ( " + groesse + " m *2 )  =  " +  bmi + "\n");
				
			}
		});
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel(new MaterialLookAndFeel());
		} catch (UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		SwingUtilities.updateComponentTreeUI(this);

	
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMIdieDritte test = new BMIdieDritte();
	}

}

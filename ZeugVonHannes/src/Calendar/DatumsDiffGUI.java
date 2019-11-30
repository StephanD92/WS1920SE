package Calendar;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class DatumsDiffGUI extends JFrame {
	private JTextField first;
	private JTextField second;
	private JTextField diff;
	public DatumsDiffGUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblErstesDatum = new JLabel("Erstes Datum");
		GridBagConstraints gbc_lblErstesDatum = new GridBagConstraints();
		gbc_lblErstesDatum.anchor = GridBagConstraints.EAST;
		gbc_lblErstesDatum.insets = new Insets(0, 0, 5, 5);
		gbc_lblErstesDatum.gridx = 0;
		gbc_lblErstesDatum.gridy = 0;
		getContentPane().add(lblErstesDatum, gbc_lblErstesDatum);
		
		first = new JTextField();
		GridBagConstraints gbc_first = new GridBagConstraints();
		gbc_first.insets = new Insets(0, 0, 5, 5);
		gbc_first.fill = GridBagConstraints.HORIZONTAL;
		gbc_first.gridx = 1;
		gbc_first.gridy = 0;
		getContentPane().add(first, gbc_first);
		first.setColumns(10);
		
		JLabel lblZweitesDatum = new JLabel("Zweites Datum");
		GridBagConstraints gbc_lblZweitesDatum = new GridBagConstraints();
		gbc_lblZweitesDatum.anchor = GridBagConstraints.EAST;
		gbc_lblZweitesDatum.insets = new Insets(0, 0, 5, 5);
		gbc_lblZweitesDatum.gridx = 0;
		gbc_lblZweitesDatum.gridy = 1;
		getContentPane().add(lblZweitesDatum, gbc_lblZweitesDatum);
		
		second = new JTextField();
		GridBagConstraints gbc_second = new GridBagConstraints();
		gbc_second.insets = new Insets(0, 0, 5, 5);
		gbc_second.fill = GridBagConstraints.HORIZONTAL;
		gbc_second.gridx = 1;
		gbc_second.gridy = 1;
		getContentPane().add(second, gbc_second);
		second.setColumns(10);
		
		JLabel lblDifferenz = new JLabel("Differenz");
		GridBagConstraints gbc_lblDifferenz = new GridBagConstraints();
		gbc_lblDifferenz.anchor = GridBagConstraints.EAST;
		gbc_lblDifferenz.insets = new Insets(0, 0, 5, 5);
		gbc_lblDifferenz.gridx = 0;
		gbc_lblDifferenz.gridy = 2;
		getContentPane().add(lblDifferenz, gbc_lblDifferenz);
		
		diff = new JTextField();
		diff.setEditable(false);
		GridBagConstraints gbc_diff = new GridBagConstraints();
		gbc_diff.insets = new Insets(0, 0, 5, 5);
		gbc_diff.fill = GridBagConstraints.HORIZONTAL;
		gbc_diff.gridx = 1;
		gbc_diff.gridy = 2;
		getContentPane().add(diff, gbc_diff);
		diff.setColumns(10);
		
		JLabel lblTage = new JLabel("Tage");
		GridBagConstraints gbc_lblTage = new GridBagConstraints();
		gbc_lblTage.insets = new Insets(0, 0, 5, 0);
		gbc_lblTage.gridx = 2;
		gbc_lblTage.gridy = 2;
		getContentPane().add(lblTage, gbc_lblTage);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				diff.setText("" + calcDiff());
								
			}
		});
		GridBagConstraints gbc_btnCalculate = new GridBagConstraints();
		gbc_btnCalculate.insets = new Insets(0, 0, 0, 5);
		gbc_btnCalculate.gridx = 1;
		gbc_btnCalculate.gridy = 3;
		getContentPane().add(btnCalculate, gbc_btnCalculate);
		this.pack();
		this.setVisible(true);
	}
	public double calcDiff() {
		DateFormat standard = new SimpleDateFormat("dd.mm.yyyy");
		Date start = new Date();
		Date end = new Date();
		try {
			start = standard.parse(first.getText());
			end = standard.parse(second.getText());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Falsche Eingabe!");
			return 0;
		}
		return Datumsdifferenzrechner.calcDiff(start, end);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatumsDiffGUI ddg = new DatumsDiffGUI();
		
	}

}

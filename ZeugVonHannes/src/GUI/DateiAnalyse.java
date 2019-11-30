package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

public class DateiAnalyse {
	
	private static JFrame frame = new JFrame("Dateianalyse");
	private static JButton load = new JButton("Auswählen...");
	private static JLabel anzZeilen = new JLabel("Anzahl Zeilen: ");
	private static TextField ausgabe = new TextField();
	private static int countLines(File file) throws IOException {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int counter = 0;
		while (br.readLine() != null) {
			counter++;
		}
		return counter;
	}
	private static File readData() {
		JFileChooser fc = new JFileChooser();
		fc.showOpenDialog(frame);
		return fc.getSelectedFile();
	}

	public static void main(String[] args) {
		frame.setLayout(new FlowLayout());
		ausgabe.setColumns(4);
		frame.add(load);
		frame.add(anzZeilen);
		frame.add(ausgabe);
		frame.pack();
		frame.setVisible(true);
		load.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					ausgabe.setText("" + countLines(readData()));
				} catch (IOException e) {
					JOptionPane.showMessageDialog(frame, "Es gibt ein Problem mit der ausgewählten Datei! Bitte überprüfen sie die Datei", "Fehler", 0);
				}
				
			}
			
		});
		
	}

}

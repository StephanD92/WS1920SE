package T05_20190507_LSG;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.*;

public class DateiverwaltungGUI extends JFrame implements ActionListener{
	
	private JButton btnLaden;
	private JButton btnSichern;
	private JButton btnBeenden;
	private JFileChooser fc;
	private Datenverwaltung dv;

	public DateiverwaltungGUI() {
		super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		super.setLayout(new FlowLayout(FlowLayout.CENTER));
		super.add(this.btnLaden = new JButton("Daten laden"));
		super.add(this.btnSichern = new JButton("Daten sichern"));
		super.add(this.btnBeenden = new JButton("Programm beenden"));
		super.setLocation(100, 100);
		
		this.btnLaden.addActionListener(this);
		this.btnSichern.addActionListener(this);
		this.btnBeenden.addActionListener(this);
		
		this.fc = new JFileChooser();
		this.dv = new Datenverwaltung();
		
		super.setVisible(true);
	}
	
	public void laden() {
		int returnValue = fc.showOpenDialog(this);
		if(returnValue == JFileChooser.APPROVE_OPTION) {
			this.dv.loadCSV(this.fc.getSelectedFile());
		}
	}
	
	public void sichern() {
		
	}
	
	public void benden() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btnLaden) {
			
		}
		if(e.getSource() == this.btnSichern) {
			
		}
		if(e.getSource() == this.btnBeenden) {
			
		}
		
	}

}

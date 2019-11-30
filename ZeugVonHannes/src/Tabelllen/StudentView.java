package Tabelllen;

import javax.swing.*;

import ErweiterungenStudent.Student;

import java.awt.ScrollPane;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentView extends JFrame {
	private ArrayList<Student> studenten;
	private JTable table;
	private StudentTableModel tablemodel;

	
	public StudentView(ArrayList<Student> studenten) {
		this.studenten = studenten;
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnHinzufgen = new JButton("Hinzuf\u00FCgen");
		btnHinzufgen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				tablemodel.addNewEntry();
			}
		});

		panel.add(btnHinzufgen);

		JButton btnLschen = new JButton("Loeschen");
		btnLschen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				tablemodel.deleteRow(i);
				if(i<tablemodel.getRowCount()) {
					table.setRowSelectionInterval(i, i);					
				} else {
					table.setRowSelectionInterval(i-1, i-1);
				}
			}
		});
		panel.add(btnLschen);
		
		JButton btnSortieren = new JButton("Sortieren");
		panel.add(btnSortieren);
		
		JComboBox comboBox = new JComboBox();
		
		for(String s: StudentTableModel.colnames) {
			comboBox.addItem(s);
		}
		panel.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		tablemodel = new StudentTableModel(this.studenten);
		table = new JTable(tablemodel);
		scrollPane.setViewportView(table);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		SwingUtilities.updateComponentTreeUI(this);
		
		
		
		this.pack();
		this.setTitle("Studentenverwaltung");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	
	
	
}

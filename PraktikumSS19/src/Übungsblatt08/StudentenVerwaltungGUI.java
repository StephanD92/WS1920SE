package Übungsblatt08;

import javax.swing.*;
import java.awt.*;

public class StudentenVerwaltungGUI extends JFrame {
	private JTable table;
	public StudentenVerwaltungGUI() {
		setTitle("Studentenverwaltung");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		menuBar.add(mntmNewMenuItem);
	}

	
}

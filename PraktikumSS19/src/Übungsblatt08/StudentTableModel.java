package Übungsblatt08;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel {

	private ArrayList<Student> studentList;
	
	public StudentTableModel(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	String[] columnNames = {"Name", "Matrnr", "Studiengang"};
	
	public String getColumnName (int col) {
		return columnNames[col];
	}
	
	public int getColumnCount() {
	 return columnNames.length;
	}
	
	public int getRowCount() {
		return studentList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
			case 0: return studentList.get(rowIndex).getName();
			case 1: return studentList.get(rowIndex).getMatrikelnummer();
			case 2: return studentList.get(rowIndex).getStudiengang();
		default:
			return null;
		}
	}
	
	
}

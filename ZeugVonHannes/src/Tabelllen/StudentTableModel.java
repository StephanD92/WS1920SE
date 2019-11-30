package Tabelllen;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import ErweiterungenStudent.Student;

public class StudentTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private ArrayList<Student> studenten;
	
	public StudentTableModel(ArrayList<Student> liste) {
		this.studenten = liste;
	}
	
	public static final String[] colnames = {"Vorname", "Nachname", "Matrikelnummer"};
	
	public String getColumnName(int col) {
		return colnames[col];		
	}
	
	@Override
	public int getColumnCount() {
		return colnames.length;
	}

	@Override
	public int getRowCount() {
		return studenten.size();
	}
	

	@Override
	public Object getValueAt(int row, int col) {
		switch(col) {
			case 0:
				return studenten.get(row).getVorname();
			case 1:
				return studenten.get(row).getNachname();
			case 2:
				return studenten.get(row).getMatnr();
			default:
				return null;
		}
	}
	
	public void setValueAt(Object value, int row, int col) {
		Student one = studenten.get(row);
		switch(col) {
			case 0:
				one.setVorname((String) value);
				break;
			case 1:
				one.setNachname((String) value);
				break;
			case 2:
				one.setMatnr((int) value);
				break;
			default:
				break;
		}
	}
	
	public void addNewEntry() {
		studenten.add(new Student());
		this.fireTableDataChanged();		
	}
	public void deleteRow(int row) {
		studenten.remove(row);
		this.fireTableDataChanged();
	}
	public boolean isCellEditable(int row, int col) {
		return true;
		
	}

		

}

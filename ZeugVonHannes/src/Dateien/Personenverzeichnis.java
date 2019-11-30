package Dateien;

import java.io.*;
import java.util.*;

import javax.swing.JFileChooser;

public class Personenverzeichnis {
	private LinkedList<Person> personenliste = new LinkedList<Person>();
	public void addPerson(Person person) {
		personenliste.add(person);
	}
	public void saveData(String dateiname) {
		File file = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			file = new File (dateiname);
			fos = new FileOutputStream (file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(personenliste);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try{ 
				if (oos != null) 
					oos.close();
				if (oos != null) 
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public LinkedList<Person> loadData(){
		File file = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		LinkedList<Person> liste = null;
		try {
			JFileChooser fc = new JFileChooser();
			fc.showOpenDialog(fc);
			file = fc.getSelectedFile();
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			if (o instanceof LinkedList<?>) {
				liste = (LinkedList<Person>) o;
			}
	
		} catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) 
				ois.close();
			if(fis != null)
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return liste;
	}
}



















